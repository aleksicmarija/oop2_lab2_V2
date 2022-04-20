package revija;

public class Odeca extends Nosivo {
	private String naziv;
	private Velicina vel;

	public Odeca(String n,Velicina v) {
		this.naziv = n;
		this.vel = v;
		// TODO Auto-generated constructor stub
	}
	
	public String dohvNaziv() {
		return naziv;
	}
	
	public Velicina dohvVelicinu() {
		return vel;
	}

	@Override
	public boolean odgovara(Model m) {
		if ((this.vel.manja(m.dohvVelicinu()))) {
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("odeća " + naziv + " " + vel);
		return sb.toString();
	}
	
}
