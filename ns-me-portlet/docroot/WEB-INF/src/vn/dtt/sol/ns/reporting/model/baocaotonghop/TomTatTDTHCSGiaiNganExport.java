package vn.dtt.sol.ns.reporting.model.baocaotonghop;

import java.util.Date;

import vn.dtt.sol.ns.baocaodli.business.BaoCaoDLITongHopBusiness;
import vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLITongHop;
import vn.dtt.sol.ns.business.KeHoachNuocSachBusiness;
import vn.dtt.sol.ns.business.KeHoachVeSinhBusiness;
import vn.dtt.sol.ns.reporting.utils.ReportConstant;
import vn.dtt.sol.ns.reporting.utils.ReportFunction;
import vn.dtt.sol.ns.util.NuocSachUtils;
import vn.dtt.sol.ns.util.format.FormatData;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;

public class TomTatTDTHCSGiaiNganExport {
	static Log log = LogFactoryUtil.getLog(TomTatTDTHCSGiaiNganExport.class);
	
	
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
			SoDauNoiKHValue = Validator.isNotNull(baoCaoDLITongHop.getSoDauNoiTheoKeHoach()) ? String.valueOf(baoCaoDLITongHop.getSoDauNoiTheoKeHoach()) : "" ;
			SoDauNoiKQDDValue = Validator.isNotNull(baoCaoDLITongHop.getSoDauNoiMoi()) ? String.valueOf(baoCaoDLITongHop.getSoDauNoiMoi()) : "" ;
			if(Validator.isNotNull(baoCaoDLITongHop.getSoDauNoiMoi())
					&& Validator.isNotNull(baoCaoDLITongHop.getSoDauNoiTheoKeHoach())   
					&& baoCaoDLITongHop.getSoDauNoiTheoKeHoach() > 0 ){
				SoDauNoiThucHienKHValue = String.valueOf(((double)baoCaoDLITongHop.getSoDauNoiMoi() / (double)baoCaoDLITongHop.getSoDauNoiTheoKeHoach()) * 100);
			}
			
			SoNhaTieuHGDXayMoiKHValue = Validator.isNotNull(baoCaoDLITongHop.getSoNhaTieuHVSTheoKH()) ? String.valueOf(baoCaoDLITongHop.getSoNhaTieuHVSTheoKH()) : "" ;
			SoNhaTieuHGDXayMoiKQDDValue = Validator.isNotNull(baoCaoDLITongHop.getSoNhaTieuHVSMoi()) ? String.valueOf(baoCaoDLITongHop.getSoNhaTieuHVSMoi()) : "" ;
			if(Validator.isNotNull(baoCaoDLITongHop.getSoNhaTieuHVSMoi())
					&& Validator.isNotNull(baoCaoDLITongHop.getSoNhaTieuHVSTheoKH())   
					&& baoCaoDLITongHop.getSoNhaTieuHVSTheoKH() > 0 ){
				SoDauNoiThucHienKHValue = String.valueOf(((double) baoCaoDLITongHop.getSoNhaTieuHVSMoi()) / (double)baoCaoDLITongHop.getSoNhaTieuHVSTheoKH() * 100);
			}
			
			SoNgHgLoiTuCapNcBenVungKHValue = Validator.isNotNull(baoCaoDLITongHop.getSoNguoiHuongLoiNuocSach()) ? String.valueOf(baoCaoDLITongHop.getSoNguoiHuongLoiNuocSach()) : "" ;
			int SoNgHgLoiTuCapNcBenVungKQDDValueTemp = KeHoachNuocSachBusiness.countSoNguoiHuongLoiCapNcBenVung(namBaoCao,maTinh);
			SoNgHgLoiTuCapNcBenVungKQDDValue = (SoNgHgLoiTuCapNcBenVungKQDDValueTemp > 0) ? String.valueOf(SoNgHgLoiTuCapNcBenVungKQDDValueTemp) : "";
			if( Validator.isNotNull(baoCaoDLITongHop.getSoNguoiHuongLoiNuocSach())   
					&& baoCaoDLITongHop.getSoNguoiHuongLoiNuocSach() > 0 ){
				SoNgHgLoiTuCapNcBenVungThucHienKHValue = String.valueOf(((double) SoNgHgLoiTuCapNcBenVungKQDDValueTemp / (double)baoCaoDLITongHop.getSoNguoiHuongLoiNuocSach()) * 100);
			}
			
			
			SoNgHgLoiTuVSTXKHValue = Validator.isNotNull(baoCaoDLITongHop.getSoNguoiHuongLoiVSTX()) ? String.valueOf(baoCaoDLITongHop.getSoNguoiHuongLoiVSTX()) : "" ;
			int SoNgHgLoiTuVSTXKQDDValueTemp = KeHoachVeSinhBusiness.countSoDanHuongLoi(namBaoCao, maTinh, "1");
			SoNgHgLoiTuVSTXKQDDValue = (SoNgHgLoiTuVSTXKQDDValueTemp > 0) ? String.valueOf(SoNgHgLoiTuVSTXKQDDValueTemp) : "0";
			if( Validator.isNotNull(baoCaoDLITongHop.getSoNguoiHuongLoiVSTX())   
					&& baoCaoDLITongHop.getSoNguoiHuongLoiVSTX() > 0 ){
				SoNgHgLoiTuVSTXThucHienKHValue = String.valueOf(((double) SoNgHgLoiTuVSTXKQDDValueTemp / (double)baoCaoDLITongHop.getSoNguoiHuongLoiVSTX()) * 100);
			}
			
			SoKHCuaTinhDcPheDuyetKHValue = Validator.isNotNull(baoCaoDLITongHop.getKeHoachPheDuyet()) ? ReportConstant.CO : "";
			SoKHCuaTinhDcPheDuyetKQDDValue = Validator.isNotNull(baoCaoDLITongHop.getKeHoachPheDuyet()) ? ReportConstant.CO : "";
			SoKHCuaTinhDcPheDuyetThucHienKHValue = "";
			
			SoBCCTDcCongBoKHValue = Validator.isNotNull(baoCaoDLITongHop.getBaoCaoChuongTrinh()) ? ReportConstant.CO : "";
			SoBCCTDcCongBoKQDDValue = Validator.isNotNull(baoCaoDLITongHop.getBaoCaoChuongTrinh()) ? ReportConstant.CO : "";
			SoBCCTDcCongBoThucHienKHValue = "";
		}
		
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
//		int a = 9234;
//		int b = 10000;
//		double c =(double) a;
//		double d = (double)b;
//		
//		System.out.println(((double)9765/(double)10000)*100);
//	}
}
