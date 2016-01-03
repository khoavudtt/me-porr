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

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dtt.nuocsach.bean.CheckDat;
import com.dtt.nuocsach.bean.CheckIDUpdateCC;
import com.dtt.nuocsach.bean.CheckThongTinCongTrinhDaLuu;
import com.dtt.nuocsach.bean.ThongTinCongTrinh;
import com.dtt.nuocsach.bean.ThongTinKiemDemKeHoach;
import com.dtt.nuocsach.bean.ThongTinKiemDemVSCCT;
import com.dtt.nuocsach.bean.ThongTinveSinh;
import com.dtt.nuocsach.config.Connect;
import com.mcvn.project.model.ChiTietKiemDemCongTrinh;
import com.mcvn.project.model.KeHoachKiemDemVeSinh;
import com.mcvn.project.model.KiemDemVien;
import com.mcvn.project.model.ThongTinKiemDemVeSinhCongTrinh;
import com.mcvn.project.model.VeSinhCongTrinh;
import com.mcvn.project.service.ChiTietKiemDemCongTrinhSevice;
import com.mcvn.project.service.KeHoachKiemDemVeSinhService;
import com.mcvn.project.service.KiemDemVienService;
import com.mcvn.project.service.ThongTinKiemDemCongTrinhService;
import com.mcvn.project.service.VeSinhCongTrinhService;

@Controller
@RequestMapping(value = "/congtrinh")
public class ThongTinKiemDemCongTrinhController extends BaseController {
	@Autowired
	private ThongTinKiemDemCongTrinhService thongTinKiemDemCongTrinhService;
	@Autowired
	private ChiTietKiemDemCongTrinhSevice chiTietKiemDemCongTrinhSevice;
	@Autowired
	private KiemDemVienService kiemDemVienService;
	@Autowired
	private VeSinhCongTrinhService veSinhCongTrinhService;
	@Autowired
	private KeHoachKiemDemVeSinhService keHoachKiemDemVeSinhService;

	@RequestMapping(value = "/getvesinhct", method = RequestMethod.POST)
	public @ResponseBody List<ThongTinKiemDemVSCCT> getvesinhctrinhtruong(@RequestParam("id") String idkiemdemvien) {
		List<ThongTinKiemDemVSCCT> list = thongTinKiemDemCongTrinhService
				.getthongtinVSCT(Integer.parseInt(idkiemdemvien));
		return list;
	}

	@RequestMapping(value = "/getthongtinkehoachcongtrinh", method = RequestMethod.POST)
	public @ResponseBody List<ThongTinKiemDemKeHoach> getThongTinKeHoachCongTrinh(
			@RequestParam("idkiemdemvien") String idkiemdemvien) {
		List<ThongTinKiemDemKeHoach> list = thongTinKiemDemCongTrinhService
				.getthongtinkehoachcongtrinh(Integer.parseInt(idkiemdemvien));
		return list;
	}

