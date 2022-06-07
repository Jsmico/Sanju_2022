package PensionerDetails.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class PensionerDetails {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)

private long id;
private String name;
private String dob;
private double salaryearned;
private String aadhaarnumber;
private double pensionamount;
private double basicsalary;
private static final int fixedageByGovt=70;
private String pensioneraccountnumber;
private String pancard;
private String username;
private String password;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public double getSalaryearned() {
	return salaryearned;
}
public void setSalaryearned(double salaryearned) {
	this.salaryearned = salaryearned;
}
public String getAadhaarnumber() {
	return aadhaarnumber;
}
public void setAadhaarnumber(String aadhaarnumber) {
	this.aadhaarnumber = aadhaarnumber;
}
public double getPensionamount() {
	return pensionamount;
}
public void setPensionamount(double pensionamount) {
	this.pensionamount = pensionamount;
}
public double getBasicsalary() {
	return basicsalary;
}
public void setBasicsalary(double basicsalary) {
	this.basicsalary = basicsalary;
}
public String getPensioneraccountnumber() {
	return pensioneraccountnumber;
}
public void setPensioneraccountnumber(String pensioneraccountnumber) {
	this.pensioneraccountnumber = pensioneraccountnumber;
}
public String getPancard() {
	return pancard;
}
public void setPancard(String pancard) {
	this.pancard = pancard;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public static int getFixedagebygovt() {
	return fixedageByGovt;
}



}
