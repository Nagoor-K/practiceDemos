import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Teacher {
	@Id
	private int tid;
	private String tname;
	private int salary;
	
  public int getTid() {
  return tid;}
  public void setTid(int tid) {
  this.tid = tid;}
  
  public String getTname() {
  return tname;}
  public void setTname(String tname) {
  this.tname = tname;}
  
  public int getSalary() {
  return salary;}
  public void setSalary(int salary) {
  this.salary = salary;}
@Override
public String toString(){return "Teacher [tid=" + tid + ", tname=" + tname + ", salary=" + salary + "]";}
	
  
	
}
