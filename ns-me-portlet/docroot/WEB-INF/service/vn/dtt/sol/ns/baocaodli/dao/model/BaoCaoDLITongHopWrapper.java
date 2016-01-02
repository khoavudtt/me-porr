/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package vn.dtt.sol.ns.baocaodli.dao.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link BaoCaoDLITongHop}.
 * </p>
 *
 * @author HuyMQ
 * @see BaoCaoDLITongHop
 * @generated
 */
public class BaoCaoDLITongHopWrapper implements BaoCaoDLITongHop,
	ModelWrapper<BaoCaoDLITongHop> {
	public BaoCaoDLITongHopWrapper(BaoCaoDLITongHop baoCaoDLITongHop) {
		_baoCaoDLITongHop = baoCaoDLITongHop;
	}

	@Override
	public Class<?> getModelClass() {
		return BaoCaoDLITongHop.class;
	}

	@Override
	public String getModelClassName() {
		return BaoCaoDLITongHop.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("maTinh", getMaTinh());
		attributes.put("nam", getNam());
		attributes.put("soDauNoiTheoKeHoach", getSoDauNoiTheoKeHoach());
		attributes.put("soDauNoiMoi", getSoDauNoiMoi());
		attributes.put("soNhaTieuHVSTheoKH", getSoNhaTieuHVSTheoKH());
		attributes.put("soNhaTieuHVSMoi", getSoNhaTieuHVSMoi());
		attributes.put("soNguoiHuongLoiNuocSach", getSoNguoiHuongLoiNuocSach());
		attributes.put("soXa", getSoXa());
		attributes.put("tiLeHGDCoNhaTieu", getTiLeHGDCoNhaTieu());
		attributes.put("tiLeHGDCoNhaTieuHVS", getTiLeHGDCoNhaTieuHVS());
		attributes.put("tiLeTruongHocHVS", getTiLeTruongHocHVS());
		attributes.put("tiLeTramYTeHVS", getTiLeTramYTeHVS());
		attributes.put("soNguoiHuongLoiVSTX", getSoNguoiHuongLoiVSTX());
		attributes.put("keHoachPheDuyet", getKeHoachPheDuyet());
		attributes.put("ngayDuyetKeHoach", getNgayDuyetKeHoach());
		attributes.put("baoCaoChuongTrinh", getBaoCaoChuongTrinh());
		attributes.put("ngayDangTai", getNgayDangTai());
		attributes.put("nguoiLap", getNguoiLap());
		attributes.put("nguoiDuyet", getNguoiDuyet());
		attributes.put("soBaoCao", getSoBaoCao());
		attributes.put("ngayBaoCao", getNgayBaoCao());
		attributes.put("trangThai", getTrangThai());
		attributes.put("luuTruPdfTH", getLuuTruPdfTH());
		attributes.put("luuTruPdf", getLuuTruPdf());
		attributes.put("luuTruCsv", getLuuTruCsv());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String maTinh = (String)attributes.get("maTinh");

		if (maTinh != null) {
			setMaTinh(maTinh);
		}

		Integer nam = (Integer)attributes.get("nam");

		if (nam != null) {
			setNam(nam);
		}

		Integer soDauNoiTheoKeHoach = (Integer)attributes.get(
				"soDauNoiTheoKeHoach");

		if (soDauNoiTheoKeHoach != null) {
			setSoDauNoiTheoKeHoach(soDauNoiTheoKeHoach);
		}

		Integer soDauNoiMoi = (Integer)attributes.get("soDauNoiMoi");

		if (soDauNoiMoi != null) {
			setSoDauNoiMoi(soDauNoiMoi);
		}

		Integer soNhaTieuHVSTheoKH = (Integer)attributes.get(
				"soNhaTieuHVSTheoKH");

		if (soNhaTieuHVSTheoKH != null) {
			setSoNhaTieuHVSTheoKH(soNhaTieuHVSTheoKH);
		}

		Integer soNhaTieuHVSMoi = (Integer)attributes.get("soNhaTieuHVSMoi");

		if (soNhaTieuHVSMoi != null) {
			setSoNhaTieuHVSMoi(soNhaTieuHVSMoi);
		}

		Integer soNguoiHuongLoiNuocSach = (Integer)attributes.get(
				"soNguoiHuongLoiNuocSach");

		if (soNguoiHuongLoiNuocSach != null) {
			setSoNguoiHuongLoiNuocSach(soNguoiHuongLoiNuocSach);
		}

		Integer soXa = (Integer)attributes.get("soXa");

		if (soXa != null) {
			setSoXa(soXa);
		}

		Integer tiLeHGDCoNhaTieu = (Integer)attributes.get("tiLeHGDCoNhaTieu");

		if (tiLeHGDCoNhaTieu != null) {
			setTiLeHGDCoNhaTieu(tiLeHGDCoNhaTieu);
		}

		Integer tiLeHGDCoNhaTieuHVS = (Integer)attributes.get(
				"tiLeHGDCoNhaTieuHVS");

		if (tiLeHGDCoNhaTieuHVS != null) {
			setTiLeHGDCoNhaTieuHVS(tiLeHGDCoNhaTieuHVS);
		}

		Integer tiLeTruongHocHVS = (Integer)attributes.get("tiLeTruongHocHVS");

		if (tiLeTruongHocHVS != null) {
			setTiLeTruongHocHVS(tiLeTruongHocHVS);
		}

		Integer tiLeTramYTeHVS = (Integer)attributes.get("tiLeTramYTeHVS");

		if (tiLeTramYTeHVS != null) {
			setTiLeTramYTeHVS(tiLeTramYTeHVS);
		}

		Integer soNguoiHuongLoiVSTX = (Integer)attributes.get(
				"soNguoiHuongLoiVSTX");

		if (soNguoiHuongLoiVSTX != null) {
			setSoNguoiHuongLoiVSTX(soNguoiHuongLoiVSTX);
		}

		String keHoachPheDuyet = (String)attributes.get("keHoachPheDuyet");

		if (keHoachPheDuyet != null) {
			setKeHoachPheDuyet(keHoachPheDuyet);
		}

		Date ngayDuyetKeHoach = (Date)attributes.get("ngayDuyetKeHoach");

		if (ngayDuyetKeHoach != null) {
			setNgayDuyetKeHoach(ngayDuyetKeHoach);
		}

		String baoCaoChuongTrinh = (String)attributes.get("baoCaoChuongTrinh");

		if (baoCaoChuongTrinh != null) {
			setBaoCaoChuongTrinh(baoCaoChuongTrinh);
		}

		Date ngayDangTai = (Date)attributes.get("ngayDangTai");

		if (ngayDangTai != null) {
			setNgayDangTai(ngayDangTai);
		}

		String nguoiLap = (String)attributes.get("nguoiLap");

		if (nguoiLap != null) {
			setNguoiLap(nguoiLap);
		}

		String nguoiDuyet = (String)attributes.get("nguoiDuyet");

		if (nguoiDuyet != null) {
			setNguoiDuyet(nguoiDuyet);
		}

		String soBaoCao = (String)attributes.get("soBaoCao");

		if (soBaoCao != null) {
			setSoBaoCao(soBaoCao);
		}

		Date ngayBaoCao = (Date)attributes.get("ngayBaoCao");

		if (ngayBaoCao != null) {
			setNgayBaoCao(ngayBaoCao);
		}

		Integer trangThai = (Integer)attributes.get("trangThai");

		if (trangThai != null) {
			setTrangThai(trangThai);
		}

		Integer luuTruPdfTH = (Integer)attributes.get("luuTruPdfTH");

		if (luuTruPdfTH != null) {
			setLuuTruPdfTH(luuTruPdfTH);
		}

		Integer luuTruPdf = (Integer)attributes.get("luuTruPdf");

		if (luuTruPdf != null) {
			setLuuTruPdf(luuTruPdf);
		}

		Integer luuTruCsv = (Integer)attributes.get("luuTruCsv");

		if (luuTruCsv != null) {
			setLuuTruCsv(luuTruCsv);
		}
	}

	/**
	* Returns the primary key of this bao cao d l i tong hop.
	*
	* @return the primary key of this bao cao d l i tong hop
	*/
	@Override
	public long getPrimaryKey() {
		return _baoCaoDLITongHop.getPrimaryKey();
	}

	/**
	* Sets the primary key of this bao cao d l i tong hop.
	*
	* @param primaryKey the primary key of this bao cao d l i tong hop
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_baoCaoDLITongHop.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this bao cao d l i tong hop.
	*
	* @return the ID of this bao cao d l i tong hop
	*/
	@Override
	public long getId() {
		return _baoCaoDLITongHop.getId();
	}

	/**
	* Sets the ID of this bao cao d l i tong hop.
	*
	* @param id the ID of this bao cao d l i tong hop
	*/
	@Override
	public void setId(long id) {
		_baoCaoDLITongHop.setId(id);
	}

	/**
	* Returns the ma tinh of this bao cao d l i tong hop.
	*
	* @return the ma tinh of this bao cao d l i tong hop
	*/
	@Override
	public java.lang.String getMaTinh() {
		return _baoCaoDLITongHop.getMaTinh();
	}

	/**
	* Sets the ma tinh of this bao cao d l i tong hop.
	*
	* @param maTinh the ma tinh of this bao cao d l i tong hop
	*/
	@Override
	public void setMaTinh(java.lang.String maTinh) {
		_baoCaoDLITongHop.setMaTinh(maTinh);
	}

	/**
	* Returns the nam of this bao cao d l i tong hop.
	*
	* @return the nam of this bao cao d l i tong hop
	*/
	@Override
	public int getNam() {
		return _baoCaoDLITongHop.getNam();
	}

	/**
	* Sets the nam of this bao cao d l i tong hop.
	*
	* @param nam the nam of this bao cao d l i tong hop
	*/
	@Override
	public void setNam(int nam) {
		_baoCaoDLITongHop.setNam(nam);
	}

	/**
	* Returns the so dau noi theo ke hoach of this bao cao d l i tong hop.
	*
	* @return the so dau noi theo ke hoach of this bao cao d l i tong hop
	*/
	@Override
	public int getSoDauNoiTheoKeHoach() {
		return _baoCaoDLITongHop.getSoDauNoiTheoKeHoach();
	}

	/**
	* Sets the so dau noi theo ke hoach of this bao cao d l i tong hop.
	*
	* @param soDauNoiTheoKeHoach the so dau noi theo ke hoach of this bao cao d l i tong hop
	*/
	@Override
	public void setSoDauNoiTheoKeHoach(int soDauNoiTheoKeHoach) {
		_baoCaoDLITongHop.setSoDauNoiTheoKeHoach(soDauNoiTheoKeHoach);
	}

	/**
	* Returns the so dau noi moi of this bao cao d l i tong hop.
	*
	* @return the so dau noi moi of this bao cao d l i tong hop
	*/
	@Override
	public int getSoDauNoiMoi() {
		return _baoCaoDLITongHop.getSoDauNoiMoi();
	}

	/**
	* Sets the so dau noi moi of this bao cao d l i tong hop.
	*
	* @param soDauNoiMoi the so dau noi moi of this bao cao d l i tong hop
	*/
	@Override
	public void setSoDauNoiMoi(int soDauNoiMoi) {
		_baoCaoDLITongHop.setSoDauNoiMoi(soDauNoiMoi);
	}

	/**
	* Returns the so nha tieu h v s theo k h of this bao cao d l i tong hop.
	*
	* @return the so nha tieu h v s theo k h of this bao cao d l i tong hop
	*/
	@Override
	public int getSoNhaTieuHVSTheoKH() {
		return _baoCaoDLITongHop.getSoNhaTieuHVSTheoKH();
	}

	/**
	* Sets the so nha tieu h v s theo k h of this bao cao d l i tong hop.
	*
	* @param soNhaTieuHVSTheoKH the so nha tieu h v s theo k h of this bao cao d l i tong hop
	*/
	@Override
	public void setSoNhaTieuHVSTheoKH(int soNhaTieuHVSTheoKH) {
		_baoCaoDLITongHop.setSoNhaTieuHVSTheoKH(soNhaTieuHVSTheoKH);
	}

	/**
	* Returns the so nha tieu h v s moi of this bao cao d l i tong hop.
	*
	* @return the so nha tieu h v s moi of this bao cao d l i tong hop
	*/
	@Override
	public int getSoNhaTieuHVSMoi() {
		return _baoCaoDLITongHop.getSoNhaTieuHVSMoi();
	}

	/**
	* Sets the so nha tieu h v s moi of this bao cao d l i tong hop.
	*
	* @param soNhaTieuHVSMoi the so nha tieu h v s moi of this bao cao d l i tong hop
	*/
	@Override
	public void setSoNhaTieuHVSMoi(int soNhaTieuHVSMoi) {
		_baoCaoDLITongHop.setSoNhaTieuHVSMoi(soNhaTieuHVSMoi);
	}

	/**
	* Returns the so nguoi huong loi nuoc sach of this bao cao d l i tong hop.
	*
	* @return the so nguoi huong loi nuoc sach of this bao cao d l i tong hop
	*/
	@Override
	public int getSoNguoiHuongLoiNuocSach() {
		return _baoCaoDLITongHop.getSoNguoiHuongLoiNuocSach();
	}

	/**
	* Sets the so nguoi huong loi nuoc sach of this bao cao d l i tong hop.
	*
	* @param soNguoiHuongLoiNuocSach the so nguoi huong loi nuoc sach of this bao cao d l i tong hop
	*/
	@Override
	public void setSoNguoiHuongLoiNuocSach(int soNguoiHuongLoiNuocSach) {
		_baoCaoDLITongHop.setSoNguoiHuongLoiNuocSach(soNguoiHuongLoiNuocSach);
	}

	/**
	* Returns the so xa of this bao cao d l i tong hop.
	*
	* @return the so xa of this bao cao d l i tong hop
	*/
	@Override
	public int getSoXa() {
		return _baoCaoDLITongHop.getSoXa();
	}

	/**
	* Sets the so xa of this bao cao d l i tong hop.
	*
	* @param soXa the so xa of this bao cao d l i tong hop
	*/
	@Override
	public void setSoXa(int soXa) {
		_baoCaoDLITongHop.setSoXa(soXa);
	}

	/**
	* Returns the ti le h g d co nha tieu of this bao cao d l i tong hop.
	*
	* @return the ti le h g d co nha tieu of this bao cao d l i tong hop
	*/
	@Override
	public int getTiLeHGDCoNhaTieu() {
		return _baoCaoDLITongHop.getTiLeHGDCoNhaTieu();
	}

	/**
	* Sets the ti le h g d co nha tieu of this bao cao d l i tong hop.
	*
	* @param tiLeHGDCoNhaTieu the ti le h g d co nha tieu of this bao cao d l i tong hop
	*/
	@Override
	public void setTiLeHGDCoNhaTieu(int tiLeHGDCoNhaTieu) {
		_baoCaoDLITongHop.setTiLeHGDCoNhaTieu(tiLeHGDCoNhaTieu);
	}

	/**
	* Returns the ti le h g d co nha tieu h v s of this bao cao d l i tong hop.
	*
	* @return the ti le h g d co nha tieu h v s of this bao cao d l i tong hop
	*/
	@Override
	public int getTiLeHGDCoNhaTieuHVS() {
		return _baoCaoDLITongHop.getTiLeHGDCoNhaTieuHVS();
	}

	/**
	* Sets the ti le h g d co nha tieu h v s of this bao cao d l i tong hop.
	*
	* @param tiLeHGDCoNhaTieuHVS the ti le h g d co nha tieu h v s of this bao cao d l i tong hop
	*/
	@Override
	public void setTiLeHGDCoNhaTieuHVS(int tiLeHGDCoNhaTieuHVS) {
		_baoCaoDLITongHop.setTiLeHGDCoNhaTieuHVS(tiLeHGDCoNhaTieuHVS);
	}

	/**
	* Returns the ti le truong hoc h v s of this bao cao d l i tong hop.
	*
	* @return the ti le truong hoc h v s of this bao cao d l i tong hop
	*/
	@Override
	public int getTiLeTruongHocHVS() {
		return _baoCaoDLITongHop.getTiLeTruongHocHVS();
	}

	/**
	* Sets the ti le truong hoc h v s of this bao cao d l i tong hop.
	*
	* @param tiLeTruongHocHVS the ti le truong hoc h v s of this bao cao d l i tong hop
	*/
	@Override
	public void setTiLeTruongHocHVS(int tiLeTruongHocHVS) {
		_baoCaoDLITongHop.setTiLeTruongHocHVS(tiLeTruongHocHVS);
	}

	/**
	* Returns the ti le tram y te h v s of this bao cao d l i tong hop.
	*
	* @return the ti le tram y te h v s of this bao cao d l i tong hop
	*/
	@Override
	public int getTiLeTramYTeHVS() {
		return _baoCaoDLITongHop.getTiLeTramYTeHVS();
	}

	/**
	* Sets the ti le tram y te h v s of this bao cao d l i tong hop.
	*
	* @param tiLeTramYTeHVS the ti le tram y te h v s of this bao cao d l i tong hop
	*/
	@Override
	public void setTiLeTramYTeHVS(int tiLeTramYTeHVS) {
		_baoCaoDLITongHop.setTiLeTramYTeHVS(tiLeTramYTeHVS);
	}

	/**
	* Returns the so nguoi huong loi v s t x of this bao cao d l i tong hop.
	*
	* @return the so nguoi huong loi v s t x of this bao cao d l i tong hop
	*/
	@Override
	public int getSoNguoiHuongLoiVSTX() {
		return _baoCaoDLITongHop.getSoNguoiHuongLoiVSTX();
	}

	/**
	* Sets the so nguoi huong loi v s t x of this bao cao d l i tong hop.
	*
	* @param soNguoiHuongLoiVSTX the so nguoi huong loi v s t x of this bao cao d l i tong hop
	*/
	@Override
	public void setSoNguoiHuongLoiVSTX(int soNguoiHuongLoiVSTX) {
		_baoCaoDLITongHop.setSoNguoiHuongLoiVSTX(soNguoiHuongLoiVSTX);
	}

	/**
	* Returns the ke hoach phe duyet of this bao cao d l i tong hop.
	*
	* @return the ke hoach phe duyet of this bao cao d l i tong hop
	*/
	@Override
	public java.lang.String getKeHoachPheDuyet() {
		return _baoCaoDLITongHop.getKeHoachPheDuyet();
	}

	/**
	* Sets the ke hoach phe duyet of this bao cao d l i tong hop.
	*
	* @param keHoachPheDuyet the ke hoach phe duyet of this bao cao d l i tong hop
	*/
	@Override
	public void setKeHoachPheDuyet(java.lang.String keHoachPheDuyet) {
		_baoCaoDLITongHop.setKeHoachPheDuyet(keHoachPheDuyet);
	}

	/**
	* Returns the ngay duyet ke hoach of this bao cao d l i tong hop.
	*
	* @return the ngay duyet ke hoach of this bao cao d l i tong hop
	*/
	@Override
	public java.util.Date getNgayDuyetKeHoach() {
		return _baoCaoDLITongHop.getNgayDuyetKeHoach();
	}

	/**
	* Sets the ngay duyet ke hoach of this bao cao d l i tong hop.
	*
	* @param ngayDuyetKeHoach the ngay duyet ke hoach of this bao cao d l i tong hop
	*/
	@Override
	public void setNgayDuyetKeHoach(java.util.Date ngayDuyetKeHoach) {
		_baoCaoDLITongHop.setNgayDuyetKeHoach(ngayDuyetKeHoach);
	}

	/**
	* Returns the bao cao chuong trinh of this bao cao d l i tong hop.
	*
	* @return the bao cao chuong trinh of this bao cao d l i tong hop
	*/
	@Override
	public java.lang.String getBaoCaoChuongTrinh() {
		return _baoCaoDLITongHop.getBaoCaoChuongTrinh();
	}

	/**
	* Sets the bao cao chuong trinh of this bao cao d l i tong hop.
	*
	* @param baoCaoChuongTrinh the bao cao chuong trinh of this bao cao d l i tong hop
	*/
	@Override
	public void setBaoCaoChuongTrinh(java.lang.String baoCaoChuongTrinh) {
		_baoCaoDLITongHop.setBaoCaoChuongTrinh(baoCaoChuongTrinh);
	}

	/**
	* Returns the ngay dang tai of this bao cao d l i tong hop.
	*
	* @return the ngay dang tai of this bao cao d l i tong hop
	*/
	@Override
	public java.util.Date getNgayDangTai() {
		return _baoCaoDLITongHop.getNgayDangTai();
	}

	/**
	* Sets the ngay dang tai of this bao cao d l i tong hop.
	*
	* @param ngayDangTai the ngay dang tai of this bao cao d l i tong hop
	*/
	@Override
	public void setNgayDangTai(java.util.Date ngayDangTai) {
		_baoCaoDLITongHop.setNgayDangTai(ngayDangTai);
	}

	/**
	* Returns the nguoi lap of this bao cao d l i tong hop.
	*
	* @return the nguoi lap of this bao cao d l i tong hop
	*/
	@Override
	public java.lang.String getNguoiLap() {
		return _baoCaoDLITongHop.getNguoiLap();
	}

	/**
	* Sets the nguoi lap of this bao cao d l i tong hop.
	*
	* @param nguoiLap the nguoi lap of this bao cao d l i tong hop
	*/
	@Override
	public void setNguoiLap(java.lang.String nguoiLap) {
		_baoCaoDLITongHop.setNguoiLap(nguoiLap);
	}

	/**
	* Returns the nguoi duyet of this bao cao d l i tong hop.
	*
	* @return the nguoi duyet of this bao cao d l i tong hop
	*/
	@Override
	public java.lang.String getNguoiDuyet() {
		return _baoCaoDLITongHop.getNguoiDuyet();
	}

	/**
	* Sets the nguoi duyet of this bao cao d l i tong hop.
	*
	* @param nguoiDuyet the nguoi duyet of this bao cao d l i tong hop
	*/
	@Override
	public void setNguoiDuyet(java.lang.String nguoiDuyet) {
		_baoCaoDLITongHop.setNguoiDuyet(nguoiDuyet);
	}

	/**
	* Returns the so bao cao of this bao cao d l i tong hop.
	*
	* @return the so bao cao of this bao cao d l i tong hop
	*/
	@Override
	public java.lang.String getSoBaoCao() {
		return _baoCaoDLITongHop.getSoBaoCao();
	}

	/**
	* Sets the so bao cao of this bao cao d l i tong hop.
	*
	* @param soBaoCao the so bao cao of this bao cao d l i tong hop
	*/
	@Override
	public void setSoBaoCao(java.lang.String soBaoCao) {
		_baoCaoDLITongHop.setSoBaoCao(soBaoCao);
	}

	/**
	* Returns the ngay bao cao of this bao cao d l i tong hop.
	*
	* @return the ngay bao cao of this bao cao d l i tong hop
	*/
	@Override
	public java.util.Date getNgayBaoCao() {
		return _baoCaoDLITongHop.getNgayBaoCao();
	}

	/**
	* Sets the ngay bao cao of this bao cao d l i tong hop.
	*
	* @param ngayBaoCao the ngay bao cao of this bao cao d l i tong hop
	*/
	@Override
	public void setNgayBaoCao(java.util.Date ngayBaoCao) {
		_baoCaoDLITongHop.setNgayBaoCao(ngayBaoCao);
	}

	/**
	* Returns the trang thai of this bao cao d l i tong hop.
	*
	* @return the trang thai of this bao cao d l i tong hop
	*/
	@Override
	public int getTrangThai() {
		return _baoCaoDLITongHop.getTrangThai();
	}

	/**
	* Sets the trang thai of this bao cao d l i tong hop.
	*
	* @param trangThai the trang thai of this bao cao d l i tong hop
	*/
	@Override
	public void setTrangThai(int trangThai) {
		_baoCaoDLITongHop.setTrangThai(trangThai);
	}

	/**
	* Returns the luu tru pdf t h of this bao cao d l i tong hop.
	*
	* @return the luu tru pdf t h of this bao cao d l i tong hop
	*/
	@Override
	public int getLuuTruPdfTH() {
		return _baoCaoDLITongHop.getLuuTruPdfTH();
	}

	/**
	* Sets the luu tru pdf t h of this bao cao d l i tong hop.
	*
	* @param luuTruPdfTH the luu tru pdf t h of this bao cao d l i tong hop
	*/
	@Override
	public void setLuuTruPdfTH(int luuTruPdfTH) {
		_baoCaoDLITongHop.setLuuTruPdfTH(luuTruPdfTH);
	}

	/**
	* Returns the luu tru pdf of this bao cao d l i tong hop.
	*
	* @return the luu tru pdf of this bao cao d l i tong hop
	*/
	@Override
	public int getLuuTruPdf() {
		return _baoCaoDLITongHop.getLuuTruPdf();
	}

	/**
	* Sets the luu tru pdf of this bao cao d l i tong hop.
	*
	* @param luuTruPdf the luu tru pdf of this bao cao d l i tong hop
	*/
	@Override
	public void setLuuTruPdf(int luuTruPdf) {
		_baoCaoDLITongHop.setLuuTruPdf(luuTruPdf);
	}

	/**
	* Returns the luu tru csv of this bao cao d l i tong hop.
	*
	* @return the luu tru csv of this bao cao d l i tong hop
	*/
	@Override
	public int getLuuTruCsv() {
		return _baoCaoDLITongHop.getLuuTruCsv();
	}

	/**
	* Sets the luu tru csv of this bao cao d l i tong hop.
	*
	* @param luuTruCsv the luu tru csv of this bao cao d l i tong hop
	*/
	@Override
	public void setLuuTruCsv(int luuTruCsv) {
		_baoCaoDLITongHop.setLuuTruCsv(luuTruCsv);
	}

	@Override
	public boolean isNew() {
		return _baoCaoDLITongHop.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_baoCaoDLITongHop.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _baoCaoDLITongHop.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_baoCaoDLITongHop.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _baoCaoDLITongHop.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _baoCaoDLITongHop.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_baoCaoDLITongHop.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _baoCaoDLITongHop.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_baoCaoDLITongHop.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_baoCaoDLITongHop.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_baoCaoDLITongHop.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new BaoCaoDLITongHopWrapper((BaoCaoDLITongHop)_baoCaoDLITongHop.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLITongHop baoCaoDLITongHop) {
		return _baoCaoDLITongHop.compareTo(baoCaoDLITongHop);
	}

	@Override
	public int hashCode() {
		return _baoCaoDLITongHop.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLITongHop> toCacheModel() {
		return _baoCaoDLITongHop.toCacheModel();
	}

	@Override
	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLITongHop toEscapedModel() {
		return new BaoCaoDLITongHopWrapper(_baoCaoDLITongHop.toEscapedModel());
	}

	@Override
	public vn.dtt.sol.ns.baocaodli.dao.model.BaoCaoDLITongHop toUnescapedModel() {
		return new BaoCaoDLITongHopWrapper(_baoCaoDLITongHop.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _baoCaoDLITongHop.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _baoCaoDLITongHop.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_baoCaoDLITongHop.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof BaoCaoDLITongHopWrapper)) {
			return false;
		}

		BaoCaoDLITongHopWrapper baoCaoDLITongHopWrapper = (BaoCaoDLITongHopWrapper)obj;

		if (Validator.equals(_baoCaoDLITongHop,
					baoCaoDLITongHopWrapper._baoCaoDLITongHop)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public BaoCaoDLITongHop getWrappedBaoCaoDLITongHop() {
		return _baoCaoDLITongHop;
	}

	@Override
	public BaoCaoDLITongHop getWrappedModel() {
		return _baoCaoDLITongHop;
	}

	@Override
	public void resetOriginalValues() {
		_baoCaoDLITongHop.resetOriginalValues();
	}

	private BaoCaoDLITongHop _baoCaoDLITongHop;
}