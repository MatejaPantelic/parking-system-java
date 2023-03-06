package projekat;

public class Racun 
{
	private String brojKartice;
	private int verifikacioniKod;
	private int mesecIsteka;
	private int godinaIsteka;
	public String getBrojKartice() {
		return brojKartice;
	}
	public void setBrojKartice(String brojKartice) {
		this.brojKartice = brojKartice;
	}
	public int getVerifikacioniKod() {
		return verifikacioniKod;
	}
	public void setVerifikacioniKod(int verifikacioniKod) {
		this.verifikacioniKod = verifikacioniKod;
	}
	public int getMesecIsteka() {
		return mesecIsteka;
	}
	public void setMesecIsteka(int mesecIsteka) {
		this.mesecIsteka = mesecIsteka;
	}
	public int getGodinaIsteka() {
		return godinaIsteka;
	}
	public void setGodinaIsteka(int godinaIsteka) {
		this.godinaIsteka = godinaIsteka;
	}
	public Racun(String brojKartice, int mesecIsteka, int godinaIsteka) {
		super();
		this.brojKartice = brojKartice;
		this.mesecIsteka = mesecIsteka;
		this.godinaIsteka = godinaIsteka;
	}
	
	

}
