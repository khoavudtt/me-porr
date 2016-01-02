package vn.dtt.sol.ns.reporting.model.tdthcntt;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import vn.dtt.sol.ns.business.DataItemBusiness;
import vn.dtt.sol.ns.reporting.utils.ReportConstant;
import vn.dtt.sol.ns.reporting.utils.ReportFunction;
import vn.dtt.sol.ns.tramcap.business.DanhGiaBenVungBussiness;
import vn.dtt.sol.ns.tramcap.business.TramCapBusiness;
import vn.dtt.sol.ns.tramcap.dao.model.DanhGiaBenVung;
import vn.dtt.sol.ns.tramcap.dao.model.TramCapNuoc;
import vn.dtt.sol.ns.tramcap.dao.service.DanhGiaBenVungLocalServiceUtil;
import vn.dtt.sol.ns.util.NuocSachUtils;
import vn.dtt.sol.ns.util.WebKeys;
import vn.dtt.sol.ns.util.format.ConvertUtil;
import vn.dtt.sol.ns.util.format.FormatData;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;

public class TienDoThucHienCapNuocExport {
	private static Log log = LogFactoryUtil.getLog(TienDoThucHienCapNuocExport.class);
	
	
	public static TienDoThucHienCapNuoc getModel(String namBaoCao, String maTinh, String soBaoCao, String ngayBaoCao, String nguoiLap, String nguoiDuyet) throws PortalException, SystemException {
		
		log.info("===TienDoThucHienCapNuocExport===");
		log.info("--getModel==namBaoCao=="+namBaoCao+"==soBaoCao--"+soBaoCao+"==ngayBaoCao--"+ngayBaoCao+"==maTinh--"+maTinh);
		TienDoThucHienCapNuoc result = new TienDoThucHienCapNuoc();
		
		TienDoThucHienCapNuocDanhSach tienDoThucHienCapNuocDanhSach = null;
		List<TienDoThucHienCapNuocDanhSach> lstTienDoThucHienCapNuocDanhSach = null;
		
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
		
		
		List<TramCapNuoc> lstTramCapNuoc = TramCapBusiness.getTramCapNuocJoinDanhGiaBenVung(maTinh,namBaoCao);
		lstTienDoThucHienCapNuocDanhSach = new ArrayList<TienDoThucHienCapNuocDanhSach>();
		
		if(Validator.isNotNull(lstTramCapNuoc) && lstTramCapNuoc.size() > 0){
			log.info("===TienDoThucHienCapNuocExport===getModel---===lstTramCapNuoc---"+lstTramCapNuoc.size());
			for (TramCapNuoc tramCapNuoc : lstTramCapNuoc) {
				tienDoThucHienCapNuocDanhSach = new TienDoThucHienCapNuocDanhSach();
				
				String tenCongTrinhValue = "";
				String diaDiemValue = "";
				String tinhTrangValue = "";
				int theoKHValue = 0;
				int workingValue = 0;
				String tatCaChiSoValue = "";
				String arsenValue = "";
				int ncThatThoatValue = 0;
				int doanhThuValue = 0;
				int chiPhiVHBDValue = 0;
				String moHinhQLValue = "";
				
				tenCongTrinhValue = Validator.isNotNull(tramCapNuoc.getTenTram()) ? tramCapNuoc.getTenTram() : "";
				String xaValueTemp = Validator.isNotNull(tramCapNuoc.getMaXa()) ? NuocSachUtils.getNameXa( tramCapNuoc.getMaXa()) : "";
				String huyenValueTemp = Validator.isNotNull(tramCapNuoc.getMaHuyen()) ? ", "+NuocSachUtils.getNameHuyen(null, tramCapNuoc.getMaHuyen()) : "";
				diaDiemValue = xaValueTemp+huyenValueTemp;
				
				int tinhTrangTemp = Validator.isNotNull(tramCapNuoc.getTinhTrangDuAn()) ? tramCapNuoc.getTinhTrangDuAn() : 0 ;
				tinhTrangValue = ReportConstant.CHUATHUCHIEN;
				if(tinhTrangTemp == 1){
					tinhTrangValue = ReportConstant.DANGVANHANH;
				}else if(tinhTrangTemp == 2){
					tinhTrangValue = ReportConstant.DANGCHAYTHU;
				}else if(tinhTrangTemp == 3){
					tinhTrangValue = ReportConstant.DANGXAYDUNG;
				}else if(tinhTrangTemp == 4){
					tinhTrangValue = ReportConstant.DANGCHUANBIDAUTU;
				}
				
				theoKHValue = Validator.isNotNull(tramCapNuoc.getTongDauNoiThietKe()) ? tramCapNuoc.getTongDauNoiThietKe() : 0 ;
				workingValue = Validator.isNotNull(tramCapNuoc.getTongDauNoiThucTe()) ? tramCapNuoc.getTongDauNoiThucTe() : 0 ;
				
				DanhGiaBenVung danhGiaBenVung = DanhGiaBenVungBussiness.getDanhGiaBenVungByTramCapNuocAndNam(tramCapNuoc.getId(),null,null); // tramcapnuoc join danhgiabenvung chi bang tramcapid thoi
				if(Validator.isNotNull(danhGiaBenVung)){
					int nuocDatTieuChuanTemp = Validator.isNotNull(danhGiaBenVung.getNuocDatTieuChuan()) ? danhGiaBenVung.getNuocDatTieuChuan() : 0;
					tatCaChiSoValue = (nuocDatTieuChuanTemp > 0 && nuocDatTieuChuanTemp == 1)  ? ReportConstant.DAT : ReportConstant.KHONG ;
					
					int nuocCoAsenTemp = Validator.isNotNull(danhGiaBenVung.getNuocCoAsen() ) ? danhGiaBenVung.getNuocCoAsen() : 0;
					arsenValue = (nuocCoAsenTemp > 0 && nuocCoAsenTemp == 2 ) ? ReportConstant.DAT : ReportConstant.KHONG ;
					
					ncThatThoatValue = Validator.isNotNull(danhGiaBenVung.getNuocThatThoat() ) ? danhGiaBenVung.getNuocThatThoat() : 0;
					doanhThuValue = Validator.isNotNull(danhGiaBenVung.getTongDoanhThu() ) ? danhGiaBenVung.getTongDoanhThu() : 0;
					chiPhiVHBDValue = Validator.isNotNull(danhGiaBenVung.getTongChiPhi() ) ? danhGiaBenVung.getTongChiPhi() : 0;
					
				}
				moHinhQLValue = Validator.isNotNull(tramCapNuoc.getMaMoHinh() ) ? DataItemBusiness.getByNode1Id(WebKeys.DATAGROUPID_MOHINHQUANLY, tramCapNuoc.getMaMoHinh()).getName() : ""; 
				
				
				tienDoThucHienCapNuocDanhSach.setTenCongTrinh(tenCongTrinhValue);
				tienDoThucHienCapNuocDanhSach.setDiaDiem(diaDiemValue);
				tienDoThucHienCapNuocDanhSach.setTinhTrang(tinhTrangValue);
				tienDoThucHienCapNuocDanhSach.setTheoKH(theoKHValue);
				tienDoThucHienCapNuocDanhSach.setWorking(workingValue);
				tienDoThucHienCapNuocDanhSach.setTatCaChiSo(tatCaChiSoValue);
				tienDoThucHienCapNuocDanhSach.setArsen(arsenValue);
				tienDoThucHienCapNuocDanhSach.setNcThatThoat(ncThatThoatValue);
				tienDoThucHienCapNuocDanhSach.setDoanhThu(doanhThuValue);
				tienDoThucHienCapNuocDanhSach.setChiPhiVHBD(chiPhiVHBDValue);
				tienDoThucHienCapNuocDanhSach.setMoHinhQL(moHinhQLValue);
				lstTienDoThucHienCapNuocDanhSach.add(tienDoThucHienCapNuocDanhSach);
			}
			
		}
		
		log.info("===TienDoThucHienCapNuocExport===getModel--result--===namValue---"+namValue+"==tenTinhValue--"+tenTinhValue+"==baoCaoSoValue--"+baoCaoSoValue+"==baoCaoNgayThangNamValue--"+baoCaoNgayThangNamValue+"==lstDSDauNoiMoiCapNuocDanhSach--"+lstTienDoThucHienCapNuocDanhSach.size());
		result.setNam(namValue);
		result.setTenTinh(tenTinhValue);
		result.setBaoCaoSo(baoCaoSoValue);
		result.setBaoCaoNgayThangNam(baoCaoNgayThangNamValue);
		result.setNguoiLap(nguoiLapValue);
		result.setNguoiDuyet(nguoiDuyetValue);
		result.setLstTienDoThucHienCapNuocDanhSach(lstTienDoThucHienCapNuocDanhSach);
		return result;
	}
}
