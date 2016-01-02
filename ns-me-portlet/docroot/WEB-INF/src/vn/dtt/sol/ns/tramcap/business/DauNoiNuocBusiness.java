package vn.dtt.sol.ns.tramcap.business;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import vn.dtt.cmon.dm.dao.model.DATAITEM;
import vn.dtt.cmon.dm.dao.model.impl.DATAITEMImpl;
import vn.dtt.cmon.dm.dao.service.DATAITEMLocalServiceUtil;
import vn.dtt.cmon.user.dao.model.UserMapping;
import vn.dtt.sol.ns.business.DataItemBusiness;
import vn.dtt.sol.ns.business.KiemDemVienBussiness;
import vn.dtt.sol.ns.daunoinuoc.constant.DauNoiNuocConstantString;
import vn.dtt.sol.ns.reporting.DataItemReportModel;
import vn.dtt.sol.ns.reporting.DauNoiNuocReportModel;
import vn.dtt.sol.ns.reporting.ThongTinKiemDemNuocModel;
import vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc;
import vn.dtt.sol.ns.tramcap.dao.model.KeHoachKiemDemNuoc;
import vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC;
import vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc;
import vn.dtt.sol.ns.tramcap.dao.model.impl.DauNoiNuocImpl;
import vn.dtt.sol.ns.tramcap.dao.service.DauNoiNuocLocalServiceUtil;
import vn.dtt.sol.ns.tramcap.dao.service.THONGTINKIEMDEMNUOCLocalServiceUtil;
import vn.dtt.sol.ns.tramcap.dao.service.TramCapNuocLocalServiceUtil;
import vn.dtt.sol.ns.util.NuocSachUtils;
import vn.dtt.sol.ns.util.WebKeys;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;

public class DauNoiNuocBusiness {
	
	/**
	 * @param gioiTinhId
	 * @return
	 */
	public static String getGioiTinh(int gioiTinhId) {
		String result = "";
		
		try {
			if(gioiTinhId == 1){
				result = "gioi-tinh-1";
			}else{
				result = "gioi-tinh-0";
			}
		} catch (Exception e) {
			_log.error(e);
		}

		return result;
	}
	
	public static int countGioiTinhChuHo(String maTinh, String namBaoCao, String gioiTinh) {
		int count = 0;

		try {
			count = DauNoiNuocLocalServiceUtil.countGioiTinhChuHo( maTinh,  namBaoCao,  gioiTinh);
		} catch (Exception e) {
			_log.error(e);
		}

		return count;
	}
	/**
	 * @param tramCapId
	 * @return
	 */
	public static int countDauNoiByTram(long tramCapId) {
		int count = 0;

		try {
			count = DauNoiNuocLocalServiceUtil
					.countDauNoiByTram((int) tramCapId);
		} catch (Exception e) {
			_log.error(e);
		}

		return count;
	}
	public static int countDauNoiSearch(String maTinh,String maHuyen,String maXa,String tramCapNuocId,String trangThai,String namBaoCao, String ngayNhap,String idNguoiTao,String advText) {
		int count = 0;

		try {
			count = DauNoiNuocLocalServiceUtil.countDauNoiSearch(maTinh, maHuyen, maXa, tramCapNuocId, trangThai, namBaoCao,ngayNhap,idNguoiTao,advText);
		} catch (Exception e) {
			_log.error(e);
		}

		return count;
	}
	public static DauNoiNuoc getDauNoiNuocById(long dauNoiId) {
		DauNoiNuoc dauNoiNuoc = new DauNoiNuocImpl();

		try {
			dauNoiNuoc = DauNoiNuocLocalServiceUtil.fetchDauNoiNuoc(dauNoiId);
		} catch (Exception e) {
			_log.error(e);
		}

		return dauNoiNuoc;
	}

