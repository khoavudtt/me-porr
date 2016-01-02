package vn.dtt.sol.ns.reporting.model.dli12th;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import vn.dtt.sol.ns.reporting.utils.ReportConstant;
import vn.dtt.sol.ns.reporting.utils.ReportFunction;
import vn.dtt.sol.ns.util.NuocSachUtils;
import vn.dtt.sol.ns.util.format.ConvertUtil;
import vn.dtt.sol.ns.util.format.FormatData;
import vn.dtt.sol.ns.vesinhmoitruong.business.ThongTinKiemDemHoGDBusiness;
import vn.dtt.sol.ns.vesinhmoitruong.business.VeSinhGiaDinhBusiness;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;

public class SoNhaTieuHGDXayMoiHVSExport {
	
	private static Log log = LogFactoryUtil.getLog(SoNhaTieuHGDXayMoiHVSExport.class);
	
	public static SoNhaTieuHGDXayMoiHVS getModel(String namBaoCao, String maTinh, String soBaoCao, String ngayBaoCao, String nguoiLap, String nguoiDuyet, String thoigianthuc){
		log.info("===SoNhaTieuHGDXayMoiHVSExport===");
		log.info("--getModel==namBaoCao=="+namBaoCao+"==soBaoCao--"+soBaoCao+"==ngayBaoCao--"+ngayBaoCao+"==maTinh--"+maTinh);
		
		String DANHGIAKIEMDEM = "1";// danhgiakiemdem 1 la co nha tieu hvs xay moi
		String TRANGTHAI = "2"; // trangthai 2 la co nha tieu hvs
		SoNhaTieuHGDXayMoiHVS result = new SoNhaTieuHGDXayMoiHVS();
		SoNhaTieuHGDXayMoiHVSDanhSach soNhaTieuHGDXayMoiHVSDanhSach = null;
		List<SoNhaTieuHGDXayMoiHVSDanhSach> lstSoNhaTieuHGDXayMoiHVSDanhSach = null; 
		
		
	
		
		String namValue = "";
		String tenTinhValue = "";
		String baoCaoSoValue = "";
		String baoCaoNgayThangNamValue = "";
		String nguoiLapValue = "";
		String nguoiDuyetValue = "";
		
		namValue = namBaoCao;		
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
		
		lstSoNhaTieuHGDXayMoiHVSDanhSach = new ArrayList<SoNhaTieuHGDXayMoiHVSDanhSach>();
		
		
		if(thoigianthuc.equalsIgnoreCase(ReportConstant.THUC)){
			log.info("===SoNhaTieuHGDXayMoiHVSExport======THUC===="+thoigianthuc);
			//lstVeSinhGiaDinh = VeSinhGiaDinhBusiness.getVeSinhGiaDinhThoiGianThuc(maTinh, namBaoCao, DANHGIAKIEMDEM);
			
			List<ThongTinKiemDemHoGD> lstThongTinKiemDemHoGD = ThongTinKiemDemHoGDBusiness.getThongTinKiemDemHGDThoiGianThucGroupBy(maTinh, namBaoCao, DANHGIAKIEMDEM);
			
			if(Validator.isNotNull(lstThongTinKiemDemHoGD) && lstThongTinKiemDemHoGD.size() > 0){
				log.info("==SoNhaTieuHGDXayMoiHVSExport==lstThongTinKiemDemHoGD=="+lstThongTinKiemDemHoGD.size());
				for (ThongTinKiemDemHoGD thongTinKiemDemHoGD : lstThongTinKiemDemHoGD) {
					soNhaTieuHGDXayMoiHVSDanhSach = new SoNhaTieuHGDXayMoiHVSDanhSach();
					
					String huyenValue = "";
					String xaValue = "";
					String soNhaTieuHGDHVSMoiValue = "0";
					
					huyenValue = Validator.isNotNull(thongTinKiemDemHoGD.getMaHuyen()) ? NuocSachUtils.getNameHuyen(null, thongTinKiemDemHoGD.getMaHuyen()) : "";
					xaValue = Validator.isNotNull(thongTinKiemDemHoGD.getMaXa()) ? NuocSachUtils.getNameXa( thongTinKiemDemHoGD.getMaXa()) : "";
					
					if(Validator.isNotNull(thongTinKiemDemHoGD.getMaHuyen()) && Validator.isNotNull(thongTinKiemDemHoGD.getMaXa())){
						int soNhaTieuHGDHVSMoiTemp = ThongTinKiemDemHoGDBusiness.countThongTinKiemDemHGDThoiGianThucGroupBy(maTinh, namBaoCao, DANHGIAKIEMDEM, thongTinKiemDemHoGD.getMaHuyen(), thongTinKiemDemHoGD.getMaXa());
						soNhaTieuHGDHVSMoiValue = (soNhaTieuHGDHVSMoiTemp > 0) ? ConvertUtil.parseIntToString1000(soNhaTieuHGDHVSMoiTemp) : "0";
					}
					soNhaTieuHGDXayMoiHVSDanhSach.setHuyen(huyenValue);
					soNhaTieuHGDXayMoiHVSDanhSach.setXa(xaValue);
					soNhaTieuHGDXayMoiHVSDanhSach.setSoNhaTieuHGDHVSMoi(soNhaTieuHGDHVSMoiValue);
					
					lstSoNhaTieuHGDXayMoiHVSDanhSach.add(soNhaTieuHGDXayMoiHVSDanhSach);
				}
			}
			
		}else if(thoigianthuc.equalsIgnoreCase(ReportConstant.CHOT)){
			log.info("===SoNhaTieuHGDXayMoiHVSExport======CHOT===="+thoigianthuc);
			
			
			List<VeSinhGiaDinh> lstVeSinhGiaDinh = VeSinhGiaDinhBusiness.getVeSinhGiaDinhGroupByMaHuyen(maTinh, null, null, null, TRANGTHAI, namBaoCao);
			if(Validator.isNotNull(lstVeSinhGiaDinh) && lstVeSinhGiaDinh.size() > 0){
				log.info("==SoNhaTieuHGDXayMoiHVSExport==lstVeSinhGiaDinh=="+lstVeSinhGiaDinh.size());
				
				for(VeSinhGiaDinh veSinhGiaDinh : lstVeSinhGiaDinh){
					soNhaTieuHGDXayMoiHVSDanhSach = new SoNhaTieuHGDXayMoiHVSDanhSach();
					
					String huyenValue = "";
					String xaValue = "";
					String soNhaTieuHGDHVSMoiValue = "0";
					
					huyenValue = Validator.isNotNull(veSinhGiaDinh.getMaHuyen()) ? NuocSachUtils.getNameHuyen(null, veSinhGiaDinh.getMaHuyen()) : "";
					xaValue = Validator.isNotNull(veSinhGiaDinh.getMaXa()) ? NuocSachUtils.getNameXa( veSinhGiaDinh.getMaXa()) : "";
					if(Validator.isNotNull(veSinhGiaDinh.getMaHuyen()) && Validator.isNotNull(veSinhGiaDinh.getMaXa())){
						int soNhaTieuHGDHVSMoiTemp = VeSinhGiaDinhBusiness.countVeSinhGiaDinhSearch(maTinh, veSinhGiaDinh.getMaHuyen(), veSinhGiaDinh.getMaXa(), null, TRANGTHAI, String.valueOf(veSinhGiaDinh.getNamBaoCao()));
						soNhaTieuHGDHVSMoiValue = (soNhaTieuHGDHVSMoiTemp > 0) ? ConvertUtil.parseIntToString1000(soNhaTieuHGDHVSMoiTemp) : "0";
								
					}
					
					soNhaTieuHGDXayMoiHVSDanhSach.setHuyen(huyenValue);
					soNhaTieuHGDXayMoiHVSDanhSach.setXa(xaValue);
					soNhaTieuHGDXayMoiHVSDanhSach.setSoNhaTieuHGDHVSMoi(soNhaTieuHGDHVSMoiValue);
					
					lstSoNhaTieuHGDXayMoiHVSDanhSach.add(soNhaTieuHGDXayMoiHVSDanhSach);
				}
			}
		}
		
		
		result.setNam(namValue);
		result.setTenTinh(tenTinhValue);
		result.setBaoCaoSo(baoCaoSoValue);
		result.setBaoCaoNgayThangNam(baoCaoNgayThangNamValue);
		result.setNguoiLap(nguoiLapValue);
		result.setNguoiDuyet(nguoiDuyetValue);
		result.setLstSoNhaTieuHGDXayMoiHVSDanhSach(lstSoNhaTieuHGDXayMoiHVSDanhSach);
		return result;
	}
}
