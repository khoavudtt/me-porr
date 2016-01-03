package com.mcvn.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.dtt.nuocsach.bean.ThongTinKiemDemKeHoach;
import com.dtt.nuocsach.bean.VeSinhGiaDinhTT;
import com.mcvn.project.model.ThongTinKiemDemNuoc;
import com.mcvn.project.model.VeSinhHoGiaDinh;

public interface VeSinhHoGiaDinhRepository extends JpaRepository<VeSinhHoGiaDinh, Integer> {

	@Query("select new com.dtt.nuocsach.bean.VeSinhGiaDinhTT(t.id,t.vesinhgiadinhid,t.keHoachKiemDemVeSinh.id,t.matinh,"
			+ "	t.mahuyen, t.maxa, t.thonxom, t.tenchuho, t.gioitinhchuho,t.ngaykiemdem,"
			+ "t.timthaynha, t.hotennguoitraloi, t.lachuhokhong, t.tendantoc, t.kinhdo, t.vido,"
			+ "t.thanhphanhogd,t.chuhodungds, t.lydokhongdungds, t.tenchuhohientai,"
			+ "	t.gioitinhchuhohientai,t.conhatieu, t.loainhatieu,"
			+ "t.nguonvon, t.chitietvonvay,t.duoccaitao, t.loainhatieucu,"
			+ "	t.vesinhsachse, t.delamvesinh, t.muivesinh,t.phiatrenkindao, t.duchemuagio,"
			+ "	t.sancaotrentoithieu, t.napbecontot, t.cuaphanbitkin, t.tranrangoai, t.nuocthaididau,"
			+ "	t.khoangcachnguonnuoc, t.ngapkhimualon, t.ghichu,t.daketthucdieutra, t.lydokhonghoanthanh,"
			+ "	t.imei, t.taikhoan, t.danhgiakiemdem,t.songuoitrongho,t.thangxaydung,"
			+ "	t.loainguonnuoc,t.chinhsach,t.conguoionha,t.gioitinhnguoitraloi,t.namxaydung,t.anhtoancanh,t.anhtrongnhatieu,t.anhbechua) from VeSinhHoGiaDinh t join t.keHoachKiemDemVeSinh k	where k.ngaydong is null and k.kiemdemvienid=:kiemdemvienid and k.ngayxuatban<>null")
	List<VeSinhGiaDinhTT> getthongtinvesinhgd(@Param("kiemdemvienid") int id);

	@Query("select new com.dtt.nuocsach.bean.ThongTinKiemDemKeHoach(v.id,v.keHoachKiemDemVeSinh.id ,v.daketthucdieutra,k.nam,k.ngaybatdau,k.ngayketthuc,k.ngaydong) from VeSinhHoGiaDinh v join v.keHoachKiemDemVeSinh k where k.kiemdemvienid = :kiemdemvienid and k.ngayxuatban <>null")
	List<ThongTinKiemDemKeHoach> getthongtinkehoach(@Param("kiemdemvienid") int id);

	@Query("select tenchuho FROM VeSinhHoGiaDinh vs WHERE vs.matinh=:matinh and vs.mahuyen=:mahuyen and vs.maxa=:maxa and vs.thonxom=:thonxom and vs.tenchuho=:tenchuho")
	List<String> checkTrung(@Param("matinh") String matinh, @Param("mahuyen") String mahuyen,
			@Param("maxa") String maxa, @Param("thonxom") String thonxom, @Param("tenchuho") String tenchuho);
	// List<VeSinhHoGiaDinh>
	// findByMatinhAndMahuyenAndMaxaAndThonxomAndTenchuho(String matinh, String
	// mahuyen,
	// String maxa, String thonxom, String tenchuho);

}
