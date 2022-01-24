import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class CreditCard {
	@Id
	private int cid;
	private String brach;
	private String cardno;
	
  public int getCid() {
  return cid;}
  public void setCid(int cid) {
  this.cid = cid;}
  
  public String getBrach() {
  return brach;}
  public void setBrach(String brach) {
  this.brach = brach;}
  
  public String getCardno() {
  return cardno;}
  public void setCardno(String cardno) {
  this.cardno = cardno;}
  
@Override 
public String toString(){return "CreditCard [cid=" + cid + ", brach=" + brach + ", cardno=" + cardno + "]";}
	
  
  
	
}
