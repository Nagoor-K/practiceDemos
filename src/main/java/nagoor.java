import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
class Alien {
	@Id
	private int id;
	private String fname;
	private String lname;
	private String section;
	
  public int getId() {
  return id;}
  
  public void setId(int id) {
  this.id = id;}
  public String getFname() {
  return fname;}
  public void setFname(String fname) {
  this.fname = fname;}
  public String getLname() {
  return lname;}
  public void setLname(String lname) {
  this.lname = lname;}
  public String getSection() {
  return section;}
  public void setSection(String section) {
  this.section = section;}
	
}
