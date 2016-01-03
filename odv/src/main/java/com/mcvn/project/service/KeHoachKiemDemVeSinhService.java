package com.mcvn.project.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.mcvn.project.model.KeHoachKiemDemVeSinh;

public interface KeHoachKiemDemVeSinhService {
public List<KeHoachKiemDemVeSinh> kiemtrakehoachdong(int kiemdemvienid);
public List<KeHoachKiemDemVeSinh> kiemtrakehoachgannhat(int kiemdemvienid);
public List<KeHoachKiemDemVeSinh> getallkehoach(int kiemdemvienid);
List<KeHoachKiemDemVeSinh> kiemtrakehoach(Integer kiemdemvienid,Integer id);
}
