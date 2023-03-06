package projekat;

public class Korisnik extends Osoba
{
	private String korisnickoIme;
	private String lozinka;
	private Racun racun;
	private Vozilo vozilo;

	public Racun getRacun() {
		return racun;
	}
	public void setRacun(Racun racun) {
		this.racun = racun;
	}
	public Vozilo getVozilo() {
		return vozilo;
	}
	public void setVozilo(Vozilo vozilo) {
		this.vozilo = vozilo;
	}
	public String getKorisnickoIme() {
		return korisnickoIme;
	}
	public void setKorisnickoIme(String korisnickoIme) {
		this.korisnickoIme = korisnickoIme;
	}
	public String getLozinka() {
		return lozinka;
	}
	public void setLozinka(String lozinka) {
		this.lozinka = lozinka;
	}
	
	
	
	public Korisnik(String ime,String Prezime, boolean pol, String telefon,String korisnickoIme, String lozinka, Racun racun, Vozilo vozilo) {
		super();
		this.ime=ime;
		this.Prezime=Prezime;
		this.pol=pol;
		this.telefon=telefon;
		this.korisnickoIme = korisnickoIme;
		this.lozinka = lozinka;
		this.racun = racun;
		this.vozilo = vozilo;
	}
	@Override
	public String toString() 
	{
		return "Ime: "+ime+"\tPrezime: "+Prezime+"\tPol: "+pol+"\tTelefon: "+telefon+"\tKorisnicko ime: "+korisnickoIme+"\tLozinka: "+lozinka+
				"\tBroj racuna: "+racun.getBrojKartice()+"\tVozilo: "+vozilo.getProizvodjac()+" "+vozilo.getModel()+"\tRegistracija: "+vozilo.getRegistracija();
	}
	
	public String StampajPriznanicu()
	{
		return "Elektronska priznanica\n\n"
				+"Ime uplatioca: "+ime+"\nPrezime uplatioca: "+Prezime+"\nKontakt telefon: "+telefon+"\n----------------------\nMarka vozila: "+vozilo.getProizvodjac()+"\nModel: "+vozilo.getModel()+"\nRegistarske tablice: "+vozilo.getRegistracija()+"\n----------------------\n";
	}
	
	

}
