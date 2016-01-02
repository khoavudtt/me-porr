package vn.dtt.sol.ns.vesinhmoitruong.business;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import vn.dtt.cmon.dm.dao.model.DATAITEM;
import vn.dtt.cmon.dm.dao.model.impl.DATAITEMImpl;
import vn.dtt.cmon.kiemdemvien.dao.model.KiemDemVien;
import vn.dtt.cmon.user.dao.model.UserMapping;
import vn.dtt.sol.ns.business.KiemDemVienBussiness;
import vn.dtt.sol.ns.kehoachkiemdemnuoc.constant.KeHoachKiemDemNuocConstantString;
import vn.dtt.sol.ns.reporting.KeHoachKiemDemVeSinhReportModel;
import vn.dtt.sol.ns.reporting.ThongTinKiemDemNuocModel;
import vn.dtt.sol.ns.reporting.ThongTinKiemDemVeSinhCongTrinhModel;
import vn.dtt.sol.ns.reporting.ThongTinKiemDemVeSinhGiaDinhModel;
import vn.dtt.sol.ns.tramcap.dao.service.THONGTINKIEMDEMNUOCLocalServiceUtil;
import vn.dtt.sol.ns.util.NuocSachUtils;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.ChiTietKiemDemCongTrinh;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.KeHoachKiemDemVeSinh;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD;
import vn.dtt.sol.ns.vesinhmoitruong.dao.service.ChiTietKiemDemCongTrinhLocalServiceUtil;
import vn.dtt.sol.ns.vesinhmoitruong.dao.service.KeHoachKiemDemVeSinhLocalServiceUtil;
import vn.dtt.sol.ns.vesinhmoitruong.dao.service.ThongTinKiemDemCongTrinhLocalServiceUtil;
import vn.dtt.sol.ns.vesinhmoitruong.dao.service.ThongTinKiemDemHoGDLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;

