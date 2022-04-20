package revija;

public class Velicina {
	
	public enum Oznaka {S, M, L};
	private Oznaka oznaka;

	public Velicina(Oznaka o) {
		this.oznaka = o;
	}
	
	public boolean manja(Velicina v) {
		if (v.oznaka == oznaka.L && this.oznaka != oznaka.L) {
			return true;
		}
		if (v.oznaka != oznaka.S && this.oznaka == Oznaka.S) {
			return true;
		}
		return false;
	}
	
	public Oznaka dohvOznaku() {
		return oznaka;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.oznaka);
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
