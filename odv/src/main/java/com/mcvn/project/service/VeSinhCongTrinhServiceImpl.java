package com.mcvn.project.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mcvn.project.model.VeSinhCongTrinh;
import com.mcvn.project.repository.VeSinhCongTrinhRepository;

@Service
public class VeSinhCongTrinhServiceImpl implements VeSinhCongTrinhService {
	@Resource
	private VeSinhCongTrinhRepository veSinhCongTrinhRepository;

	@Override
	public VeSinhCongTrinh save(VeSinhCongTrinh veSinhCongTrinh) {

		return veSinhCongTrinhRepository.save(veSinhCongTrinh);
	}

	@Override
	public VeSinhCongTrinh findById(int id) {

		return veSinhCongTrinhRepository.findOne(id);
	}

}
