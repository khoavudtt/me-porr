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
import java.util.Date;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dtt.nuocsach.bean.CheckidupdateVesinh;
import com.dtt.nuocsach.bean.ThongTin;
import com.dtt.nuocsach.bean.ThongTinKiemDemKeHoach;
import com.dtt.nuocsach.bean.ThongTinveSinh;
import com.dtt.nuocsach.bean.VeSinhGiaDinhTT;
import com.dtt.nuocsach.config.Connect;
import com.mcvn.project.model.KeHoachKiemDemVeSinh;
import com.mcvn.project.model.KiemDemVien;
import com.mcvn.project.model.VeSinh;
import com.mcvn.project.model.VeSinhHoGiaDinh;
import com.mcvn.project.service.KeHoachKiemDemVeSinhService;
import com.mcvn.project.service.KiemDemVienService;
import com.mcvn.project.service.VeSinhHoGiaDinhService;
import com.mcvn.project.service.VeSinhService;

@Controller
@RequestMapping(value = "/vesinh")
public class VeSinhHoGiaDinhController extends BaseController {
	@Autowired
	private VeSinhHoGiaDinhService veSinhHoGiaDinhService;
	@Autowired
	private KeHoachKiemDemVeSinhService keHoachKiemDemVeSinhService;
	@Autowired
	private VeSinhService veSinhService;
	@Autowired
	private KiemDemVienService kiemDemVienService;
	@Autowired
	private ServletContext context;

	@RequestMapping(value = "/getvesinh", method = RequestMethod.POST)
	public @ResponseBody List<VeSinhGiaDinhTT> getvesinhgiadinhmoi(@RequestParam("id") String idkiemdemvien) {
		List<VeSinhGiaDinhTT> list = veSinhHoGiaDinhService.getVeSinhGd(Integer.parseInt(idkiemdemvien));
		return list;
	}

	@RequestMapping(value = "/getDaunoimoivakehoach", method = RequestMethod.POST)
	public @ResponseBody List<ThongTinKiemDemKeHoach> getDaunoimoivakehoach(@RequestParam("id") String idkiemdemvien) {
		List<ThongTinKiemDemKeHoach> list = veSinhHoGiaDinhService.getthongtinkehoach(Integer.parseInt(idkiemdemvien));
		return list;
	}

	@RequestMapping(value = "/get")
	public @ResponseBody List<ThongTinKiemDemKeHoach> getDaunoimoivakehoach() {
		List<ThongTinKiemDemKeHoach> list = veSinhHoGiaDinhService.getthongtinkehoach(62);
		return list;
	}

	@RequestMapping(value = "/kiemtrakehoachvsdong", method = RequestMethod.POST)
	public @ResponseBody List<KeHoachKiemDemVeSinh> kiemtrakehoachvesinhdong(@RequestParam("id") String idkiemdemvien) {
		List<KeHoachKiemDemVeSinh> list = keHoachKiemDemVeSinhService
				.kiemtrakehoachdong(Integer.parseInt(idkiemdemvien));
		return list;
	}

