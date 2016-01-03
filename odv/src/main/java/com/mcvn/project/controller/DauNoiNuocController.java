package com.mcvn.project.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dtt.nuocsach.bean.CheckIdUpdate;
import com.dtt.nuocsach.bean.ThongTin;
import com.dtt.nuocsach.bean.ThongTinDauNoi;
import com.dtt.nuocsach.bean.ThongTinKiemDemKeHoach;
import com.dtt.nuocsach.config.Connect;
import com.mcvn.project.model.DauNoiNuoc;
import com.mcvn.project.model.KeHoachKiemDemNuoc;
import com.mcvn.project.model.ThongTinKiemDemNuoc;
import com.mcvn.project.service.DauNoiNuocService;
import com.mcvn.project.service.KeHoachKiemDemNuocService;
import com.mcvn.project.service.ThongTinKiemDemNuocService;

@Controller
@RequestMapping(value = "/admin")
public class DauNoiNuocController extends BaseController {
	@Autowired
	private ThongTinKiemDemNuocService thongTinKiemDemService;
	@Autowired
	private DauNoiNuocService dauNoiNuocService;
	@Autowired
	private KeHoachKiemDemNuocService keHoachKiemDemNuocService;

	@RequestMapping(value = "/dongbo", method = RequestMethod.POST)
	public @ResponseBody List<CheckIdUpdate> upDatedaunoiNuoc(@RequestBody ThongTin[] thongTins) {
		List<CheckIdUpdate> listID = new ArrayList<CheckIdUpdate>();
		for (ThongTin thongTin : thongTins) {
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			ThongTinKiemDemNuoc tt = new ThongTinKiemDemNuoc();
			tt.setId(Integer.parseInt(thongTin.getId()));
			tt.setAnhbechua(thongTin.getAnhbechua());
			tt.setAnhdaunoi(thongTin.getAnhdaunoi());
			tt.setAnhdongho(thongTin.getAnhdongho());
			if (thongTin.getBimatnuoc() != null) {
				tt.setBimatnuoc(Integer.parseInt(thongTin.getBimatnuoc()));
			}
			tt.setChisodongho(thongTin.getChisodongho());
			if (thongTin.getChuhodungds() != null) {
				tt.setChuhodungds(Integer.parseInt(thongTin.getChuhodungds()));
			}
			if (thongTin.getCobechua() != null) {
				tt.setCobechuanuoc(Integer.parseInt(thongTin.getCobechua()));
			}
			tt.setTimthaynha(thongTin.getTimthaynha());
			tt.setConguoionha(thongTin.getConguoionhakhong());
			if (thongTin.getDaunoinuocid() != null) {
				tt.setDaunoinuocid(Integer.parseInt(thongTin.getDaunoinuocid()));
			}
			if (thongTin.getDaketthucdieutra() != null) {
				tt.setDaketthucdieutra(Integer.parseInt(thongTin.getDaketthucdieutra()));
			} else {
				tt.setDaketthucdieutra(0);
			}
			if (thongTin.getDatungduckhong() != null) {
				tt.setDatungduckhong(Integer.parseInt(thongTin.getDatungduckhong()));
			}
			if (thongTin.getDaunoichua() != null) {
				tt.setDaunoichua(Integer.parseInt(thongTin.getDaunoichua()));
			}
			tt.setGhichu(thongTin.getGhichu());
			if (thongTin.getGioitinhchuho() != null) {
				tt.setGioitinhchuho(Integer.parseInt(thongTin.getGioitinhchuho()));
			}
			if (thongTin.getGioitinhchuhohientai() != null) {
				tt.setGioitinhchuhohientai(Integer.parseInt(thongTin.getGioitinhchuhohientai()));
			}
			tt.setGioitinhnguoitraloi(thongTin.getGioitinhnguoitraloi());
			tt.setHotennguoitraloi(thongTin.getHotennguoitraloi());
			if (thongTin.getKehoachkiemdemnuocid() != null) {
				KeHoachKiemDemNuoc kh = new KeHoachKiemDemNuoc();
				kh.setId(Integer.parseInt(thongTin.getKehoachkiemdemnuocid()));
				tt.setKeHoachKiemDemNuoc(kh);
			}
			if (thongTin.getChinhsach() != null) {
				tt.setChinhsach(Integer.parseInt(thongTin.getChinhsach()));
			}

			tt.setLachuhokhong(thongTin.getLachuhokhong());
			tt.setLoaikhac(thongTin.getLoaikhac());
			tt.setLoaikhactungco(thongTin.getLoaikhactungco());
			tt.setLydokhonghoanthanh(thongTin.getLydokhonghoanthanh());
			tt.setMahuyen(thongTin.getMahuyen());
			tt.setMaxa(thongTin.getMaxa());
			tt.setMatinh(thongTin.getMatinh());
			tt.setMaunuoc(thongTin.getMaunuoc());
			tt.setMuinuoc(thongTin.getMuinuoc());
			tt.setMaunuoctungco(thongTin.getMaunuoctungco());
			tt.setMuinuoctungco(thongTin.getMuinuoctungco());
			if (thongTin.getNgaykiemdem() != null) {
				Date date;
				try {
					date = formatter.parse(thongTin.getNgaykiemdem());
					tt.setNgaykiemdem(date);
				} catch (ParseException e) {
					e.printStackTrace();
				}
			}
			if (thongTin.getNuoctrongkhong() != null) {
				tt.setNuoctrongkhong(Integer.parseInt(thongTin.getNuoctrongkhong()));
			}
			if (thongTin.getSogiotrungbinh() != null) {
				tt.setSogiotrungbinh(Integer.parseInt(thongTin.getSogiotrungbinh()));
			}
			if (thongTin.getSolanmatnuoc() != null) {
				tt.setSolanmatnuoc(Integer.parseInt(thongTin.getSolanmatnuoc()));
			}
			if (thongTin.getSonguoitrongho() != null) {
				tt.setSonguoitrongho(Integer.parseInt(thongTin.getSonguoitrongho()));
			}
			tt.setSoserydongho(thongTin.getSoserydongho());
			tt.setTenchuho(thongTin.getTenchuho());
			tt.setTenchuhohientai(thongTin.getTenchuhohientai());
			tt.setTendantoc(thongTin.getTendantoc());
			if (thongTin.getThanhphanhogd() != null) {
				tt.setThanhphanhogd(Integer.parseInt(thongTin.getThanhphanhogd()));
			}
			if (thongTin.getThoigiandaunoihopdong() != null) {
				try {
					SimpleDateFormat formatter1;
					formatter1 = new SimpleDateFormat("yyyy-MM-dd");
					Date date = formatter1.parse(thongTin.getThoigiandaunoihopdong().substring(0, 10));
					tt.setThoigiandauhopdong(date);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (thongTin.getThoigiandaunoithucte() != null) {
				try {
					SimpleDateFormat formatter1;
					formatter1 = new SimpleDateFormat("yyyy-MM-dd");
					Date date = formatter1.parse(thongTin.getThoigiandaunoithucte().substring(0, 10));
					tt.setThoigiandaunoithucte(date);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			tt.setThonxom(thongTin.getThonxom());
			if (thongTin.getTinhtrangbe() != null) {
				tt.setTinhtrangbe(Integer.parseInt(thongTin.getTinhtrangbe()));
			}
			tt.setKinhdo(thongTin.getToadodiachi_longitude().toString());
			tt.setVido(thongTin.getToadodiachi_latitude().toString());
			tt.setVinuoc(thongTin.getVinuoc());
			tt.setVinuoctungco(thongTin.getVinuoctungco());
			if (thongTin.getVoinuoccochaykhong() != null) {
				tt.setVoinuocchaykhong(Integer.parseInt(thongTin.getVoinuoccochaykhong()));
			}
			tt.setDanhgiakiemdem(0);
			int danhgia = danhgiakiemdem(thongTin);
			tt.setDanhgiakiemdem(danhgia);
			List<KeHoachKiemDemNuoc> list = keHoachKiemDemNuocService
					.getKehoachThemDauNoi(Integer.parseInt(thongTin.getIdkiemtra()));
			if (Integer.parseInt(thongTin.getId()) == 0 && list.size() >= 1 && thongTin.getTenchuho() != null
					&& thongTin.getMatinh() != null && thongTin.getMahuyen() != null && thongTin.getMaxa() != null) {
				KeHoachKiemDemNuoc kh = list.get(0);
				DauNoiNuoc dn = new DauNoiNuoc();
				dn.setMAHUYEN(thongTin.getMahuyen());
				dn.setMATINH(thongTin.getMatinh());
				dn.setMAXA(thongTin.getMaxa());
				dn.setTHONXOM(thongTin.getThonxom());
				dn.setTENCHUHO(thongTin.getTenchuho());
				dn.setTRANGTHAI(1);
				if (thongTin.getGioitinhchuho() != null) {
					dn.setGIOITINH(Integer.parseInt(thongTin.getGioitinhchuho()));
				}
				if (thongTin.getThoigiandaunoihopdong() != null) {
					try {
						SimpleDateFormat formatter1;
						formatter1 = new SimpleDateFormat("yyyy-MM-dd");
						Date date = formatter1.parse(thongTin.getThoigiandaunoihopdong().substring(0, 10));
						dn.setNGAYDAUNOIHOPDONG(date);
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				dn.setTRAMCAPNUOCID(kh.getTramcapnuocid());
				dn.setNAMBAOCAO(0);
				dn.setIDNGUOITAO(0);
				dn.setNGAYTAO(new Date());
				tt.setKeHoachKiemDemNuoc(kh);
				int iddaunoi = getIdDauNoi();
				dn.setID(iddaunoi);
				if (thongTin.getSoserydongho() != null) {
					List<ThongTinKiemDemNuoc> listsosery = thongTinKiemDemService
							.kiemtratrungsosery(thongTin.getSoserydongho());
					if (listsosery.size() == 0) {
						List<ThongTinKiemDemNuoc> listtrungdiachi = thongTinKiemDemService.kiemtratrung(
								thongTin.getMatinh(), thongTin.getMahuyen(), thongTin.getMaxa(), thongTin.getThonxom(),
								thongTin.getTenchuho());
						if (listtrungdiachi.size() == 0) {
							DauNoiNuoc dnm = dauNoiNuocService.save(dn);
							tt.setDaunoinuocid(dnm.getID());
							int idthongtin = getIDthongtinnuoc();
							CheckIdUpdate CheckID = new CheckIdUpdate();
							CheckID.setId_daunoi(dnm.getID());
							CheckID.setId_kehoach(kh.getId());
							CheckID.setId_mobile(thongTin.getIdmobile());
							CheckID.setId_thongtinkiemdem(idthongtin);
							listID.add(CheckID);
							tt.setId(idthongtin);
							thongTinKiemDemService.save(tt);
						} else {
							CheckIdUpdate CheckID = new CheckIdUpdate();
							CheckID.setId_mobile(thongTin.getIdmobile());
							CheckID.setIstrung(2);
							listID.add(CheckID);
						}

					} else {
						CheckIdUpdate CheckID = new CheckIdUpdate();
						CheckID.setId_mobile(thongTin.getIdmobile());
						CheckID.setIstrung(1);
						listID.add(CheckID);
					}
				} else {
					List<ThongTinKiemDemNuoc> listtrungdiachi = thongTinKiemDemService.kiemtratrung(
							thongTin.getMatinh(), thongTin.getMahuyen(), thongTin.getMaxa(), thongTin.getThonxom(),
							thongTin.getTenchuho());
					if (listtrungdiachi.size() == 0) {
						DauNoiNuoc dnm = dauNoiNuocService.save(dn);
						tt.setDaunoinuocid(dnm.getID());
						int idthongtin = getIDthongtinnuoc();
						CheckIdUpdate CheckID = new CheckIdUpdate();
						CheckID.setId_daunoi(dnm.getID());
						CheckID.setId_kehoach(kh.getId());
						CheckID.setId_mobile(thongTin.getIdmobile());
						CheckID.setId_thongtinkiemdem(idthongtin);
						listID.add(CheckID);
						tt.setId(idthongtin);
						thongTinKiemDemService.save(tt);
					} else {
						CheckIdUpdate CheckID = new CheckIdUpdate();
						CheckID.setId_mobile(thongTin.getIdmobile());
						CheckID.setIstrung(2);
						listID.add(CheckID);
					}
				}

			}
			if (Integer.parseInt(thongTin.getId()) > 0) {

				tt.setDaunoinuocid(Integer.parseInt(thongTin.getDaunoinuocid()));
				thongTinKiemDemService.save(tt);
			}
		}
		return listID;
	}

	private int kiemTraAnh(ThongTin thongTin) {
		int count = 0;
		if (thongTin.getAnhdaunoi() != null) {
			count = count + 1;
		}
		if (thongTin.getAnhbechua() != null) {
			count = count + 1;
		}
		if (thongTin.getAnhdongho() != null) {
			count = count + 1;
		}
		return count;
	}

	private int danhgiakiemdem(ThongTin thongTin) {
		String thoigiandaunoithucte[];
		int namthucte = 0;
		if (thongTin.getDaketthucdieutra() == null) {
			return 0;
		}
		if (thongTin.getThoigiandaunoithucte() == null) {
			return 2;
		}
		if (kiemTraAnh(thongTin) < 2) {
			return 2;
		}
		if (thongTin.getVoinuoccochaykhong() != null && thongTin.getDaunoichua() != null) {
			if (Integer.parseInt(thongTin.getVoinuoccochaykhong()) == 1
					&& Integer.parseInt(thongTin.getVoinuoccochaykhong()) == 1)
				if (thongTin.getThoigiandaunoithucte() != null) {
					thoigiandaunoithucte = thongTin.getThoigiandaunoithucte().split("[-]");
					namthucte = Integer.parseInt(thoigiandaunoithucte[0]);
					if (namthucte >= 2013) {
						return 1;
					}
				}
		}
		return 2;
	}

	@RequestMapping(value = "/kiemtratkehoachdongnuoc", method = RequestMethod.POST)
	private @ResponseBody List<KeHoachKiemDemNuoc> kiemtrakhdongnuoc(@RequestParam("id") String idkiemdemvien) {
		return keHoachKiemDemNuocService.kiemtrakhdong(Integer.parseInt(idkiemdemvien));

	}

	private int getIDthongtinnuoc() {
		ResultSet rs = null;
		java.sql.Connection conn;
		int id = 0;
		try {
			conn = Connect.getconect();
			java.sql.Statement stmt = conn.createStatement();
			rs = stmt.executeQuery(
					"SELECT currentId FROM counter where name='vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC'");
			while (rs.next()) {
				id = rs.getInt("currentId");
			}
			String sql = "UPDATE counter SET currentId=? WHERE name='vn.dtt.sol.ns.tramcap.dao.model.THONGTINKIEMDEMNUOC'";
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setInt(1, id + 1);
			statement.executeUpdate();
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return id + 1;
	}

	private int getIdDauNoi() {
		ResultSet rs = null;
		java.sql.Connection conn;
		int id = 0;
		try {
			conn = Connect.getconect();
			java.sql.Statement stmt = conn.createStatement();
			rs = stmt.executeQuery(
					"SELECT currentId FROM counter where name='vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc'");
			while (rs.next()) {
				id = rs.getInt("currentId");

			}
			String sql = "UPDATE counter SET currentId=? WHERE name='vn.dtt.sol.ns.tramcap.dao.model.DauNoiNuoc'";
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setInt(1, id + 1);
			statement.executeUpdate();
			stmt.close();
			conn.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return id + 1;
	}

	@RequestMapping(value = "/getDaunoimoi", method = RequestMethod.POST)
	public @ResponseBody List<ThongTinDauNoi> getDaunoimoi(@RequestParam("id") String idkiemdemvien) {
		List<ThongTinDauNoi> list = thongTinKiemDemService.getdaunoinuocmoi(Integer.parseInt(idkiemdemvien));

		for (ThongTinDauNoi daunoi : list) {
			if (daunoi.getThoigiandauhopdong() != null) {
				java.sql.Date date = new java.sql.Date(daunoi.getThoigiandauhopdong().getTime());
				daunoi.setThoigiandauhopdong(date);
			}
			if (daunoi.getThoigiandaunoithucte() != null) {
				java.sql.Date date = new java.sql.Date(daunoi.getThoigiandaunoithucte().getTime());
				daunoi.setThoigiandaunoithucte(date);
			}

		}
		return list;

	}

	@RequestMapping(value = "/getdaunoimoivakehoach", method = RequestMethod.POST)
	public @ResponseBody List<ThongTinKiemDemKeHoach> getDaunoimoivakehoach(@RequestParam("id") String idkiemdemvien) {
		List<ThongTinKiemDemKeHoach> list = thongTinKiemDemService.getthongtinkehoach(Integer.parseInt(idkiemdemvien));
		return list;

	}

	private int _cal(Date ngaykd, Date tgthucte) {
		Calendar startCalendar = new GregorianCalendar();
		Calendar endCalendar = new GregorianCalendar();
		startCalendar.setTime(ngaykd);
		endCalendar.setTime(tgthucte);
		int diffYear = endCalendar.get(Calendar.YEAR) - startCalendar.get(Calendar.YEAR);
		int diffMonth = diffYear * 12 + endCalendar.get(Calendar.MONTH) - startCalendar.get(Calendar.MONTH);
		return diffMonth;
	}

	private String getpath(String path) {
		String name[] = null;
		String LOCAL_FILE = System.getProperty("catalina.base") + "/" + "webapps/images";
		name = path.split("[/]");
		String tinh = name[0];
		String huyen = name[1];
		String xa = name[2];
		String nameimage = name[3];
		String PATH_DAUNOINUOC = LOCAL_FILE + "/daunoinuoc";
		String PATH_TINH = PATH_DAUNOINUOC + "/" + tinh;
		String PATH_HUYEN = PATH_TINH + "/" + huyen;
		String PATH_XA = PATH_HUYEN + "/" + xa;
		String PATH_FILE = PATH_XA + "/" + nameimage;
		File dir = new File(LOCAL_FILE);
		if (!dir.exists()) {
			dir.mkdirs();
		}
		File dir_daunoinuoc = new File(PATH_DAUNOINUOC);
		if (!dir_daunoinuoc.exists()) {
			dir_daunoinuoc.mkdirs();
		}
		File dir_tinh = new File(PATH_TINH);
		if (!dir_tinh.exists()) {
			dir_tinh.mkdirs();
		}
		File dir_huyen = new File(PATH_HUYEN);
		if (!dir_huyen.exists()) {
			dir_huyen.mkdirs();
		}
		File dir_xa = new File(PATH_XA);
		if (!dir_xa.exists()) {
			dir_xa.mkdirs();
		}
		return PATH_FILE;
	}

	@RequestMapping(value = "/uploadImage", method = RequestMethod.POST)
	public @ResponseBody String uploadImage(@RequestParam("image") String imageValue, @RequestParam("path") String path,
			HttpServletRequest request) {
		String err = null;
		String PATH_FILE = getpath(path);
		try {
			byte[] imageByte = Base64.decodeBase64(imageValue);
			OutputStream out = new FileOutputStream(PATH_FILE);
			System.out.print(PATH_FILE);
			out.write(imageByte);
			out.close();

		} catch (Exception e)

		{
			err = e.getMessage();
		}
		return err;

	}

}
