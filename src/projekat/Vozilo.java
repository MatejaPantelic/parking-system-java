package projekat;

public class Vozilo 
{
	private String proizvodjac;
	private String model;
	private String boja;
	private String registracija;
	private String tip;
	public String getProizvodjac() {
		return proizvodjac;
	}
	public void setProizvodjac(String proizvodjac) {
		this.proizvodjac = proizvodjac;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getBoja() {
		return boja;
	}
	public void setBoja(String boja) {
		this.boja = boja;
	}
	public String getRegistracija() {
		return registracija;
	}
	public void setRegistracija(String registracija) {
		this.registracija = registracija;
	}
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
	
	public Vozilo() {
		super();
	}
	public Vozilo(String proizvodjac, String model, String boja, String registracija, String tip) {
		super();
		this.proizvodjac = proizvodjac;
		this.model = model;
		this.boja = boja;
		this.registracija = registracija;
		this.tip = tip;
	}
	
	
	
}
