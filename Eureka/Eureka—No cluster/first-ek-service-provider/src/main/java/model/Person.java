package model;

public class Person {

	private int personId;
	private String personName;
	private int year;
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Person(int personId, String personName, int year) {
		this.personId = personId;
		this.personName = personName;
		this.year = year;
	}
	
	
}
