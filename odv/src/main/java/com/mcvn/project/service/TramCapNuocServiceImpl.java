package com.mcvn.project.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mcvn.project.model.TramCapNuoc;
import com.mcvn.project.repository.TramCapNuocRepository;

@Service
public class TramCapNuocServiceImpl implements TramCapNuocService {
	@Resource
	private TramCapNuocRepository tramCapNuocRepository;

	@Override
	public TramCapNuoc findTenTramCap(int id) {
		// TODO Auto-generated method stub
		return tramCapNuocRepository.findOne(id);
	}

}
