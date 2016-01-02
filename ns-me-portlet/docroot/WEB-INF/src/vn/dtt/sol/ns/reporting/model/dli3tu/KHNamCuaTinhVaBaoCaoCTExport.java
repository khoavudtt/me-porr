package vn.dtt.sol.ns.reporting.model.dli3tu;

import java.util.ArrayList;
import java.util.List;

import vn.dtt.sol.ns.baocaodli.business.BaoCaoDLITongHopBusiness;
import vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLITongHop;
import vn.dtt.sol.ns.util.NuocSachUtils;
import vn.dtt.sol.ns.util.format.FormatData;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;

public class KHNamCuaTinhVaBaoCaoCTExport {
	private static Log log = LogFactoryUtil.getLog(KHNamCuaTinhVaBaoCaoCTExport.class);
	public static KHNamCuaTinhVaBaoCaoCT getModel(String namBaoCao){
		log.info("===KHNamCuaTinhVaBaoCaoCTExport===");
		KHNamCuaTinhVaBaoCaoCT result = new KHNamCuaTinhVaBaoCaoCT();
		
		KHNamCuaTinhVaBaoCaoCTDanhSach khNamCuaTinhVaBaoCaoCTDanhSach = null;
		List<KHNamCuaTinhVaBaoCaoCTDanhSach> lstKhNamCuaTinhVaBaoCaoCTDanhSach = null;
		
		
		String namValue = "";
		namValue = Validator.isNotNull(namBaoCao) ? namBaoCao : "";		
		
		List<BaoCaoDLITongHop> lstBaoCaoDLITongHop = BaoCaoDLITongHopBusiness.getListBaoCaoDLITongHopByNamTW(namBaoCao);
		if(Validator.isNotNull(lstBaoCaoDLITongHop) && lstBaoCaoDLITongHop.size() > 0){
			lstKhNamCuaTinhVaBaoCaoCTDanhSach = new ArrayList<KHNamCuaTinhVaBaoCaoCTDanhSach>();
			
			for (BaoCaoDLITongHop baoCaoDLITongHop : lstBaoCaoDLITongHop) {
				khNamCuaTinhVaBaoCaoCTDanhSach = new KHNamCuaTinhVaBaoCaoCTDanhSach();
				String tenTinhValue = "";
				String keHoachNamCuaTinhDaDuocPheDuyetChuaValue = "";
				String ngayPheDuyetValue = "";
				String baoCaoDangTaiTrenWebValue = "";
				String ngayDangValue = "";
				
				tenTinhValue = NuocSachUtils.getNameTinh(baoCaoDLITongHop.getMaTinh());
				keHoachNamCuaTinhDaDuocPheDuyetChuaValue = Validator.isNotNull(baoCaoDLITongHop.getKeHoachPheDuyet()) ? baoCaoDLITongHop.getKeHoachPheDuyet() : "";
				if(Validator.isNotNull(baoCaoDLITongHop.getNgayDuyetKeHoach())){
					ngayPheDuyetValue = FormatData.parseDateToTringDDMMYYY(baoCaoDLITongHop.getNgayDuyetKeHoach());
				}
					
				baoCaoDangTaiTrenWebValue = Validator.isNotNull(baoCaoDLITongHop.getBaoCaoChuongTrinh()) ? baoCaoDLITongHop.getBaoCaoChuongTrinh() : "";
					
				if(Validator.isNotNull(baoCaoDLITongHop.getNgayDangTai()) ){
					ngayDangValue = FormatData.parseDateToTringDDMMYYY(baoCaoDLITongHop.getNgayDangTai());
				}
				
				khNamCuaTinhVaBaoCaoCTDanhSach.setTenTinh(tenTinhValue);
				khNamCuaTinhVaBaoCaoCTDanhSach.setKeHoachNamCuaTinhDaDuocPheDuyetChua(keHoachNamCuaTinhDaDuocPheDuyetChuaValue);
				khNamCuaTinhVaBaoCaoCTDanhSach.setNgayPheDuyet(ngayPheDuyetValue);
				khNamCuaTinhVaBaoCaoCTDanhSach.setBaoCaoDangTaiTrenWeb(baoCaoDangTaiTrenWebValue);
				khNamCuaTinhVaBaoCaoCTDanhSach.setNgayDang(ngayDangValue);
				
				lstKhNamCuaTinhVaBaoCaoCTDanhSach.add(khNamCuaTinhVaBaoCaoCTDanhSach);
			}
		}
		
		
		result.setNam(namValue);
		result.setLstKhNamCuaTinhVaBaoCaoCTDanhSach(lstKhNamCuaTinhVaBaoCaoCTDanhSach);
		return result;
	}
}
