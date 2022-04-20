package revija;

public class Model {
	private Velicina vel;
	private static int genID = 0;
	private int Id = ++genID;
	
	public Model(Velicina v) {
		this.vel = v;
	}

	public Velicina dohvVelicinu() {
		return vel;
	}

	public int dohvId() {
		return Id;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Model" + this.Id + "(" + this.vel + ")");
		return sb.toString();
	}

}
