package com.mcvn.project.service;

import com.mcvn.project.model.DauNoiNuoc;

public interface DauNoiNuocService {
	public DauNoiNuoc save(DauNoiNuoc dauNoiNuoc);
	public DauNoiNuoc findById(int id);
}
