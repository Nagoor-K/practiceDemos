
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Student {
	@Id
	private int sid;
	private String sname;
	private int mark;
	@OneToMany(mappedBy = "student", fetch = FetchType.EAGER)
	private List<Laptop> laptop=new ArrayList<Laptop>();
	
	
  
  
public List<Laptop> getLaptop() {
  return laptop;}
  public void setLaptop(List<Laptop> laptop) {
  this.laptop = laptop;}
  
public int getSid() {
  return sid;}
  public void setSid(int sid) {
  this.sid = sid;}
  
  public String getSname() {
  return sname;}
  public void setSname(String sname) {
  this.sname = sname;}
  
  public int getMark() {
  return mark;}
  public void setMark(int mark) {
  this.mark = mark;}
@Override public String toString(){return "Student [sid=" + sid + ", sname=" + sname + ", mark=" + mark + ", laptop=" + laptop + "]";}
  
	
	
}
