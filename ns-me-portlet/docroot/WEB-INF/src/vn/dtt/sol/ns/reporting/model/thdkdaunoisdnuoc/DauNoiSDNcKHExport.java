package vn.dtt.sol.ns.reporting.model.thdkdaunoisdnuoc;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import vn.dtt.sol.ns.business.KeHoachNuocSachBusiness;
import vn.dtt.sol.ns.kehoachdaunam.dao.model.KeHoachDauNam;
import vn.dtt.sol.ns.reporting.utils.ReportBusinessUtils;
import vn.dtt.sol.ns.reporting.utils.ReportFunction;
import vn.dtt.sol.ns.util.NuocSachUtils;
import vn.dtt.sol.ns.util.format.ConvertUtil;
import vn.dtt.sol.ns.util.format.FormatData;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;

public class DauNoiSDNcKHExport {
	private static Log log = LogFactoryUtil.getLog(DauNoiSDNcKHExport.class);
	
	public static DauNoiSDNcKH getModel(String namBaoCao, String maTinh, String soBaoCao, String ngayBaoCao, String nguoiLap, String nguoiDuyet){
		log.info("==========DauNoiSDNcKHExport===");
		log.info("--getModel==namBaoCao=="+namBaoCao+"==soBaoCao--"+soBaoCao+"==ngayBaoCao--"+ngayBaoCao+"==maTinh--"+maTinh);
		
		
		
		DauNoiSDNcKH result = new DauNoiSDNcKH();
		DauNoiSDNcKHDanhSach dauNoiSDNcKHDanhSach = null;
		List<DauNoiSDNcKHDanhSach> lstDauNoiSDNcKHDanhSach = null;
		
		String namValue = "";
		String tenTinhValue = "";	
		String baoCaoSoValue = "";
		String baoCaoNgayThangNamValue = "";
		String nguoiLapValue = "";
		String nguoiDuyetValue = "";
		String totalSoHoValue = "";
		String totalDanSoValue = "";
		String totalSoDauNoiDuKienValue = "";
		
		long totalSoHoValueTemp = 0;
		long totalDanSoValueTemp = 0;
		long totalSoDauNoiDuKienValueTemp = 0;
		
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
		
		lstDauNoiSDNcKHDanhSach = new ArrayList<DauNoiSDNcKHDanhSach>();
		
		List<KeHoachDauNam> lstKeHoachDauNam = KeHoachNuocSachBusiness.searchByNamAndMaTinh(namBaoCao, maTinh);
		if(Validator.isNotNull(lstKeHoachDauNam) && lstKeHoachDauNam.size() > 0){
			log.info("==DauNoiSDNcKHExport==lstKeHoachDauNam=="+lstKeHoachDauNam.size());
			for (KeHoachDauNam keHoachDauNam : lstKeHoachDauNam) {
				
				dauNoiSDNcKHDanhSach = new DauNoiSDNcKHDanhSach();
				
				String tenTramValue = "";
				String soHoValue = "";
				String danSoValue = "";
				String soDauNoiDuKienValue = "";
				String ghiChuValue = "";
				
				long soHoValueTemp = 0;
				long danSoValueTemp = 0;
				long soDauNoiDuKienValueTemp = 0;
				
				tenTramValue = Validator.isNotNull(keHoachDauNam.getTramCapNuocId()) ? NuocSachUtils.getTenTramByTramId(String.valueOf(keHoachDauNam.getTramCapNuocId())) : "";
				
				soHoValueTemp = Validator.isNotNull(keHoachDauNam.getSoHoHuongLoi()) ? keHoachDauNam.getSoHoHuongLoi() : 0 ;
				totalSoHoValueTemp = totalSoHoValueTemp + soHoValueTemp;
				soHoValue = ConvertUtil.parseLongToString1000(soHoValueTemp);
				
				danSoValueTemp = Validator.isNotNull(keHoachDauNam.getSoNguoiHuongLoi()) ? keHoachDauNam.getSoNguoiHuongLoi() : 0 ;
				totalDanSoValueTemp = totalDanSoValueTemp + danSoValueTemp;
				danSoValue = ConvertUtil.parseLongToString1000(danSoValueTemp);
				
				soDauNoiDuKienValueTemp = Validator.isNotNull(keHoachDauNam.getSoDauNoiMoi()) ? keHoachDauNam.getSoDauNoiMoi() : 0 ;
				totalSoDauNoiDuKienValueTemp = totalSoDauNoiDuKienValueTemp + soDauNoiDuKienValueTemp;
				soDauNoiDuKienValue = ConvertUtil.parseLongToString1000(soDauNoiDuKienValueTemp);
				
				ghiChuValue = Validator.isNotNull(keHoachDauNam.getGhiChu()) ? keHoachDauNam.getGhiChu() : "";
				
				dauNoiSDNcKHDanhSach.setTenTram(tenTramValue);
				dauNoiSDNcKHDanhSach.setSoHo(soHoValue);
				dauNoiSDNcKHDanhSach.setDanSo(danSoValue);
				dauNoiSDNcKHDanhSach.setSoDauNoiDuKien(soDauNoiDuKienValue);
				dauNoiSDNcKHDanhSach.setGhiChu(ghiChuValue);
								
				lstDauNoiSDNcKHDanhSach.add(dauNoiSDNcKHDanhSach);
			}
			
		}
		
		
		/*
		// test value
		namValue =  namBaoCao ;
		tenTinhValue = maTinh;
		baoCaoSoValue = soBaoCao ;
		baoCaoNgayThangNamValue = ngayBaoCao ;
		nguoiLapValue = nguoiLap;
		nguoiDuyetValue = nguoiDuyet;
		
		lstDauNoiSDNcKHDanhSach = new ArrayList<DauNoiSDNcKHDanhSach>();
		
		for(int i = 0;i < 200;i++){
			String tenTramValue = "";
			String soHoValue = "";
			String danSoValue = "";
			String soDauNoiDuKienValue = "";
			String ghiChuValue = "";
			
			int soHoValueTemp = 0;
			int danSoValueTemp = 0;
			int soDauNoiDuKienValueTemp = 0;
			
			dauNoiSDNcKHDanhSach = new DauNoiSDNcKHDanhSach();
			
			tenTramValue = "HN "+i;
			
			soHoValueTemp = 1+i;
			totalSoHoValueTemp = totalSoHoValueTemp + soHoValueTemp;
			soHoValue = ConvertUtil.parseIntToString1000(soHoValueTemp);
			
			danSoValueTemp = 1+i;
			totalDanSoValueTemp = totalDanSoValueTemp + danSoValueTemp;
			danSoValue = ConvertUtil.parseIntToString1000(danSoValueTemp);
			
			soDauNoiDuKienValueTemp = 1+i;
			totalSoDauNoiDuKienValueTemp = totalSoDauNoiDuKienValueTemp + soDauNoiDuKienValueTemp;
			soDauNoiDuKienValue = ConvertUtil.parseIntToString1000(soDauNoiDuKienValueTemp);
			
			ghiChuValue = "ghi chu "+i;
			
			dauNoiSDNcKHDanhSach.setTenTram(tenTramValue);
			dauNoiSDNcKHDanhSach.setSoHo(soHoValue);
			dauNoiSDNcKHDanhSach.setDanSo(danSoValue);
			dauNoiSDNcKHDanhSach.setSoDauNoiDuKien(soDauNoiDuKienValue);
			dauNoiSDNcKHDanhSach.setGhiChu(ghiChuValue);
			
			
			lstDauNoiSDNcKHDanhSach.add(dauNoiSDNcKHDanhSach);
			
		}
		 */
		
		totalSoHoValue = ConvertUtil.parseLongToString1000(totalSoHoValueTemp);
		totalDanSoValue = ConvertUtil.parseLongToString1000(totalDanSoValueTemp);
		totalSoDauNoiDuKienValue = ConvertUtil.parseLongToString1000(totalSoDauNoiDuKienValueTemp);
		
		result.setNam(namValue);
		result.setTenTinh(tenTinhValue);
		result.setBaoCaoSo(baoCaoSoValue);
		result.setBaoCaoNgayThangNam(baoCaoNgayThangNamValue);
		result.setNguoiLap(nguoiLapValue);
		result.setNguoiDuyet(nguoiDuyetValue);
		result.setLstDauNoiSDNcKHDanhSach(lstDauNoiSDNcKHDanhSach);
		result.setTotalSoHo(totalSoHoValue);
		result.setTotalDanSo(totalDanSoValue);	
		result.setTotalSoDauNoiDuKien(totalSoDauNoiDuKienValue);
		
		return result;
		
		
		
	}
	
//	public static void main(String[] args) {
//		String a = ReportBusinessUtils.actionExport_THDK_DNSDN("D:\\DEV\\liferay-plugins-sdk-6.2.0\\portlets\\ns-me-portlet\\docroot\\", "2015", "01", "PRO1993", "10/01/1993", "Tai", "Tai");
//		System.out.println(a);
//	}
	
	
}
