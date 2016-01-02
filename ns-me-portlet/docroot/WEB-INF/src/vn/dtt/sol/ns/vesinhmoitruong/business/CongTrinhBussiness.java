package vn.dtt.sol.ns.vesinhmoitruong.business;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import vn.dtt.cmon.user.dao.model.UserMapping;
import vn.dtt.sol.ns.daunoinuoc.constant.DauNoiNuocConstantString;
import vn.dtt.sol.ns.reporting.CongTrinhReportModel;
import vn.dtt.sol.ns.util.NuocSachUtils;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhCongTrinh;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh;
import vn.dtt.sol.ns.vesinhmoitruong.dao.service.VeSinhCongTrinhLocalServiceUtil;
import vn.dtt.sol.ns.vesinhmoitruong.dao.service.VeSinhGiaDinhLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;

public class CongTrinhBussiness {
	// fill data dau noi to list / reporting
			public static int countCongTrinhByTypeUser(
					UserMapping userMapping, String maTinh,String maHuyen,String maXa,String loaiNhaTieuId,String loaiCongTrinh,String trangThai,String namBaoCao, int start, int end) {
				int results = 0;
				try {

					if (userMapping.getUserType() == DauNoiNuocConstantString.UserMapping.CAP_TU) {
						if(!maTinh.isEmpty()
								||!maHuyen.isEmpty()
								||!maXa.isEmpty()
								||!loaiNhaTieuId.isEmpty()
								||!loaiCongTrinh.isEmpty()
								||!trangThai.isEmpty()
								||!namBaoCao.isEmpty()){
							results = VeSinhCongTrinhLocalServiceUtil.countVeSinhCongTrinhSearch(maTinh, maHuyen, maXa, loaiNhaTieuId, loaiCongTrinh, trangThai, namBaoCao);
						}else{
							results = VeSinhCongTrinhLocalServiceUtil.getVeSinhCongTrinhsCount();
						}
						
					}else if (userMapping.getUserType() == DauNoiNuocConstantString.UserMapping.CAP_TINH) {
						results = VeSinhCongTrinhLocalServiceUtil.countVeSinhCongTrinhSearch(userMapping.getOrgCode1(), maHuyen, maXa, loaiNhaTieuId, loaiCongTrinh, trangThai, namBaoCao);
					}else if (userMapping.getUserType() == DauNoiNuocConstantString.UserMapping.CAP_HUYEN) {
						results = VeSinhCongTrinhLocalServiceUtil.countVeSinhCongTrinhSearch(maTinh,maHuyen, maXa, loaiNhaTieuId, loaiCongTrinh, trangThai, namBaoCao);
					}
					
				} catch (Exception e) {
					// TODO: handle exception
					_log.error(e);
				}
				return results;
			}
			public static List<CongTrinhReportModel> getListCongTrinhByTypeUser(
					UserMapping userMapping, String maTinh,String maHuyen,String maXa,String loaiNhaTieuId,String loaiCongTrinh,String trangThai,String namBaoCao,int start,int end) {
				List<CongTrinhReportModel> results = new ArrayList<CongTrinhReportModel>();
				List<VeSinhCongTrinh> resultBase = new ArrayList<VeSinhCongTrinh>();
				try {
					_log.info("maTinh"+maTinh+"maHuyen"+maHuyen+"maXa"+maXa+"loaiNhaTieuId"+loaiNhaTieuId+"loaiCongTrinh"+loaiCongTrinh+"trangThai"+trangThai+"namBaoCao"+namBaoCao);
					if (userMapping.getUserType() == DauNoiNuocConstantString.UserMapping.CAP_TU) {
						if(!maTinh.isEmpty()
								||!maHuyen.isEmpty()
								||!maXa.isEmpty()
								||!loaiNhaTieuId.isEmpty()
								||!trangThai.isEmpty()
								||!namBaoCao.isEmpty()){
							resultBase = VeSinhCongTrinhLocalServiceUtil.getVeSinhCongTrinhSearch(maTinh, maHuyen, maXa, loaiNhaTieuId,loaiCongTrinh, trangThai, namBaoCao, start, end);
						}else{
							resultBase = VeSinhCongTrinhLocalServiceUtil.getVeSinhCongTrinhs(start, end);
						}
						
					}else if (userMapping.getUserType() == DauNoiNuocConstantString.UserMapping.CAP_TINH) {
						resultBase = VeSinhCongTrinhLocalServiceUtil.getVeSinhCongTrinhSearch(userMapping.getOrgCode1(), maHuyen, maXa, loaiNhaTieuId, loaiCongTrinh, trangThai, namBaoCao, start, end);
					}else if (userMapping.getUserType() == DauNoiNuocConstantString.UserMapping.CAP_HUYEN) {
						resultBase = VeSinhCongTrinhLocalServiceUtil.getVeSinhCongTrinhSearch(maTinh,maHuyen, maXa, loaiNhaTieuId, loaiCongTrinh, trangThai, namBaoCao,start,end);
					}
					_log.info("resultBase"+resultBase.size());
					for (VeSinhCongTrinh veSinhCongTrinh : resultBase) {
						results.add(new CongTrinhReportModel(veSinhCongTrinh.getId(), 
								StringPool.BLANK, 
								NuocSachUtils.getNameTinh(veSinhCongTrinh.getMaTinh()), 
								NuocSachUtils.getNameHuyen(veSinhCongTrinh.getMaTinh(),veSinhCongTrinh.getMaHuyen()), 
								NuocSachUtils.getNameXa(veSinhCongTrinh.getMaXa()), 
								veSinhCongTrinh.getDiaChi(), 
								veSinhCongTrinh.getTenCongTrinh(), 
								"tinh-trang-ve-sinh-"+veSinhCongTrinh.getTrangThai(),
								StringPool.BLANK,
								veSinhCongTrinh.getNamBaoCao()+"",
								Validator.isNotNull(veSinhCongTrinh.getIdNguoiTao())?Integer.valueOf(veSinhCongTrinh.getIdNguoiTao()):0));
					}
				} catch (Exception e) {
					// TODO: handle exception
					_log.error(e);
				}
				return results;
			}
			
			public static VeSinhCongTrinh fetchVeSinhCongTrinh(int id) {
				VeSinhCongTrinh veSinhCongTrinh = null;
				try {
					veSinhCongTrinh = VeSinhCongTrinhLocalServiceUtil.fetchVeSinhCongTrinh(id);
				} catch (SystemException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return veSinhCongTrinh;
			}
			private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			private static Log _log = LogFactoryUtil.getLog(CongTrinhBussiness.class);
}
