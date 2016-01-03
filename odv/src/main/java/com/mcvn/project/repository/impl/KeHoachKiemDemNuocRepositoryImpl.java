package com.mcvn.project.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;

import com.dtt.nuocsach.bean.Kehoachkiemdem;
import com.mcvn.project.model.KeHoachKiemDemNuoc;
import com.mcvn.project.repository.KeHoachKiemDemNuocRepositycustom;

public class KeHoachKiemDemNuocRepositoryImpl implements KeHoachKiemDemNuocRepositycustom {

	public final static String LIST_KEHOACH = "SELECT * FROM KeHoachKiemDemNuoc as kh where ngaydong <>null";
	public final static String LIST_kehoach = "SELECT new com.dtt.nuocsach.bean.Kehoachkiemdem(t.id,t.kehoachkiemdemnuocid,t.daketthucdieutra,k.LastSavePoint) FROM  ThongTinKiemDem as t JOIN t.KeHoachkiemDemNuoc AS k  WHERE k.kiemdemvienid = :kiemdemvienid";
	@Autowired
	private EntityManager entityManager;

	@Override
	public List<KeHoachKiemDemNuoc> getkehoachList() {
		Query query = entityManager.createQuery(LIST_KEHOACH);
		List<KeHoachKiemDemNuoc> items = query.getResultList();
		return items;
	}

	@Override
	public List<Kehoachkiemdem> getkehoach() {
		Query query = entityManager.createQuery(LIST_kehoach);
		List<Kehoachkiemdem> items = query.getResultList();
		return items;
	
	}

}
