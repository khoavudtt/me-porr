package vn.dtt.sol.ns.vesinhmoitruong.business;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import vn.dtt.cmon.user.dao.model.UserMapping;
import vn.dtt.sol.ns.daunoinuoc.constant.DauNoiNuocConstantString;
import vn.dtt.sol.ns.reporting.HoGiaDinhReportModel;
import vn.dtt.sol.ns.tramcap.business.DauNoiNuocBusiness;
import vn.dtt.sol.ns.tramcap.business.TramCapBusiness;
import vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc;
import vn.dtt.sol.ns.tramcap.dao.service.DauNoiNuocLocalServiceUtil;
import vn.dtt.sol.ns.util.NuocSachUtils;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.impl.VeSinhGiaDinhImpl;
import vn.dtt.sol.ns.vesinhmoitruong.dao.service.VeSinhGiaDinhLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;

public class HoGiaDinhBussiness {
	// fill data dau noi to list / reporting
		public static int countHoGiaDinhByTypeUser(
				UserMapping userMapping, String maTinh,String maHuyen,String maXa,String loaiNhaTieuId,String trangThai,String namBaoCao, String namBaoCaoVstx, String ngayNhap, String idNguoiTao, String advText, int start, int end) {
			int results = 0;
			try {
				if (userMapping.getUserType() == DauNoiNuocConstantString.UserMapping.CAP_TU) {
					if(!maTinh.isEmpty()
							||!maHuyen.isEmpty()
							||!maXa.isEmpty()
							||!loaiNhaTieuId.isEmpty()
							||!trangThai.isEmpty()
							||!namBaoCao.isEmpty()){
						
						results = VeSinhGiaDinhLocalServiceUtil.countVeSinhGiaDinhSearch(maTinh, maHuyen, maXa, loaiNhaTieuId, trangThai, namBaoCao,namBaoCaoVstx, ngayNhap, idNguoiTao, advText);
					}else{
						results = VeSinhGiaDinhLocalServiceUtil.getVeSinhGiaDinhsCount();
					}
					
				}else if (userMapping.getUserType() == DauNoiNuocConstantString.UserMapping.CAP_TINH) {
					results = VeSinhGiaDinhLocalServiceUtil.countVeSinhGiaDinhSearch(userMapping.getOrgCode1(), maHuyen, maXa, loaiNhaTieuId, trangThai, namBaoCao,namBaoCaoVstx, ngayNhap, idNguoiTao, advText);
				}else if (userMapping.getUserType() == DauNoiNuocConstantString.UserMapping.CAP_HUYEN) {
					results = VeSinhGiaDinhLocalServiceUtil.countVeSinhGiaDinhSearch(maTinh,maHuyen, maXa, loaiNhaTieuId, trangThai, namBaoCao,namBaoCaoVstx, ngayNhap, idNguoiTao, advText);
				}
				
			} catch (Exception e) {
				// TODO: handle exception
				_log.error(e);
			}
			return results;
		}
		public static List<HoGiaDinhReportModel> getListHoGiaDinhByTypeUser(
				UserMapping userMapping, String maTinh,String maHuyen,String maXa,String loaiNhaTieuId,String trangThai,String namBaoCao, String namBaoCaoVstx, String ngayNhap, String idNguoiTao, String advText,int start,int end) {
			List<HoGiaDinhReportModel> results = new ArrayList<HoGiaDinhReportModel>();
			List<VeSinhGiaDinh> resultBase = new ArrayList<VeSinhGiaDinh>();
			try {
//				_log.info("maTinh"+maTinh+"maHuyen"+maHuyen+"maXa"+maXa+"tramCapNuocId"+tramCapNuocId+"trangThai"+trangThai+"namBaoCao"+namBaoCao);
				if (userMapping.getUserType() == DauNoiNuocConstantString.UserMapping.CAP_TU) {
					if(!maTinh.isEmpty()
							||!maHuyen.isEmpty()
							||!maXa.isEmpty()
							||!loaiNhaTieuId.isEmpty()
							||!trangThai.isEmpty()
							||!namBaoCao.isEmpty()){
						resultBase = VeSinhGiaDinhLocalServiceUtil.getVeSinhGiaDinhSearch(maTinh, maHuyen, maXa, loaiNhaTieuId, trangThai, namBaoCao, namBaoCaoVstx, ngayNhap, idNguoiTao, advText, start, end);
					}else{
						resultBase = VeSinhGiaDinhLocalServiceUtil.getVeSinhGiaDinhs(start, end);
					}
					
				}else if (userMapping.getUserType() == DauNoiNuocConstantString.UserMapping.CAP_TINH) {
					resultBase = VeSinhGiaDinhLocalServiceUtil.getVeSinhGiaDinhSearch(userMapping.getOrgCode1(), maHuyen, maXa, loaiNhaTieuId, trangThai, namBaoCao, namBaoCaoVstx, ngayNhap, idNguoiTao, advText, start, end);
				}else if (userMapping.getUserType() == DauNoiNuocConstantString.UserMapping.CAP_HUYEN) {
					resultBase = VeSinhGiaDinhLocalServiceUtil.getVeSinhGiaDinhSearch(maTinh, maHuyen, maXa, loaiNhaTieuId, trangThai, namBaoCao, namBaoCaoVstx, ngayNhap, idNguoiTao, advText,start,end);
				}
				for (VeSinhGiaDinh veSinhGiaDinh : resultBase) {
					results.add(new HoGiaDinhReportModel(veSinhGiaDinh.getId(), 
							StringPool.BLANK, 
							NuocSachUtils.getNameTinh(veSinhGiaDinh.getMaTinh()), 
							NuocSachUtils.getNameHuyen(veSinhGiaDinh.getMaTinh(),veSinhGiaDinh.getMaHuyen()), 
							NuocSachUtils.getNameXa(veSinhGiaDinh.getMaXa()), 
							veSinhGiaDinh.getThonXom(), 
							veSinhGiaDinh.getTenChuHo(), 
							"tinh-trang-ve-sinh-"+veSinhGiaDinh.getTrangThai(),
							veSinhGiaDinh.getNamXayDung()>0?veSinhGiaDinh.getNamXayDung()+"":"",
							veSinhGiaDinh.getNamBaoCao()+"",
							veSinhGiaDinh.getIdNguoiTao()));
				}
			} catch (Exception e) {
				// TODO: handle exception
				_log.error(e);
			}
			return results;
		}
		
		public static VeSinhGiaDinh fetchVeSinhGiaDinh(int id) {
			VeSinhGiaDinh veSinhGiaDinh = null;
			try {
				veSinhGiaDinh = VeSinhGiaDinhLocalServiceUtil.fetchVeSinhGiaDinh(id);
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return veSinhGiaDinh;
		}
		private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		private static Log _log = LogFactoryUtil.getLog(HoGiaDinhBussiness.class);
}
