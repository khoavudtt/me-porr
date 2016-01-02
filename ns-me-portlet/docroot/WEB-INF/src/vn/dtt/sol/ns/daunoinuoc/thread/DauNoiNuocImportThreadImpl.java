package vn.dtt.sol.ns.daunoinuoc.thread;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import vn.dtt.cmon.dm.dao.model.DATAITEM;
import vn.dtt.cmon.dm.dao.model.impl.DATAITEMImpl;
import vn.dtt.sol.ns.business.DataItemBusiness;
import vn.dtt.sol.ns.reporting.DauNoiNuocImportModel;
import vn.dtt.sol.ns.tramcap.business.TramCapBusiness;
import vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc;
import vn.dtt.sol.ns.tramcap.dao.model.impl.DauNoiNuocImpl;
import vn.dtt.sol.ns.tramcap.dao.service.DauNoiNuocLocalServiceUtil;
import vn.dtt.sol.ns.util.WebKeys;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.messaging.MessageListener;
import com.liferay.portal.kernel.messaging.MessageListenerException;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.Organization;
import com.liferay.portal.service.ServiceContext;
import com.mysql.jdbc.jdbc2.optional.SuspendableXAConnection;






public class DauNoiNuocImportThreadImpl implements  MessageListener {

	
	public void receive(Message message) throws MessageListenerException {
	       try {
	            doReceive(message);
	        }
	        catch (Exception e) {
	            _log.error("Unable to process message " + message, e);
	        }
		
	}
	  protected void doReceive(Message message) {
		
		  ServiceContext context = (ServiceContext)message.get ("context");
		  
		  List<DauNoiNuocImportModel> results = new ArrayList<DauNoiNuocImportModel>();
		  int namBaoCao = 0;
			try {
				results = (List<DauNoiNuocImportModel>)message.get("listImport");
				long userId = (Long)message.get("userId");
				namBaoCao = message.getInteger("namBaoCao");
				_log.info("resultsresults"+results.size()+"/"+namBaoCao);
				for (DauNoiNuocImportModel dauNoiNuocImportModel : results) {
					if( Validator.isNumber(dauNoiNuocImportModel.getStt())
							&&dauNoiNuocImportModel.getHuyen().length()>4){
						long idTram = 0;
						idTram = TramCapBusiness.getByTenTram(dauNoiNuocImportModel.getTenHeThongCapNuoc()).size()>0?TramCapBusiness.getByTenTram(dauNoiNuocImportModel.getTenHeThongCapNuoc()).get(0).getId():0;
						dauNoiNuocImportModel.setTenHeThongCapNuocId(idTram);
						DATAITEM dataItem = new DATAITEMImpl();
						dataItem = DataItemBusiness.getDATAITEMByTen(dauNoiNuocImportModel.getTinh(),"",1);
						if(dataItem.getLevel()==1)dauNoiNuocImportModel.setMaTinh(dataItem.getNode1());
						dataItem = DataItemBusiness.getDATAITEMByTen(dauNoiNuocImportModel.getHuyen(),dauNoiNuocImportModel.getMaTinh(),2);
						if(dataItem.getLevel()==2)dauNoiNuocImportModel.setMaHuyen(dataItem.getNode2());
						dataItem = DataItemBusiness.getDATAITEMByTen(dauNoiNuocImportModel.getXa(),dauNoiNuocImportModel.getMaHuyen(),3);
						if(dataItem.getLevel()==3)dauNoiNuocImportModel.setMaXa(dataItem.getNode3());
						
						long id = 0;
						id = CounterLocalServiceUtil.increment(DauNoiNuoc.class.getName());
						DauNoiNuoc ettImport = new DauNoiNuocImpl();
						ettImport = DauNoiNuocLocalServiceUtil.createDauNoiNuoc(id);
						ettImport.setTramCapNuocId(Integer.valueOf(dauNoiNuocImportModel.getTenHeThongCapNuocId()+""));
						ettImport.setMaTinh(dauNoiNuocImportModel.getMaTinh());
						ettImport.setMaHuyen(dauNoiNuocImportModel.getMaHuyen());
						ettImport.setMaXa(dauNoiNuocImportModel.getMaXa());
						ettImport.setThonXom(dauNoiNuocImportModel.getThon());
						ettImport.setTenChuHo(dauNoiNuocImportModel.getTenChuHoCoQuan());
						ettImport.setSoNguoiTrongHo(Validator.isNotNull(dauNoiNuocImportModel.getSoNguoiTrongHo())?Integer.valueOf(dauNoiNuocImportModel.getSoNguoiTrongHo()):0);
						ettImport.setNgayDauNoiHopDong(dauNoiNuocImportModel.getNgayDauNoiDate());
						ettImport.setSoSeryDongHo(dauNoiNuocImportModel.getSoSeRy());
						ettImport.setIdNguoiTao(Integer.valueOf(userId+""));
						ettImport.setNgayTao(new Date());
						ettImport.setNamBaoCao(namBaoCao);
						if(namBaoCao == 0){
							ettImport.setTrangThai(0);
						}else{
							ettImport.setTrangThai(2);
						}
						
						DauNoiNuocLocalServiceUtil.updateDauNoiNuoc(ettImport);
						//log data
						_log.info("run"+dauNoiNuocImportModel.getId()+"//"+
								dauNoiNuocImportModel.getTenHeThongCapNuocId()+"//"+
								dauNoiNuocImportModel.getMaTinh()+"//"+
								dauNoiNuocImportModel.getMaHuyen()+"//"+
								dauNoiNuocImportModel.getMaXa()+"//"+
								dauNoiNuocImportModel.getThon()+"//"+
								dauNoiNuocImportModel.getTenChuHoCoQuan()+"//"+
								dauNoiNuocImportModel.getSoNguoiTrongHo()+"//"+
								dauNoiNuocImportModel.getNgayDauNoiDate()+"//"+
								dauNoiNuocImportModel.getSoSeRy());
					}
					
				}
			} catch (Exception e) {
				_log.error(e);
			}
	}
		  
		

	private static Log _log =   LogFactoryUtil.getLog(DauNoiNuocImportThreadImpl.class);
}
