package vn.dtt.sol.ns.daunoinuoc.thread;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import vn.dtt.cmon.dm.dao.model.DATAITEM;
import vn.dtt.cmon.dm.dao.model.impl.DATAITEMImpl;
import vn.dtt.sol.ns.business.DataItemBusiness;
import vn.dtt.sol.ns.reporting.HoGiaDinhImportModel;
import vn.dtt.sol.ns.tramcap.business.TramCapBusiness;
import vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc;
import vn.dtt.sol.ns.tramcap.dao.model.impl.DauNoiNuocImpl;
import vn.dtt.sol.ns.tramcap.dao.service.DauNoiNuocLocalServiceUtil;
import vn.dtt.sol.ns.util.WebKeys;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.VeSinhGiaDinhImpl;
import vn.dtt.sol.ns.vesinhmoitruong.dao.service.VeSinhGiaDinhLocalServiceUtil;

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






public class HoGiaDinhImportThreadImpl implements  MessageListener {

	
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
		  
		  List<HoGiaDinhImportModel> results = new ArrayList<HoGiaDinhImportModel>();
		  int namBaoCao = 0;
			try {
				long userId = (Long)message.get("userId");
				int typeImport = (Integer)message.get("typeImport");
				results = (List<HoGiaDinhImportModel>)message.get("listImport");
				namBaoCao = message.getInteger("namBaoCao");
				for (HoGiaDinhImportModel HoGiaDinhImportModel : results) {
					_log.info(Validator.isNumber(HoGiaDinhImportModel.getStt())+"sos: "+HoGiaDinhImportModel.getStt());
					if( Validator.isNumber(HoGiaDinhImportModel.getStt())
							&&Validator.isNotNull(HoGiaDinhImportModel.getStt())){
						_log.info("HoGiaDinhImportModel"+HoGiaDinhImportModel.getMaHuyen()+"//"+HoGiaDinhImportModel.getMaTinh());
						DATAITEM dataItem = new DATAITEMImpl();
//						dataItem = DataItemBusiness.getDATAITEMByTen(HoGiaDinhImportModel.getMaHuyen(),HoGiaDinhImportModel.getMaTinh());
						dataItem = DataItemBusiness.getDATAITEMByTen(HoGiaDinhImportModel.getMaHuyen(),HoGiaDinhImportModel.getMaTinh(),2);
						if(dataItem.getLevel()==2)HoGiaDinhImportModel.setMaHuyen(dataItem.getNode2());
//						dataItem = DataItemBusiness.getDATAITEMByTen(HoGiaDinhImportModel.getMaXa(),HoGiaDinhImportModel.getMaHuyen());
						dataItem = DataItemBusiness.getDATAITEMByTen(HoGiaDinhImportModel.getMaXa(),HoGiaDinhImportModel.getMaHuyen(),3);
						if(dataItem.getLevel()==3)HoGiaDinhImportModel.setMaXa(dataItem.getNode3());
						
						long id = 0;
						id = CounterLocalServiceUtil.increment(VeSinhGiaDinh.class.getName());
						VeSinhGiaDinh ettImport = new VeSinhGiaDinhImpl();
						ettImport = VeSinhGiaDinhLocalServiceUtil.createVeSinhGiaDinh(Integer.valueOf(id+""));
						ettImport.setMaTinh(HoGiaDinhImportModel.getMaTinh());
						ettImport.setMaHuyen(HoGiaDinhImportModel.getMaHuyen());
						ettImport.setMaXa(HoGiaDinhImportModel.getMaXa());
						ettImport.setThonXom(HoGiaDinhImportModel.getThonXom());
						ettImport.setTenChuHo(HoGiaDinhImportModel.getTenChuHo());
						if(Validator.isNotNull(HoGiaDinhImportModel.getHoNgheo())){
							ettImport.setThanhPhanHoGD(1);
						}else{
							ettImport.setThanhPhanHoGD(3);
						}
						if(Validator.isNotNull(HoGiaDinhImportModel.getKhongCoNhaTieu())){
							ettImport.setCoNhaTieu(2);
						}else{
							ettImport.setCoNhaTieu(1);
						}
						if(Validator.isNotNull(HoGiaDinhImportModel.getKhongCoNhaTieu()) && HoGiaDinhImportModel.getKhongCoNhaTieu() == 999){
							ettImport.setCoNhaTieu(1);
						}
						if(Validator.isNotNull(HoGiaDinhImportModel.getCoNhaTieuKhongHVS())){
							if(typeImport == 1){
								ettImport.setCoNhaTieu(1);
							}
							ettImport.setNhaTieuHVS(2);
						}else{
							if(typeImport == 1){
								ettImport.setCoNhaTieu(1);
							}else{
								ettImport.setNhaTieuHVS(1);
							}
						}
						if(Validator.isNotNull(HoGiaDinhImportModel.getCoNhaTieuKhongHVS()) && HoGiaDinhImportModel.getCoNhaTieuKhongHVS() == 999){
							ettImport.setCoNhaTieu(1);
							ettImport.setNhaTieuHVS(1);
						}
						if(typeImport == 1){
							ettImport.setLoaiNhaTieu(HoGiaDinhImportModel.getLoaiNhaTieu()+"");
							ettImport.setNguonVon(HoGiaDinhImportModel.getNguonVon());
							if(Validator.isNotNull(HoGiaDinhImportModel.getDateToGetStr())){
								String[] strSplit = HoGiaDinhImportModel.getDateToGetStr().split("/");
								ettImport.setThangXayDung(Validator.isNotNull(strSplit[0].trim())?Integer.valueOf(strSplit[0].trim()):0);
								ettImport.setNamXayDung(Validator.isNotNull(strSplit[1].trim())?Integer.valueOf(strSplit[1].trim()):0);
							}
							ettImport.setGhiChu(HoGiaDinhImportModel.getGhiChu());
						}else{
							ettImport.setSoNguoiTrongHo(HoGiaDinhImportModel.getSoNguoi());
						}
						
						ettImport.setIdNguoiTao(Integer.valueOf(userId+""));
						ettImport.setNgayTao(new Date());
						VeSinhGiaDinhLocalServiceUtil.updateVeSinhGiaDinh(ettImport);
						//log data
						_log.info("run"+ettImport.getId()+"//"+
								ettImport.getMaTinh()+"//"+
								ettImport.getMaHuyen()+"//"+
								ettImport.getMaXa()+"//"+
								ettImport.getThonXom()+"//"+
								ettImport.getTenChuHo()+"//"+
								ettImport.getThanhPhanHoGD()+"//"+
								ettImport.getCoNhaTieu()+"//"+
								ettImport.getNhaTieuHVS()+"//"+
								ettImport.getLoaiNhaTieu()+"//"+
								ettImport.getNguonVon()+"//"+
								ettImport.getThangXayDung()+"//"+
								ettImport.getNamXayDung()+"//"+
								ettImport.getGhiChu()+"//"
								);
					}
					
				}
			} catch (Exception e) {
				_log.error(e);
			}
	}
		  
		

	private static Log _log =   LogFactoryUtil.getLog(HoGiaDinhImportThreadImpl.class);
}
