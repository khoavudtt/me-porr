package dtt.company.bean;

public class ThongTinTrung {

	String code = null;
	String name = null;
	String key;
	boolean selected = false;

	public ThongTinTrung(String code, String name, String key, boolean selected) {
		super();
		this.code = code;
		this.name = name;
		this.key = key;
		this.selected = selected;
	}

	public ThongTinTrung() {
		super();
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

}
