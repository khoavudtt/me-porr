package com.mcvn.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.dtt.nuocsach.bean.ThongTinKiemDemKeHoach;
import com.mcvn.project.model.ChiTietKiemDemCongTrinh;
import com.mcvn.project.model.KeHoachKiemDemNuoc;

@Transactional(readOnly = true)
public interface ChiTietKiemDemCongTrinhRepository extends JpaRepository<ChiTietKiemDemCongTrinh, Integer> {
	List<ChiTietKiemDemCongTrinh> findByThongtinkiemdemcongtrinhid(int thongtinkiemdemcongtrinhid);

	@Modifying
	@Transactional
	@Query("delete from ChiTietKiemDemCongTrinh c where c.thongtinkiemdemcongtrinhid=:thongtinkiemdemcongtrinhid")
	void deletechitiet(@Param("thongtinkiemdemcongtrinhid") int thongtinkiemdemcongtrinhid);

}
