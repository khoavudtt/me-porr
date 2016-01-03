package com.mcvn.project.service;

import java.util.List;

import com.mcvn.project.model.ChiTietKiemDemCongTrinh;

public interface ChiTietKiemDemCongTrinhSevice {
	public ChiTietKiemDemCongTrinh save(ChiTietKiemDemCongTrinh chiTietKiemDemCongTrinh);

	public void deletechitiet(int thongtinkiemdemcongtrinhid);

	public List<ChiTietKiemDemCongTrinh> findByThongtinkiemdemcongtrinhid(int thongtinkiemdemcongtrinhid);

}
