package vn.dtt.sol.ns.reporting.model.dlith;

import java.util.Date;

import vn.dtt.sol.ns.baocaodli.business.BaoCaoDLITongHopBusiness;
import vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLITongHop;
import vn.dtt.sol.ns.business.KeHoachNuocSachBusiness;
import vn.dtt.sol.ns.business.KeHoachVeSinhBusiness;
import vn.dtt.sol.ns.reporting.utils.ReportBusinessUtils;
import vn.dtt.sol.ns.reporting.utils.ReportConstant;
import vn.dtt.sol.ns.reporting.utils.ReportFunction;
import vn.dtt.sol.ns.util.NuocSachUtils;
import vn.dtt.sol.ns.util.format.ConvertUtil;
import vn.dtt.sol.ns.util.format.FormatData;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;

public class TomTatTDTHCSGiaiNganExport {
	private static Log log = LogFactoryUtil.getLog(TomTatTDTHCSGiaiNganExport.class);
	
	
	public static TomTatTDTHCSGiaiNgan getModel(String namBaoCao, String maTinh, String soBaoCao, String ngayBaoCao, String nguoiLap, String nguoiDuyet){
		log.info("==========TomTatTDTHCSGiaiNganExport===");
		log.info("--getModel==namBaoCao=="+namBaoCao+"==soBaoCao--"+soBaoCao+"==ngayBaoCao--"+ngayBaoCao+"==maTinh--"+maTinh);
		
		TomTatTDTHCSGiaiNgan result = new TomTatTDTHCSGiaiNgan(); 
		
		String namValue = "";
		String tenTinhValue = "";	
		String baoCaoSoValue = "";
		String baoCaoNgayThangNamValue = "";
		String nguoiLapValue = "";
		String nguoiDuyetValue = "";
		
		String SoDauNoiKHValue = "";
		String SoDauNoiKQDDValue = "";
		String SoDauNoiThucHienKHValue = "";

		String SoNhaTieuHGDXayMoiKHValue = "";
		String SoNhaTieuHGDXayMoiKQDDValue = "";
		String SoNhaTieuHGDXayMoiThucHienKHValue = "";

		String SoNgHgLoiTuCapNcBenVungKHValue = "";
		String SoNgHgLoiTuCapNcBenVungKQDDValue = "";
		String SoNgHgLoiTuCapNcBenVungThucHienKHValue = "";
		
		String SoNgHgLoiTuVSTXKHValue = "";
		String SoNgHgLoiTuVSTXKQDDValue = "";
		String SoNgHgLoiTuVSTXThucHienKHValue = "";
		
		String SoKHCuaTinhDcPheDuyetKHValue = "";
		String SoKHCuaTinhDcPheDuyetKQDDValue = "";
		String SoKHCuaTinhDcPheDuyetThucHienKHValue = "";
		
		String SoBCCTDcCongBoKHValue = "";
		String SoBCCTDcCongBoKQDDValue = "";
		String SoBCCTDcCongBoThucHienKHValue = "";
		
		
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
			
			SoDauNoiKHValue = Validator.isNotNull(baoCaoDLITongHop.getSoDauNoiTheoKeHoach()) ? ConvertUtil.parseIntToString1000(baoCaoDLITongHop.getSoDauNoiTheoKeHoach()) : "" ;
			SoDauNoiKQDDValue = Validator.isNotNull(baoCaoDLITongHop.getSoDauNoiMoi()) ? ConvertUtil.parseIntToString1000(baoCaoDLITongHop.getSoDauNoiMoi()) : "" ;
			if(Validator.isNotNull(baoCaoDLITongHop.getSoDauNoiMoi())
					&& Validator.isNotNull(baoCaoDLITongHop.getSoDauNoiTheoKeHoach())   
					&& baoCaoDLITongHop.getSoDauNoiTheoKeHoach() > 0 ){
				
				SoDauNoiThucHienKHValue = ConvertUtil.parseDoubleToString2Digits((ConvertUtil.convertIntToDouble(baoCaoDLITongHop.getSoDauNoiMoi()) / ConvertUtil.convertIntToDouble(baoCaoDLITongHop.getSoDauNoiTheoKeHoach())) * 100);
			
			}
			
			SoNhaTieuHGDXayMoiKHValue = Validator.isNotNull(baoCaoDLITongHop.getSoNhaTieuHVSTheoKH()) ? ConvertUtil.parseIntToString1000(baoCaoDLITongHop.getSoNhaTieuHVSTheoKH()) : "" ;
			SoNhaTieuHGDXayMoiKQDDValue = Validator.isNotNull(baoCaoDLITongHop.getSoNhaTieuHVSMoi()) ? ConvertUtil.parseIntToString1000(baoCaoDLITongHop.getSoNhaTieuHVSMoi()) : "" ;
			if(Validator.isNotNull(baoCaoDLITongHop.getSoNhaTieuHVSMoi())
					&& Validator.isNotNull(baoCaoDLITongHop.getSoNhaTieuHVSTheoKH())   
					&& baoCaoDLITongHop.getSoNhaTieuHVSTheoKH() > 0 ){
				
				SoNhaTieuHGDXayMoiThucHienKHValue = ConvertUtil.parseDoubleToString2Digits((ConvertUtil.convertIntToDouble(baoCaoDLITongHop.getSoNhaTieuHVSMoi()) / ConvertUtil.convertIntToDouble(baoCaoDLITongHop.getSoNhaTieuHVSTheoKH())) * 100);
			
			}
			
			SoNgHgLoiTuCapNcBenVungKHValue = Validator.isNotNull(baoCaoDLITongHop.getSoNguoiHuongLoiNuocSach()) ? ConvertUtil.parseIntToString1000(baoCaoDLITongHop.getSoNguoiHuongLoiNuocSach()) : "" ;
			int SoNgHgLoiTuCapNcBenVungKQDDValueTemp = KeHoachNuocSachBusiness.countSoNguoiHuongLoiCapNcBenVung(namBaoCao,maTinh);
			SoNgHgLoiTuCapNcBenVungKQDDValue = (SoNgHgLoiTuCapNcBenVungKQDDValueTemp > 0) ? ConvertUtil.parseIntToString1000(SoNgHgLoiTuCapNcBenVungKQDDValueTemp) : "";
			if( Validator.isNotNull(baoCaoDLITongHop.getSoNguoiHuongLoiNuocSach())   
					&& baoCaoDLITongHop.getSoNguoiHuongLoiNuocSach() > 0 ){
				
				SoNgHgLoiTuCapNcBenVungThucHienKHValue = ConvertUtil.parseDoubleToString2Digits((ConvertUtil.convertIntToDouble(SoNgHgLoiTuCapNcBenVungKQDDValueTemp) / ConvertUtil.convertIntToDouble(baoCaoDLITongHop.getSoNguoiHuongLoiNuocSach())) * 100);
			
			}
			
			
			SoNgHgLoiTuVSTXKHValue = Validator.isNotNull(baoCaoDLITongHop.getSoNguoiHuongLoiVSTX()) ? ConvertUtil.parseIntToString1000(baoCaoDLITongHop.getSoNguoiHuongLoiVSTX()) : "" ;
			int SoNgHgLoiTuVSTXKQDDValueTemp = KeHoachVeSinhBusiness.countSoDanHuongLoi(namBaoCao, maTinh, "1");
			SoNgHgLoiTuVSTXKQDDValue = (SoNgHgLoiTuVSTXKQDDValueTemp > 0) ? ConvertUtil.parseIntToString1000(SoNgHgLoiTuVSTXKQDDValueTemp) : "0";
			if( Validator.isNotNull(baoCaoDLITongHop.getSoNguoiHuongLoiVSTX())   
					&& baoCaoDLITongHop.getSoNguoiHuongLoiVSTX() > 0 ){
				
				SoNgHgLoiTuVSTXThucHienKHValue = ConvertUtil.parseDoubleToString2Digits((ConvertUtil.convertIntToDouble(SoNgHgLoiTuVSTXKQDDValueTemp) / ConvertUtil.convertIntToDouble(baoCaoDLITongHop.getSoNguoiHuongLoiVSTX())) * 100);
			
			}
			
			SoKHCuaTinhDcPheDuyetKHValue = Validator.isNotNull(baoCaoDLITongHop.getKeHoachPheDuyet()) ? ReportConstant.CO : "";
			SoKHCuaTinhDcPheDuyetKQDDValue = Validator.isNotNull(baoCaoDLITongHop.getKeHoachPheDuyet()) ? ReportConstant.CO : "";
			SoKHCuaTinhDcPheDuyetThucHienKHValue = "";
			
			SoBCCTDcCongBoKHValue = Validator.isNotNull(baoCaoDLITongHop.getBaoCaoChuongTrinh()) ? ReportConstant.CO : "";
			SoBCCTDcCongBoKQDDValue = Validator.isNotNull(baoCaoDLITongHop.getBaoCaoChuongTrinh()) ? ReportConstant.CO : "";
			SoBCCTDcCongBoThucHienKHValue = "";
		}
		
