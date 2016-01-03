package com.mcvn.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mcvn.project.model.KeHoachKiemDemNuoc;
import com.mcvn.project.model.KeHoachKiemDemVeSinh;

public interface KeHoachkiemDemVeSinhRepository extends JpaRepository<KeHoachKiemDemVeSinh, Integer> {

	@Query("from KeHoachKiemDemVeSinh k  where k.kiemdemvienid =:kiemdemvienid and ngaydong<>null")
	List<KeHoachKiemDemVeSinh> kiemtrakhdongvs(@Param("kiemdemvienid") Integer kiemdemvienid);

	@Query("from KeHoachKiemDemVeSinh  where kiemdemvienid =:kiemdemvienid and ngaydong is null and ngayxuatban<>null  ORDER BY ngaybatdau DESC")
	List<KeHoachKiemDemVeSinh> kiemtrakehoachgan(@Param("kiemdemvienid") Integer kiemdemvienid);

	@Query("FROM KeHoachKiemDemVeSinh k WHERE k.kiemdemvienid=:kiemdemvienid")
	List<KeHoachKiemDemVeSinh> getAllkehoach(@Param("kiemdemvienid") Integer kiemdemvienid);

	@Query("FROM KeHoachKiemDemVeSinh k WHERE k.kiemdemvienid=:kiemdemvienid and k.id=:id")
	List<KeHoachKiemDemVeSinh> kiemtrakehoach(@Param("kiemdemvienid") Integer kiemdemvienid,@Param("id") Integer id);
}
