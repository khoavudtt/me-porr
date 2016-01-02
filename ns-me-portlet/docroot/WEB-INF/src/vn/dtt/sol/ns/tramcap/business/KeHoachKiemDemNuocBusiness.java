package vn.dtt.sol.ns.tramcap.business;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import vn.dtt.cmon.dm.dao.model.DATAITEM;
import vn.dtt.cmon.dm.dao.model.impl.DATAITEMImpl;
import vn.dtt.cmon.dm.dao.service.DATAITEMLocalServiceUtil;
import vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien;
import vn.dtt.cmon.user.dao.model.UserMapping;
import vn.dtt.sol.ns.business.DataItemBusiness;
import vn.dtt.sol.ns.business.KiemDemVienBussiness;
import vn.dtt.sol.ns.daunoinuoc.constant.DauNoiNuocConstantString;
import vn.dtt.sol.ns.kehoachkiemdemnuoc.constant.KeHoachKiemDemNuocConstantString;
import vn.dtt.sol.ns.reporting.DataItemReportModel;
import vn.dtt.sol.ns.reporting.DauNoiNuocReportModel;
import vn.dtt.sol.ns.reporting.KeHoachKiemDemNuocReportModel;
import vn.dtt.sol.ns.reporting.ThongTinKiemDemNuocModel;
import vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc;
import vn.dtt.sol.ns.tramcap.dao.model.KeHoachKiemDemNuoc;
import vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC;
import vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc;
import vn.dtt.sol.ns.tramcap.dao.model.impl.DauNoiNuocImpl;
import vn.dtt.sol.ns.tramcap.dao.model.impl.KeHoachKiemDemNuocImpl;
import vn.dtt.sol.ns.tramcap.dao.service.DauNoiNuocLocalServiceUtil;
import vn.dtt.sol.ns.tramcap.dao.service.KeHoachKiemDemNuocLocalServiceUtil;
import vn.dtt.sol.ns.tramcap.dao.service.THONGTINKIEMDEMNUOCLocalServiceUtil;
import vn.dtt.sol.ns.util.NuocSachUtils;
import vn.dtt.sol.ns.util.WebKeys;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;

public class KeHoachKiemDemNuocBusiness {
	
	public static int getSumDauNoiBykeHoachKiemDemNuocId(int keHoachKiemDemNuocId) {
		int result = 0;
		try {
			result = THONGTINKIEMDEMNUOCLocalServiceUtil.getSumDauNoiBykeHoachKiemDemNuocId(keHoachKiemDemNuocId);
		} catch (Exception e) {
			_log.error(e);
		}

		return result;
	}
	
	public static int getCountDauNoiBykeHoachKiemDemNuocId(int keHoachKiemDemNuocId, int daKetThucDieuTra) {
		int result = 0;
		try {
			result = THONGTINKIEMDEMNUOCLocalServiceUtil.getCountDauNoiBykeHoachKiemDemNuocId(keHoachKiemDemNuocId, daKetThucDieuTra);
		} catch (Exception e) {
			_log.error(e);
		}

		return result;
	}
	public static int getCountDauNoiBykeHoachKiemDemNuocIdDanhGiaKiemDem(int keHoachKiemDemNuocId, int danhGiaKiemDem) {
		int result = 0;
		try {
			result = THONGTINKIEMDEMNUOCLocalServiceUtil.getCountDauNoiBykeHoachKiemDemNuocIdDanhGiaKiemDem(keHoachKiemDemNuocId, danhGiaKiemDem);
		} catch (Exception e) {
			_log.error(e);
		}

		return result;
	}
	public static KeHoachKiemDemNuoc getKeHoachKiemDemNuocById(int id) {
		KeHoachKiemDemNuoc keHoachKiemDemNuoc = new KeHoachKiemDemNuocImpl();

		try {
			keHoachKiemDemNuoc = KeHoachKiemDemNuocLocalServiceUtil.fetchKeHoachKiemDemNuoc(id);
		} catch (Exception e) {
			_log.error(e);
		}

		return keHoachKiemDemNuoc;
	}

