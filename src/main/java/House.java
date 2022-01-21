import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY,region="department")
public class House {
	@Id
	private int hid;
	private String place;
	
  public int getHid() {
  return hid;}
  public void setHid(int hid) {
  this.hid = hid;}
  
  public String getPlace() {
  return place;}
  public void setPlace(String place) {
  this.place = place;}
  
  @Override 
  public String toString(){return "House [hid=" + hid + ", place=" + place + "]";}	
  
  
}
