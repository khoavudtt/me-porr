package com.mcvn.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dtt.nuocsach.bean.ThongTinDauNoi;
import com.dtt.nuocsach.bean.ThongTinKiemDemKeHoach;
import com.mcvn.project.model.ThongTinKiemDemNuoc;

public interface ThongTinKiemDemNuocRepository extends JpaRepository<ThongTinKiemDemNuoc, Integer> {
	@Query("FROM ThongTinKiemDemNuoc L WHERE L.keHoachKiemDemNuoc.id=:kehoachkiemdemnuocid")
	List<ThongTinKiemDemNuoc> getdaunoi(@Param("kehoachkiemdemnuocid") int kehoachkiemdemnuocid);

	List<ThongTinKiemDemNuoc> findById(int id);

	@Query("select new com.dtt.nuocsach.bean.ThongTinD"
			+ "auNoi(t.id,t.bimatnuoc,t.chisodongho,t.chuhodungds, t.cobechuanuoc,"
			+ "t.conguoionha, t.daunoinuocid,t.daketthucdieutra,t.datungduckhong,"
			+ "t.daunoichua,t.ghichu, t.gioitinhchuho, t.gioitinhchuhohientai,"
			+ "t.gioitinhnguoitraloi, t.hotennguoitraloi, t.chinhsach,t.keHoachKiemDemNuoc.id,"
			+ "t.lachuhokhong,t.loaikhac, t.loaikhactungco,t.lydokhongdungds,"
			+ "t.lydokhonghoanthanh,t.mahuyen,t.matinh,t.maxa,t.maunuoc, t.maunuoctungco,"
			+ "t.muinuoc,t.muinuoctungco, t.ngaykiemdem, t.nuoctrongkhong,t.sogiotrungbinh,"
			+ "t.solanmatnuoc, t.songuoitrongho,t.soserydongho, t.tenchuho,t.tenchuhohientai,"
			+ "t.tendantoc, t.thanhphanhogd,t.thoigiandauhopdong, t.thoigiandaunoithucte, t.thonxom,"
			+ "t.timthaynha, t.tinhtrangbe, t.kinhdo, t.vido,t.vinuoc, t.vinuoctungco,"
			+ "t.voinuocchaykhong,t.anhbechua,t.anhdongho,t.anhdaunoi) from ThongTinKiemDemNuoc	t join	t.keHoachKiemDemNuoc k	where k.ngaydong is null and k.kiemdemvienid=:kiemdemvienid and k.ngayxuatban<>null")
	List<ThongTinDauNoi> getdaunoinuocmoi(@Param("kiemdemvienid") int kiemdemvienid);

	@Query("select new com.dtt.nuocsach.bean.ThongTinKiemDemKeHoach(t.id,t.keHoachKiemDemNuoc.id ,t.daketthucdieutra,k.nam,k.ngaybatdau,k.ngayketthuc,k.ngaydong) from ThongTinKiemDemNuoc t join t.keHoachKiemDemNuoc k where k.kiemdemvienid = :kiemdemvienid and k.ngayxuatban <>null")
	List<ThongTinKiemDemKeHoach> getthongtinkehoach(@Param("kiemdemvienid") int id);

	List<ThongTinKiemDemNuoc> findByMatinhAndMahuyenAndMaxaAndThonxomAndTenchuho(String matinh, String mahuyen,
			String maxa, String thonxom, String tenchuho);

	List<ThongTinKiemDemNuoc> findBySoserydongho(String soserydongho);
}
