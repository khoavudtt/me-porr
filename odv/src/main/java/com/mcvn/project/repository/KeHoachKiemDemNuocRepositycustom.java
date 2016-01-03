package com.mcvn.project.repository;

import java.util.List;

import org.springframework.data.repository.NoRepositoryBean;

import com.dtt.nuocsach.bean.Kehoachkiemdem;
import com.mcvn.project.model.KeHoachKiemDemNuoc;

@NoRepositoryBean
public interface KeHoachKiemDemNuocRepositycustom {
	public List<KeHoachKiemDemNuoc> getkehoachList();
	public List<Kehoachkiemdem> getkehoach();

}
