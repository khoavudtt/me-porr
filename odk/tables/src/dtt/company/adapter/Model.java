package dtt.company.adapter;

public class Model {
	private String name;
	private boolean selected;

	public Model(String name) {

		this.name = name;
	}

	public Model(String name, boolean check) {

		this.name = name;
		this.selected = check;
	}

	public String getName() {
		return name;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}
}