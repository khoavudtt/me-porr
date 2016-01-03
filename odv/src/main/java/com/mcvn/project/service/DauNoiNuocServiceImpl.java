package com.mcvn.project.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mcvn.project.model.DauNoiNuoc;
import com.mcvn.project.repository.DauNoiNuocRepository;

@Service
public class DauNoiNuocServiceImpl implements DauNoiNuocService {
	@Resource
	private DauNoiNuocRepository dauNoiNuocRepository;

	@Override
	public DauNoiNuoc save(DauNoiNuoc dauNoiNuoc) {
		// TODO Auto-generated method stub
		return dauNoiNuocRepository.save(dauNoiNuoc);
	}

	@Override
	public DauNoiNuoc findById(int id) {
		// TODO Auto-generated method stub
		return dauNoiNuocRepository.findOne(id);
	}
}