	// fill data dau noi to list / reporting
	public static int countKeHoachKiemDemNuocByTypeUser(
			UserMapping userMapping, String maTinh,String kiemDemVienId,String tramCapNuocId,String trangThai, int start, int end) {
		int results = 0;
		try {

			if (userMapping.getUserType() == KeHoachKiemDemNuocConstantString.UserMapping.CAP_TU) {
				if(!maTinh.isEmpty()
						||!kiemDemVienId.isEmpty()
						||!tramCapNuocId.isEmpty()
						||!trangThai.isEmpty()){
					results = KeHoachKiemDemNuocLocalServiceUtil.countKeHoachKiemDemNuocSearch(maTinh,"", kiemDemVienId, tramCapNuocId, trangThai);
				}else{
					results = KeHoachKiemDemNuocLocalServiceUtil.getKeHoachKiemDemNuocsCount();
				}
				
			}else if (userMapping.getUserType() == KeHoachKiemDemNuocConstantString.UserMapping.CAP_TINH) {
				results = KeHoachKiemDemNuocLocalServiceUtil.countKeHoachKiemDemNuocSearch(userMapping.getOrgCode1(),"", kiemDemVienId, tramCapNuocId, trangThai);
			}else if (userMapping.getUserType() == KeHoachKiemDemNuocConstantString.UserMapping.CAP_HUYEN) {
				results = KeHoachKiemDemNuocLocalServiceUtil.countKeHoachKiemDemNuocSearch(userMapping.getOrgCode1(),userMapping.getOrgCode2(), kiemDemVienId, tramCapNuocId, trangThai);
			}else if (userMapping.getUserType() == KeHoachKiemDemNuocConstantString.UserMapping.CAP_TRAM) {
				TramCapNuoc tramCapUser = null;
				tramCapUser = TramCapBusiness.getTramCap(Long.valueOf(userMapping.getOrgCode2()));
				results = KeHoachKiemDemNuocLocalServiceUtil.countKeHoachKiemDemNuocSearch(tramCapUser.getMaTinh(), tramCapUser.getMaHuyen(), kiemDemVienId, tramCapUser.getId()+"", trangThai);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			_log.error(e);
		}
		return results;
	}
	public static List<KeHoachKiemDemNuocReportModel> getListKeHoachKiemDemNuocByTypeUser(
			UserMapping userMapping, String maTinh,String kiemDemVienId,String tramCapNuocId,String trangThai, int start, int end)  {
		List<KeHoachKiemDemNuocReportModel> results = new ArrayList<KeHoachKiemDemNuocReportModel>();
		List<KeHoachKiemDemNuoc> resultBase = new ArrayList<KeHoachKiemDemNuoc>();
		try {
//			_log.info("maTinh"+maTinh+"maHuyen"+maHuyen+"maXa"+maXa+"tramCapNuocId"+tramCapNuocId+"trangThai"+trangThai+"namBaoCao"+namBaoCao);
			if (userMapping.getUserType() == KeHoachKiemDemNuocConstantString.UserMapping.CAP_TU) {
				if(!maTinh.isEmpty()
						||!kiemDemVienId.isEmpty()
						||!tramCapNuocId.isEmpty()
						||!trangThai.isEmpty()){
					resultBase = KeHoachKiemDemNuocLocalServiceUtil.getKeHoachKiemDemNuocSearch(maTinh,"", kiemDemVienId, tramCapNuocId, trangThai,start, end);
				}else{
					resultBase = KeHoachKiemDemNuocLocalServiceUtil.getKeHoachKiemDemNuocSearch("","", "", "", "",start, end);
				}
				
			}else if (userMapping.getUserType() == KeHoachKiemDemNuocConstantString.UserMapping.CAP_TINH) {
				resultBase = KeHoachKiemDemNuocLocalServiceUtil.getKeHoachKiemDemNuocSearch(userMapping.getOrgCode1(),"", kiemDemVienId, tramCapNuocId, trangThai,start, end);
			}else if (userMapping.getUserType() == KeHoachKiemDemNuocConstantString.UserMapping.CAP_HUYEN) {
				resultBase = KeHoachKiemDemNuocLocalServiceUtil.getKeHoachKiemDemNuocSearch(userMapping.getOrgCode1(), userMapping.getOrgCode2(), kiemDemVienId, tramCapNuocId, trangThai,start, end);
			}else if (userMapping.getUserType() == KeHoachKiemDemNuocConstantString.UserMapping.CAP_TRAM) {
				TramCapNuoc tramCapUser = null;
				tramCapUser = TramCapBusiness.getTramCap(Long.valueOf(userMapping.getOrgCode2()));
				resultBase = KeHoachKiemDemNuocLocalServiceUtil.getKeHoachKiemDemNuocSearch(tramCapUser.getMaTinh(), tramCapUser.getMaHuyen(), kiemDemVienId, tramCapUser.getId()+"", trangThai,start, end);
			}
			int trangThaiChk = 0;
			for (KeHoachKiemDemNuoc keHoachKiemDemNuoc : resultBase) {
				if(Validator.isNull(keHoachKiemDemNuoc.getNgayXuatBan()) && Validator.isNull(keHoachKiemDemNuoc.getNgayDong())){
					trangThaiChk=0;
				}else if(Validator.isNotNull(keHoachKiemDemNuoc.getNgayXuatBan()) && Validator.isNull(keHoachKiemDemNuoc.getNgayDong())){
					trangThaiChk=1;
				}else if(Validator.isNotNull(keHoachKiemDemNuoc.getNgayXuatBan()) && Validator.isNotNull(keHoachKiemDemNuoc.getNgayDong())){
					trangThaiChk=2;
				}
				try {
					results.add(new KeHoachKiemDemNuocReportModel(keHoachKiemDemNuoc.getId(), 
							keHoachKiemDemNuoc.getNam()+"",
							NuocSachUtils.getNameTinh(TramCapBusiness.getTramCap(keHoachKiemDemNuoc.getTramCapNuocId()).getMaTinh()), 
							NuocSachUtils.getNameHuyen(TramCapBusiness.getTramCap(keHoachKiemDemNuoc.getTramCapNuocId()).getMaTinh(),TramCapBusiness.getTramCap(keHoachKiemDemNuoc.getTramCapNuocId()).getMaHuyen()), 
							TramCapBusiness.getTramCap(keHoachKiemDemNuoc.getTramCapNuocId()).getTenTram(), 
							(Validator.isNotNull(KiemDemVienBussiness.getKiemDemVien(keHoachKiemDemNuoc.getKiemDemVienId()))?KiemDemVienBussiness.getKiemDemVien(keHoachKiemDemNuoc.getKiemDemVienId()).getHoVaTen():StringPool.BLANK), 
							"trang-thai-ke-hoach-"+getStatusKeHoachKiemDem(keHoachKiemDemNuoc.getNgayXuatBan(), keHoachKiemDemNuoc.getNgayDong()),
							trangThaiChk,
							keHoachKiemDemNuoc.getIdNguoiTao(),
							0,""));
				} catch (Exception e) {
					// TODO: handle exception
				}
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			_log.error(e);
		}
		return results;
	}
	
	//them nam
	// fill data dau noi to list / reporting
		public static int countKeHoachKiemDemNuocByTypeUser(
				UserMapping userMapping, String maTinh,String kiemDemVienId,String tramCapNuocId,String trangThai,String nam,String idNguoiTao, int start, int end) {
			int results = 0;
			try {

				if (userMapping.getUserType() == KeHoachKiemDemNuocConstantString.UserMapping.CAP_TU) {
					if(!maTinh.isEmpty()
							||!kiemDemVienId.isEmpty()
							||!tramCapNuocId.isEmpty()
							||!nam.isEmpty()
							||!trangThai.isEmpty()){
						results = KeHoachKiemDemNuocLocalServiceUtil.countKeHoachKiemDemNuocSearchNam(maTinh,"", kiemDemVienId, tramCapNuocId, trangThai,nam, idNguoiTao);
					}else{
						results = KeHoachKiemDemNuocLocalServiceUtil.getKeHoachKiemDemNuocsCount();
					}
					
				}else if (userMapping.getUserType() == KeHoachKiemDemNuocConstantString.UserMapping.CAP_TINH) {
					results = KeHoachKiemDemNuocLocalServiceUtil.countKeHoachKiemDemNuocSearchNam(userMapping.getOrgCode1(),"", kiemDemVienId, tramCapNuocId, trangThai,nam, idNguoiTao);
				}else if (userMapping.getUserType() == KeHoachKiemDemNuocConstantString.UserMapping.CAP_HUYEN) {
					results = KeHoachKiemDemNuocLocalServiceUtil.countKeHoachKiemDemNuocSearchNam(userMapping.getOrgCode1(),"", kiemDemVienId, tramCapNuocId, trangThai,nam, idNguoiTao);
				}else if (userMapping.getUserType() == KeHoachKiemDemNuocConstantString.UserMapping.CAP_TRAM) {
					//TramCapNuoc tramCapUser = null;
					//tramCapUser = TramCapBusiness.getTramCap(Long.valueOf(userMapping.getOrgCode2()));
					results = KeHoachKiemDemNuocLocalServiceUtil.countKeHoachKiemDemNuocSearchNam(userMapping.getOrgCode1(), "", kiemDemVienId, tramCapNuocId, trangThai,nam, idNguoiTao);
				}
				
			} catch (Exception e) {
				// TODO: handle exception
				_log.error(e);
			}
			return results;
		}
		public static List<KeHoachKiemDemNuocReportModel> getListKeHoachKiemDemNuocByTypeUser(
				UserMapping userMapping, String maTinh,String kiemDemVienId,String tramCapNuocId,String trangThai,String nam, String idNguoiTao, int start, int end)  {
			List<KeHoachKiemDemNuocReportModel> results = new ArrayList<KeHoachKiemDemNuocReportModel>();
			List<KeHoachKiemDemNuoc> resultBase = new ArrayList<KeHoachKiemDemNuoc>();
			try {
//				_log.info("maTinh"+maTinh+"maHuyen"+maHuyen+"maXa"+maXa+"tramCapNuocId"+tramCapNuocId+"trangThai"+trangThai+"namBaoCao"+namBaoCao);
				if (userMapping.getUserType() == KeHoachKiemDemNuocConstantString.UserMapping.CAP_TU) {
					if(!maTinh.isEmpty()
							||!kiemDemVienId.isEmpty()
							||!tramCapNuocId.isEmpty()
							||!nam.isEmpty()
							||!trangThai.isEmpty()){
						resultBase = KeHoachKiemDemNuocLocalServiceUtil.getKeHoachKiemDemNuocSearchNam(maTinh,"", kiemDemVienId, tramCapNuocId, trangThai, nam, idNguoiTao,start, end);
					}else{
						resultBase = KeHoachKiemDemNuocLocalServiceUtil.getKeHoachKiemDemNuocSearchNam("","", "", "", "","","",start, end);
					}
					
				}else if (userMapping.getUserType() == KeHoachKiemDemNuocConstantString.UserMapping.CAP_TINH) {
					resultBase = KeHoachKiemDemNuocLocalServiceUtil.getKeHoachKiemDemNuocSearchNam(userMapping.getOrgCode1(),"", kiemDemVienId, tramCapNuocId, trangThai, nam, idNguoiTao,start, end);
				}else if (userMapping.getUserType() == KeHoachKiemDemNuocConstantString.UserMapping.CAP_HUYEN) {
					resultBase = KeHoachKiemDemNuocLocalServiceUtil.getKeHoachKiemDemNuocSearchNam(userMapping.getOrgCode1(), "", kiemDemVienId, tramCapNuocId, trangThai, nam, idNguoiTao,start, end);
				}else if (userMapping.getUserType() == KeHoachKiemDemNuocConstantString.UserMapping.CAP_TRAM) {
					//TramCapNuoc tramCapUser = null;
					//tramCapUser = TramCapBusiness.getTramCap(Long.valueOf(userMapping.getOrgCode2()));
					resultBase = KeHoachKiemDemNuocLocalServiceUtil.getKeHoachKiemDemNuocSearchNam(userMapping.getOrgCode1(), "", kiemDemVienId, tramCapNuocId, trangThai, nam, idNguoiTao,start, end);
				}
				int trangThaiChk = 0;
				for (KeHoachKiemDemNuoc keHoachKiemDemNuoc : resultBase) {
					if(Validator.isNull(keHoachKiemDemNuoc.getNgayXuatBan()) && Validator.isNull(keHoachKiemDemNuoc.getNgayDong())){
						trangThaiChk=0;
					}else if(Validator.isNotNull(keHoachKiemDemNuoc.getNgayXuatBan()) && Validator.isNull(keHoachKiemDemNuoc.getNgayDong())){
						trangThaiChk=1;
					}else if(Validator.isNotNull(keHoachKiemDemNuoc.getNgayXuatBan()) && Validator.isNotNull(keHoachKiemDemNuoc.getNgayDong())){
						trangThaiChk=2;
					}
					try {
						String gsv = "";
						
						KiemDemVien kdv = KiemDemVienBussiness.getKiemDemVien(keHoachKiemDemNuoc.getKiemDemVienId());
						
						if (Validator.isNotNull(kdv)) {
							gsv = kdv.getNameQuanLy();
						}
						
						results.add(new KeHoachKiemDemNuocReportModel(keHoachKiemDemNuoc.getId(), 
								keHoachKiemDemNuoc.getNam()+"",
								NuocSachUtils.getNameTinh(TramCapBusiness.getTramCap(keHoachKiemDemNuoc.getTramCapNuocId()).getMaTinh()), 
								NuocSachUtils.getNameHuyen(TramCapBusiness.getTramCap(keHoachKiemDemNuoc.getTramCapNuocId()).getMaTinh(),TramCapBusiness.getTramCap(keHoachKiemDemNuoc.getTramCapNuocId()).getMaHuyen()), 
								TramCapBusiness.getTramCap(keHoachKiemDemNuoc.getTramCapNuocId()).getTenTram(), 
								(Validator.isNotNull(KiemDemVienBussiness.getKiemDemVien(keHoachKiemDemNuoc.getKiemDemVienId()))?KiemDemVienBussiness.getKiemDemVien(keHoachKiemDemNuoc.getKiemDemVienId()).getHoVaTen():StringPool.BLANK), 
								"trang-thai-ke-hoach-"+getStatusKeHoachKiemDem(keHoachKiemDemNuoc.getNgayXuatBan(), keHoachKiemDemNuoc.getNgayDong()),
								trangThaiChk,
								keHoachKiemDemNuoc.getIdNguoiTao(),
								getSumDauNoiBykeHoachKiemDemNuocId(keHoachKiemDemNuoc.getId()),
								gsv));
					} catch (Exception e) {
						// TODO: handle exception
					}
					
				}
			} catch (Exception e) {
				// TODO: handle exception
				_log.error(e);
			}
			return results;
		}
	public static int getStatusKeHoachKiemDem(Date ngayxuatban,Date ngaydong){
		int result = 0;
		if(Validator.isNull(ngayxuatban) && Validator.isNull(ngaydong)){
			result = 0;
		}
		if(Validator.isNotNull(ngayxuatban) && Validator.isNull(ngaydong)){
			result = 1;
		}
		if(Validator.isNotNull(ngayxuatban) && Validator.isNotNull(ngaydong)){
			result = 2;
		}
		return result;
	}
	public static List<ThongTinKiemDemNuocModel> getListThongTinKiemDemNuocModelByDauNoiId(
			long dauNoiNuocId, int start, int end) {
		List<ThongTinKiemDemNuocModel> results = new ArrayList<ThongTinKiemDemNuocModel>();
		List<THONGTINKIEMDEMNUOC> resultBase = new ArrayList<THONGTINKIEMDEMNUOC>();
			try {
				
				resultBase = THONGTINKIEMDEMNUOCLocalServiceUtil.getListByDauNoiId(dauNoiNuocId, start, end);
				
				for (THONGTINKIEMDEMNUOC thongtinkiemdemnuoc : resultBase) {
					results.add(new ThongTinKiemDemNuocModel(thongtinkiemdemnuoc.getId(), 
							StringPool.BLANK, 
							Validator.isNotNull(thongtinkiemdemnuoc.getNgayKiemDem())?sdf.format(thongtinkiemdemnuoc.getNgayKiemDem()):StringPool.BLANK, 
							thongtinkiemdemnuoc.getTaiKhoan(), 
							thongtinkiemdemnuoc.getTenChuHo(), 
							String.valueOf(thongtinkiemdemnuoc.getDaKetThucDieuTra())));
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
	
	//data
		public static int countDataItems(String maTinh,String maHuyen,String maXa, int start, int end) {
			int results = 0;
			try {

				if (maTinh.isEmpty() && maHuyen.isEmpty() && maXa.isEmpty()) {
					results = DataItemBusiness.countByDataGroupId(WebKeys.DATAGROUPID_DONVIHANHCHINH);
				}else{
					results = DauNoiNuocLocalServiceUtil.getDataItemSearch(maTinh, maHuyen, maXa, QueryUtil.ALL_POS, QueryUtil.ALL_POS).size();
				}
				
			} catch (Exception e) {
				// TODO: handle exception
				_log.error(e);
			}
			return results;
		}
		public static List<DataItemReportModel> getListDataItems(String maTinh,String maHuyen,String maXa, int start, int end) {
			List<DataItemReportModel> results = new ArrayList<DataItemReportModel>();
			List<DATAITEM> resultBase = new ArrayList<DATAITEM>();
			try {
				_log.info("maTinh.isEmpty() && maHuyen.isEmpty() && maXa.isEmpty()"+(maTinh.isEmpty() && maHuyen.isEmpty() && maXa.isEmpty()));
				if (maTinh.isEmpty() && maHuyen.isEmpty() && maXa.isEmpty()) {
					resultBase = DataItemBusiness.getByDataGroupId(WebKeys.DATAGROUPID_DONVIHANHCHINH,start, end);
				}else{
					resultBase = DauNoiNuocLocalServiceUtil.getDataItemSearch(maTinh, maHuyen, maXa,start, end);
				}
				long tongDauNoi = 0;
				int initUserType = DauNoiNuocConstantString.UserMapping.CAP_TU;
				for (DATAITEM dataItem : resultBase) {
					_log.info("dataItem.getNode1(), dataItem.getNode2(), dataItem.getNode3()"+dataItem.getNode1() +"/"+ dataItem.getNode2()+"/"+ dataItem.getNode3());
//					tongDauNoi = DauNoiNuocBusiness.countDauNoiByTypeUser(initUserType, "", dataItem.getNode1(), dataItem.getNode2(), dataItem.getNode3(), "", "", "", start, end);
					_log.info("tongDauNoi"+tongDauNoi);
					results.add(new DataItemReportModel(dataItem.getId(), 
							"", 
							NuocSachUtils.getNameTinh(dataItem.getNode1()), 
							NuocSachUtils.getNameHuyen(dataItem.getNode1(),dataItem.getNode2()), 
							NuocSachUtils.getNameXa(dataItem.getNode3()), 
							String.valueOf(tongDauNoi)));
					
				}
			} catch (Exception e) {
				// TODO: handle exception
				_log.error(e);
			}
			return results;
		}
		public static List<ThongTinKiemDemNuocModel> getListThongTinKiemDemNuocModelByKeHoachId(
				int keHoachId, int start, int end) {
			List<ThongTinKiemDemNuocModel> results = new ArrayList<ThongTinKiemDemNuocModel>();
			List<THONGTINKIEMDEMNUOC> resultBase = new ArrayList<THONGTINKIEMDEMNUOC>();
				try {
					
					resultBase = THONGTINKIEMDEMNUOCLocalServiceUtil.getListBykeHoachKiemDemNuocId(keHoachId, start, end);
					
					for (THONGTINKIEMDEMNUOC thongtinkiemdemnuoc : resultBase) {
						results.add(new ThongTinKiemDemNuocModel(thongtinkiemdemnuoc.getId(), 
								StringPool.BLANK, 
								Validator.isNotNull(thongtinkiemdemnuoc.getNgayKiemDem())?sdf.format(thongtinkiemdemnuoc.getNgayKiemDem()):StringPool.BLANK, 
								thongtinkiemdemnuoc.getTaiKhoan(), 
								thongtinkiemdemnuoc.getTenChuHo(), 
								String.valueOf(thongtinkiemdemnuoc.getDaKetThucDieuTra())));
					}
				} catch (SystemException e) {
					// TODO Auto-generated catch block
					_log.error(e);
				}
			return results;
		
		}
		
		public static List<ThongTinKiemDemNuocModel> getListThongTinKiemDemNuocModelByKeHoachIdInfo(
				int keHoachId, int start, int end) {
			List<ThongTinKiemDemNuocModel> results = new ArrayList<ThongTinKiemDemNuocModel>();
			List<THONGTINKIEMDEMNUOC> resultBase = new ArrayList<THONGTINKIEMDEMNUOC>();
				try {
					
					resultBase = THONGTINKIEMDEMNUOCLocalServiceUtil.getListBykeHoachKiemDemNuocId(keHoachId, start, end);
					
					for (THONGTINKIEMDEMNUOC thongtinkiemdemnuoc : resultBase) {
						results.add(new ThongTinKiemDemNuocModel(thongtinkiemdemnuoc.getId(), 
								thongtinkiemdemnuoc.getTenChuHo(), 
								NuocSachUtils.getNameHuyen(thongtinkiemdemnuoc.getMaTinh(),thongtinkiemdemnuoc.getMaHuyen()), 
								NuocSachUtils.getNameXa(thongtinkiemdemnuoc.getMaXa()), 
								thongtinkiemdemnuoc.getThonXom(), 
								Validator.isNotNull(thongtinkiemdemnuoc.getThoiGianDauHopDong())?sdf.format(thongtinkiemdemnuoc.getThoiGianDauHopDong()):StringPool.BLANK, 
								""));
					}
				} catch (SystemException e) {
					// TODO Auto-generated catch block
					_log.error(e);
				}
			return results;
		
		}
		public static List<ThongTinKiemDemNuocModel> getListThongTinKiemDemNuocModelViewDetail(
				int keHoachId,String trangThai,String maTinh,String maHuyen,String maXa,String nguonDL, String danhGiaKiemDem, String advText, int start, int end) {
			List<ThongTinKiemDemNuocModel> results = new ArrayList<ThongTinKiemDemNuocModel>();
			List<THONGTINKIEMDEMNUOC> resultBase = new ArrayList<THONGTINKIEMDEMNUOC>();
				try {
					
					resultBase = THONGTINKIEMDEMNUOCLocalServiceUtil.getThongTinKeHoachKiemDemNuocSearch(keHoachId+"", trangThai, maTinh, maHuyen, maXa,nguonDL,danhGiaKiemDem, advText, start, end);
					
					for (THONGTINKIEMDEMNUOC thongtinkiemdemnuoc : resultBase) {
						results.add(new ThongTinKiemDemNuocModel(thongtinkiemdemnuoc.getId(), 
								thongtinkiemdemnuoc.getTenChuHo(), 
								NuocSachUtils.getNameHuyen(thongtinkiemdemnuoc.getMaTinh(),thongtinkiemdemnuoc.getMaHuyen()), 
								NuocSachUtils.getNameXa(thongtinkiemdemnuoc.getMaXa()), 
								thongtinkiemdemnuoc.getThonXom(),
								Validator.isNotNull(thongtinkiemdemnuoc.getNgayKiemDem())?sdf.format(thongtinkiemdemnuoc.getNgayKiemDem()):StringPool.BLANK,
								"da-ket-thuc-dieu-tra-"+thongtinkiemdemnuoc.getDaKetThucDieuTra()+"", 
								"",
								"danh-gia-kiem-dem-"+thongtinkiemdemnuoc.getDanhGiaKiemDem()));
					}
				} catch (SystemException e) {
					// TODO Auto-generated catch block
					_log.error(e);
				}
			return results;
		
		}
		public static int countListThongTinKiemDemNuocModelViewDetail(
				int keHoachId,String trangThai,String maTinh,String maHuyen,String maXa,String nguonDL, String danhGiaKiemDem, String advText) {
			int result = 0;
				try {
					
					result = THONGTINKIEMDEMNUOCLocalServiceUtil.getThongTinKeHoachKiemDemNuocSearch(keHoachId+"", trangThai, maTinh, maHuyen, maXa,nguonDL, danhGiaKiemDem, advText, QueryUtil.ALL_POS, QueryUtil.ALL_POS).size();
					
				} catch (SystemException e) {
					// TODO Auto-generated catch block
					_log.error(e);
				}
			return result;
		
		}
		public static int countListThongTinKiemDemNuocModelByKeHoachId(
				int keHoachId) {
			int result = 0;
				try {
					
					result = THONGTINKIEMDEMNUOCLocalServiceUtil.getListByDauNoiId(keHoachId, QueryUtil.ALL_POS, QueryUtil.ALL_POS).size();
					
				} catch (SystemException e) {
					// TODO Auto-generated catch block
					_log.error(e);
				}
			return result;
		
		}
		public static List<DATAITEM> getHuyenKeHoachKiemDemNuocSearch(String keHoachId,String trangThai,String maTinh,int start,int end) {
			List<DATAITEM> listHuyen = new ArrayList<DATAITEM>();
				List<String> listStr = new ArrayList<String>();
				try {
					listStr = THONGTINKIEMDEMNUOCLocalServiceUtil.getHuyenXaKeHoachKiemDemNuocSearch(keHoachId, trangThai, maTinh, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
					String[] splitStr = new String[listStr.size()];
					for (String string : listStr) {
						if(string.contains(",") && Validator.isNotNull(string)){
							splitStr = string.split(",");
							if(Validator.isNotNull(splitStr[0]) && Validator.isNotNull(splitStr[1])){
								boolean isOk = true;
								for (DATAITEM huyen : listHuyen) {
									if(Validator.isNotNull(NuocSachUtils.getDATAITEMHuyen(splitStr[0], splitStr[1]))){
										if(huyen.getId() == NuocSachUtils.getDATAITEMHuyen(splitStr[0], splitStr[1]).getId()){
											isOk = false;
											break;
										}
									}
								}
								if(isOk){
									listHuyen.add(NuocSachUtils.getDATAITEMHuyen(splitStr[0], splitStr[1]));
								}
								
							}else{
								listHuyen.add(new DATAITEMImpl());
							}
							
						}
						
					}
				} catch (SystemException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			return listHuyen;
		}
		public static List<DATAITEM> getXaKeHoachKiemDemNuocSearch(String keHoachId,String trangThai,String maTinh,int start,int end) {
			List<DATAITEM> listXa = new ArrayList<DATAITEM>();
				List<String> listStr = new ArrayList<String>();
				try {
					listStr = THONGTINKIEMDEMNUOCLocalServiceUtil.getHuyenXaKeHoachKiemDemNuocSearch(keHoachId, trangThai, maTinh, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
					String[] splitStr = new String[listStr.size()];
					for (String string : listStr) {
						if(string.contains(",") && Validator.isNotNull(string)){
							splitStr = string.split(",");
							if(Validator.isNotNull(splitStr[2])){
								boolean isOk = true;
								for (DATAITEM xa : listXa) {
									if(Validator.isNotNull(NuocSachUtils.getDataItem(1, 3, splitStr[2]))){
										if(xa.getId() == NuocSachUtils.getDataItem(1, 3, splitStr[2]).getId()){
											isOk = false;
											break;
										}
									}
								}
								if(isOk){
									listXa.add(NuocSachUtils.getDataItem(1, 3, splitStr[2]));
								}
							}else{
								listXa.add(new DATAITEMImpl());
							}
							
						}
						
					}
				} catch (SystemException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			return listXa;
		}
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private static Log _log = LogFactoryUtil.getLog(KeHoachKiemDemNuocBusiness.class);
}