		/* test value
		namValue = namBaoCao	;
		tenTinhValue = maTinh;
		baoCaoSoValue = soBaoCao;
		baoCaoNgayThangNamValue = ngayBaoCao;
		nguoiLapValue = nguoiLap;
		nguoiDuyetValue = nguoiDuyet;
		
		SoDauNoiKHValue = ConvertUtil.parseToString1000(11000) ;
		SoDauNoiKQDDValue = ConvertUtil.parseToString1000(9867) ;
		SoDauNoiThucHienKHValue = ConvertUtil.parseDoubleToString2Digits((ConvertUtil.convertIntToDouble(9867) / ConvertUtil.convertIntToDouble(11000)) * 100);
		
		SoNhaTieuHGDXayMoiKHValue = ConvertUtil.parseToString1000(9000) ;
		SoNhaTieuHGDXayMoiKQDDValue = ConvertUtil.parseToString1000(7856) ;
		SoNhaTieuHGDXayMoiThucHienKHValue = ConvertUtil.parseDoubleToString2Digits((ConvertUtil.convertIntToDouble(7856) / ConvertUtil.convertIntToDouble(9000)) * 100);
		
		SoNgHgLoiTuCapNcBenVungKHValue = ConvertUtil.parseToString1000(9876) ;
		SoNgHgLoiTuCapNcBenVungKQDDValue = ConvertUtil.parseToString1000(11000) ;
		SoNgHgLoiTuCapNcBenVungThucHienKHValue = ConvertUtil.parseDoubleToString2Digits((ConvertUtil.convertIntToDouble(11000) / ConvertUtil.convertIntToDouble(9876)) * 100);
		
		SoNgHgLoiTuVSTXKHValue = ConvertUtil.parseToString1000(11000) ;
		SoNgHgLoiTuVSTXKQDDValue = ConvertUtil.parseToString1000(9967) ;
		SoNgHgLoiTuVSTXThucHienKHValue = ConvertUtil.parseDoubleToString2Digits((ConvertUtil.convertIntToDouble(9967) / ConvertUtil.convertIntToDouble(11000)) * 100);
		
		SoKHCuaTinhDcPheDuyetKHValue =  "Có" ;
		SoKHCuaTinhDcPheDuyetKQDDValue =  "Có" ;
		SoKHCuaTinhDcPheDuyetThucHienKHValue = "";
		
		SoBCCTDcCongBoKHValue =  "Có" ;
		SoBCCTDcCongBoKQDDValue = "Có" ;
		SoBCCTDcCongBoThucHienKHValue = "";
		
		*/
		result.setNam(namValue);
		result.setTenTinh(tenTinhValue);
		result.setBaoCaoSo(baoCaoSoValue);
		result.setBaoCaoNgayThangNam(baoCaoNgayThangNamValue);
		result.setNguoiLap(nguoiLapValue);
		result.setNguoiDuyet(nguoiDuyetValue);
		