public class KeHoachKiemDemVeSinhBussiness {
	// fill data dau noi to list / reporting
		public static int countKeHoachKiemDemVeSInhByTypeUser(
				UserMapping userMapping, String maTinh, String maHuyen,String kiemDemVienId,String trangThai, String idNguoiTao, int start, int end) {
			int results = 0;
			try {

				if (userMapping.getUserType() == KeHoachKiemDemNuocConstantString.UserMapping.CAP_TU) {
					if(Validator.isNotNull(maTinh)
							||Validator.isNotNull(kiemDemVienId)
							||Validator.isNotNull(trangThai)){
						results = KeHoachKiemDemVeSinhLocalServiceUtil.countKeHoachKiemDemVeSinhSearch(maTinh, maHuyen, kiemDemVienId, trangThai, idNguoiTao);
					}else{
						results = KeHoachKiemDemVeSinhLocalServiceUtil.getKeHoachKiemDemVeSinhsCount();
					}
					
				}else if (userMapping.getUserType() == KeHoachKiemDemNuocConstantString.UserMapping.CAP_TINH) {
					results = KeHoachKiemDemVeSinhLocalServiceUtil.countKeHoachKiemDemVeSinhSearch(userMapping.getOrgCode1(),maHuyen, kiemDemVienId, trangThai, idNguoiTao);
				}else if (userMapping.getUserType() == KeHoachKiemDemNuocConstantString.UserMapping.CAP_HUYEN) {
					results = KeHoachKiemDemVeSinhLocalServiceUtil.countKeHoachKiemDemVeSinhSearch(userMapping.getOrgCode1(),userMapping.getOrgCode2(), kiemDemVienId, trangThai, idNguoiTao);
				}
				
			} catch (Exception e) {
				// TODO: handle exception
				_log.error(e);
			}
			return results;
		}
		public static List<KeHoachKiemDemVeSinhReportModel> getListKeHoachKiemDemVeSInhByTypeUser(
				UserMapping userMapping, String maTinh, String maHuyen,String kiemDemVienId,String trangThai, String idNguoiTao, int start, int end)  {
			List<KeHoachKiemDemVeSinhReportModel> results = new ArrayList<KeHoachKiemDemVeSinhReportModel>();
			List<KeHoachKiemDemVeSinh> resultBase = new ArrayList<KeHoachKiemDemVeSinh>();
			
			try {
				_log.info("maTinh"+maTinh+"maHuyen"+maHuyen+"maXa"+"tramCapNuocId"+"trangThai"+trangThai+"namBaoCao");
				if (userMapping.getUserType() == KeHoachKiemDemNuocConstantString.UserMapping.CAP_TU) {
					if(Validator.isNotNull(maTinh)
							||Validator.isNotNull(kiemDemVienId)
							||Validator.isNotNull(trangThai)){
						resultBase = KeHoachKiemDemVeSinhLocalServiceUtil.getKeHoachKiemDemVeSinhSearch(maTinh, maHuyen, kiemDemVienId, trangThai, idNguoiTao, start, end);
					}else{
						resultBase = KeHoachKiemDemVeSinhLocalServiceUtil.getKeHoachKiemDemVeSinhSearch("", "", "", "","", start, end);
					}
					
				}else if (userMapping.getUserType() == KeHoachKiemDemNuocConstantString.UserMapping.CAP_TINH) {
					resultBase = KeHoachKiemDemVeSinhLocalServiceUtil.getKeHoachKiemDemVeSinhSearch(userMapping.getOrgCode1(),maHuyen, kiemDemVienId, trangThai, idNguoiTao,start, end);
				}else if (userMapping.getUserType() == KeHoachKiemDemNuocConstantString.UserMapping.CAP_HUYEN) {
					
					resultBase = KeHoachKiemDemVeSinhLocalServiceUtil.getKeHoachKiemDemVeSinhSearch(userMapping.getOrgCode1(),maHuyen, kiemDemVienId, trangThai, idNguoiTao,start, end);
					//resultBase = KeHoachKiemDemVeSinhLocalServiceUtil.getKeHoachKiemDemVeSinhSearch(userMapping.getOrgCode1(), userMapping.getOrgCode2(), kiemDemVienId, trangThai, idNguoiTao,start, end);
				} 
				int trangThaiChk = 0;
				for (KeHoachKiemDemVeSinh keHoachKiemDemVeSinh : resultBase) {
					if(Validator.isNull(keHoachKiemDemVeSinh.getNgayXuatBan()) && Validator.isNull(keHoachKiemDemVeSinh.getNgayDong())){
						trangThaiChk=0;
					}else if(Validator.isNotNull(keHoachKiemDemVeSinh.getNgayXuatBan()) && Validator.isNull(keHoachKiemDemVeSinh.getNgayDong())){
						trangThaiChk=1;
					}else if(Validator.isNotNull(keHoachKiemDemVeSinh.getNgayXuatBan()) && Validator.isNotNull(keHoachKiemDemVeSinh.getNgayDong())){
						trangThaiChk=2;
					}
					try {

						String gsv = "";
						
						KiemDemVien kdv = KiemDemVienBussiness.getKiemDemVien(keHoachKiemDemVeSinh.getKiemDemVienID());
						
						if (Validator.isNotNull(kdv)) {
							gsv = kdv.getNameQuanLy();
						}
						
						results.add(new KeHoachKiemDemVeSinhReportModel(keHoachKiemDemVeSinh.getId(), 
								ThongTinKiemDemHoGDLocalServiceUtil.getSumHDGBykeHoachKiemDemVsId(keHoachKiemDemVeSinh.getId()) +" / " + ThongTinKiemDemCongTrinhLocalServiceUtil.getSumCtBykeHoachKiemDemVsId(keHoachKiemDemVeSinh.getId()),
								NuocSachUtils.getNameTinh(keHoachKiemDemVeSinh.getMaTinh()), 
								NuocSachUtils.getNameHuyen(keHoachKiemDemVeSinh.getMaTinh(),keHoachKiemDemVeSinh.getMaHuyen()), 
								keHoachKiemDemVeSinh.getKiemDemVienID()>0?KiemDemVienBussiness.getKiemDemVien(keHoachKiemDemVeSinh.getKiemDemVienID()).getHoVaTen():StringPool.BLANK, 
								"trang-thai-ke-hoach-"+getStatusKeHoachKiemDem(keHoachKiemDemVeSinh.getNgayXuatBan(), keHoachKiemDemVeSinh.getNgayDong()),
								trangThaiChk,
								keHoachKiemDemVeSinh.getIdNguoiTao(),
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
		public static KeHoachKiemDemVeSinh fetchKeHoachKiemDemVeSinh(int id) {
			KeHoachKiemDemVeSinh keHoachKiemDemVeSinh = null;
			try {
				keHoachKiemDemVeSinh = KeHoachKiemDemVeSinhLocalServiceUtil.fetchKeHoachKiemDemVeSinh(id);
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return keHoachKiemDemVeSinh;
		}
		
		public static List<ThongTinKiemDemVeSinhGiaDinhModel> getListThongTinKiemDemGdModelViewDetail(
				int keHoachId,String trangThai,String maTinh,String maHuyen,String maXa, String danhGiaKiemDem, int start, int end) {
			List<ThongTinKiemDemVeSinhGiaDinhModel> results = new ArrayList<ThongTinKiemDemVeSinhGiaDinhModel>();
			List<ThongTinKiemDemHoGD> resultBase = new ArrayList<ThongTinKiemDemHoGD>();
				
			try {
					
					resultBase = KeHoachKiemDemVeSinhLocalServiceUtil.getThongTinKeHoachKiemDemVeSinhGdSearch(keHoachId+"", trangThai, maTinh, maHuyen, maXa, danhGiaKiemDem, start, end);
					_log.info("resultBase"+resultBase.size());
					for (ThongTinKiemDemHoGD ThongTinKiemDemHoGD : resultBase) {
						results.add(new ThongTinKiemDemVeSinhGiaDinhModel(ThongTinKiemDemHoGD.getId(), 
								ThongTinKiemDemHoGD.getTenChuHo(), 
								NuocSachUtils.getNameHuyen(ThongTinKiemDemHoGD.getMaTinh(),ThongTinKiemDemHoGD.getMaHuyen()), 
								NuocSachUtils.getNameXa(ThongTinKiemDemHoGD.getMaXa()), 
								ThongTinKiemDemHoGD.getThonXom(),
								Validator.isNotNull(ThongTinKiemDemHoGD.getNgayKiemDem())?sdf.format(ThongTinKiemDemHoGD.getNgayKiemDem()):StringPool.BLANK,
								"da-ket-thuc-dieu-tra-"+ThongTinKiemDemHoGD.getDaKetThucDieuTra()+"", 
								"",
								"danh-gia-kiem-dem-"+ThongTinKiemDemHoGD.getDanhGiaKiemDem()));
					}
				} catch (SystemException e) {
					// TODO Auto-generated catch block
					_log.error(e);
				}
			return results;
		
		}
		public static List<ThongTinKiemDemVeSinhCongTrinhModel> getListThongTinKiemDemCongTrinhModelViewDetail(
				int keHoachId,String trangThai,String maTinh,String maHuyen,String maXa, String danhGiaKiemDem, int start, int end) {
			List<ThongTinKiemDemVeSinhCongTrinhModel> results = new ArrayList<ThongTinKiemDemVeSinhCongTrinhModel>();
			List<ThongTinKiemDemCongTrinh> resultBase = new ArrayList<ThongTinKiemDemCongTrinh>();
				
			try {
					
					resultBase = KeHoachKiemDemVeSinhLocalServiceUtil.getThongTinKeHoachKiemDemVeSinhCongTrinhSearch(keHoachId+"", trangThai, maTinh, maHuyen, maXa, danhGiaKiemDem, start, end);
					_log.info("resultBase"+resultBase.size());
					for (ThongTinKiemDemCongTrinh ThongTinKiemDemHoGD : resultBase) {
						results.add(new ThongTinKiemDemVeSinhCongTrinhModel(ThongTinKiemDemHoGD.getId(), 
								ThongTinKiemDemHoGD.getTenCongTrinh(), 
								NuocSachUtils.getNameHuyen(ThongTinKiemDemHoGD.getMaTinh(),ThongTinKiemDemHoGD.getMaHuyen()), 
								NuocSachUtils.getNameXa(ThongTinKiemDemHoGD.getMaXa()), 
								ThongTinKiemDemHoGD.getDiaChi(),
								Validator.isNotNull(ThongTinKiemDemHoGD.getNgayKiemDem())?sdf.format(ThongTinKiemDemHoGD.getNgayKiemDem()):StringPool.BLANK,
								"da-ket-thuc-dieu-tra-"+ThongTinKiemDemHoGD.getDaKetThucDieuTra()+"", 
								"",
								"danh-gia-kiem-dem-"+ThongTinKiemDemHoGD.getDanhGiaKiemDem()));
					}
				} catch (SystemException e) {
					// TODO Auto-generated catch block
					_log.error(e);
				}
			return results;
		
		}
		public static int countListThongTinKiemDemVeSinhGdModelViewDetail(
				int keHoachId,String trangThai,String maTinh,String maHuyen,String maXa,String danhGiaKiemDem) {
			int result = 0;
				try {
					result = KeHoachKiemDemVeSinhLocalServiceUtil.getThongTinKeHoachKiemDemVeSinhGdSearch(keHoachId+"", trangThai, maTinh, maHuyen, maXa, danhGiaKiemDem, QueryUtil.ALL_POS, QueryUtil.ALL_POS).size();
				} catch (SystemException e) {
					// TODO Auto-generated catch block
					_log.error(e);
				}
			return result;
		
		}
		public static int countListThongTinKiemDemVeSinhCongTrinhModelViewDetail(
				int keHoachId,String trangThai,String maTinh,String maHuyen,String maXa, String danhGiaKiemDem) {
			int result = 0;
				try {
					result = KeHoachKiemDemVeSinhLocalServiceUtil.getThongTinKeHoachKiemDemVeSinhCongTrinhSearch(keHoachId+"", trangThai, maTinh, maHuyen, maXa, danhGiaKiemDem, QueryUtil.ALL_POS, QueryUtil.ALL_POS).size();
				} catch (SystemException e) {
					// TODO Auto-generated catch block
					_log.error(e);
				}
			return result;
		
		}
		
		//with thon xom, nguon du lieu
		public static List<ThongTinKiemDemVeSinhGiaDinhModel> getListThongTinKiemDemGdModelViewDetailWithThonXom(
				int keHoachId,String trangThai,String maTinh,String maHuyen,String maXa, String danhGiaKiemDem,String thonXom,String nguonDL, int start, int end) {
			List<ThongTinKiemDemVeSinhGiaDinhModel> results = new ArrayList<ThongTinKiemDemVeSinhGiaDinhModel>();
			List<ThongTinKiemDemHoGD> resultBase = new ArrayList<ThongTinKiemDemHoGD>();
				
			try {
					
					resultBase = KeHoachKiemDemVeSinhLocalServiceUtil.getThongTinKeHoachKiemDemVeSinhGdSearchWithThonXom(keHoachId+"", trangThai, maTinh, maHuyen, maXa, danhGiaKiemDem, thonXom,nguonDL, start, end);
					_log.info("resultBase"+resultBase.size());
					for (ThongTinKiemDemHoGD ThongTinKiemDemHoGD : resultBase) {
						results.add(new ThongTinKiemDemVeSinhGiaDinhModel(ThongTinKiemDemHoGD.getId(), 
								ThongTinKiemDemHoGD.getTenChuHo(), 
								NuocSachUtils.getNameHuyen(ThongTinKiemDemHoGD.getMaTinh(),ThongTinKiemDemHoGD.getMaHuyen()), 
								NuocSachUtils.getNameXa(ThongTinKiemDemHoGD.getMaXa()), 
								ThongTinKiemDemHoGD.getThonXom(),
								Validator.isNotNull(ThongTinKiemDemHoGD.getNgayKiemDem())?sdf.format(ThongTinKiemDemHoGD.getNgayKiemDem()):StringPool.BLANK,
								"da-ket-thuc-dieu-tra-"+ThongTinKiemDemHoGD.getDaKetThucDieuTra()+"", 
								"",
								"danh-gia-kiem-dem-"+ThongTinKiemDemHoGD.getDanhGiaKiemDem()));
					}
				} catch (SystemException e) {
					// TODO Auto-generated catch block
					_log.error(e);
				}
			return results;
		
		}
		public static List<ThongTinKiemDemVeSinhCongTrinhModel> getListThongTinKiemDemCongTrinhModelViewDetailWithThonXom(
				int keHoachId,String trangThai,String maTinh,String maHuyen,String maXa, String danhGiaKiemDem,String thonXom, int start, int end) {
			List<ThongTinKiemDemVeSinhCongTrinhModel> results = new ArrayList<ThongTinKiemDemVeSinhCongTrinhModel>();
			List<ThongTinKiemDemCongTrinh> resultBase = new ArrayList<ThongTinKiemDemCongTrinh>();
				
			try {
					
					resultBase = KeHoachKiemDemVeSinhLocalServiceUtil.getThongTinKeHoachKiemDemVeSinhCongTrinhSearchWithThonXom(keHoachId+"", trangThai, maTinh, maHuyen, maXa, danhGiaKiemDem, thonXom, start, end);
					_log.info("resultBase"+resultBase.size());
					for (ThongTinKiemDemCongTrinh ThongTinKiemDemHoGD : resultBase) {
						results.add(new ThongTinKiemDemVeSinhCongTrinhModel(ThongTinKiemDemHoGD.getId(), 
								ThongTinKiemDemHoGD.getTenCongTrinh(), 
								NuocSachUtils.getNameHuyen(ThongTinKiemDemHoGD.getMaTinh(),ThongTinKiemDemHoGD.getMaHuyen()), 
								NuocSachUtils.getNameXa(ThongTinKiemDemHoGD.getMaXa()), 
								ThongTinKiemDemHoGD.getDiaChi(),
								Validator.isNotNull(ThongTinKiemDemHoGD.getNgayKiemDem())?sdf.format(ThongTinKiemDemHoGD.getNgayKiemDem()):StringPool.BLANK,
								"da-ket-thuc-dieu-tra-"+ThongTinKiemDemHoGD.getDaKetThucDieuTra()+"", 
								"",
								"danh-gia-kiem-dem-cong-trinh-"+ThongTinKiemDemHoGD.getDanhGiaKiemDem()));
					}
				} catch (SystemException e) {
					// TODO Auto-generated catch block
					_log.error(e);
				}
			return results;
		
		}
		public static int countListThongTinKiemDemVeSinhGdModelViewDetailWithThonXom(
				int keHoachId,String trangThai,String maTinh,String maHuyen,String maXa,String danhGiaKiemDem,String thonXom,String nguonDL) {
			int result = 0;
				try {
					result = KeHoachKiemDemVeSinhLocalServiceUtil.getThongTinKeHoachKiemDemVeSinhGdSearchWithThonXom(keHoachId+"", trangThai, maTinh, maHuyen, maXa, danhGiaKiemDem, thonXom,nguonDL, QueryUtil.ALL_POS, QueryUtil.ALL_POS).size();
				} catch (SystemException e) {
					// TODO Auto-generated catch block
					_log.error(e);
				}
			return result;
		
		}
		public static int countListThongTinKiemDemVeSinhCongTrinhModelViewDetailWithThonXom(
				int keHoachId,String trangThai,String maTinh,String maHuyen,String maXa, String danhGiaKiemDem,String thonXom) {
			int result = 0;
				try {
					result = KeHoachKiemDemVeSinhLocalServiceUtil.getThongTinKeHoachKiemDemVeSinhCongTrinhSearchWithThonXom(keHoachId+"", trangThai, maTinh, maHuyen, maXa, danhGiaKiemDem, thonXom, QueryUtil.ALL_POS, QueryUtil.ALL_POS).size();
				} catch (SystemException e) {
					// TODO Auto-generated catch block
					_log.error(e);
				}
			return result;
		
		}
		public static List<DATAITEM> getHuyenKeHoachKiemDemVeSinhGdSearch(String keHoachId,String trangThai,String maTinh,int start,int end) {
			List<DATAITEM> listHuyen = new ArrayList<DATAITEM>();
				List<String> listStr = new ArrayList<String>();
				try {
					listStr = KeHoachKiemDemVeSinhLocalServiceUtil.getHuyenXaKeHoachKiemDemGiaDinhSearch(keHoachId, trangThai, maTinh, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
					String[] splitStr = new String[listStr.size()];
					for (String string : listStr) {
						if(string.contains(",") && Validator.isNotNull(string)){
							splitStr = string.split(",");
							if(Validator.isNotNull(splitStr[0]) && Validator.isNotNull(splitStr[1])){
								listHuyen.add(NuocSachUtils.getDATAITEMHuyen(splitStr[0], splitStr[1]));
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
		public static List<DATAITEM> getXaKeHoachKiemDemVeSinhGdSearch(String keHoachId,String trangThai,String maTinh,int start,int end) {
			List<DATAITEM> listXa = new ArrayList<DATAITEM>();
				List<String> listStr = new ArrayList<String>();
				try {
					listStr = KeHoachKiemDemVeSinhLocalServiceUtil.getHuyenXaKeHoachKiemDemGiaDinhSearch(keHoachId, trangThai, maTinh, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
					String[] splitStr = new String[listStr.size()];
					for (String string : listStr) {
						if(string.contains(",") && Validator.isNotNull(string)){
							splitStr = string.split(",");
							if(Validator.isNotNull(splitStr[2])){
								listXa.add(NuocSachUtils.getDataItem(1, 3, splitStr[2]));
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
		public static List<DATAITEM> getHuyenKeHoachKiemDemVeSinhCongTrinhSearch(String keHoachId,String trangThai,String maTinh,int start,int end) {
			List<DATAITEM> listHuyen = new ArrayList<DATAITEM>();
				List<String> listStr = new ArrayList<String>();
				try {
					listStr = KeHoachKiemDemVeSinhLocalServiceUtil.getHuyenXaKeHoachKiemDemCongTrinhSearch(keHoachId, trangThai, maTinh, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
					String[] splitStr = new String[listStr.size()];
					for (String string : listStr) {
						if(string.contains(",") && Validator.isNotNull(string)){
							splitStr = string.split(",");
							if(Validator.isNotNull(splitStr[0]) && Validator.isNotNull(splitStr[1])){
								listHuyen.add(NuocSachUtils.getDATAITEMHuyen(splitStr[0], splitStr[1]));
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
		public static List<DATAITEM> getXaKeHoachKiemDemVeSinhCongTrinhSearch(String keHoachId,String trangThai,String maTinh,int start,int end) {
			List<DATAITEM> listXa = new ArrayList<DATAITEM>();
				List<String> listStr = new ArrayList<String>();
				try {
					listStr = KeHoachKiemDemVeSinhLocalServiceUtil.getHuyenXaKeHoachKiemDemCongTrinhSearch(keHoachId, trangThai, maTinh, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
					String[] splitStr = new String[listStr.size()];
					for (String string : listStr) {
						if(string.contains(",") && Validator.isNotNull(string)){
							splitStr = string.split(",");
							if(Validator.isNotNull(splitStr[2])){
								listXa.add(NuocSachUtils.getDataItem(1, 3, splitStr[2]));
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
		
		public static List<ThongTinKiemDemNuocModel> getListThongTinKiemDemGDModelById(
				int veSinhGiaDinhId, int start, int end) {
			List<ThongTinKiemDemNuocModel> results = new ArrayList<ThongTinKiemDemNuocModel>();
			List<ThongTinKiemDemHoGD> resultBase = new ArrayList<ThongTinKiemDemHoGD>();
				try {
					resultBase = ThongTinKiemDemHoGDLocalServiceUtil.getListThongTinKiemDemHoGiaDinhByGDID(veSinhGiaDinhId, start, end);
					KeHoachKiemDemVeSinh keHoach = null;
					for (ThongTinKiemDemHoGD thongTinKiemDemHoGD : resultBase) {
						String keHoachStr = "";
						String ngayBatDau = "";
						String ngayKetThuc = "";
						keHoach = KeHoachKiemDemVeSinhBussiness.fetchKeHoachKiemDemVeSinh(thongTinKiemDemHoGD.getKeHoachKiemDemVeSinhId());
						if(Validator.isNotNull(keHoach)){
							ngayBatDau = Validator.isNotNull(keHoach.getNgayBatDau())?sdf.format(keHoach.getNgayBatDau()):StringPool.BLANK;
							ngayKetThuc = Validator.isNotNull(keHoach.getNgayKetThuc())?sdf.format(keHoach.getNgayKetThuc()):StringPool.BLANK;
							keHoachStr = "T\u1EEB "+ngayBatDau + " \u0111\u1EBFn " + ngayKetThuc;
						}
						results.add(new ThongTinKiemDemNuocModel(thongTinKiemDemHoGD.getId(), 
								Validator.isNotNull(KiemDemVienBussiness.findByTaiKhoan(thongTinKiemDemHoGD.getTaiKhoan()))?KiemDemVienBussiness.findByTaiKhoan(thongTinKiemDemHoGD.getTaiKhoan()).getHoVaTen():StringPool.BLANK, 
								keHoachStr, 
								thongTinKiemDemHoGD.getHoTenNguoiTraLoi(), 
								"danh-gia-kiem-dem-"+thongTinKiemDemHoGD.getDanhGiaKiemDem(), 
								Validator.isNotNull(thongTinKiemDemHoGD.getNgayKiemDem())?sdf.format(thongTinKiemDemHoGD.getNgayKiemDem()):StringPool.BLANK,
								"kiem-dem-nuoc-da-ket-thuc-dieu-tra-"+thongTinKiemDemHoGD.getDaKetThucDieuTra(),""));
					}
				} catch (SystemException e) {
					// TODO Auto-generated catch block
					_log.error(e);
				}
			return results;
		
		}
		public static int countListThongTinKiemDemGDModelById(
				int veSinhGiaDinhId) {
			int result = 0;
				try {
					
					result = ThongTinKiemDemHoGDLocalServiceUtil.getListThongTinKiemDemHoGiaDinhByGDID(veSinhGiaDinhId, QueryUtil.ALL_POS, QueryUtil.ALL_POS).size();
					
				} catch (SystemException e) {
					// TODO Auto-generated catch block
					_log.error(e);
				}
			return result;
		
		}
		public static List<ThongTinKiemDemNuocModel> getListThongTinKiemDemCongTrinhModelById(
				int veSinhGiaDinhId, int start, int end) {
			List<ThongTinKiemDemNuocModel> results = new ArrayList<ThongTinKiemDemNuocModel>();
			List<ThongTinKiemDemCongTrinh> resultBase = new ArrayList<ThongTinKiemDemCongTrinh>();
				try {
					resultBase = ThongTinKiemDemCongTrinhLocalServiceUtil.getListThongTinKiemDemCongTrinhByCTID(veSinhGiaDinhId, start, end);
					KeHoachKiemDemVeSinh keHoach = null;
					_log.info("resultBase"+resultBase.size());
					for (ThongTinKiemDemCongTrinh thongTinKiemDemHoGD : resultBase) {
						String keHoachStr = "";
						String ngayBatDau = "";
						String ngayKetThuc = "";
						keHoach = KeHoachKiemDemVeSinhBussiness.fetchKeHoachKiemDemVeSinh(thongTinKiemDemHoGD.getKeHoachKiemDemVeSinhId());
						if(Validator.isNotNull(keHoach)){
							ngayBatDau = Validator.isNotNull(keHoach.getNgayBatDau())?sdf.format(keHoach.getNgayBatDau()):StringPool.BLANK;
							ngayKetThuc = Validator.isNotNull(keHoach.getNgayKetThuc())?sdf.format(keHoach.getNgayKetThuc()):StringPool.BLANK;
							keHoachStr = "T\u1EEB "+ngayBatDau + " \u0111\u1EBFn " + ngayKetThuc;
						}
						results.add(new ThongTinKiemDemNuocModel(thongTinKiemDemHoGD.getId(), 
								Validator.isNotNull(KiemDemVienBussiness.findByTaiKhoan(thongTinKiemDemHoGD.getTaiKhoan()))?KiemDemVienBussiness.findByTaiKhoan(thongTinKiemDemHoGD.getTaiKhoan()).getHoVaTen():StringPool.BLANK, 
								keHoachStr, 
								thongTinKiemDemHoGD.getHoTenNguoiTraLoi(), 
								"danh-gia-kiem-dem-"+thongTinKiemDemHoGD.getDanhGiaKiemDem(), 
								Validator.isNotNull(thongTinKiemDemHoGD.getNgayKiemDem())?sdf.format(thongTinKiemDemHoGD.getNgayKiemDem()):StringPool.BLANK,
								"kiem-dem-nuoc-da-ket-thuc-dieu-tra-"+thongTinKiemDemHoGD.getDaKetThucDieuTra(),""));
					}
				} catch (SystemException e) {
					// TODO Auto-generated catch block
					_log.error(e);
				}
			return results;
		
		}
		public static int countListThongTinKiemDemCongTrinhModelById(
				int veSinhGiaDinhId) {
			int result = 0;
				try {
					
					result = ThongTinKiemDemCongTrinhLocalServiceUtil.getListThongTinKiemDemCongTrinhByCTID(veSinhGiaDinhId, QueryUtil.ALL_POS, QueryUtil.ALL_POS).size();
					
				} catch (SystemException e) {
					// TODO Auto-generated catch block
					_log.error(e);
				}
			return result;
		
		}
		public static List<ChiTietKiemDemCongTrinh> getListDetailCongTrinhByKeHoachId(int thongTinKiemDemCongTrinhId){
			List<ChiTietKiemDemCongTrinh> result = null;
			try {
				result = ChiTietKiemDemCongTrinhLocalServiceUtil.getListDetailCongTrinhByKeHoachId(thongTinKiemDemCongTrinhId);
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return result;
		}
		public static int getCountCongTrinhBykeHoachId(int keHoachKiemDemVeSinhId, int daKetThucDieuTra) {
			int result = 0;
			try {
				result = ThongTinKiemDemCongTrinhLocalServiceUtil.getCountCongTrinhBykeHoachId(keHoachKiemDemVeSinhId, daKetThucDieuTra);
			} catch (Exception e) {
				_log.error(e);
			}

			return result;
		}
		public static int getCountCongTrinhBykeHoachIdDanhGiaKiemDem(int keHoachKiemDemVeSinhId, int danhGiaKiemDem) {
			int result = 0;
			try {
				result = ThongTinKiemDemCongTrinhLocalServiceUtil.getCountCongTrinhBykeHoachIdDanhGiaKiemDem(keHoachKiemDemVeSinhId, danhGiaKiemDem);
			} catch (Exception e) {
				_log.error(e);
			}

			return result;
		}
		public static int getCountGiaDinhBykeHoachId(int keHoachKiemDemVeSinhId, int daKetThucDieuTra) {
			int result = 0;
			try {
				result = ThongTinKiemDemHoGDLocalServiceUtil.getCountGiaDinhBykeHoachId(keHoachKiemDemVeSinhId, daKetThucDieuTra);
			} catch (Exception e) {
				_log.error(e);
			}

			return result;
		}
		public static int getCountGiaDinhBykeHoachIdDanhGiaKiemDem(int keHoachKiemDemVeSinhId, int danhGiaKiemDem) {
			int result = 0;
			try {
				result = ThongTinKiemDemHoGDLocalServiceUtil.getCountGiaDinhBykeHoachIdDanhGiaKiemDem(keHoachKiemDemVeSinhId, danhGiaKiemDem);
			} catch (Exception e) {
				_log.error(e);
			}

			return result;
		}
		public static int getCountCosNhaVeSinh(int keHoachKiemDemVeSinhId) {
			int result = 0;
			try {
				result = ThongTinKiemDemHoGDLocalServiceUtil.getCountCoNhaVeSinh(keHoachKiemDemVeSinhId);
			} catch (Exception e) {
				_log.error(e);
			}

			return result;
		}
		public static int getCountcoHVS(int keHoachKiemDemVeSinhId) {
			int result = 0;
			try {
				result = ThongTinKiemDemHoGDLocalServiceUtil.getCountcoHVS(keHoachKiemDemVeSinhId);
			} catch (Exception e) {
				_log.error(e);
			}

			return result;
		}
		public static int getCountcoHVSXayMoi(int keHoachKiemDemVeSinhId) {
			int result = 0;
			try {
			result = ThongTinKiemDemHoGDLocalServiceUtil
					.getCountcoHVSXayMoi(keHoachKiemDemVeSinhId);
			} catch (Exception e) {
				_log.error(e);
			}

			return result;
		}
		private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		private static Log _log = LogFactoryUtil.getLog(KeHoachKiemDemVeSinhBussiness.class);
}
