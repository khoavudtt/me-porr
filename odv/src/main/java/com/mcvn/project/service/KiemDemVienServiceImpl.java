package com.mcvn.project.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mcvn.project.model.KiemDemVien;
import com.mcvn.project.repository.KiemDemVienRepository;
@Service
public class KiemDemVienServiceImpl implements KiemDemVienService{
	@Resource
	private KiemDemVienRepository kiemDemVienRepository;
	@Override
	public KiemDemVien findAcc(String taikhoan, String matkhau) {
		// TODO Auto-generated method stub
		return kiemDemVienRepository.findByTaikhoanAndMatkhau(taikhoan, matkhau);
	}
	@Override
	public KiemDemVien findten(int id) {
		// TODO Auto-generated method stub
		return kiemDemVienRepository.findById(id);
	}

}
