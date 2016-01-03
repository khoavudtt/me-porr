package com.mcvn.project.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mcvn.project.repository.DataItemRepository;

@Service
public class DataItemServiceImpl implements DataItemService {
	@Resource
	private DataItemRepository dataItemRepository;

	@Override
	public String getTenTinh(String node1) {
		// TODO Auto-generated method stub
		return dataItemRepository.getTinh(node1);
	}

	@Override
	public String getTenHuyen(String node1, String node2) {
		// TODO Auto-generated method stub
		return dataItemRepository.getHuyen(node1, node2);
	}

}