	@RequestMapping(value = "/dongbo", method = RequestMethod.POST)
	public @ResponseBody List<CheckidupdateVesinh> upDateVeSinh(@RequestBody ThongTinveSinh[] thongtinvesinhs) {
		List<CheckidupdateVesinh> listID = new ArrayList<CheckidupdateVesinh>();
		for (ThongTinveSinh thongtinvesinh : thongtinvesinhs) {
			VeSinhHoGiaDinh vs = new VeSinhHoGiaDinh();
			vs.setId(thongtinvesinh.getId());
			if (thongtinvesinh.getAnhbechua() != null) {
				vs.setAnhbechua(thongtinvesinh.getAnhbechua());
			}
			if (thongtinvesinh.getAnhtoancanh() != null) {
				vs.setAnhtoancanh(thongtinvesinh.getAnhtoancanh());
			}
			if (thongtinvesinh.getAnhtrongnhatieu() != null) {
				vs.setAnhtrongnhatieu(thongtinvesinh.getAnhtrongnhatieu());
			}

			if (thongtinvesinh.getChinhsach() != null) {
				vs.setChinhsach(Integer.parseInt(thongtinvesinh.getChinhsach()));
			}
			if (thongtinvesinh.getConguoionha() != null) {
				vs.setConguoionha(Integer.parseInt(thongtinvesinh.getConguoionha()));
			}
			if (thongtinvesinh.getConhatieu() != null) {
				vs.setConhatieu(Integer.parseInt(thongtinvesinh.getConhatieu()));
			}
			if (thongtinvesinh.getCuaphanbitkin() != null) {
				vs.setCuaphanbitkin(Integer.parseInt(thongtinvesinh.getCuaphanbitkin()));
			}
			if (thongtinvesinh.getDaketthucdieutra() != null) {
				vs.setDaketthucdieutra(Integer.parseInt(thongtinvesinh.getDaketthucdieutra()));
			}
			if (thongtinvesinh.getDanhgiakiemdem() != null) {
				vs.setDanhgiakiemdem(Integer.parseInt(thongtinvesinh.getDanhgiakiemdem()));
			}
			if (thongtinvesinh.getDelamvesinh() != null) {
				vs.setDelamvesinh(Integer.parseInt(thongtinvesinh.getDelamvesinh()));
			}
			if (thongtinvesinh.getDuchemuagio() != null) {
				vs.setDuchemuagio(Integer.parseInt(thongtinvesinh.getDuchemuagio()));
			}
			if (thongtinvesinh.getDuoccaitao() != null) {
				vs.setDuoccaitao(Integer.parseInt(thongtinvesinh.getDuoccaitao()));
			}
			vs.setGhichu(thongtinvesinh.getGhichu());
			if (thongtinvesinh.getGioitinhchuho() != null) {
				vs.setGioitinhchuho(Integer.parseInt(thongtinvesinh.getGioitinhchuho()));
			}
			if (thongtinvesinh.getGioitinhchuhohientai() != null) {
				vs.setGioitinhchuhohientai(Integer.parseInt(thongtinvesinh.getGioitinhchuhohientai()));
			}
			if (thongtinvesinh.getDuoccaitao() == null) {
				vs.setDuoccaitao(2);
			}
			vs.setGioitinhnguoitraloi(thongtinvesinh.getGioitinhnguoitraloi());
			vs.setHotennguoitraloi(thongtinvesinh.getHotennguoitraloi());
			KeHoachKiemDemVeSinh khvs = new KeHoachKiemDemVeSinh();
			khvs.setId(thongtinvesinh.getKehoachkiemdemvesinhid());
			vs.setKeHoachKiemDemVeSinh(khvs);
			if (thongtinvesinh.getKhoangcachnguonnuoc() != null) {
				vs.setKhoangcachnguonnuoc(Integer.parseInt(thongtinvesinh.getKhoangcachnguonnuoc()));
			}
			vs.setKinhdo(thongtinvesinh.getKinhdo());
			vs.setVido(thongtinvesinh.getVido());
			if (thongtinvesinh.getLachuhokhong() != null) {
				vs.setLachuhokhong(Integer.parseInt(thongtinvesinh.getLachuhokhong()));
			}
			vs.setLoainguonnuoc(thongtinvesinh.getLoainguonnuoc());
			vs.setLoainhatieu(thongtinvesinh.getLoainhatieu());
			vs.setLoainhatieucu(thongtinvesinh.getLoainhatieucu());
			vs.setLydokhongdungds(thongtinvesinh.getLydokhongdungds());
			vs.setLydokhonghoanthanh(thongtinvesinh.getLydokhonghoanthanh());
			vs.setMahuyen(thongtinvesinh.getMahuyen());
			vs.setMatinh(thongtinvesinh.getMatinh());
			vs.setMaxa(thongtinvesinh.getMaxa());
			vs.setThonxom(thongtinvesinh.getThonxom());
			if (thongtinvesinh.getMuivesinh() != null) {
				vs.setMuivesinh(Integer.parseInt(thongtinvesinh.getMuivesinh()));
			}
			if (thongtinvesinh.getNamxaydung() != null) {
				vs.setNamxaydung(Integer.parseInt(thongtinvesinh.getNamxaydung()));
			}

			if (thongtinvesinh.getNapbecontot() != null) {
				vs.setNapbecontot(Integer.parseInt(thongtinvesinh.getNapbecontot()));
			}
			if (thongtinvesinh.getNgapkhimualon() != null) {
				vs.setNgapkhimualon(Integer.parseInt(thongtinvesinh.getNgapkhimualon()));
			}
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			Date date;
			try {
				if (thongtinvesinh.getNgaykiemdem() != null) {
					date = formatter.parse(thongtinvesinh.getNgaykiemdem());
					vs.setNgaykiemdem(date);
				}
			} catch (ParseException e) {
				e.printStackTrace();
			}
			KiemDemVien kd = kiemDemVienService.findten(Integer.parseInt(thongtinvesinh.getIdkiemdemvien()));
			vs.setTaikhoan(kd.getTaikhoan());
			if (thongtinvesinh.getNguonvon() != null) {
				vs.setNguonvon(Integer.parseInt(thongtinvesinh.getNguonvon()));
			}
			if (thongtinvesinh.getNuocthaididau() != null) {
				vs.setNuocthaididau(Integer.parseInt(thongtinvesinh.getNuocthaididau()));
			}
			if (thongtinvesinh.getPhiatrenkindao() != null) {
				vs.setPhiatrenkindao(Integer.parseInt(thongtinvesinh.getPhiatrenkindao()));
			}
			if (thongtinvesinh.getSancaotrentoithieu() != null) {
				vs.setSancaotrentoithieu(Integer.parseInt(thongtinvesinh.getSancaotrentoithieu()));
			}
			if (thongtinvesinh.getSonguoitrongho() != null) {
				vs.setSonguoitrongho(Integer.parseInt(thongtinvesinh.getSonguoitrongho()));
			}
			if (thongtinvesinh.getSonguoitrongho() != null) {
				vs.setSonguoitrongho(Integer.parseInt(thongtinvesinh.getSonguoitrongho()));
			}
			vs.setLoainhatieu(thongtinvesinh.getLoainhatieu());
			if (thongtinvesinh.getVesinhsachse() != null) {
				vs.setVesinhsachse(Integer.parseInt(thongtinvesinh.getVesinhsachse()));
			}
			if (thongtinvesinh.getTranrangoai() != null) {
				vs.setTranrangoai(Integer.parseInt(thongtinvesinh.getTranrangoai()));
			}

			vs.setTenchuho(thongtinvesinh.getTenchuho());
			vs.setTenchuhohientai(thongtinvesinh.getTenchuhohientai());
			vs.setTendantoc(thongtinvesinh.getTendantoc());
			if (thongtinvesinh.getThangxaydung() != null) {
				vs.setThangxaydung(Integer.parseInt(thongtinvesinh.getThangxaydung()));
			}
			if (thongtinvesinh.getThanhphanhogd() != null) {
				vs.setThanhphanhogd(Integer.parseInt(thongtinvesinh.getThanhphanhogd()));
			}
			if (thongtinvesinh.getTimthaynha() != null) {
				vs.setTimthaynha(Integer.parseInt(thongtinvesinh.getTimthaynha()));
			}
			if (thongtinvesinh.getTranrangoai() != null) {
				vs.setTranrangoai(Integer.parseInt(thongtinvesinh.getTranrangoai()));
			}

			vs.setVesinhgiadinhid(thongtinvesinh.getVesinhgiadinhid());
			if (thongtinvesinh.getVesinhsachse() != null) {
				vs.setVesinhsachse(Integer.parseInt(thongtinvesinh.getVesinhsachse()));
			}
			int danhgiavesinh = checkdat(thongtinvesinh);

			vs.setDanhgiakiemdem(danhgiavesinh);
			if (thongtinvesinh.getDaketthucdieutra() == null) {
				vs.setDanhgiakiemdem(0);
			}
			List<KeHoachKiemDemVeSinh> list = keHoachKiemDemVeSinhService
					.kiemtrakehoachgannhat(Integer.parseInt(thongtinvesinh.getIdkiemdemvien()));
			if (list.size() >= 1 && thongtinvesinh.getTenchuho() != null && thongtinvesinh.getMatinh() != null
					&& thongtinvesinh.getMahuyen() != null && thongtinvesinh.getMaxa() != null) {
				if (thongtinvesinh.getId() > 0) {

					veSinhHoGiaDinhService.save(vs);
				} else {
String tinh=thongtinvesinh.getMatinh();
String getMahuyen=thongtinvesinh.getMahuyen();
String xa=thongtinvesinh.getMaxa();
String thonxom=thongtinvesinh.getThonxom();
String ten=thongtinvesinh.getTenchuho();

					List<String> listtrung = veSinhHoGiaDinhService.kiemtratrung(thongtinvesinh.getMatinh(),
							thongtinvesinh.getMahuyen(), thongtinvesinh.getMaxa(), thongtinvesinh.getThonxom(),
							thongtinvesinh.getTenchuho());
					if (listtrung.size() > 0) {
						CheckidupdateVesinh CheckID = new CheckidupdateVesinh();
						CheckID.setId_mobile(thongtinvesinh.getIdmobile());
						CheckID.setLatrung(1);
						listID.add(CheckID);
					} else {
						KeHoachKiemDemVeSinh kh = list.get(0);
						int idttvesinh = getIDthongtinvesinh();
						VeSinh vesinh = new VeSinh();
						vesinh.setId(getIdvesinh());
						vesinh.setMatinh(thongtinvesinh.getMatinh());
						vesinh.setMahuyen(thongtinvesinh.getMahuyen());
						vesinh.setMaxa(thongtinvesinh.getMaxa());
						vesinh.setThonxom(thongtinvesinh.getThonxom());
						vesinh.setTenchuho(thongtinvesinh.getTenchuho());
						vesinh.setLoainhatieu(thongtinvesinh.getLoainhatieu());
						vesinh.setTrangthai(1);
						if (thongtinvesinh.getConhatieu() != null) {
							vesinh.setConhatieu(Integer.parseInt(thongtinvesinh.getConhatieu()));
						}
						if (thongtinvesinh.getThanhphanhogd() != null) {
							vesinh.setThanhphanhogd(Integer.parseInt(thongtinvesinh.getThanhphanhogd()));
						}
						if (thongtinvesinh.getThangxaydung() != null) {
							vesinh.setThangxaydung(Integer.parseInt(thongtinvesinh.getThangxaydung()));
						}
						if (thongtinvesinh.getNamxaydung() != null) {
							vesinh.setNamxaydung(Integer.parseInt(thongtinvesinh.getNamxaydung()));
						}

						if (thongtinvesinh.getGioitinhchuho() != null) {
							vesinh.setGioitinhchuho(Integer.parseInt(thongtinvesinh.getGioitinhchuho()));
						}
						vesinh.setNgaytao(new Date());
						if (thongtinvesinh.getThanhphanhogd() != null) {
							vesinh.setThanhphanhogd(Integer.parseInt(thongtinvesinh.getThanhphanhogd()));
						}
						vs.setKeHoachKiemDemVeSinh(kh);
						vs.setId(idttvesinh);
						VeSinh vnew = veSinhService.save(vesinh);
						vs.setVesinhgiadinhid(vnew.getId());
						VeSinhHoGiaDinh vshgd = veSinhHoGiaDinhService.save(vs);
						CheckidupdateVesinh CheckID = new CheckidupdateVesinh();
						CheckID.setId_kehoach(kh.getId());
						CheckID.setId_mobile(thongtinvesinh.getIdmobile());
						CheckID.setId_thongtinvs(vshgd.getId());
						CheckID.setId_vesinh(vnew.getId());
						CheckID.setLatrung(0);
						listID.add(CheckID);
					}

				}

			}
		}

		return listID;
	}

