package com.mcvn.project.service;

import java.util.List;

import com.mcvn.project.model.KeHoachKiemDemNuoc;

public interface KeHoachKiemDemNuocService {
	public List<KeHoachKiemDemNuoc> getkehoach();

	public List<KeHoachKiemDemNuoc> getKehoachUpdate(Integer idkiemdem);
	public 	List<KeHoachKiemDemNuoc> getKehoachThemDauNoi(Integer idkiemdem);
	public 	KeHoachKiemDemNuoc kiemtrakehoachdong(Integer id);
	public 	List<KeHoachKiemDemNuoc> kiemtrakhdong(Integer idkiemdem);
	public 	List<KeHoachKiemDemNuoc> getallkehoach(Integer idkiemdem);
	public KeHoachKiemDemNuoc findbyID(Integer id);


	

}
