package org.union.minerva.agent.dto;

public class AgentDTO {
	private String id;
	private String name;
	private int age;
	private String addr;
	private String division;
	private String class_no;
	public AgentDTO(){
		this("","",0,"","","");
	}
	public AgentDTO(String id, String name, int age, String addr, String division, String class_no) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
		this.age=age;
		this.addr=addr;
		this.division=division;
		this.class_no=class_no;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public String getClass_no() {
		return class_no;
	}
	public void setClass_no(String class_no) {
		this.class_no = class_no;
	}
	@Override
	public String toString() {
		return "AgentDTO [id=" + id + ", name=" + name + ", age=" + age + ", addr=" + addr + ", division=" + division
				+ ", class_no=" + class_no + "]";
	}
	
}
