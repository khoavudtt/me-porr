package com.mcvn.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mcvn.project.model.KiemDemVien;

public interface KiemDemVienRepository extends JpaRepository<KiemDemVien, Integer>{
	KiemDemVien findByTaikhoanAndMatkhau(String taikhoan, String matkhau);
	KiemDemVien findById(int id);

}
