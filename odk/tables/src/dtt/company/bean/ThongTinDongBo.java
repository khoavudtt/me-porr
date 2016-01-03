package dtt.company.bean;

public class ThongTinDongBo {
	private String err;
	private int tongdaunoinuoc;
	private int tongvesinh;
	private int tongcongtrinh;
	private int khonghoplenuoc;
	private int khonghoplevesinh;
	private int khonghoplecc;
	private int checkloai;
	private int tongguinuoc;
	private int tongguivesinh;
	private int tongguicongtrinh;
	private int tongguicongtrinhtruong;

	public ThongTinDongBo() {
		super();
		this.err = null;
		this.tongvesinh = 0;
		this.tongdaunoinuoc = 0;
		this.tongcongtrinh = 0;
		this.khonghoplecc = 0;
		this.khonghoplenuoc = 0;
		this.khonghoplevesinh = 0;

	}

	public String getErr() {
		return err;
	}

	public int getTongguinuoc() {
		return tongguinuoc;
	}

	public void setTongguinuoc(int tongguinuoc) {
		this.tongguinuoc = tongguinuoc;
	}

	public int getTongguicongtrinhtruong() {
		return tongguicongtrinhtruong;
	}

	public void setTongguicongtrinhtruong(int tongguicongtrinhtruong) {
		this.tongguicongtrinhtruong = tongguicongtrinhtruong;
	}

	public int getTongguivesinh() {
		return tongguivesinh;
	}

	public void setTongguivesinh(int tongguivesinh) {
		this.tongguivesinh = tongguivesinh;
	}

	public int getTongguicongtrinh() {
		return tongguicongtrinh;
	}

	public void setTongguicongtrinh(int tongguicongtrinh) {
		this.tongguicongtrinh = tongguicongtrinh;
	}

	public void setErr(String err) {
		this.err = err;
	}

	public int getTongdaunoinuoc() {
		return tongdaunoinuoc;
	}

	public void setTongdaunoinuoc(int tongdaunoinuoc) {
		this.tongdaunoinuoc = tongdaunoinuoc;
	}

	public int getTongvesinh() {
		return tongvesinh;
	}

	public void setTongvesinh(int tongvesinh) {
		this.tongvesinh = tongvesinh;
	}

	public int getTongcongtrinh() {
		return tongcongtrinh;
	}

	public int getKhonghoplenuoc() {
		return khonghoplenuoc;
	}

	public int getCheckloai() {
		return checkloai;
	}

	public void setCheckloai(int checkloai) {
		this.checkloai = checkloai;
	}

	public void setKhonghoplenuoc(int khonghoplenuoc) {
		this.khonghoplenuoc = khonghoplenuoc;
	}

	public int getKhonghoplevesinh() {
		return khonghoplevesinh;
	}

	public void setKhonghoplevesinh(int khonghoplevesinh) {
		this.khonghoplevesinh = khonghoplevesinh;
	}

	public int getKhonghoplecc() {
		return khonghoplecc;
	}

	public void setKhonghoplecc(int khonghoplecc) {
		this.khonghoplecc = khonghoplecc;
	}

	public void setTongcongtrinh(int tongcongtrinh) {
		this.tongcongtrinh = tongcongtrinh;
	}

}
