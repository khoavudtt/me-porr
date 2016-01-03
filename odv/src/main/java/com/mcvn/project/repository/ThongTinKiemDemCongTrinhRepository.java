package com.mcvn.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.dtt.nuocsach.bean.ThongTinKiemDemKeHoach;
import com.dtt.nuocsach.bean.ThongTinKiemDemVSCCT;
import com.mcvn.project.model.ThongTinKiemDemVeSinhCongTrinh;
@Transactional(readOnly = true)
public interface ThongTinKiemDemCongTrinhRepository extends JpaRepository<ThongTinKiemDemVeSinhCongTrinh, Integer> {
	@Query("select new com.dtt.nuocsach.bean.ThongTinKiemDemVSCCT(t.id,t.vesinhcongtrinhid,t.keHoachKiemDemVeSinh.id, t.tencongtrinh,t.loaicongtrinh,"
			+ "t.matinh, t.mahuyen,t.maxa, t.diachi, t.hotennguoitraloi,t.sodienthoai,"
			+ "t.gioitinhnguoitraloi,t.vaitrochucdanh,t.soca,t.songuoitrongca,t.kinhdo,t.vido,"
			+ "t.loainguonnuoc,t.datqcvn, t.dattieuchuanhvs,t.sonhatieu,"
			+ "t.ghichu,t.daketthucdieutra,t.lydokhonghoanthanh,t.imei) from ThongTinKiemDemVeSinhCongTrinh t join t.keHoachKiemDemVeSinh k	where k.ngaydong is null and k.kiemdemvienid=:kiemdemvienid and k.ngayxuatban<>null")
	List<ThongTinKiemDemVSCCT> getVsCT(@Param("kiemdemvienid") int kiemdemvienid);

	@Query("select t.danhgiakiemdem as danhgiakiemdem  from ThongTinKiemDemVeSinhCongTrinh t where t.id=:id")
	int getdanhgia(@Param("id") int id);

	@Query("select new com.dtt.nuocsach.bean.ThongTinKiemDemKeHoach(t.id,t.keHoachKiemDemVeSinh.id ,t.daketthucdieutra,k.nam,k.ngaybatdau,k.ngayketthuc,k.ngaydong) from ThongTinKiemDemVeSinhCongTrinh t join t.keHoachKiemDemVeSinh k where k.kiemdemvienid = :kiemdemvienid and k.ngayxuatban <>null")
	List<ThongTinKiemDemKeHoach> getthongtinkehoachcongtrinh(@Param("kiemdemvienid") int id);

	@Modifying
	@Transactional
	@Query("UPDATE ThongTinKiemDemVeSinhCongTrinh SET danhgiakiemdem=:danhgiakiemdem WHERE id=:id")
	void update(@Param("danhgiakiemdem") int danhgiakiemdem, @Param("id") int id);

	List<ThongTinKiemDemVeSinhCongTrinh> findByMatinhAndMahuyenAndMaxaAndDiachiAndTencongtrinhAndLoaicongtrinh(
			String matinh, String mahuyen, String maxa, String diachi, String tencongtrinh, Integer loaicongtrinh);
}
