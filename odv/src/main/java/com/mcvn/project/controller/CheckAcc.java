package com.mcvn.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dtt.nuocsach.bean.CheckKiemDemKeHoach;
import com.dtt.nuocsach.bean.LogIn;
import com.mcvn.project.model.KeHoachKiemDemNuoc;
import com.mcvn.project.model.KeHoachKiemDemVeSinh;
import com.mcvn.project.model.KiemDemVien;
import com.mcvn.project.model.TramCapNuoc;
import com.mcvn.project.service.DataItemService;
import com.mcvn.project.service.KeHoachKiemDemNuocService;
import com.mcvn.project.service.KeHoachKiemDemVeSinhService;
import com.mcvn.project.service.KiemDemVienService;
import com.mcvn.project.service.TramCapNuocService;

@Controller
@RequestMapping(value = "/check")
public class CheckAcc extends BaseController {

	@Autowired
	private KiemDemVienService kiemDemVienService;
	@Autowired
	private KeHoachKiemDemNuocService keHoachKiemDemNuocService;
	@Autowired
	private KeHoachKiemDemVeSinhService keHoachKiemDemVeSinhService;
	@Autowired
	private DataItemService dataItemService;
	@Autowired
	private TramCapNuocService tramCapNuocService;

	@RequestMapping(value = "/acc", method = RequestMethod.POST)
	public @ResponseBody CheckKiemDemKeHoach checkLogin(@RequestBody LogIn account) {
		// TODO: kiem tra lai phan nay
		CheckKiemDemKeHoach checkkh = new CheckKiemDemKeHoach();
		KiemDemVien kd = kiemDemVienService.findAcc(account.getTaikhoan(), account.getMatkhau());
		String tinh, code = null;

		if (kd == null) {
			checkkh.setId(0);
			return checkkh;
		}
		checkkh.setId(kd.getId());
		checkkh.setKiemdemvien(kd.getHOVATEN());
		checkkh.setGiamsatvien(kd.getNameQuanLy());
		List<KeHoachKiemDemNuoc> kdn = keHoachKiemDemNuocService.getallkehoach(kd.getId());
		tinh = dataItemService.getTenTinh(kd.getORGCODE1());
		if (kd.getCAPHOATDONG() == 2) {
			code = dataItemService.getTenHuyen(kd.getORGCODE1(), kd.getORGCODE2());
		}
		if (kd.getCAPHOATDONG() == 3) {
			TramCapNuoc tramcap = tramCapNuocService.findTenTramCap(Integer.parseInt(kd.getORGCODE2()));
			code = tramcap.getTENTRAM();
		}
		if (kdn.size() >= 1) {
			checkkh.setNuoc(1);
		}
		List<KeHoachKiemDemVeSinh> kdvs = keHoachKiemDemVeSinhService.getallkehoach(kd.getId());
		if (kdvs.size() >= 1) {
			checkkh.setVesinh(1);
		}
		checkkh.setCode(code);
		checkkh.setTinh(tinh);
		return checkkh;

	}

}