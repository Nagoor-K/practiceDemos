import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Student {
	@Id
	private int sid;
	private String sname;
	private int mark;
	@ManyToMany
	private List<Laptop> laptops=new ArrayList<Laptop>();
	
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
  
	
  public List<Laptop> getLaptops() {
  return laptops;}
  public void setLaptops(List<Laptop> laptops) {
  this.laptops = laptops;}
  
  
	
	
}
