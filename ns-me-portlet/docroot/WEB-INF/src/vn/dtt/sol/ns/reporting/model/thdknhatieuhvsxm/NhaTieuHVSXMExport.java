package vn.dtt.sol.ns.reporting.model.thdknhatieuhvsxm;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import vn.dtt.sol.ns.business.KeHoachVeSinhBusiness;
import vn.dtt.sol.ns.kehoachvesinh.dao.model.KeHoachVeSinh;
import vn.dtt.sol.ns.reporting.utils.ReportBusinessUtils;
import vn.dtt.sol.ns.reporting.utils.ReportFunction;
import vn.dtt.sol.ns.util.NuocSachUtils;
import vn.dtt.sol.ns.util.format.ConvertUtil;
import vn.dtt.sol.ns.util.format.FormatData;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;

public class NhaTieuHVSXMExport {
	private static Log log = LogFactoryUtil.getLog(NhaTieuHVSXMExport.class);
	
	public static NhaTieuHVSXM getModel(String namBaoCao, String maTinh, String soBaoCao, String ngayBaoCao, String nguoiLap, String nguoiDuyet){
		log.info("==========NhaTieuHVSXMExport===");
		log.info("--getModel==namBaoCao=="+namBaoCao+"==soBaoCao--"+soBaoCao+"==ngayBaoCao--"+ngayBaoCao+"==maTinh--"+maTinh);
		
		NhaTieuHVSXM result = new NhaTieuHVSXM();
		
		NhaTieuHVSXMDanhSach nhaTieuHVSXMDanhSachVSTX = null;
		List<NhaTieuHVSXMDanhSach> lstNhaTieuHVSXMDanhSachVSTX = null;
		
		List<NhaTieuHVSXMDanhSach> lstNhaTieuHVSXMDanhSachXaKhac = null;
		NhaTieuHVSXMDanhSach nhaTieuHVSXMDanhSachXaKhac = null;
		
		String namValue = namBaoCao;
		String tenTinhValue = maTinh;
		String baoCaoSoValue = soBaoCao;
		String baoCaoNgayThangNamValue = ngayBaoCao;
		String nguoiLapValue = nguoiLap;
		String nguoiDuyetValue = nguoiDuyet;
		
		long totalDanSoValue = 0;
		long totalSoNhaTieuHVSDuKienValue = 0;
		
		long totalDanSoVSTXValue = 0;
		long totalSoNhaTieuHVSDuKienVSTXValue = 0;
		
		long totalDanSoXaKhacValue = 0;
		long totalSoNhaTieuHVSDuKienXaKhacValue = 0;
		
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
		
		List<KeHoachVeSinh> lstKeHoachVeSinhVSTX = KeHoachVeSinhBusiness.getKeHoachVeSinhByNamTinhDangKyVSTX(namBaoCao, maTinh, "1");
		lstNhaTieuHVSXMDanhSachVSTX = new ArrayList<NhaTieuHVSXMDanhSach>();
		
		if(Validator.isNotNull(lstKeHoachVeSinhVSTX) && lstKeHoachVeSinhVSTX.size() > 0){
			log.info("==NhaTieuHVSXMExport==lstKeHoachVeSinhVSTX=="+lstKeHoachVeSinhVSTX.size());
			for (KeHoachVeSinh keHoachVeSinhVSTX : lstKeHoachVeSinhVSTX) {
				nhaTieuHVSXMDanhSachVSTX = new NhaTieuHVSXMDanhSach();
				
				String tenHuyenValue = "";
				String tenXaVaHuyenValue = "";
				long danSoValue = 0;
				long soNhaTieuHVSDuKienValue = 0;
				String dangKyVSTXValue = "";
				
				long danSoValueTemp = 0;
				long soNhaTieuHVSDuKienValueTemp = 0;
				
				tenHuyenValue = Validator.isNotNull(keHoachVeSinhVSTX.getMaHuyen()) ? NuocSachUtils.getNameHuyen(null, keHoachVeSinhVSTX.getMaHuyen()) : "";
				tenXaVaHuyenValue = (Validator.isNotNull(keHoachVeSinhVSTX.getMaXa()) ? NuocSachUtils.getNameXa( keHoachVeSinhVSTX.getMaXa()) : "") + " - "+tenHuyenValue;
				
				danSoValueTemp = Validator.isNotNull(keHoachVeSinhVSTX.getSoDan()) ? keHoachVeSinhVSTX.getSoDan() :0;
				totalDanSoVSTXValue = totalDanSoVSTXValue + danSoValueTemp;
				danSoValue = danSoValueTemp;
				
				soNhaTieuHVSDuKienValueTemp = Validator.isNotNull(keHoachVeSinhVSTX.getSoNhaTieuHVSMoi()) ? keHoachVeSinhVSTX.getSoNhaTieuHVSMoi() :0;
				totalSoNhaTieuHVSDuKienVSTXValue = totalSoNhaTieuHVSDuKienVSTXValue + soNhaTieuHVSDuKienValueTemp;
				soNhaTieuHVSDuKienValue = soNhaTieuHVSDuKienValueTemp;
				dangKyVSTXValue = String.valueOf(keHoachVeSinhVSTX.getDangKyVSTX());
				
				nhaTieuHVSXMDanhSachVSTX.setTenHuyen(tenHuyenValue);
				nhaTieuHVSXMDanhSachVSTX.setTenXaVaHuyen(tenXaVaHuyenValue);
				nhaTieuHVSXMDanhSachVSTX.setDanSo(danSoValue);
				nhaTieuHVSXMDanhSachVSTX.setSoNhaTieuHVSDuKien(soNhaTieuHVSDuKienValue);
				nhaTieuHVSXMDanhSachVSTX.setDangKyVSTX(dangKyVSTXValue);
				
				lstNhaTieuHVSXMDanhSachVSTX.add(nhaTieuHVSXMDanhSachVSTX);
			}
		}
		
		List<KeHoachVeSinh> lstKeHoachVeSinhXaKhac = KeHoachVeSinhBusiness.getKeHoachVeSinhByNamTinhDangKyVSTX(namBaoCao, maTinh, "2");
		lstNhaTieuHVSXMDanhSachXaKhac = new ArrayList<NhaTieuHVSXMDanhSach>();
		
		if(Validator.isNotNull(lstKeHoachVeSinhXaKhac) && lstKeHoachVeSinhXaKhac.size() > 0){
			log.info("==NhaTieuHVSXMExport==lstKeHoachVeSinhXaKhac=="+lstKeHoachVeSinhXaKhac.size());
			for (KeHoachVeSinh keHoachVeSinhXaKhac : lstKeHoachVeSinhXaKhac) {
				nhaTieuHVSXMDanhSachXaKhac = new NhaTieuHVSXMDanhSach();
				
				String tenHuyenValue = "";
				String tenXaVaHuyenValue = "";
				long danSoValue = 0;
				long soNhaTieuHVSDuKienValue = 0;
				String dangKyVSTXValue = "";
				
				long danSoValueTemp = 0;
				long soNhaTieuHVSDuKienValueTemp = 0;
				
				tenHuyenValue = Validator.isNotNull(keHoachVeSinhXaKhac.getMaHuyen()) ? NuocSachUtils.getNameHuyen(null, keHoachVeSinhXaKhac.getMaHuyen()) : "";
				tenXaVaHuyenValue = (Validator.isNotNull(keHoachVeSinhXaKhac.getMaXa()) ? NuocSachUtils.getNameXa( keHoachVeSinhXaKhac.getMaXa()) : "") + " - "+tenHuyenValue;
				danSoValueTemp = Validator.isNotNull(keHoachVeSinhXaKhac.getSoDan()) ? keHoachVeSinhXaKhac.getSoDan() :0;
				totalDanSoXaKhacValue = totalDanSoXaKhacValue + danSoValueTemp;
				danSoValue = danSoValueTemp;
				
				soNhaTieuHVSDuKienValueTemp = Validator.isNotNull(keHoachVeSinhXaKhac.getSoNhaTieuHVSMoi()) ? keHoachVeSinhXaKhac.getSoNhaTieuHVSMoi() :0;
				totalSoNhaTieuHVSDuKienXaKhacValue = totalSoNhaTieuHVSDuKienXaKhacValue + soNhaTieuHVSDuKienValueTemp;
				soNhaTieuHVSDuKienValue = soNhaTieuHVSDuKienValueTemp;
				
				dangKyVSTXValue = String.valueOf(keHoachVeSinhXaKhac.getDangKyVSTX());
				nhaTieuHVSXMDanhSachXaKhac.setTenHuyen(tenHuyenValue);
				nhaTieuHVSXMDanhSachXaKhac.setTenXaVaHuyen(tenXaVaHuyenValue);
				nhaTieuHVSXMDanhSachXaKhac.setDanSo(danSoValue);
				nhaTieuHVSXMDanhSachXaKhac.setSoNhaTieuHVSDuKien(soNhaTieuHVSDuKienValue);
				nhaTieuHVSXMDanhSachXaKhac.setDangKyVSTX(dangKyVSTXValue);
				
				lstNhaTieuHVSXMDanhSachXaKhac.add(nhaTieuHVSXMDanhSachXaKhac);
			}
		}
		/*
		for(int i = 0; i < 10;i++){
			nhaTieuHVSXMDanhSachVSTX = new NhaTieuHVSXMDanhSach();
			
			String tenHuyenValue = "";
			String tenXaVaHuyenValue = "";
			long danSoValue = 0;
			long soNhaTieuHVSDuKienValue = 0;
			String dangKyVSTXValue = "";
			
			long danSoValueTemp = 0;
			long soNhaTieuHVSDuKienValueTemp = 0;
			
			
			tenHuyenValue = "HN "+i;
			tenXaVaHuyenValue = "Lao Cai - "+tenHuyenValue;
			
			danSoValueTemp = 1+i;
			totalDanSoVSTXValue = totalDanSoVSTXValue + danSoValueTemp;
			danSoValue = danSoValueTemp;
			
			soNhaTieuHVSDuKienValueTemp = 1+i;
			totalSoNhaTieuHVSDuKienVSTXValue = totalSoNhaTieuHVSDuKienVSTXValue + soNhaTieuHVSDuKienValueTemp;
			soNhaTieuHVSDuKienValue = soNhaTieuHVSDuKienValueTemp;
			
			dangKyVSTXValue = "1";
			
			nhaTieuHVSXMDanhSachVSTX.setTenHuyen(tenHuyenValue);
			nhaTieuHVSXMDanhSachVSTX.setTenXaVaHuyen(tenXaVaHuyenValue);
			nhaTieuHVSXMDanhSachVSTX.setDanSo(danSoValue);
			nhaTieuHVSXMDanhSachVSTX.setSoNhaTieuHVSDuKien(soNhaTieuHVSDuKienValue);
			nhaTieuHVSXMDanhSachVSTX.setDangKyVSTX(dangKyVSTXValue);
			lstNhaTieuHVSXMDanhSachVSTX.add(nhaTieuHVSXMDanhSachVSTX);
		}
		
		
		
		
		for(int i = 0; i<200 ; i++){
			nhaTieuHVSXMDanhSachXaKhac = new NhaTieuHVSXMDanhSach();
			
			String tenHuyenValue = "";
			String tenXaVaHuyenValue = "";
			long danSoValue = 0;
			long soNhaTieuHVSDuKienValue = 0;
			String dangKyVSTXValue = "";
			
			long danSoValueTemp = 0;
			long soNhaTieuHVSDuKienValueTemp = 0;
			if(i <= 10){
				tenHuyenValue = "Mu Cang Chai";
			}else 
			if( i < 100 && i > 10){
				tenHuyenValue = "My Tho";
			}else{
				tenHuyenValue = "Nhat Tan";
			}
			
			tenXaVaHuyenValue = "Lao Cai - "+tenHuyenValue;
			
			danSoValueTemp = 1+i;
			totalDanSoXaKhacValue = totalDanSoXaKhacValue + danSoValueTemp;
			danSoValue = danSoValueTemp;
			
			soNhaTieuHVSDuKienValueTemp = 1+i;
			totalSoNhaTieuHVSDuKienXaKhacValue = totalSoNhaTieuHVSDuKienXaKhacValue + soNhaTieuHVSDuKienValueTemp;
			soNhaTieuHVSDuKienValue = soNhaTieuHVSDuKienValueTemp;
			
			dangKyVSTXValue = "2";
			
			nhaTieuHVSXMDanhSachXaKhac.setTenHuyen(tenHuyenValue);
			nhaTieuHVSXMDanhSachXaKhac.setTenXaVaHuyen(tenXaVaHuyenValue);
			nhaTieuHVSXMDanhSachXaKhac.setDanSo(danSoValue);
			nhaTieuHVSXMDanhSachXaKhac.setSoNhaTieuHVSDuKien(soNhaTieuHVSDuKienValue);
			nhaTieuHVSXMDanhSachXaKhac.setDangKyVSTX(dangKyVSTXValue);
			
			lstNhaTieuHVSXMDanhSachXaKhac.add(nhaTieuHVSXMDanhSachXaKhac);
		}
		
		*/
		totalDanSoValue = totalDanSoVSTXValue + totalDanSoXaKhacValue;
		totalSoNhaTieuHVSDuKienValue = totalSoNhaTieuHVSDuKienVSTXValue + totalSoNhaTieuHVSDuKienXaKhacValue;
		
		result.setNam(namValue);
		result.setTenTinh(tenTinhValue);
		result.setBaoCaoSo(baoCaoSoValue);
		result.setBaoCaoNgayThangNam(baoCaoNgayThangNamValue);
		result.setNguoiLap(nguoiLapValue);
		result.setNguoiDuyet(nguoiDuyetValue);
		
		result.setTotalDanSo(totalDanSoValue);
		result.setTotalSoNhaTieuHVSDuKien(totalSoNhaTieuHVSDuKienValue);
		result.setTotalDanSoVSTX(totalDanSoVSTXValue);
		result.setTotalSoNhaTieuHVSDuKienVSTX(totalSoNhaTieuHVSDuKienVSTXValue);
		result.setTotalDanSoXaKhac(totalDanSoXaKhacValue);
		result.setTotalSoNhaTieuHVSDuKienXaKhac(totalSoNhaTieuHVSDuKienXaKhacValue);
		
		result.setLstNhaTieuHVSXMDanhSachVSTX(lstNhaTieuHVSXMDanhSachVSTX);
		result.setLstNhaTieuHVSXMDanhSachXaKhac(lstNhaTieuHVSXMDanhSachXaKhac);
		
		return result;
	}
//	count group : http://stackoverflow.com/questions/17480184/how-to-calculate-the-number-of-groups
//	group tinh tong tren dau : http://stackoverflow.com/questions/14450634/grouping-records-in-jasperreports
//	public static void main(String[] args) {
//		String a = ReportBusinessUtils.actionExport_THDK_NTHVSXM("D:\\DEV\\liferay-plugins-sdk-6.2.0\\portlets\\ns-me-portlet\\docroot\\", "2015", "01", "PRO1993", "10/01/1993", "Tai", "Tai");
//		System.out.println(a);
//		
//	}
}
