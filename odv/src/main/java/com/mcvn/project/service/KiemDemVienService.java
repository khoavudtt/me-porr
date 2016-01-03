package com.mcvn.project.service;

import com.mcvn.project.model.KiemDemVien;

public interface KiemDemVienService {
public KiemDemVien findAcc(String taikhoan,String matkhau);
public KiemDemVien findten(int id);
}