		result.setSoDauNoiKH(SoDauNoiKHValue);
		result.setSoDauNoiKQDD(SoDauNoiKQDDValue);
		result.setSoDauNoiThucHienKH(SoDauNoiThucHienKHValue);
		
		result.setSoNhaTieuHGDXayMoiKH(SoNhaTieuHGDXayMoiKHValue);
		result.setSoNhaTieuHGDXayMoiKQDD(SoNhaTieuHGDXayMoiKQDDValue);
		result.setSoNhaTieuHGDXayMoiThucHienKH(SoNhaTieuHGDXayMoiThucHienKHValue);
		
		result.setSoNgHgLoiTuCapNcBenVungKH(SoNgHgLoiTuCapNcBenVungKHValue);
		result.setSoNgHgLoiTuCapNcBenVungKQDD(SoNgHgLoiTuCapNcBenVungKQDDValue);
		result.setSoNgHgLoiTuCapNcBenVungThucHienKH(SoNgHgLoiTuCapNcBenVungThucHienKHValue);
		
		result.setSoNgHgLoiTuVSTXKH(SoNgHgLoiTuVSTXKHValue);
		result.setSoNgHgLoiTuVSTXKQDD(SoNgHgLoiTuVSTXKQDDValue);
		result.setSoNgHgLoiTuVSTXThucHienKH(SoNgHgLoiTuVSTXThucHienKHValue);
		
		result.setSoKHCuaTinhDcPheDuyetKH(SoKHCuaTinhDcPheDuyetKHValue);
		result.setSoKHCuaTinhDcPheDuyetKQDD(SoKHCuaTinhDcPheDuyetKQDDValue);
		result.setSoKHCuaTinhDcPheDuyetThucHienKH(SoKHCuaTinhDcPheDuyetThucHienKHValue);
		
		result.setSoBCCTDcCongBoKH(SoBCCTDcCongBoKHValue);
		result.setSoBCCTDcCongBoKQDD(SoBCCTDcCongBoKQDDValue);
		result.setSoBCCTDcCongBoThucHienKH(SoBCCTDcCongBoThucHienKHValue);
		
		
		return result;
	}
	
//	public static void main(String[] args) {
//		String a = ReportBusinessUtils.actionExport_Dli_TH("D:\\DEV\\liferay-plugins-sdk-6.2.0\\portlets\\ns-me-portlet\\docroot\\", "2015", "01", "PRO1993", "10/01/1993", "Tai", "Tai");
//		System.out.println(a);
//	}
}
