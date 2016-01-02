package vn.dtt.sol.ns.reporting.util;

public class KeHoachCSV {
	private String _id;
	private String _form_id;
	private String _locale;
	private String _savepoint_type;
	private String _savepoint_timestamp;
	
	private String _savepoint_creator;
	private String AnhBeChua_contentType="image/*";
	private String AnhBeChua_uriFragment;
	private String AnhDauNoi_contentType="image/*";
	private String AnhDauNoi_uriFragment;
	private String AnhDongHo_contentType="image/*";
	private String AnhDongHo_uriFragment;
	private String BiMatNuoc;
	private String ChiSoDongHo;
	private String ChuHoDungDS;
	private String CoBeChuaNuoc;
	private String CoNguoiONhaKhong;
	private String DAUNOINUOCID;
	private String DaKetThucDieuTra;
	private String DaTungDucKhong;
	private String DauNoiChua;
	private String GhiChu;
	private String GioiTinhChuHo;
	private String GioiTinhChuHoHienTai;
	private String GioiTinhNguoiTraLoi;
	private String HoTenNguoiTraLoi;
	private String ID;
	private String IMEI;
	private String KEHOACHKIEMDEMNUOCID;
	private String LaChuHoKhong;
	private String LoaiKhac;
	private String LoaiKhacTungCo;
	private String LyDoKhongDungDS;
	private String LyDoKhongHoanThanh;
	private String MaHuyen;
	private String MaTinh;
	private String MaXa;
	private String MauNuoc;
	private String MauNuocTungCo;
	private String MuiNuoc;
	private String MuiNuocTungCo;
	private String NgayKiemDem;
	private String NuocTrongKhong;
	private String SoGioTrungBinh;
	private String SoLanMatNuoc;
	private String SoNguoiTrongHo;
	private String SoSeryDongHo;
	private String TenChuHo;
	private String TenChuHoHienTai;
	private String TenDanToc;
	private String ThanhPhanHoGD;
	private String ThoiGianDauHopDong;
	private String ThoiGianDauNoiThucTe;
	private String ThonXom;
	private String TimThayNha;
	private String TinhTrangBe;
	private String ToaDoDiaChi_accuracy;
	private String ToaDoDiaChi_altitude;
	private String ToaDoDiaChi_latitude;
	private String ToaDoDiaChi_longitude;
	private String ViNuoc;
	private String ViNuocTungCo;
	private String VoiNuocChayKhong;
	private String _filter_type;
	private String _filter_value;
	private String _row_etag;
	private String tai_khoan;
	public KeHoachCSV() {
		// TODO Auto-generated constructor stub
	}
	
