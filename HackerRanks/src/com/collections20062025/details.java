package com.collections20062025;

public class details {

	private Integer Studentid;
	private String StudentName;
	private String StudneAddress;
	public Integer getStudentid() {
		return Studentid;
	}
	public void setStudentid(Integer studentid) {
		Studentid = studentid;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getStudneAddress() {
		return StudneAddress;
	}
	public void setStudneAddress(String studneAddress) {
		StudneAddress = studneAddress;
	}
	details(Integer studentid, String studentName, String studneAddress) {
		super();
		Studentid = studentid;
		StudentName = studentName;
		StudneAddress = studneAddress;
	}
	@Override
	public String toString() {
		return "details [Studentid=" + Studentid + ", StudentName=" + StudentName + ", StudneAddress=" + StudneAddress
				+ "]";
	}
	

}