	private int checkdat(ThongTinveSinh tt) {
		String ngay[];
		String namxaydung = null;
		if (tt.getNgaykiemdem() != null) {
			ngay = tt.getNgaykiemdem().split("[/]");
			namxaydung = ngay[2];
		}

		if (tt.getConhatieu() == null) {
			return 3;
		}
		if (kiemTraAnh(tt) < 2) {
			return 3;
		}
		if (Integer.parseInt(tt.getConhatieu()) != 1) {
			return 4;
		}
		if (tt.getLoainhatieu() == null) {
			return 3;
		}
		if (tt.getLoainhatieu() != null) {
			if (!tt.getLoainhatieu().equals("02") && !tt.getLoainhatieu().equals("01")
					&& !tt.getLoainhatieu().equals("03") && !tt.getLoainhatieu().equals("04")
					&& !tt.getLoainhatieu().equals("05") && !tt.getLoainhatieu().equals("06")) {
				return 3;
			}
		}
		if (tt.getNapbecontot() == null) {
			return 3;
		}
		if (Integer.parseInt(tt.getNapbecontot()) != 1) {
			return 3;
		}
		if (tt.getCuaphanbitkin() == null) {
			return 3;
		}
		if (Integer.parseInt(tt.getCuaphanbitkin()) != 1) {
			return 3;
		}
		if (tt.getTranrangoai() == null) {
			return 3;
		}
		if (Integer.parseInt(tt.getTranrangoai()) != 2) {
			return 3;
		}
		if (tt.getLoainguonnuoc() == null || tt.getLoainhatieu() == null) {
			return 3;
		}
		if (tt.getLoainguonnuoc().equals("02") || tt.getLoainguonnuoc().equals("03")
				|| tt.getLoainguonnuoc().equals("04") || tt.getLoainhatieu().equals("01")
				|| tt.getLoainhatieu().equals("02") || tt.getLoainhatieu().equals("05")
				|| tt.getLoainhatieu().equals("06") || tt.getLoainhatieu().equals("07")) {
			if (tt.getKhoangcachnguonnuoc().equals("2")) {
				return 3;
			}
		}
		if (checkdieukienphu(tt) >= 3) {
			if (tt.getNamxaydung() == null) {
				return 2;
			}
			if (namxaydung == null) {
				return 0;
			}
			if (namxaydung.equals(tt.getNamxaydung())) {
				if (tt.getDuoccaitao() != null) {
					if (Integer.parseInt(tt.getDuoccaitao()) == 1) {
						if (tt.getLoainhatieucu() == null) {
							return 1;
						}
						if (!tt.getLoainhatieucu().equals(tt.getLoainhatieu())) {
							return 1;
						} else {
							return 2;
						}
					}
				}
			}
			return 1;
		}
		return 3;
	}