	public KeHoachCSV(String _id, String _form_id, String _locale,
			String _savepoint_type, String _savepoint_timestamp,
			String _savepoint_creator, String anhBeChua_contentType,
			String anhBeChua_uriFragment, String anhDauNoi_contentType,
			String anhDauNoi_uriFragment, String anhDongHo_contentType,
			String anhDongHo_uriFragment, String biMatNuoc, String chiSoDongHo,
			String chuHoDungDS, String coBeChuaNuoc, String coNguoiONhaKhong,
			String dAUNOINUOCID, String daKetThucDieuTra,
			String daTungDucKhong, String dauNoiChua, String ghiChu,
			String gioiTinhChuHo, String gioiTinhChuHoHienTai,
			String gioiTinhNguoiTraLoi, String hoTenNguoiTraLoi, String iD,
			String iMEI, String kEHOACHKIEMDEMNUOCID, String laChuHoKhong,
			String loaiKhac, String loaiKhacTungCo, String lyDoKhongDungDS,
			String lyDoKhongHoanThanh, String maHuyen, String maTinh,
			String maXa, String mauNuoc, String mauNuocTungCo, String muiNuoc,
			String muiNuocTungCo, String ngayKiemDem, String nuocTrongKhong,
			String soGioTrungBinh, String soLanMatNuoc, String soNguoiTrongHo,
			String soSeryDongHo, String tenChuHo, String tenChuHoHienTai,
			String tenDanToc, String thanhPhanHoGD, String thoiGianDauHopDong,
			String thoiGianDauNoiThucTe, String thonXom, String timThayNha,
			String tinhTrangBe, String toaDoDiaChi_accuracy,
			String toaDoDiaChi_altitude, String toaDoDiaChi_latitude,
			String toaDoDiaChi_longitude, String viNuoc, String viNuocTungCo,
			String voiNuocChayKhong, String _filter_type, String _filter_value,
			String _row_etag,String tai_khoan) {
		super();
		this._id = _id;
		this._form_id = _form_id;
		this._locale = _locale;
		this._savepoint_type = _savepoint_type;
		this._savepoint_timestamp = _savepoint_timestamp;
		this._savepoint_creator = _savepoint_creator;
		AnhBeChua_contentType = anhBeChua_contentType;
		AnhBeChua_uriFragment = anhBeChua_uriFragment;
		AnhDauNoi_contentType = anhDauNoi_contentType;
		AnhDauNoi_uriFragment = anhDauNoi_uriFragment;
		AnhDongHo_contentType = anhDongHo_contentType;
		AnhDongHo_uriFragment = anhDongHo_uriFragment;
		BiMatNuoc = biMatNuoc;
		ChiSoDongHo = chiSoDongHo;
		ChuHoDungDS = chuHoDungDS;
		CoBeChuaNuoc = coBeChuaNuoc;
		CoNguoiONhaKhong = coNguoiONhaKhong;
		DAUNOINUOCID = dAUNOINUOCID;
		DaKetThucDieuTra = daKetThucDieuTra;
		DaTungDucKhong = daTungDucKhong;
		DauNoiChua = dauNoiChua;
		GhiChu = ghiChu;
		GioiTinhChuHo = gioiTinhChuHo;
		GioiTinhChuHoHienTai = gioiTinhChuHoHienTai;
		GioiTinhNguoiTraLoi = gioiTinhNguoiTraLoi;
		HoTenNguoiTraLoi = hoTenNguoiTraLoi;
		ID = iD;
		IMEI = iMEI;
		KEHOACHKIEMDEMNUOCID = kEHOACHKIEMDEMNUOCID;
		LaChuHoKhong = laChuHoKhong;
		LoaiKhac = loaiKhac;
		LoaiKhacTungCo = loaiKhacTungCo;
		LyDoKhongDungDS = lyDoKhongDungDS;
		LyDoKhongHoanThanh = lyDoKhongHoanThanh;
		MaHuyen = maHuyen;
		MaTinh = maTinh;
		MaXa = maXa;
		MauNuoc = mauNuoc;
		MauNuocTungCo = mauNuocTungCo;
		MuiNuoc = muiNuoc;
		MuiNuocTungCo = muiNuocTungCo;
		NgayKiemDem = ngayKiemDem;
		NuocTrongKhong = nuocTrongKhong;
		SoGioTrungBinh = soGioTrungBinh;
		SoLanMatNuoc = soLanMatNuoc;
		SoNguoiTrongHo = soNguoiTrongHo;
		SoSeryDongHo = soSeryDongHo;
		TenChuHo = tenChuHo;
		TenChuHoHienTai = tenChuHoHienTai;
		TenDanToc = tenDanToc;
		ThanhPhanHoGD = thanhPhanHoGD;
		ThoiGianDauHopDong = thoiGianDauHopDong;
		ThoiGianDauNoiThucTe = thoiGianDauNoiThucTe;
		ThonXom = thonXom;
		TimThayNha = timThayNha;
		TinhTrangBe = tinhTrangBe;
		ToaDoDiaChi_accuracy = toaDoDiaChi_accuracy;
		ToaDoDiaChi_altitude = toaDoDiaChi_altitude;
		ToaDoDiaChi_latitude = toaDoDiaChi_latitude;
		ToaDoDiaChi_longitude = toaDoDiaChi_longitude;
		ViNuoc = viNuoc;
		ViNuocTungCo = viNuocTungCo;
		VoiNuocChayKhong = voiNuocChayKhong;
		this._filter_type = _filter_type;
		this._filter_value = _filter_value;
		this._row_etag = _row_etag;
		this.tai_khoan = tai_khoan;
	}

	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String get_form_id() {
		return _form_id;
	}
	public void set_form_id(String _form_id) {
		this._form_id = _form_id;
	}
	public String get_locale() {
		return _locale;
	}
	public void set_locale(String _locale) {
		this._locale = _locale;
	}
	public String get_savepoint_type() {
		return _savepoint_type;
	}
	public void set_savepoint_type(String _savepoint_type) {
		this._savepoint_type = _savepoint_type;
	}
	public String get_savepoint_timestamp() {
		return _savepoint_timestamp;
	}
	public void set_savepoint_timestamp(String _savepoint_timestamp) {
		this._savepoint_timestamp = _savepoint_timestamp;
	}
	public String get_savepoint_creator() {
		return _savepoint_creator;
	}
	public void set_savepoint_creator(String _savepoint_creator) {
		this._savepoint_creator = _savepoint_creator;
	}
	public String getAnhBeChua_contentType() {
		return AnhBeChua_contentType;
	}
	public void setAnhBeChua_contentType(String anhBeChua_contentType) {
		AnhBeChua_contentType = anhBeChua_contentType;
	}
	public String getAnhBeChua_uriFragment() {
		return AnhBeChua_uriFragment;
	}
	public void setAnhBeChua_uriFragment(String anhBeChua_uriFragment) {
		AnhBeChua_uriFragment = anhBeChua_uriFragment;
	}
	public String getAnhDauNoi_contentType() {
		return AnhDauNoi_contentType;
	}
	public void setAnhDauNoi_contentType(String anhDauNoi_contentType) {
		AnhDauNoi_contentType = anhDauNoi_contentType;
	}
	public String getAnhDauNoi_uriFragment() {
		return AnhDauNoi_uriFragment;
	}
	public void setAnhDauNoi_uriFragment(String anhDauNoi_uriFragment) {
		AnhDauNoi_uriFragment = anhDauNoi_uriFragment;
	}
	public String getAnhDongHo_contentType() {
		return AnhDongHo_contentType;
	}
	public void setAnhDongHo_contentType(String anhDongHo_contentType) {
		AnhDongHo_contentType = anhDongHo_contentType;
	}
	public String getAnhDongHo_uriFragment() {
		return AnhDongHo_uriFragment;
	}
	public void setAnhDongHo_uriFragment(String anhDongHo_uriFragment) {
		AnhDongHo_uriFragment = anhDongHo_uriFragment;
	}
	public String getBiMatNuoc() {
		return BiMatNuoc;
	}
	public void setBiMatNuoc(String biMatNuoc) {
		BiMatNuoc = biMatNuoc;
	}
	public String getChiSoDongHo() {
		return ChiSoDongHo;
	}
	public void setChiSoDongHo(String chiSoDongHo) {
		ChiSoDongHo = chiSoDongHo;
	}
	public String getChuHoDungDS() {
		return ChuHoDungDS;
	}
	public void setChuHoDungDS(String chuHoDungDS) {
		ChuHoDungDS = chuHoDungDS;
	}
	public String getCoBeChuaNuoc() {
		return CoBeChuaNuoc;
	}
	public void setCoBeChuaNuoc(String coBeChuaNuoc) {
		CoBeChuaNuoc = coBeChuaNuoc;
	}
	public String getCoNguoiONhaKhong() {
		return CoNguoiONhaKhong;
	}
	public void setCoNguoiONhaKhong(String coNguoiONhaKhong) {
		CoNguoiONhaKhong = coNguoiONhaKhong;
	}
	public String getDAUNOINUOCID() {
		return DAUNOINUOCID;
	}
	public void setDAUNOINUOCID(String dAUNOINUOCID) {
		DAUNOINUOCID = dAUNOINUOCID;
	}
	public String getDaKetThucDieuTra() {
		return DaKetThucDieuTra;
	}
	public void setDaKetThucDieuTra(String daKetThucDieuTra) {
		DaKetThucDieuTra = daKetThucDieuTra;
	}
	public String getDaTungDucKhong() {
		return DaTungDucKhong;
	}
	public void setDaTungDucKhong(String daTungDucKhong) {
		DaTungDucKhong = daTungDucKhong;
	}
	public String getDauNoiChua() {
		return DauNoiChua;
	}
	public void setDauNoiChua(String dauNoiChua) {
		DauNoiChua = dauNoiChua;
	}
	public String getGhiChu() {
		return GhiChu;
	}
	public void setGhiChu(String ghiChu) {
		GhiChu = ghiChu;
	}
	public String getGioiTinhChuHo() {
		return GioiTinhChuHo;
	}
	public void setGioiTinhChuHo(String gioiTinhChuHo) {
		GioiTinhChuHo = gioiTinhChuHo;
	}
	public String getGioiTinhChuHoHienTai() {
		return GioiTinhChuHoHienTai;
	}
	public void setGioiTinhChuHoHienTai(String gioiTinhChuHoHienTai) {
		GioiTinhChuHoHienTai = gioiTinhChuHoHienTai;
	}
	public String getGioiTinhNguoiTraLoi() {
		return GioiTinhNguoiTraLoi;
	}
	public void setGioiTinhNguoiTraLoi(String gioiTinhNguoiTraLoi) {
		GioiTinhNguoiTraLoi = gioiTinhNguoiTraLoi;
	}
	public String getHoTenNguoiTraLoi() {
		return HoTenNguoiTraLoi;
	}
	public void setHoTenNguoiTraLoi(String hoTenNguoiTraLoi) {
		HoTenNguoiTraLoi = hoTenNguoiTraLoi;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getIMEI() {
		return IMEI;
	}
	public void setIMEI(String iMEI) {
		IMEI = iMEI;
	}
	public String getKEHOACHKIEMDEMNUOCID() {
		return KEHOACHKIEMDEMNUOCID;
	}
	public void setKEHOACHKIEMDEMNUOCID(String kEHOACHKIEMDEMNUOCID) {
		KEHOACHKIEMDEMNUOCID = kEHOACHKIEMDEMNUOCID;
	}
	public String getLaChuHoKhong() {
		return LaChuHoKhong;
	}
	public void setLaChuHoKhong(String laChuHoKhong) {
		LaChuHoKhong = laChuHoKhong;
	}
	public String getLoaiKhac() {
		return LoaiKhac;
	}
	public void setLoaiKhac(String loaiKhac) {
		LoaiKhac = loaiKhac;
	}
	public String getLoaiKhacTungCo() {
		return LoaiKhacTungCo;
	}
	public void setLoaiKhacTungCo(String loaiKhacTungCo) {
		LoaiKhacTungCo = loaiKhacTungCo;
	}
	public String getLyDoKhongDungDS() {
		return LyDoKhongDungDS;
	}
	public void setLyDoKhongDungDS(String lyDoKhongDungDS) {
		LyDoKhongDungDS = lyDoKhongDungDS;
	}
	public String getLyDoKhongHoanThanh() {
		return LyDoKhongHoanThanh;
	}
	public void setLyDoKhongHoanThanh(String lyDoKhongHoanThanh) {
		LyDoKhongHoanThanh = lyDoKhongHoanThanh;
	}
	public String getMaHuyen() {
		return MaHuyen;
	}
	public void setMaHuyen(String maHuyen) {
		MaHuyen = maHuyen;
	}
	public String getMaTinh() {
		return MaTinh;
	}
	public void setMaTinh(String maTinh) {
		MaTinh = maTinh;
	}
	public String getMaXa() {
		return MaXa;
	}
	public void setMaXa(String maXa) {
		MaXa = maXa;
	}
	public String getMauNuoc() {
		return MauNuoc;
	}
	public void setMauNuoc(String mauNuoc) {
		MauNuoc = mauNuoc;
	}
	public String getMauNuocTungCo() {
		return MauNuocTungCo;
	}
	public void setMauNuocTungCo(String mauNuocTungCo) {
		MauNuocTungCo = mauNuocTungCo;
	}
	public String getMuiNuoc() {
		return MuiNuoc;
	}
	public void setMuiNuoc(String muiNuoc) {
		MuiNuoc = muiNuoc;
	}
	public String getMuiNuocTungCo() {
		return MuiNuocTungCo;
	}
	public void setMuiNuocTungCo(String muiNuocTungCo) {
		MuiNuocTungCo = muiNuocTungCo;
	}
	public String getNgayKiemDem() {
		return NgayKiemDem;
	}
	public void setNgayKiemDem(String ngayKiemDem) {
		NgayKiemDem = ngayKiemDem;
	}
	public String getNuocTrongKhong() {
		return NuocTrongKhong;
	}
	public void setNuocTrongKhong(String nuocTrongKhong) {
		NuocTrongKhong = nuocTrongKhong;
	}
	public String getSoGioTrungBinh() {
		return SoGioTrungBinh;
	}
	public void setSoGioTrungBinh(String soGioTrungBinh) {
		SoGioTrungBinh = soGioTrungBinh;
	}
	public String getSoLanMatNuoc() {
		return SoLanMatNuoc;
	}
	public void setSoLanMatNuoc(String soLanMatNuoc) {
		SoLanMatNuoc = soLanMatNuoc;
	}
	public String getSoNguoiTrongHo() {
		return SoNguoiTrongHo;
	}
	public void setSoNguoiTrongHo(String soNguoiTrongHo) {
		SoNguoiTrongHo = soNguoiTrongHo;
	}
	public String getSoSeryDongHo() {
		return SoSeryDongHo;
	}
	public void setSoSeryDongHo(String soSeryDongHo) {
		SoSeryDongHo = soSeryDongHo;
	}
	public String getTenChuHo() {
		return TenChuHo;
	}
	public void setTenChuHo(String tenChuHo) {
		TenChuHo = tenChuHo;
	}
	public String getTenChuHoHienTai() {
		return TenChuHoHienTai;
	}
	public void setTenChuHoHienTai(String tenChuHoHienTai) {
		TenChuHoHienTai = tenChuHoHienTai;
	}
	public String getTenDanToc() {
		return TenDanToc;
	}
	public void setTenDanToc(String tenDanToc) {
		TenDanToc = tenDanToc;
	}
	public String getThanhPhanHoGD() {
		return ThanhPhanHoGD;
	}
	public void setThanhPhanHoGD(String thanhPhanHoGD) {
		ThanhPhanHoGD = thanhPhanHoGD;
	}
	public String getThoiGianDauHopDong() {
		return ThoiGianDauHopDong;
	}
	public void setThoiGianDauHopDong(String thoiGianDauHopDong) {
		ThoiGianDauHopDong = thoiGianDauHopDong;
	}
	public String getThoiGianDauNoiThucTe() {
		return ThoiGianDauNoiThucTe;
	}
	public void setThoiGianDauNoiThucTe(String thoiGianDauNoiThucTe) {
		ThoiGianDauNoiThucTe = thoiGianDauNoiThucTe;
	}
	public String getThonXom() {
		return ThonXom;
	}
	public void setThonXom(String thonXom) {
		ThonXom = thonXom;
	}
	public String getTimThayNha() {
		return TimThayNha;
	}
	public void setTimThayNha(String timThayNha) {
		TimThayNha = timThayNha;
	}
	public String getTinhTrangBe() {
		return TinhTrangBe;
	}
	public void setTinhTrangBe(String tinhTrangBe) {
		TinhTrangBe = tinhTrangBe;
	}
	public String getToaDoDiaChi_accuracy() {
		return ToaDoDiaChi_accuracy;
	}
	public void setToaDoDiaChi_accuracy(String toaDoDiaChi_accuracy) {
		ToaDoDiaChi_accuracy = toaDoDiaChi_accuracy;
	}
	public String getToaDoDiaChi_altitude() {
		return ToaDoDiaChi_altitude;
	}
	public void setToaDoDiaChi_altitude(String toaDoDiaChi_altitude) {
		ToaDoDiaChi_altitude = toaDoDiaChi_altitude;
	}
	public String getToaDoDiaChi_latitude() {
		return ToaDoDiaChi_latitude;
	}
	public void setToaDoDiaChi_latitude(String toaDoDiaChi_latitude) {
		ToaDoDiaChi_latitude = toaDoDiaChi_latitude;
	}
	public String getToaDoDiaChi_longitude() {
		return ToaDoDiaChi_longitude;
	}
	public void setToaDoDiaChi_longitude(String toaDoDiaChi_longitude) {
		ToaDoDiaChi_longitude = toaDoDiaChi_longitude;
	}
	public String getViNuoc() {
		return ViNuoc;
	}
	public void setViNuoc(String viNuoc) {
		ViNuoc = viNuoc;
	}
	public String getViNuocTungCo() {
		return ViNuocTungCo;
	}
	public void setViNuocTungCo(String viNuocTungCo) {
		ViNuocTungCo = viNuocTungCo;
	}
	public String getVoiNuocChayKhong() {
		return VoiNuocChayKhong;
	}
	public void setVoiNuocChayKhong(String voiNuocChayKhong) {
		VoiNuocChayKhong = voiNuocChayKhong;
	}
	public String get_filter_type() {
		return _filter_type;
	}
	public void set_filter_type(String _filter_type) {
		this._filter_type = _filter_type;
	}
	public String get_filter_value() {
		return _filter_value;
	}
	public void set_filter_value(String _filter_value) {
		this._filter_value = _filter_value;
	}
	public String get_row_etag() {
		return _row_etag;
	}
	public void set_row_etag(String _row_etag) {
		this._row_etag = _row_etag;
	}

	public String getTai_khoan() {
		return tai_khoan;
	}

	public void setTai_khoan(String tai_khoan) {
		this.tai_khoan = tai_khoan;
	}
	
}