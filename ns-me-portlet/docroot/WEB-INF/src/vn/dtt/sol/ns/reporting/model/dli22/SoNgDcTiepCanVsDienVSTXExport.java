package vn.dtt.sol.ns.reporting.model.dli22;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import vn.dtt.sol.ns.danhgiavesinh.business.DANHGIAVESINHXABusiness;
import vn.dtt.sol.ns.danhgiavesinh.dao.model.DANHGIAVESINHXA;
import vn.dtt.sol.ns.reporting.utils.ReportFunction;
import vn.dtt.sol.ns.util.NuocSachUtils;
import vn.dtt.sol.ns.util.format.ConvertUtil;
import vn.dtt.sol.ns.util.format.FormatData;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;

public class SoNgDcTiepCanVsDienVSTXExport {
	private static Log log = LogFactoryUtil.getLog(SoNgDcTiepCanVsDienVSTXExport.class);
	
	public static SoNgDcTiepCanVsDienVSTX getModel(String namBaoCao, String maTinh, String soBaoCao, String ngayBaoCao, String nguoiLap, String nguoiDuyet){
		log.info("===SoNgDcTiepCanVsDienVSTXExport===");
		log.info("--getModel==namBaoCao=="+namBaoCao+"==soBaoCao--"+soBaoCao+"==ngayBaoCao--"+ngayBaoCao+"==maTinh--"+maTinh);
		
		SoNgDcTiepCanVsDienVSTX result = new SoNgDcTiepCanVsDienVSTX();
		
		SoNgDcTiepCanVsDienVSTXDanhSach soNgDcTiepCanVsDienVSTXDanhSach = null;
		List<SoNgDcTiepCanVsDienVSTXDanhSach> lstSoNgDcTiepCanVsDienVSTXDanhSach = null;
		

		
		String namValue = "";
		String tenTinhValue = "";
		String baoCaoSoValue = "";
		String baoCaoNgayThangNamValue = "";
		String nguoiLapValue = "";
		String nguoiDuyetValue = "";
		
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
		
		lstSoNgDcTiepCanVsDienVSTXDanhSach = new ArrayList<SoNgDcTiepCanVsDienVSTXDanhSach>();
		
		List<DANHGIAVESINHXA> lstDanhgiavesinhxa = DANHGIAVESINHXABusiness.getDanhGiaVeSinhXaBaoCao(maTinh, null, null, namBaoCao);
		
		if(Validator.isNotNull(lstDanhgiavesinhxa) && lstDanhgiavesinhxa.size() > 0){
			log.info("==SoNgDcTiepCanVsDienVSTXExport==lstVeSinhGiaDinh=="+lstDanhgiavesinhxa.size());
			for(DANHGIAVESINHXA danhgiavesinhxa : lstDanhgiavesinhxa){
				soNgDcTiepCanVsDienVSTXDanhSach = new SoNgDcTiepCanVsDienVSTXDanhSach();
				
				String huyenValue = "";
				String xaValue = "";
				String coNhaTieuHVSValue = "0";
				String coNhaTieuValue = "0";
				String truongHocCoNcSachVaNhaTieuHVSValue = "0";
				String tramYteCoNcSachVaNhaTieuHVSValue = "0";
				String soNgHuongLoiTuVSTXValue = "0";
				
				huyenValue = Validator.isNotNull(danhgiavesinhxa.getMaHuyen()) ? NuocSachUtils.getNameHuyen(null, danhgiavesinhxa.getMaHuyen()) : "";
				xaValue = Validator.isNotNull(danhgiavesinhxa.getMaXa()) ? NuocSachUtils.getNameXa( danhgiavesinhxa.getMaXa()) : "";
				coNhaTieuHVSValue = (danhgiavesinhxa.getTiLeHGDCoNhaTieuHVS() > 0) ? String.valueOf(danhgiavesinhxa.getTiLeHGDCoNhaTieuHVS()) : "0" ;
				coNhaTieuValue = (danhgiavesinhxa.getTiLeHGDCoNhaTieu() > 0) ? String.valueOf(danhgiavesinhxa.getTiLeHGDCoNhaTieu()) : "0" ;
				truongHocCoNcSachVaNhaTieuHVSValue = (danhgiavesinhxa.getTiLeTruongHocHVS() > 0) ? String.valueOf(danhgiavesinhxa.getTiLeTruongHocHVS()) : "0" ;
				tramYteCoNcSachVaNhaTieuHVSValue = (danhgiavesinhxa.getTiLeTramYTeHVS() > 0) ? String.valueOf(danhgiavesinhxa.getTiLeTramYTeHVS()) : "0" ;
				soNgHuongLoiTuVSTXValue = (danhgiavesinhxa.getSoDan() > 0) ? ConvertUtil.parseIntToString1000(danhgiavesinhxa.getSoDan()) : "0" ;
				
				soNgDcTiepCanVsDienVSTXDanhSach.setHuyen(huyenValue);
				soNgDcTiepCanVsDienVSTXDanhSach.setXa(xaValue);
				soNgDcTiepCanVsDienVSTXDanhSach.setCoNhaTieuHVS(coNhaTieuHVSValue);
				soNgDcTiepCanVsDienVSTXDanhSach.setCoNhaTieu(coNhaTieuValue);
				soNgDcTiepCanVsDienVSTXDanhSach.setTruongHocCoNcSachVaNhaTieuHVS(truongHocCoNcSachVaNhaTieuHVSValue);
				soNgDcTiepCanVsDienVSTXDanhSach.setTramYteCoNcSachVaNhaTieuHVS(tramYteCoNcSachVaNhaTieuHVSValue);
				soNgDcTiepCanVsDienVSTXDanhSach.setSoNgHuongLoiTuVSTX(soNgHuongLoiTuVSTXValue);
				
				lstSoNgDcTiepCanVsDienVSTXDanhSach.add(soNgDcTiepCanVsDienVSTXDanhSach);
			}
		}
		
		result.setNam(namValue);
		result.setTenTinh(tenTinhValue);
		result.setBaoCaoSo(baoCaoSoValue);
		result.setBaoCaoNgayThangNam(baoCaoNgayThangNamValue);
		result.setNguoiLap(nguoiLapValue);
		result.setNguoiDuyet(nguoiDuyetValue);
		result.setLstSoNgDcTiepCanVsDienVSTXDanhSach(lstSoNgDcTiepCanVsDienVSTXDanhSach);
		return result;
	}
}