	private int kiemTraAnh(ThongTinveSinh tt) {
		int count = 0;
		if (tt.getAnhtoancanh() != null) {
			count = count + 1;
		}
		if (tt.getAnhtrongnhatieu() != null) {
			count = count + 1;
		}
		if (tt.getAnhbechua() != null) {
			count = count + 1;
		}
		return count;
	}

	private int checkdieukienphu(ThongTinveSinh tt) {
		int i = 0;
		if (tt.getVesinhsachse() != null) {
			if (Integer.parseInt(tt.getVesinhsachse()) == 1) {
				i = i + 1;
			}
		}
		if (tt.getDelamvesinh() != null) {
			if (Integer.parseInt(tt.getDelamvesinh()) == 1) {
				i = i + 1;
			}
		}
		if (tt.getDelamvesinh() != null) {
			if (Integer.parseInt(tt.getDelamvesinh()) == 1) {
				i = i + 1;
			}
		}
		if (tt.getMuivesinh() != null) {
			if (Integer.parseInt(tt.getMuivesinh()) == 1) {
				i = i + 1;
			}
		}
		if (tt.getPhiatrenkindao() != null) {
			if (Integer.parseInt(tt.getPhiatrenkindao()) == 1) {
				i = i + 1;
			}
		}
		if (tt.getDuchemuagio() != null) {
			if (Integer.parseInt(tt.getDuchemuagio()) == 1) {
				i = i + 1;
			}
		}
		if (tt.getNgapkhimualon() != null) {
			if (Integer.parseInt(tt.getNgapkhimualon()) == 1) {
				i = i + 1;
			}
		}
		return i;
	}

