package com.mcvn.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mcvn.project.model.KeHoachKiemDemNuoc;

public interface KeHoachKiemDemNuocRepository extends JpaRepository<KeHoachKiemDemNuoc, Integer> {
	@Query("FROM KeHoachKiemDemNuoc L WHERE L.ngaydong <> null")
	List<KeHoachKiemDemNuoc> getAllkehoach();

	@Query("FROM KeHoachKiemDemNuoc L WHERE L.kiemdemvienid=:kiemdemvienid")
	List<KeHoachKiemDemNuoc> getAllkehoach(@Param("kiemdemvienid") Integer kiemdemvienid);

	@Query("from KeHoachKiemDemNuoc  where kiemdemvienid =:kiemdemvienid and ngaydong is null and ngayxuatban<>null  ORDER BY ngaybatdau DESC")
	List<KeHoachKiemDemNuoc> getkehoachthemdaunoi(@Param("kiemdemvienid") Integer kiemdemvienid);

	@Query("from KeHoachKiemDemNuoc  where id =:id and ngaydong<>null")
	KeHoachKiemDemNuoc kiemtrakehoachdong(@Param("id") Integer id);
	
	@Query("from KeHoachKiemDemNuoc k  where k.kiemdemvienid =:kiemdemvienid and ngaydong<>null")
	List<KeHoachKiemDemNuoc> kiemtrakhdong(@Param("kiemdemvienid") Integer kiemdemvienid);
}
