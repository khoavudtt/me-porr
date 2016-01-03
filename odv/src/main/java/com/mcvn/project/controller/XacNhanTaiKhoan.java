package com.mcvn.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/xacnhantaikhoan")
public class XacNhanTaiKhoan extends BaseController {

	@RequestMapping(value = "/xacnhan", method = RequestMethod.POST)
	public @ResponseBody String checkXacNhan() {
		// TODO: kiem tra lai phan nay
		return "ok";

	}

}