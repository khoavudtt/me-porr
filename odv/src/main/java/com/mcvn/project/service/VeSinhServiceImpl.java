package com.mcvn.project.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mcvn.project.model.VeSinh;
import com.mcvn.project.repository.VeSinhRepository;

@Service
public class VeSinhServiceImpl implements VeSinhService {
	@Resource
	private VeSinhRepository veSinhRepository;

	@Override
	public VeSinh save(VeSinh veSinh) {
		// TODO Auto-generated method stub
		return veSinhRepository.save(veSinh);
	}

	
}
