import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="nagoor_Table")
@Embeddable
class Alien {
	@Id
	private int id;
	private alien_name name;
	@Column(name="section_name")
	private String section;
	
  public int getId() {
  return id;}
  
  public void setId(int id) {
  this.id = id;}
  
 

public alien_name getName() {
return name;}

public void setName(alien_name name) {
this.name = name;}

public String getSection() {
  return section;}
  public void setSection(String section) {
  this.section = section;}

@Override public String toString(){return "Alien [id=" + id + ", name=" + name + ", section=" + section + "]";}

  
	
}
