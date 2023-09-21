package model;

public abstract class Mitarbeiter {
	private int id;
	private String name;
	
	protected Mitarbeiter(int id, String name) {
		this.setId(id);
		this.setName(name);
	}

	protected Mitarbeiter() {}
		
	public abstract double einkommen();
	
	@Override
	public String toString() {
		return "Mitarbeiter [id=" + getId() + ", name=" + getName() + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
