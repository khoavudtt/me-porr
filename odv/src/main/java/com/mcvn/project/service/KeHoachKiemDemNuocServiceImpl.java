package com.mcvn.project.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mcvn.project.model.KeHoachKiemDemNuoc;
import com.mcvn.project.repository.KeHoachKiemDemNuocRepository;

@Service
public class KeHoachKiemDemNuocServiceImpl implements KeHoachKiemDemNuocService {
	@Resource
	private KeHoachKiemDemNuocRepository keHoachKiemDemNuocRepository;

	@Override
	public List<KeHoachKiemDemNuoc> getkehoach() {
		// TODO Auto-generated method stub
		return keHoachKiemDemNuocRepository.getAllkehoach();
	}

	@Override
	public List<KeHoachKiemDemNuoc> getKehoachUpdate(Integer idkiemdem) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<KeHoachKiemDemNuoc> getKehoachThemDauNoi(Integer idkiemdem) {
		// TODO Auto-generated method stub
		return keHoachKiemDemNuocRepository.getkehoachthemdaunoi(idkiemdem);
	}

	@Override
	public KeHoachKiemDemNuoc kiemtrakehoachdong(Integer id) {
		// TODO Auto-generated method stub
		return keHoachKiemDemNuocRepository.kiemtrakehoachdong(id);
	}

	@Override
	public List<KeHoachKiemDemNuoc> kiemtrakhdong(Integer idkiemdem) {
		// TODO Auto-generated method stub
		return keHoachKiemDemNuocRepository.kiemtrakhdong(idkiemdem);
	}

	@Override
	public List<KeHoachKiemDemNuoc> getallkehoach(Integer idkiemdem) {
		// TODO Auto-generated method stub
		return keHoachKiemDemNuocRepository.getAllkehoach(idkiemdem);
	}

	@Override
	public KeHoachKiemDemNuoc findbyID(Integer id) {
		// TODO Auto-generated method stub
		return keHoachKiemDemNuocRepository.findOne(id);
	}

}