	// fill data dau noi to list / reporting
	public static int countDauNoiByTypeUser(
			UserMapping userMapping, String maTinh,String maHuyen,String maXa,String tramCapNuocId,String trangThai,String namBaoCao, String ngayNhap, String idNguoiTao, String advText, int start, int end) {
		int results = 0;
		try {

			if (userMapping.getUserType() == DauNoiNuocConstantString.UserMapping.CAP_TU) {
				if(!maTinh.isEmpty()
						||!maHuyen.isEmpty()
						||!maXa.isEmpty()
						||!tramCapNuocId.isEmpty()
						||!trangThai.isEmpty()
						||!namBaoCao.isEmpty()){
					results = DauNoiNuocLocalServiceUtil.countDauNoiSearch(maTinh, maHuyen, maXa, tramCapNuocId, trangThai, namBaoCao, ngayNhap,idNguoiTao, advText);
				}else{
					results = DauNoiNuocLocalServiceUtil.getDauNoiNuocsCount();
				}
				
			}else if (userMapping.getUserType() == DauNoiNuocConstantString.UserMapping.CAP_TINH) {
				results = DauNoiNuocLocalServiceUtil.countDauNoiSearch(userMapping.getOrgCode1(), maHuyen, maXa, tramCapNuocId, trangThai, namBaoCao, ngayNhap,idNguoiTao, advText);
			}else if (userMapping.getUserType() == DauNoiNuocConstantString.UserMapping.CAP_HUYEN) {
				results = DauNoiNuocLocalServiceUtil.countDauNoiSearch(userMapping.getOrgCode1(),"", maXa, tramCapNuocId, trangThai, namBaoCao, ngayNhap,idNguoiTao, advText);
			}else if (userMapping.getUserType() == DauNoiNuocConstantString.UserMapping.CAP_TRAM) {
				//TramCapNuoc tramCap = TramCapNuocLocalServiceUtil.fetchTramCapNuoc(Long.valueOf(userMapping.getOrgCode2()));
				results = DauNoiNuocLocalServiceUtil.countDauNoiSearch(userMapping.getOrgCode1(),"", maXa, tramCapNuocId, trangThai, namBaoCao, ngayNhap,idNguoiTao, advText);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			_log.error(e);
		}
		return results;
	}
	public static List<DauNoiNuocReportModel> getListDauNoiByTypeUser(
			UserMapping userMapping, String maTinh,String maHuyen,String maXa,String tramCapNuocId,String trangThai,String namBaoCao, String ngayNhap, String idNguoiTao, String advText,int start,int end) {
		List<DauNoiNuocReportModel> results = new ArrayList<DauNoiNuocReportModel>();
		List<DauNoiNuoc> resultBase = new ArrayList<DauNoiNuoc>();
		try {
//			_log.info("maTinh"+maTinh+"maHuyen"+maHuyen+"maXa"+maXa+"tramCapNuocId"+tramCapNuocId+"trangThai"+trangThai+"namBaoCao"+namBaoCao);
			if (userMapping.getUserType() == DauNoiNuocConstantString.UserMapping.CAP_TU) {
				if(!maTinh.isEmpty()
						||!maHuyen.isEmpty()
						||!maXa.isEmpty()
						||!tramCapNuocId.isEmpty()
						||!trangThai.isEmpty()
						||!namBaoCao.isEmpty()){
					resultBase = DauNoiNuocLocalServiceUtil.getDauNoiSearch(maTinh, maHuyen, maXa, tramCapNuocId, trangThai, namBaoCao, ngayNhap, idNguoiTao, advText, start, end);
				}else{
					resultBase = DauNoiNuocLocalServiceUtil.getDauNoiNuocs(start,
							end);
				}
				
			}else if (userMapping.getUserType() == DauNoiNuocConstantString.UserMapping.CAP_TINH) {
				resultBase = DauNoiNuocLocalServiceUtil.getDauNoiSearch(userMapping.getOrgCode1(), maHuyen, maXa, tramCapNuocId, trangThai, namBaoCao, ngayNhap, idNguoiTao, advText, start, end);
			}else if (userMapping.getUserType() == DauNoiNuocConstantString.UserMapping.CAP_HUYEN) {
				resultBase = DauNoiNuocLocalServiceUtil.getDauNoiSearch(userMapping.getOrgCode1(),"", maXa, tramCapNuocId, trangThai, namBaoCao, ngayNhap, idNguoiTao, advText,start,end);
			}else if (userMapping.getUserType() == DauNoiNuocConstantString.UserMapping.CAP_TRAM) {
				//TramCapNuoc tramCap = TramCapNuocLocalServiceUtil.fetchTramCapNuoc(Long.valueOf(userMapping.getOrgCode2()));
				resultBase = DauNoiNuocLocalServiceUtil.getDauNoiSearch(userMapping.getOrgCode1(),"", maXa, tramCapNuocId, trangThai, namBaoCao, ngayNhap, idNguoiTao, advText,start,end);
			}
			
			for (DauNoiNuoc dauNoiNuoc : resultBase) {
				String tenTramResult = StringPool.BLANK;
					tenTramResult = dauNoiNuoc.getTramCapNuocId()>0?TramCapBusiness.getTramCap(dauNoiNuoc.getTramCapNuocId()).getTenTram():StringPool.BLANK;
				results.add(new DauNoiNuocReportModel(dauNoiNuoc.getId(), 
						StringPool.BLANK, 
						NuocSachUtils.getNameTinh(dauNoiNuoc.getMaTinh()), 
						NuocSachUtils.getNameHuyen(dauNoiNuoc.getMaTinh(),dauNoiNuoc.getMaHuyen()), 
						NuocSachUtils.getNameXa(dauNoiNuoc.getMaXa()), 
						dauNoiNuoc.getThonXom(), 
						tenTramResult, 
						dauNoiNuoc.getTenChuHo(), 
						"tinh-trang-dau-noi-"+dauNoiNuoc.getTrangThai(),
						Validator.isNotNull(dauNoiNuoc.getNgayDauNoiHopDong())?sdf.format(dauNoiNuoc.getNgayDauNoiHopDong()):StringPool.BLANK,
						dauNoiNuoc.getNamBaoCao()+"",
						dauNoiNuoc.getIdNguoiTao()));
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			_log.error(e);
		}
		return results;
	}
	public static List<ThongTinKiemDemNuocModel> getListThongTinKiemDemNuocModelByDauNoiId(
			long dauNoiNuocId, int start, int end) {
		List<ThongTinKiemDemNuocModel> results = new ArrayList<ThongTinKiemDemNuocModel>();
		List<THONGTINKIEMDEMNUOC> resultBase = new ArrayList<THONGTINKIEMDEMNUOC>();
			try {
				
				resultBase = THONGTINKIEMDEMNUOCLocalServiceUtil.getListByDauNoiId(dauNoiNuocId, start, end);
				KeHoachKiemDemNuoc keHoach = null;
				for (THONGTINKIEMDEMNUOC thongtinkiemdemnuoc : resultBase) {
					String keHoachStr = "";
					String ngayBatDau = "";
					String ngayKetThuc = "";
					keHoach = KeHoachKiemDemNuocBusiness.getKeHoachKiemDemNuocById(thongtinkiemdemnuoc.getKeHoachKiemDemNuocId());
					if(Validator.isNotNull(keHoach)){
						ngayBatDau = Validator.isNotNull(keHoach.getNgayBatDau())?sdf.format(keHoach.getNgayBatDau()):StringPool.BLANK;
						ngayKetThuc = Validator.isNotNull(keHoach.getNgayKetThuc())?sdf.format(keHoach.getNgayKetThuc()):StringPool.BLANK;
						keHoachStr = "T\u1EEB "+ngayBatDau + " \u0111\u1EBFn " + ngayKetThuc;
					}
					results.add(new ThongTinKiemDemNuocModel(thongtinkiemdemnuoc.getId(), 
							Validator.isNotNull(KiemDemVienBussiness.findByTaiKhoan(thongtinkiemdemnuoc.getTaiKhoan()))?KiemDemVienBussiness.findByTaiKhoan(thongtinkiemdemnuoc.getTaiKhoan()).getHoVaTen():StringPool.BLANK, 
							keHoachStr, 
							thongtinkiemdemnuoc.getHoTenNguoiTraLoi(), 
							"danh-gia-kiem-dem-"+thongtinkiemdemnuoc.getDanhGiaKiemDem(), 
							Validator.isNotNull(thongtinkiemdemnuoc.getNgayKiemDem())?sdf.format(thongtinkiemdemnuoc.getNgayKiemDem()):StringPool.BLANK,
							"kiem-dem-nuoc-da-ket-thuc-dieu-tra-"+thongtinkiemdemnuoc.getDaKetThucDieuTra(),""));
				}
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				_log.error(e);
			}
		return results;
	
	}
	public static int countListThongTinKiemDemNuocModelByDauNoiId(
			long dauNoiNuocId) {
		int result = 0;
			try {
				
				result = THONGTINKIEMDEMNUOCLocalServiceUtil.getListByDauNoiId(dauNoiNuocId, QueryUtil.ALL_POS, QueryUtil.ALL_POS).size();
				
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				_log.error(e);
			}
		return result;
	
	}
	
	public static List<DauNoiNuoc> getDauNoiByMaTinhTramIdTrangThaiAndNam(String maTinh, String tramCapNuocId,
		String trangThai,String namBaoCao){
		List<DauNoiNuoc> lst = new ArrayList<DauNoiNuoc>();
		
		try{
			lst = DauNoiNuocLocalServiceUtil.getDauNoiByMaTinhTramIdTrangThaiAndNam(maTinh, tramCapNuocId, trangThai, namBaoCao);
		}catch(Exception e){
			_log.error(e);
		}
		
		return lst;
	}
	
	public static int countDauNoiByMaTinhTramIdTrangThaiAndNam(String maTinh, String tramCapNuocId, String trangThai, String namBaoCao){
		int count = 0;
		
		try{
			count = DauNoiNuocLocalServiceUtil.countDauNoiByMaTinhTramIdTrangThaiAndNam(maTinh,tramCapNuocId, trangThai, namBaoCao);
		}catch(Exception e){
			_log.error(e);
		}
		
		return count;
	}
	
	public static List<DauNoiNuoc> getDauNoiByMaTinhTramIdTrangThaiAndNamThoiGianThuc(String maTinh,String danhgiakiemdem,String namBaoCao) {
			List<DauNoiNuoc> lst = new ArrayList<DauNoiNuoc>();
			
			try{
				lst = DauNoiNuocLocalServiceUtil.getDauNoiByMaTinhTramIdTrangThaiAndNamThoiGianThuc(maTinh,danhgiakiemdem,namBaoCao);
			}catch(Exception e){
				_log.error(e);
			}
			
			return lst;
		}
	
	public static List<DauNoiNuoc> getDauNoiGroupByMaTinhTW(String namBaoCao)  {
		List<DauNoiNuoc> lst = new ArrayList<DauNoiNuoc>();
		
		try{
			lst = DauNoiNuocLocalServiceUtil.getDauNoiGroupByMaTinhTW(namBaoCao);
		}catch(Exception e){
			_log.error(e);
		}
		
		return lst;
	}
	public static List<DauNoiNuoc> getDauNoiSearch(String maTinh,String maHuyen,String maXa,String tramCapNuocId,String trangThai,String namBaoCao,String ngayNhap,String idNguoiTao,String advText) {
		List<DauNoiNuoc> lst = new ArrayList<DauNoiNuoc>();
		
		try{
			lst = DauNoiNuocLocalServiceUtil.getDauNoiSearch(maTinh, maHuyen, maXa, tramCapNuocId, trangThai, namBaoCao, ngayNhap, idNguoiTao, advText, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		}catch(Exception e){
			_log.error(e);
		}
		
		return lst;
	}
	public static List<DauNoiNuoc> getDauNoiGroupByTramCapIDTW(String namBaoCao,String trangThai) {
		List<DauNoiNuoc> lst = new ArrayList<DauNoiNuoc>();
		
		try{
			lst = DauNoiNuocLocalServiceUtil.getDauNoiGroupByTramCapIDTW(namBaoCao,trangThai);
		}catch(Exception e){
			_log.error(e);
		}
		
		return lst;
	}
	
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private static Log _log = LogFactoryUtil.getLog(DauNoiNuocBusiness.class);
}