	@RequestMapping(value = "/dongbo", method = RequestMethod.POST)
	public @ResponseBody List<CheckIDUpdateCC> upDateVeSinh(@RequestBody ThongTinCongTrinh[] thongtinvesinhccs) {
		List<CheckIDUpdateCC> listID = new ArrayList<CheckIDUpdateCC>();
		List<CheckDat> listcheckdat = new ArrayList<CheckDat>();
		List<CheckThongTinCongTrinhDaLuu> list_checkThongTinCongTrinhDaLuu = new ArrayList<CheckThongTinCongTrinhDaLuu>();
		for (ThongTinCongTrinh thongtinvesinhcc : thongtinvesinhccs) {
			List<KeHoachKiemDemVeSinh> listkhvs = keHoachKiemDemVeSinhService.kiemtrakehoach(
					Integer.parseInt(thongtinvesinhcc.getIdkiemdem()), thongtinvesinhcc.getKehoachkiemdemvesinhid());
			if (listkhvs.size() > 0) {
				chiTietKiemDemCongTrinhSevice.deletechitiet(thongtinvesinhcc.getId());
			}
		}
		for (ThongTinCongTrinh thongtinvesinhcc : thongtinvesinhccs) {
			ThongTinKiemDemVeSinhCongTrinh ct = new ThongTinKiemDemVeSinhCongTrinh();
			ct.setId(thongtinvesinhcc.getId());
			ct.setAnhchupchungnhan(thongtinvesinhcc.getAnhchungnhan());
			if (thongtinvesinhcc.getDaketthucdieutra() != null) {
				ct.setDaketthucdieutra(Integer.parseInt(thongtinvesinhcc.getDaketthucdieutra()));
			}
			if (thongtinvesinhcc.getDatqcvn() != null) {
				ct.setDatqcvn(Integer.parseInt(thongtinvesinhcc.getDatqcvn()));
			}
			if (thongtinvesinhcc.getDattieuchuanhvs() != null) {
				ct.setDattieuchuanhvs(Integer.parseInt(thongtinvesinhcc.getDattieuchuanhvs()));
			}
			ct.setDiachi(thongtinvesinhcc.getDiachi());
			if (thongtinvesinhcc.getSonguoitrongca() != null) {
				ct.setSonguoitrongca(Integer.parseInt(thongtinvesinhcc.getSonguoitrongca()));
			}
			ct.setGhichu(thongtinvesinhcc.getGhichu());
			ct.setGioitinhnguoitraloi(thongtinvesinhcc.getGioitinhnguoitraloi());
			ct.setHotennguoitraloi(thongtinvesinhcc.getHotennguoitraloi());
			KeHoachKiemDemVeSinh kdvc = new KeHoachKiemDemVeSinh();
			kdvc.setId(thongtinvesinhcc.getKehoachkiemdemvesinhid());
			ct.setKeHoachKiemDemVeSinh(kdvc);
			ct.setKinhdo(thongtinvesinhcc.getKinhdo());
			if (thongtinvesinhcc.getLoaicongtrinh() != null) {
				ct.setLoaicongtrinh(Integer.parseInt(thongtinvesinhcc.getLoaicongtrinh()));
			}
			if (thongtinvesinhcc.getSonhatieu() != null) {
				ct.setSonhatieu(Integer.parseInt(thongtinvesinhcc.getSonhatieu()));
			}
			ct.setLoainguonnuoc(thongtinvesinhcc.getLoainguonnuoc());
			ct.setLydokhonghoanthanh(thongtinvesinhcc.getLydokhonghoanthanh());
			ct.setMahuyen(thongtinvesinhcc.getMahuyen());
			ct.setMatinh(thongtinvesinhcc.getMatinh());
			ct.setMaxa(thongtinvesinhcc.getMaxa());
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			Date date;
			try {
				if (thongtinvesinhcc.getNgaykiemdem() != null) {
					date = formatter.parse(thongtinvesinhcc.getNgaykiemdem());
					ct.setNgayKiemDem(date);
				}
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (thongtinvesinhcc.getSoca() != null) {
				ct.setSoca(Integer.parseInt(thongtinvesinhcc.getSoca()));
			}
			ct.setSodienthoai(thongtinvesinhcc.getSodienthoai());
			KiemDemVien kd = kiemDemVienService.findten(Integer.parseInt(thongtinvesinhcc.getIdkiemdem()));
			ct.setTaikhoan(kd.getTaikhoan());
			ct.setTencongtrinh(thongtinvesinhcc.getTencongtrinh());

			ct.setVaitrochucdanh(thongtinvesinhcc.getVaitrochucdanh());
			ct.setVesinhcongtrinhid(thongtinvesinhcc.getVesinhcongtrinhid());

			ct.setVido(thongtinvesinhcc.getVido());
			ct.setDanhgiakiemdem(checkdatcc(thongtinvesinhcc));
			if (thongtinvesinhcc.getDaketthucdieutra() == null) {
				ct.setDanhgiakiemdem(0);
			}
			// them thông tin chi tiết
			ChiTietKiemDemCongTrinh chiTietKiemDemCongTrinh = new ChiTietKiemDemCongTrinh();
			chiTietKiemDemCongTrinh.setId(getthongtinvesinhchitietId());
			chiTietKiemDemCongTrinh.setAnhbechua(thongtinvesinhcc.getAnhbechua());
			chiTietKiemDemCongTrinh.setAnhtoancanh(thongtinvesinhcc.getAnhtoancanh());
			chiTietKiemDemCongTrinh.setAnhtrongnhatieu(thongtinvesinhcc.getAnhtrongnhatieu());
			chiTietKiemDemCongTrinh.setChitietcongtrinhruatay(thongtinvesinhcc.getChitietcongtrinhruatay());
			chiTietKiemDemCongTrinh.setTencongtrinh(thongtinvesinhcc.getTennhatieu());
			if (thongtinvesinhcc.getSohotieu() != null) {
				chiTietKiemDemCongTrinh.setSohotieu(Integer.parseInt(thongtinvesinhcc.getSohotieu()));
			}
			if (thongtinvesinhcc.getCocongtrinhruatay() != null) {
				chiTietKiemDemCongTrinh.setCocongtrinhruatay(Integer.parseInt(thongtinvesinhcc.getCocongtrinhruatay()));
			}
			if (thongtinvesinhcc.getCuaphanbitkin() != null) {
				chiTietKiemDemCongTrinh.setCuaphanbitkin(Integer.parseInt(thongtinvesinhcc.getCuaphanbitkin()));
			}
			if (thongtinvesinhcc.getDelamvesinh() != null) {
				chiTietKiemDemCongTrinh.setDelamvesinh(Integer.parseInt(thongtinvesinhcc.getDelamvesinh()));
			}
			if (thongtinvesinhcc.getDuchemuagio() != null) {
				chiTietKiemDemCongTrinh.setDuchemuagio(Integer.parseInt(thongtinvesinhcc.getDuchemuagio()));
			}
			if (thongtinvesinhcc.getKhoangcachnguonnuoc() != null) {
				chiTietKiemDemCongTrinh
						.setKhoangcachnguonnuoc(Integer.parseInt(thongtinvesinhcc.getKhoangcachnguonnuoc()));
			}
			chiTietKiemDemCongTrinh.setLoainhatieu(thongtinvesinhcc.getLoainhatieu());
			if (thongtinvesinhcc.getMuivesinh() != null) {
				chiTietKiemDemCongTrinh.setMuivesinh(Integer.parseInt(thongtinvesinhcc.getMuivesinh()));
			}
			if (thongtinvesinhcc.getNapbecontot() != null) {
				chiTietKiemDemCongTrinh.setNapbecontot(Integer.parseInt(thongtinvesinhcc.getNapbecontot()));
			}
			if (thongtinvesinhcc.getNgapkhimualon() != null) {
				chiTietKiemDemCongTrinh.setNgapkhimualon(Integer.parseInt(thongtinvesinhcc.getNgapkhimualon()));
			}
			if (thongtinvesinhcc.getNuocthaididau() != null) {
				chiTietKiemDemCongTrinh.setNuocthaididau(Integer.parseInt(thongtinvesinhcc.getNuocthaididau()));
			}
			if (thongtinvesinhcc.getPhiatrenkindao() != null) {
				chiTietKiemDemCongTrinh.setPhiatrenkindao(Integer.parseInt(thongtinvesinhcc.getPhiatrenkindao()));
			}
			if (thongtinvesinhcc.getSancaotrentoithieu() != null) {
				chiTietKiemDemCongTrinh
						.setSancaotrentoithieu(Integer.parseInt(thongtinvesinhcc.getSancaotrentoithieu()));
			}
			if (thongtinvesinhcc.getTranrangoai() != null) {
				chiTietKiemDemCongTrinh.setTranrangoai(Integer.parseInt(thongtinvesinhcc.getTranrangoai()));
			}
			if (thongtinvesinhcc.getVesinhsachse() != null) {
				chiTietKiemDemCongTrinh.setVesinhsachse(Integer.parseInt(thongtinvesinhcc.getVesinhsachse()));
			}
			// ve sinh cong trinh
			VeSinhCongTrinh veSinhCongTrinh = new VeSinhCongTrinh();
			veSinhCongTrinh.setDiachi(thongtinvesinhcc.getDiachi());
			veSinhCongTrinh.setGhichu(thongtinvesinhcc.getGhichu());
			if (thongtinvesinhcc.getIdkiemdem() != null) {
				veSinhCongTrinh.setIdnguoitao(Integer.parseInt(thongtinvesinhcc.getIdkiemdem()));
			}
			veSinhCongTrinh.setKinhdo(thongtinvesinhcc.getKinhdo());
			veSinhCongTrinh.setVido(thongtinvesinhcc.getVido());
			if (thongtinvesinhcc.getLoaicongtrinh() != null) {
				veSinhCongTrinh.setLoaicongtrinh(Integer.parseInt(thongtinvesinhcc.getLoaicongtrinh()));
			}
			veSinhCongTrinh.setLoainhatieu(thongtinvesinhcc.getLoainhatieu());
			veSinhCongTrinh.setMahuyen(thongtinvesinhcc.getMahuyen());
			veSinhCongTrinh.setMaxa(thongtinvesinhcc.getMaxa());
			veSinhCongTrinh.setMatinh(thongtinvesinhcc.getMatinh());
			veSinhCongTrinh.setNambaocao(0);
			veSinhCongTrinh.setNgaytao(new Date());
			veSinhCongTrinh.setTrangthai(1);
			veSinhCongTrinh.setTencongtrinh(thongtinvesinhcc.getTencongtrinh());
			veSinhCongTrinh.setLoainguonnuoc(thongtinvesinhcc.getLoainguonnuoc());
			SimpleDateFormat formattervs = new SimpleDateFormat("dd/MM/yyyy");
			Date ngaykd;
			try {
				if (thongtinvesinhcc.getNgaykiemdem() != null) {
					ngaykd = formattervs.parse(thongtinvesinhcc.getNgaykiemdem());
					veSinhCongTrinh.setNgaykiemdem(ngaykd);
				}
			} catch (ParseException e) {
				e.printStackTrace();
			}
			List<KeHoachKiemDemVeSinh> list = keHoachKiemDemVeSinhService
					.kiemtrakehoachgannhat(Integer.parseInt(thongtinvesinhcc.getIdkiemdem()));
			if (list.size() >= 1 && thongtinvesinhcc.getTencongtrinh() != null && thongtinvesinhcc.getMatinh() != null
					&& thongtinvesinhcc.getMahuyen() != null && thongtinvesinhcc.getMaxa() != null
					&& thongtinvesinhcc.getLoaicongtrinh() != null && thongtinvesinhcc.getDiachi() != null) {
				if (thongtinvesinhcc.getId() > 0) {
					chiTietKiemDemCongTrinh.setThongtinkiemdemcongtrinhid(thongtinvesinhcc.getId());
					if (listcheckdat.size() == 0) {
						chiTietKiemDemCongTrinhSevice.save(chiTietKiemDemCongTrinh);
						thongTinKiemDemCongTrinhService.save(ct);
						if (ct.getDanhgiakiemdem() == 2) {
							CheckDat itemcheckdat = new CheckDat();
							itemcheckdat.setId(ct.getId());
							itemcheckdat.setDanhgiakiemdem(ct.getDanhgiakiemdem());
							listcheckdat.add(itemcheckdat);
						}

					} else {
						for (int k = 0; k < listcheckdat.size(); k++) {
							CheckDat cditem = listcheckdat.get(k);
							if ((thongtinvesinhcc.getId() == cditem.getId()) && (cditem.getDanhgiakiemdem() == 2)) {
								ct.setDanhgiakiemdem(2);
							}
						}
						chiTietKiemDemCongTrinhSevice.save(chiTietKiemDemCongTrinh);
						thongTinKiemDemCongTrinhService.save(ct);
						if (ct.getDanhgiakiemdem() == 2) {
							CheckDat itemcheckdat = new CheckDat();
							itemcheckdat.setId(ct.getId());
							itemcheckdat.setDanhgiakiemdem(ct.getDanhgiakiemdem());
							listcheckdat.add(itemcheckdat);
						}
					}

				} else {

					// add mới
					CheckIDUpdateCC CheckID = new CheckIDUpdateCC();
					CheckThongTinCongTrinhDaLuu checkThongTinCongTrinhDaLuu = new CheckThongTinCongTrinhDaLuu();
					KeHoachKiemDemVeSinh kh = list.get(0);
					// ve sinh cong trinh

					if (list_checkThongTinCongTrinhDaLuu.size() == 0) {
						veSinhCongTrinh.setId(getvesinhcongtrinhId());
						VeSinhCongTrinh veSinhCongTrinhnew = veSinhCongTrinhService.save(veSinhCongTrinh);
						ct.setId(getthongtinkiemdemId());
						ct.setKeHoachKiemDemVeSinh(kh);
						ct.setVesinhcongtrinhid(veSinhCongTrinhnew.getId());
						ThongTinKiemDemVeSinhCongTrinh thongTinKiemDemVeSinhCongTrinhnew = thongTinKiemDemCongTrinhService
								.save(ct);
						checkThongTinCongTrinhDaLuu.setId(thongTinKiemDemVeSinhCongTrinhnew.getId());
						checkThongTinCongTrinhDaLuu.setIdmap(thongtinvesinhcc.getIdmap());
						list_checkThongTinCongTrinhDaLuu.add(checkThongTinCongTrinhDaLuu);
						chiTietKiemDemCongTrinh
								.setThongtinkiemdemcongtrinhid(thongTinKiemDemVeSinhCongTrinhnew.getId());

						chiTietKiemDemCongTrinhSevice.save(chiTietKiemDemCongTrinh);
						CheckID.setId_thongtinvsct(thongTinKiemDemVeSinhCongTrinhnew.getId());
						CheckID.setIdmap(thongtinvesinhcc.getIdmap());
						CheckID.setId_kehoach(kh.getId());
						CheckID.setId_mobile(thongtinvesinhcc.getId_mobile());
						CheckID.setId_vesinhct(veSinhCongTrinhnew.getId());
						listID.add(CheckID);
					} else {
						int count = 0;
						int position = 0;
						for (int i = 0; i < list_checkThongTinCongTrinhDaLuu.size(); i++) {
							CheckThongTinCongTrinhDaLuu checkitem = list_checkThongTinCongTrinhDaLuu.get(i);
							if (thongtinvesinhcc.getIdmap().equals(checkitem.getIdmap())) {
								count = count + 1;
								position = i;
								break;
							}
						}
						if (count == 0) {
							veSinhCongTrinh.setId(getvesinhcongtrinhId());
							VeSinhCongTrinh veSinhCongTrinhnew = veSinhCongTrinhService.save(veSinhCongTrinh);
							ct.setId(getthongtinkiemdemId());
							ct.setKeHoachKiemDemVeSinh(kh);
							ct.setVesinhcongtrinhid(veSinhCongTrinhnew.getId());
							ThongTinKiemDemVeSinhCongTrinh thongTinKiemDemVeSinhCongTrinhnew = thongTinKiemDemCongTrinhService
									.save(ct);
							checkThongTinCongTrinhDaLuu.setId(thongTinKiemDemVeSinhCongTrinhnew.getId());
							checkThongTinCongTrinhDaLuu.setIdmap(thongtinvesinhcc.getIdmap());
							list_checkThongTinCongTrinhDaLuu.add(checkThongTinCongTrinhDaLuu);
							chiTietKiemDemCongTrinh
									.setThongtinkiemdemcongtrinhid(thongTinKiemDemVeSinhCongTrinhnew.getId());
							chiTietKiemDemCongTrinhSevice.save(chiTietKiemDemCongTrinh);
							CheckID.setId_thongtinvsct(thongTinKiemDemVeSinhCongTrinhnew.getId());
							CheckID.setIdmap(thongtinvesinhcc.getIdmap());
							CheckID.setId_kehoach(kh.getId());
							CheckID.setId_mobile(thongtinvesinhcc.getId_mobile());
							CheckID.setId_vesinhct(veSinhCongTrinhnew.getId());
							listID.add(CheckID);
						} else {
							CheckThongTinCongTrinhDaLuu checkitem = list_checkThongTinCongTrinhDaLuu.get(position);
							ct.setId(checkitem.getId());
							int thongTindanhgiacongtrinh = thongTinKiemDemCongTrinhService.findById(checkitem.getId());
							if (thongTindanhgiacongtrinh == 2 && checkdatcc(thongtinvesinhcc) == 1) {
								// ct.setDanhgiakiemdem(2);
								// ct.setKeHoachKiemDemVeSinh(kh);
								// thongTinKiemDemCongTrinhService.save(ct);
								thongTinKiemDemCongTrinhService.updateDanhgia(2, checkitem.getId());
							}
							chiTietKiemDemCongTrinh.setThongtinkiemdemcongtrinhid(checkitem.getId());
							chiTietKiemDemCongTrinhSevice.save(chiTietKiemDemCongTrinh);

						}

					}

				}
			}
		}
		return listID;
	}

	private int checkdatcc(ThongTinCongTrinh tt) {
		if (tt.getSonhatieu() == null) {
			return 2;
		}
		if (Integer.parseInt(tt.getSonhatieu()) < 1) {
			return 2;
		}
		if (tt.getLoaicongtrinh() == null) {

			return 2;

		}
		if (tt.getSonhatieu() == null) {
			return 2;
		}
		if (tt.getLoaicongtrinh().equals("01")) {

			if (Integer.parseInt(tt.getSonhatieu()) < 2) {
				return 2;

			}

		}
		if (tt.getLoaicongtrinh().equals("02") || tt.getLoaicongtrinh().equals("03")) {
			if (Integer.parseInt(tt.getSonhatieu()) < 4) {
				return 2;

			}

		}
		if (tt.getLoaicongtrinh().equals("04")) {
			if (Integer.parseInt(tt.getSonhatieu()) < 2) {
				return 2;

			}

		}
		if (tt.getLoaicongtrinh().equals("02") || tt.getLoaicongtrinh().equals("03")
				|| tt.getLoaicongtrinh().equals("01")) {
			if (tt.getSonguoitrongca() == null) {
				return 2;

			}
			if (tt.getTongsohotieu() == null || tt.getTongsohotieu().equals("0")) {
				return 2;

			}
			if ((Integer.parseInt(tt.getSonguoitrongca()) / Integer.parseInt(tt.getTongsohotieu())) > 200) {
				return 2;

			}

		}
		if (tt.getLoainhatieu() == null) {
			return 2;
		}
		if (tt.getLoainhatieu().equals("07") || tt.getLoainhatieu().equals("08") || tt.getLoainhatieu().equals("09")
				|| tt.getLoainhatieu().equals("10")) {
			return 2;
		}
		if (tt.getNapbecontot() == null) {
			return 2;
		}
		if (Integer.parseInt(tt.getNapbecontot()) == 2) {
			return 2;
		}
		if (tt.getCuaphanbitkin() == null) {
			return 2;
		}
		if (Integer.parseInt(tt.getCuaphanbitkin()) == 2) {
			return 2;
		}
		if (tt.getTranrangoai() == null) {
			return 2;
		}
		if (Integer.parseInt(tt.getTranrangoai()) == 1) {
			return 2;
		}
		if (tt.getLoainguonnuoc() == null) {
			return 2;
		}
		if (!tt.getLoainguonnuoc().equals("06")) {
			if (tt.getDatqcvn() == null) {
				return 2;
			}
			if (Integer.parseInt(tt.getDatqcvn()) == 2) {
				return 2;
			}

			if (tt.getDattieuchuanhvs() == null) {
				return 2;
			}
			if (Integer.parseInt(tt.getDattieuchuanhvs()) == 2) {
				return 2;
			}
		}
		
		if (tt.getChitietcongtrinhruatay() == null) {
			return 2;
		}
		if (!tt.getChitietcongtrinhruatay().equals("3")) {
			return 2;
		}
		if (tt.getLoainhatieu() == null) {
			return 2;
		}
		if (!tt.getLoainhatieu().equals("04")) {
			if (tt.getLoainguonnuoc() == null) {
				return 2;
			}
			if (tt.getLoainguonnuoc().equals("02") || tt.getLoainguonnuoc().equals("03")
					|| tt.getLoainguonnuoc().equals("04")) {
				if (tt.getKhoangcachnguonnuoc() == null) {
					return 2;
				}
				if (Integer.parseInt(tt.getKhoangcachnguonnuoc()) == 2) {
					return 2;
				}
			}
		}
		if (tt.getPhiatrenkindao() == null) {
			return 2;
		}
		if (Integer.parseInt(tt.getPhiatrenkindao()) == 2) {
			return 2;
		}
		if (checkdieukienphucc(tt) < 3) {
			return 2;
		}
		if (kiemTraAnh(tt) < 2) {
			return 2;
		}
		return 1;
	}

	private int kiemTraAnh(ThongTinCongTrinh tt) {
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

	private int checkdieukienphucc(ThongTinCongTrinh tt) {
		int i = 0;
		if (tt.getDuchemuagio() != null) {
			if (Integer.parseInt(tt.getDuchemuagio()) == 1) {
				i = i + 1;
			}
		}
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
		if (tt.getMuivesinh() != null) {
			if (Integer.parseInt(tt.getMuivesinh()) == 1) {
				i = i + 1;
			}
		}

		if (tt.getNuocthaididau() != null) {
			if (Integer.parseInt(tt.getNuocthaididau()) == 1) {
				i = i + 1;
			}
		}
		if (tt.getSancaotrentoithieu() != null) {
			if (Integer.parseInt(tt.getSancaotrentoithieu()) == 1) {
				i = i + 1;
			}
		}
		if (tt.getNgapkhimualon() != null) {
			if (Integer.parseInt(tt.getNgapkhimualon()) == 2) {
				i = i + 1;
			}
		}
		return i;
	}

	private int getthongtinkiemdemId() {
		ResultSet rs = null;
		java.sql.Connection conn;
		int id = 0;
		try {
			conn = Connect.getconect();
			java.sql.Statement stmt = conn.createStatement();
			rs = stmt.executeQuery(
					"SELECT currentId FROM counter where name='vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh'");
			while (rs.next()) {
				id = rs.getInt("currentId");
			}
			String sql = "UPDATE counter SET currentId=? WHERE name='vn.dtt.sol.ns.vesinhmoitruong.dao.model.ThongTinKiemDemCongTrinh'";
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

	private int getthongtinvesinhchitietId() {
		ResultSet rs = null;
		java.sql.Connection conn;
		int id = 0;
		try {
			conn = Connect.getconect();
			java.sql.Statement stmt = conn.createStatement();
			rs = stmt.executeQuery(
					"SELECT currentId FROM counter where name='vn.dtt.sol.ns.vesinhmoitruong.dao.model.ChiTietKiemDemCongTrinh'");
			while (rs.next()) {
				id = rs.getInt("currentId");
			}
			String sql = "UPDATE counter SET currentId=? WHERE name='vn.dtt.sol.ns.vesinhmoitruong.dao.model.ChiTietKiemDemCongTrinh'";
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

	private int getvesinhcongtrinhId() {
		ResultSet rs = null;
		java.sql.Connection conn;
		int id = 0;
		try {
			conn = Connect.getconect();
			java.sql.Statement stmt = conn.createStatement();
			rs = stmt.executeQuery(
					"SELECT currentId FROM counter where name='vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhCongTrinh'");
			while (rs.next()) {
				id = rs.getInt("currentId");

			}
			String sql = "UPDATE counter SET currentId=? WHERE name='vn.dtt.sol.ns.vesinhmoitruong.dao.model.VeSinhCongTrinh'";
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

	private String getpath(String path) {
		String name[] = null;
		String LOCAL_FILE = System.getProperty("catalina.base") + "/" + "webapps/images";
		name = path.split("[/]");
		String tinh = name[0];
		String huyen = name[1];
		String xa = name[2];
		String nameimage = name[3];
		String PATH_VESINHCT = LOCAL_FILE + "/vesinhct";
		String PATH_TINH = PATH_VESINHCT + "/" + tinh;
		String PATH_HUYEN = PATH_TINH + "/" + huyen;
		String PATH_XA = PATH_HUYEN + "/" + xa;
		String PATH_FILE = PATH_XA + "/" + nameimage;
		File dir = new File(LOCAL_FILE);
		if (!dir.exists()) {
			dir.mkdirs();
		}
		File dir_daunoinuoc = new File(PATH_VESINHCT);
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
