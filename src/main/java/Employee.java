import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Employee {
	@Id
	private int eid;
	private String ename;
	private String contact;
	@ManyToMany(mappedBy = "employee")
	private List<Company> company=new ArrayList<Company>(00);
	
  public int getEid() {
  return eid;}
  public void setEid(int eid) {
  this.eid = eid;}
  
  public String getEname() {
  return ename;}
  public void setEname(String ename) {
  this.ename = ename;}
  
  public String getContact() {
  return contact;}
  public void setContact(String contact) {
  this.contact = contact;}
  
	public List<Company> getCompany() {
	return company;}
	public void setCompany(List<Company> company) {
	this.company = company;}
  
  
  
  
	
}