	private int getIDthongtinvesinh() {
		ResultSet rs = null;
		java.sql.Connection conn;
		int id = 0;
		try {
			conn = Connect.getconect();
			java.sql.Statement stmt = conn.createStatement();
			rs = stmt.executeQuery(
					"SELECT currentId FROM counter where name='vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD'");
			while (rs.next()) {
				id = rs.getInt("currentId");
			}
			String sql = "UPDATE counter SET currentId=? WHERE name='vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemHoGD'";
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

	private int getIdvesinh() {
		ResultSet rs = null;
		java.sql.Connection conn;
		int id = 0;
		try {
			conn = Connect.getconect();
			java.sql.Statement stmt = conn.createStatement();
			rs = stmt.executeQuery(
					"SELECT currentId FROM counter where name='vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh'");
			while (rs.next()) {
				id = rs.getInt("currentId");
			}
			String sql = "UPDATE counter SET currentId=? WHERE name='vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhGiaDinh'";
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

	@RequestMapping(value = "/uploadImage", method = RequestMethod.POST)
	public @ResponseBody String uploadImage(@RequestParam("image") String imageValue, @RequestParam("path") String path,
			HttpServletRequest request) {
		String name[] = null;
		String LOCAL_FILE = System.getProperty("catalina.base") + "/" + "webapps/images";
		name = path.split("[/]");
		String tinh = name[0];
		String huyen = name[1];
		String xa = name[2];
		String nameimage = name[3];
		String PATH_DAUNOINUOC = System.getProperty("catalina.base") + "/" + "webapps/images/vesinhgiadinh";
		String PATH_TINH = System.getProperty("catalina.base") + "/" + "webapps/images/vesinhgiadinh/" + tinh;
		String PATH_HUYEN = System.getProperty("catalina.base") + "/" + "webapps/images/vesinhgiadinh/" + tinh + "/"
				+ huyen;
		String PATH_XA = System.getProperty("catalina.base") + "/" + "webapps/images/vesinhgiadinh/" + tinh + "/"
				+ huyen + "/" + xa;
		String PATH_FILE = System.getProperty("catalina.base") + "/" + "webapps/images/vesinhgiadinh/" + tinh + "/"
				+ huyen + "/" + xa + "/" + nameimage;
		try {
			byte[] imageByte = Base64.decodeBase64(imageValue);
			String a = this.context.getRealPath("");
			File dir_daunoinuoc = new File(PATH_DAUNOINUOC);
			if (!dir_daunoinuoc.exists()) {
				dir_daunoinuoc.mkdirs();
			}
			File dir = new File(LOCAL_FILE);
			if (!dir.exists()) {
				dir.mkdirs();
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
			OutputStream out = new FileOutputStream(PATH_FILE);
			out.write(imageByte);
			out.close();
			return "success";
		} catch (Exception e)

		{
			return e.getMessage();
		}
	}

}
