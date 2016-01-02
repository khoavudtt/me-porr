package vn.dtt.sol.ns.reporting.model.dli3;

import java.util.Date;

import vn.dtt.sol.ns.baocaodli.business.BaoCaoDLITongHopBusiness;
import vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLITongHop;
import vn.dtt.sol.ns.reporting.utils.ReportFunction;
import vn.dtt.sol.ns.util.NuocSachUtils;
import vn.dtt.sol.ns.util.format.FormatData;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;

public class KHTinhVaBaoCaoCTExport {
	private static Log log = LogFactoryUtil.getLog(KHTinhVaBaoCaoCTExport.class);
	
	public static KHTinhVaBaoCaoCT getModel(String namBaoCao, String maTinh, String soBaoCao, String ngayBaoCao, String nguoiLap, String nguoiDuyet){
		log.info("==========KHTinhVaBaoCaoCTExport===");
		log.info("--getModel==namBaoCao=="+namBaoCao+"==soBaoCao--"+soBaoCao+"==ngayBaoCao--"+ngayBaoCao+"==maTinh--"+maTinh);
		
		KHTinhVaBaoCaoCT result = new KHTinhVaBaoCaoCT();
		
		
		
		String namValue = "";
		String tenTinhValue = "";
		String baoCaoSoValue = "";
		String baoCaoNgayThangNamValue = "";
		String nguoiLapValue = "";
		String nguoiDuyetValue = "";
		
		String keHoachNamCuaTinhDaDuocPheDuyetChuaValue = "";
		String ngayPheDuyetValue = "";
		String baoCaoDangTaiTrenWebValue = "";
		String ngayDangValue = "";
		
		namValue = Validator.isNotNull(namBaoCao) ? namBaoCao : "";		
		tenTinhValue = NuocSachUtils.getNameTinh(maTinh);
		baoCaoSoValue = Validator.isNotNull(soBaoCao) ? soBaoCao : "" ;
		if(Validator.isNotNull(ngayBaoCao)){
			Date dateNgayBaoCao = FormatData.parseStringToDateTypeDDMMYYYY(ngayBaoCao.trim());
			baoCaoNgayThangNamValue = ReportFunction.parserDateToString4(dateNgayBaoCao);
		}
		if(Validator.isNotNull(nguoiLap)){
			nguoiLapValue = nguoiLap;
		}
		if(Validator.isNotNull(nguoiDuyet)){
			nguoiDuyetValue = nguoiDuyet;
		}
		
		
		
		BaoCaoDLITongHop baoCaoDLITongHop = BaoCaoDLITongHopBusiness.getBaoCaoDLITongHopByTinhVaNam(maTinh, namBaoCao);
		
		if(Validator.isNotNull(baoCaoDLITongHop) ){
			keHoachNamCuaTinhDaDuocPheDuyetChuaValue = Validator.isNotNull(baoCaoDLITongHop.getKeHoachPheDuyet()) ? baoCaoDLITongHop.getKeHoachPheDuyet() : "";
			if(Validator.isNotNull(baoCaoDLITongHop.getNgayDuyetKeHoach())){
				ngayPheDuyetValue = FormatData.parseDateToTringDDMMYYY(baoCaoDLITongHop.getNgayDuyetKeHoach());
			}
				
			baoCaoDangTaiTrenWebValue = Validator.isNotNull(baoCaoDLITongHop.getBaoCaoChuongTrinh()) ? baoCaoDLITongHop.getBaoCaoChuongTrinh() : "";
				
			if(Validator.isNotNull(baoCaoDLITongHop.getNgayDangTai()) ){
				ngayDangValue = FormatData.parseDateToTringDDMMYYY(baoCaoDLITongHop.getNgayDangTai());
			}
		}
		result.setKeHoachNamCuaTinhDaDuocPheDuyetChua(keHoachNamCuaTinhDaDuocPheDuyetChuaValue);
		result.setNgayPheDuyet(ngayPheDuyetValue);
		result.setBaoCaoDangTaiTrenWeb(baoCaoDangTaiTrenWebValue);
		result.setNgayDang(ngayDangValue);
		
		result.setNam(namValue);
		result.setTenTinh(tenTinhValue);
		result.setBaoCaoSo(baoCaoSoValue);
		result.setBaoCaoNgayThangNam(baoCaoNgayThangNamValue);
		result.setNguoiLap(nguoiLapValue);
		result.setNguoiDuyet(nguoiDuyetValue);
		return result;
	}
	
}
