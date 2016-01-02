package vn.dtt.sol.ns.reporting.model.dli12ct;



import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import vn.dtt.sol.ns.reporting.utils.ReportConstant;
import vn.dtt.sol.ns.reporting.utils.ReportFunction;
import vn.dtt.sol.ns.util.NuocSachUtils;
import vn.dtt.sol.ns.util.WebKeys;
import vn.dtt.sol.ns.util.format.FormatData;
import vn.dtt.sol.ns.vesinhmoitruong.business.ThongTinKiemDemHoGDBusiness;
import vn.dtt.sol.ns.vesinhmoitruong.business.VeSinhGiaDinhBusiness;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD;
import vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;

public class DSNhaTieuHGDXayMoiExport {
	private static Log log = LogFactoryUtil.getLog(DSNhaTieuHGDXayMoiExport.class);
	
	public static DSNhaTieuHGDXayMoi getModel(String namBaoCao, String maTinh, String soBaoCao, String ngayBaoCao, String nguoiLap, String nguoiDuyet, String thoigianthuc ) {
		String tichCo = "1";
		String DANHGIAKIEMDEM = "1";// danhgiakiemdem 1 la co nha tieu hvs xay moi
		String TRANGTHAI = "2"; // trangthai 2 la co nha tieu hvs
		log.info("===DSNhaTieuHGDXayMoiExport===");
		log.info("--getModel==namBaoCao=="+namBaoCao+"==soBaoCao--"+soBaoCao+"==ngayBaoCao--"+ngayBaoCao+"==maTinh--"+maTinh);
		
		DSNhaTieuHGDXayMoi result = new DSNhaTieuHGDXayMoi();
		
		DSNhaTieuHGDXayMoiDanhSach dsNhaTieuHGDXayMoiDanhSach = null;
		List<DSNhaTieuHGDXayMoiDanhSach> lstDsNhaTieuHGDXayMoiDanhSach = null;
		

		
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
		
		lstDsNhaTieuHGDXayMoiDanhSach = new ArrayList<DSNhaTieuHGDXayMoiDanhSach>();
		
		if(thoigianthuc.equalsIgnoreCase(ReportConstant.THUC)){
			log.info("===DSNhaTieuHGDXayMoiExport======THUC===="+thoigianthuc);
			
			List<ThongTinKiemDemHoGD> lstThongTinKiemDemHoGD = ThongTinKiemDemHoGDBusiness.getThongTinKiemDemHGDThoiGianThuc(maTinh, namBaoCao, DANHGIAKIEMDEM);
			if(Validator.isNotNull(lstThongTinKiemDemHoGD) && lstThongTinKiemDemHoGD.size() > 0){
				log.info("==DSNhaTieuHGDXayMoiExport==lstThongTinKiemDemHoGD=="+lstThongTinKiemDemHoGD.size());
				for (ThongTinKiemDemHoGD thongTinKiemDemHoGD : lstThongTinKiemDemHoGD) {
					String huyenValue = "";
					String xaValue = "";
					String thonValue = "";
					String tenChuHoValue = "";
					String toaDoValue = "";
					String hoNgheoValue = "";
					String koCoNhaTieuValue = "" ;
					String coNhungKoHVSValue = "" ;
					String THValue = "";
					String TDValue = "";
					String HNValue = "";
					String chimValue = "";
					String khacValue = "";
					String troCapValue = "";
					String vayVonNHCSValue = "";
					String tuXayValue = "";
					String thangNamHoanThanhValue = "";
					String ghiChuValue = "";
					
					dsNhaTieuHGDXayMoiDanhSach = new DSNhaTieuHGDXayMoiDanhSach();
					
					huyenValue = Validator.isNotNull(thongTinKiemDemHoGD.getMaHuyen()) ? NuocSachUtils.getNameHuyen(null, thongTinKiemDemHoGD.getMaHuyen()) : "";
					xaValue = Validator.isNotNull(thongTinKiemDemHoGD.getMaXa()) ? NuocSachUtils.getNameXa( thongTinKiemDemHoGD.getMaXa()) : "";
					thonValue = Validator.isNotNull(thongTinKiemDemHoGD.getThonXom()) ? thongTinKiemDemHoGD.getThonXom() : "";
					tenChuHoValue = Validator.isNotNull(thongTinKiemDemHoGD.getTenChuHo()) ? thongTinKiemDemHoGD.getTenChuHo() : "";
					
					String kinhDoTemp = Validator.isNotNull(thongTinKiemDemHoGD.getKinhDo()) ? thongTinKiemDemHoGD.getKinhDo() : "";
					String viDoTemp = Validator.isNotNull(thongTinKiemDemHoGD.getViDo()) ? "/"+thongTinKiemDemHoGD.getViDo() : "";
					toaDoValue = kinhDoTemp + viDoTemp;
					
					if(Validator.isNotNull(thongTinKiemDemHoGD.getThanhPhanHoGD()) && thongTinKiemDemHoGD.getThanhPhanHoGD() > 0){
						if(thongTinKiemDemHoGD.getThanhPhanHoGD() == WebKeys.TPHGD_NGHEO){
							hoNgheoValue = tichCo;
						}
					}
					
					if(Validator.isNotNull(thongTinKiemDemHoGD.getCoNhaTieu()) && thongTinKiemDemHoGD.getCoNhaTieu() > 0){
						if(thongTinKiemDemHoGD.getCoNhaTieu() == WebKeys.CONHATIEU_KHONG){
							koCoNhaTieuValue = tichCo;
						}				
					}
					
					if(Validator.isNotNull(thongTinKiemDemHoGD.getDuocCaiTao()) && thongTinKiemDemHoGD.getDuocCaiTao() > 0){
						if(thongTinKiemDemHoGD.getDuocCaiTao() == WebKeys.NHATIEUHVS_CO){
							coNhungKoHVSValue = tichCo;
						}else if(thongTinKiemDemHoGD.getDuocCaiTao() == WebKeys.NHATIEUHVS_KHONG){
							koCoNhaTieuValue = tichCo;
						}
					}else{
						koCoNhaTieuValue = tichCo;
					}
					
					if(Validator.isNotNull(thongTinKiemDemHoGD.getLoaiNhaTieu())){
						
						String loaiNhaTieuTemp = thongTinKiemDemHoGD.getLoaiNhaTieu();
						
						
						if(loaiNhaTieuTemp.equalsIgnoreCase(WebKeys.IMPORT_TH)){ //Nhà tiêu tự hoại
							THValue = tichCo;
							TDValue = "";
							HNValue = "";
							chimValue = "";
							khacValue = "";
						}else if(loaiNhaTieuTemp.equalsIgnoreCase(WebKeys.IMPORT_TD) || loaiNhaTieuTemp.equalsIgnoreCase(WebKeys.LOAINHATIEU_DNBB)){ //Nhà tiêu thấm dội nước và Nhà tiêu dội nước + bể biogas
							THValue = "";
							TDValue = tichCo;
							HNValue = "";
							chimValue = "";
							khacValue = "";
						}else if(loaiNhaTieuTemp.equalsIgnoreCase(WebKeys.IMPORT_HN) || loaiNhaTieuTemp.equalsIgnoreCase(WebKeys.LOAINHATIEU_MN)){ //Nhà tiêu khô nổi hai ngăn tách hoặc không tách nước tiểu và Nhà tiêu khô nổi một ngăn tách hoặc không tách nước tiểu 
							THValue = "";
							TDValue = "";
							HNValue = tichCo;
							chimValue = "";
							khacValue = "";
						}else if(loaiNhaTieuTemp.equalsIgnoreCase(WebKeys.IMPORT_CHIM)){ // Nhà tiêu khô chìm
							THValue = "";
							TDValue = "";
							HNValue = "";
							chimValue = tichCo;
							khacValue = "";
						}else if(loaiNhaTieuTemp.equalsIgnoreCase(WebKeys.IMPORT_KHAC) || loaiNhaTieuTemp.equalsIgnoreCase(WebKeys.LOAINHATIEU_DNNT) || loaiNhaTieuTemp.equalsIgnoreCase(WebKeys.LOAINHATIEU_THCT) || loaiNhaTieuTemp.equalsIgnoreCase(WebKeys.LOAINHATIEU_KQSD) ){ //Loại nhà tiêu khác , Nhà tiêu dội nước (nước thải không qua bể phốt, hố, hay biogas), Nhà tiêu thùng hoặc cầu tõm, Không quan sát được 
							THValue = "";
							TDValue = "";
							HNValue = "";
							chimValue = "";
							khacValue = tichCo;
						}
					}

					if(Validator.isNotNull(thongTinKiemDemHoGD.getNguonVon()) && thongTinKiemDemHoGD.getNguonVon() > 0){
						switch(thongTinKiemDemHoGD.getNguonVon()){
							case WebKeys.NGUONVON_TRO_CAP:
								troCapValue = tichCo;
								vayVonNHCSValue = "";
								tuXayValue = "";
								break;
							case WebKeys.NGUONVON_VAY_VON:
								troCapValue = "";
								vayVonNHCSValue = tichCo;
								tuXayValue = "";
								break;
							case WebKeys.NGUONVON_TU_XAY:
								troCapValue = "";
								vayVonNHCSValue = "";
								tuXayValue = tichCo;
								break;
						}			
					}
					
					if(thongTinKiemDemHoGD.getThangXayDung() > 0 && thongTinKiemDemHoGD.getNamXayDung() > 0){
						thangNamHoanThanhValue = thongTinKiemDemHoGD.getThangXayDung()+"/"+thongTinKiemDemHoGD.getNamXayDung();
					}
					if(Validator.isNotNull(thongTinKiemDemHoGD.getGhiChu())){
						ghiChuValue = thongTinKiemDemHoGD.getGhiChu();
					}
					dsNhaTieuHGDXayMoiDanhSach.setHuyen(huyenValue);
					dsNhaTieuHGDXayMoiDanhSach.setXa(xaValue);
					dsNhaTieuHGDXayMoiDanhSach.setThon(thonValue);
					dsNhaTieuHGDXayMoiDanhSach.setTenChuHo(tenChuHoValue);
					dsNhaTieuHGDXayMoiDanhSach.setToaDo(toaDoValue);
					dsNhaTieuHGDXayMoiDanhSach.setHoNgheo(hoNgheoValue);
					
					dsNhaTieuHGDXayMoiDanhSach.setKoCoNhaTieu(koCoNhaTieuValue);
					dsNhaTieuHGDXayMoiDanhSach.setCoNhungKoHVS(coNhungKoHVSValue);
					
					dsNhaTieuHGDXayMoiDanhSach.setTH(THValue);
					dsNhaTieuHGDXayMoiDanhSach.setTD(TDValue);
					dsNhaTieuHGDXayMoiDanhSach.setHN(HNValue);
					dsNhaTieuHGDXayMoiDanhSach.setChim(chimValue);
					dsNhaTieuHGDXayMoiDanhSach.setKhac(khacValue);
					
					dsNhaTieuHGDXayMoiDanhSach.setTroCap(troCapValue);
					dsNhaTieuHGDXayMoiDanhSach.setVayVonNHCS(vayVonNHCSValue);
					dsNhaTieuHGDXayMoiDanhSach.setTuXay(tuXayValue);
					
					dsNhaTieuHGDXayMoiDanhSach.setThangNamHoanThanh(thangNamHoanThanhValue);
					dsNhaTieuHGDXayMoiDanhSach.setGhiChu(ghiChuValue);
					
					lstDsNhaTieuHGDXayMoiDanhSach.add(dsNhaTieuHGDXayMoiDanhSach);
				}
			}
		}else if(thoigianthuc.equalsIgnoreCase(ReportConstant.CHOT)){
			log.info("===DSNhaTieuHGDXayMoiExport======CHOT===="+thoigianthuc);
			
			List<VeSinhGiaDinh> lstVeSinhGiaDinh = VeSinhGiaDinhBusiness.getVeSinhGiaDinhSearch(maTinh, null, null, null, TRANGTHAI, namBaoCao, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
			if(Validator.isNotNull(lstVeSinhGiaDinh) && lstVeSinhGiaDinh.size() > 0){
				log.info("==DSNhaTieuHGDXayMoiExport==lstVeSinhGiaDinh=="+lstVeSinhGiaDinh.size());
				
				for(VeSinhGiaDinh veSinhGiaDinh: lstVeSinhGiaDinh){
					
					String huyenValue = "";
					String xaValue = "";
					String thonValue = "";
					String tenChuHoValue = "";
					String toaDoValue = "";
					String hoNgheoValue = "";
					String koCoNhaTieuValue = "" ;
					String coNhungKoHVSValue = "" ;
					String THValue = "";
					String TDValue = "";
					String HNValue = "";
					String chimValue = "";
					String khacValue = "";
					String troCapValue = "";
					String vayVonNHCSValue = "";
					String tuXayValue = "";
					String thangNamHoanThanhValue = "";
					String ghiChuValue = "";
					
					dsNhaTieuHGDXayMoiDanhSach = new DSNhaTieuHGDXayMoiDanhSach();
					
					
					huyenValue = Validator.isNotNull(veSinhGiaDinh.getMaHuyen()) ? NuocSachUtils.getNameHuyen(null, veSinhGiaDinh.getMaHuyen()) : "";
					xaValue = Validator.isNotNull(veSinhGiaDinh.getMaXa()) ? NuocSachUtils.getNameXa( veSinhGiaDinh.getMaXa()) : "";
					thonValue = Validator.isNotNull(veSinhGiaDinh.getThonXom()) ? veSinhGiaDinh.getThonXom() : "";
					tenChuHoValue = Validator.isNotNull(veSinhGiaDinh.getTenChuHo()) ? veSinhGiaDinh.getTenChuHo() : "";
					
					String kinhDoTemp = Validator.isNotNull(veSinhGiaDinh.getKinhDo()) ? veSinhGiaDinh.getKinhDo() : "";
					String viDoTemp = Validator.isNotNull(veSinhGiaDinh.getViDo()) ? "/"+veSinhGiaDinh.getViDo() : "";
					toaDoValue = kinhDoTemp + viDoTemp;
					
					if(Validator.isNotNull(veSinhGiaDinh.getThanhPhanHoGD()) && veSinhGiaDinh.getThanhPhanHoGD() > 0){
						if(veSinhGiaDinh.getThanhPhanHoGD() == WebKeys.TPHGD_NGHEO){
							hoNgheoValue = tichCo;
						}
					}
					if(Validator.isNotNull(veSinhGiaDinh.getCoNhaTieu()) && veSinhGiaDinh.getCoNhaTieu() > 0){
						if(veSinhGiaDinh.getCoNhaTieu() == WebKeys.CONHATIEU_KHONG){
							koCoNhaTieuValue = tichCo;
						}				
					}
					if(Validator.isNotNull(veSinhGiaDinh.getNhaTieuHVS()) && veSinhGiaDinh.getNhaTieuHVS() > 0){
						if(veSinhGiaDinh.getNhaTieuHVS() == WebKeys.NHATIEUHVS_KHONG){
							coNhungKoHVSValue = tichCo;
						}				
					}
					
					if(Validator.isNotNull(veSinhGiaDinh.getLoaiNhaTieu())){
						
						String loaiNhaTieuTemp = veSinhGiaDinh.getLoaiNhaTieu();
						
						
						if(loaiNhaTieuTemp.equalsIgnoreCase(WebKeys.IMPORT_TH)){ //Nhà tiêu tự hoại
							THValue = tichCo;
							TDValue = "";
							HNValue = "";
							chimValue = "";
							khacValue = "";
						}else if(loaiNhaTieuTemp.equalsIgnoreCase(WebKeys.IMPORT_TD) || loaiNhaTieuTemp.equalsIgnoreCase(WebKeys.LOAINHATIEU_DNBB)){ //Nhà tiêu thấm dội nước và Nhà tiêu dội nước + bể biogas
							THValue = "";
							TDValue = tichCo;
							HNValue = "";
							chimValue = "";
							khacValue = "";
						}else if(loaiNhaTieuTemp.equalsIgnoreCase(WebKeys.IMPORT_HN) || loaiNhaTieuTemp.equalsIgnoreCase(WebKeys.LOAINHATIEU_MN)){ //Nhà tiêu khô nổi hai ngăn tách hoặc không tách nước tiểu và Nhà tiêu khô nổi một ngăn tách hoặc không tách nước tiểu 
							THValue = "";
							TDValue = "";
							HNValue = tichCo;
							chimValue = "";
							khacValue = "";
						}else if(loaiNhaTieuTemp.equalsIgnoreCase(WebKeys.IMPORT_CHIM)){ // Nhà tiêu khô chìm
							THValue = "";
							TDValue = "";
							HNValue = "";
							chimValue = tichCo;
							khacValue = "";
						}else if(loaiNhaTieuTemp.equalsIgnoreCase(WebKeys.IMPORT_KHAC) || loaiNhaTieuTemp.equalsIgnoreCase(WebKeys.LOAINHATIEU_DNNT) || loaiNhaTieuTemp.equalsIgnoreCase(WebKeys.LOAINHATIEU_THCT) || loaiNhaTieuTemp.equalsIgnoreCase(WebKeys.LOAINHATIEU_KQSD) ){ //Loại nhà tiêu khác , Nhà tiêu dội nước (nước thải không qua bể phốt, hố, hay biogas), Nhà tiêu thùng hoặc cầu tõm, Không quan sát được 
							THValue = "";
							TDValue = "";
							HNValue = "";
							chimValue = "";
							khacValue = tichCo;
						}
					}

					if(Validator.isNotNull(veSinhGiaDinh.getNguonVon()) && veSinhGiaDinh.getNguonVon() > 0){
						switch(veSinhGiaDinh.getNguonVon()){
							case WebKeys.NGUONVON_TRO_CAP:
								troCapValue = tichCo;
								vayVonNHCSValue = "";
								tuXayValue = "";
								break;
							case WebKeys.NGUONVON_VAY_VON:
								troCapValue = "";
								vayVonNHCSValue = tichCo;
								tuXayValue = "";
								break;
							case WebKeys.NGUONVON_TU_XAY:
								troCapValue = "";
								vayVonNHCSValue = "";
								tuXayValue = tichCo;
								break;
						}			
					}
					
					if(veSinhGiaDinh.getThangXayDung() > 0 && veSinhGiaDinh.getNamXayDung() > 0){
						thangNamHoanThanhValue = veSinhGiaDinh.getThangXayDung()+"/"+veSinhGiaDinh.getNamXayDung();
					}
					
					if(Validator.isNotNull(veSinhGiaDinh.getGhiChu())){
						ghiChuValue = veSinhGiaDinh.getGhiChu();						
					}
					dsNhaTieuHGDXayMoiDanhSach.setHuyen(huyenValue);
					dsNhaTieuHGDXayMoiDanhSach.setXa(xaValue);
					dsNhaTieuHGDXayMoiDanhSach.setThon(thonValue);
					dsNhaTieuHGDXayMoiDanhSach.setTenChuHo(tenChuHoValue);
					dsNhaTieuHGDXayMoiDanhSach.setToaDo(toaDoValue);
					dsNhaTieuHGDXayMoiDanhSach.setHoNgheo(hoNgheoValue);
					
					dsNhaTieuHGDXayMoiDanhSach.setKoCoNhaTieu(koCoNhaTieuValue);
					dsNhaTieuHGDXayMoiDanhSach.setCoNhungKoHVS(coNhungKoHVSValue);
					
					dsNhaTieuHGDXayMoiDanhSach.setTH(THValue);
					dsNhaTieuHGDXayMoiDanhSach.setTD(TDValue);
					dsNhaTieuHGDXayMoiDanhSach.setHN(HNValue);
					dsNhaTieuHGDXayMoiDanhSach.setChim(chimValue);
					dsNhaTieuHGDXayMoiDanhSach.setKhac(khacValue);
					
					dsNhaTieuHGDXayMoiDanhSach.setTroCap(troCapValue);
					dsNhaTieuHGDXayMoiDanhSach.setVayVonNHCS(vayVonNHCSValue);
					dsNhaTieuHGDXayMoiDanhSach.setTuXay(tuXayValue);
					
					dsNhaTieuHGDXayMoiDanhSach.setThangNamHoanThanh(thangNamHoanThanhValue);
					dsNhaTieuHGDXayMoiDanhSach.setGhiChu(ghiChuValue);
					
					lstDsNhaTieuHGDXayMoiDanhSach.add(dsNhaTieuHGDXayMoiDanhSach);
				}
			}
		}
		
		
		
		result.setNam(namValue);
		result.setTenTinh(tenTinhValue);
		result.setBaoCaoSo(baoCaoSoValue);
		result.setBaoCaoNgayThangNam(baoCaoNgayThangNamValue);
		result.setNguoiLap(nguoiLapValue);
		result.setNguoiDuyet(nguoiDuyetValue);
		result.setLstDSNhaTieuHGDXayMoiDanhSach(lstDsNhaTieuHGDXayMoiDanhSach);
		return result;
	}
}
