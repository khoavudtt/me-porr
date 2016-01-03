package com.mcvn.project.service;

import com.mcvn.project.model.VeSinhCongTrinh;

public interface VeSinhCongTrinhService {
	public VeSinhCongTrinh save(VeSinhCongTrinh veSinhCongTrinh);

	public VeSinhCongTrinh findById(int id);
}
