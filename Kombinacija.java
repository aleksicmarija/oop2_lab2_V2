package revija;
import java.util.ArrayList;


public class Kombinacija {
	private int kap;
	private ArrayList<Nosivo> listaStvari;
	private int br = 0;

	public Kombinacija(int k) {
		this.kap = k;
		this.listaStvari = new ArrayList<>();
	}
	
	public void dodaj(Nosivo n) throws GDodavanje {
		if (br == kap) {
			throw new GDodavanje();
		}
		listaStvari.add(n);
		br++;
	}
	
	public int dohvBrStvari() {
		return br;
	}
	
	public int dohvMaxBrStvari() {
		return kap;
	}
	
	public Nosivo dohvStvar(int i) throws GIndeks {
		if ((i > (kap-1)) || i > (br-1)) throw  new GIndeks();
		return listaStvari.get(i);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (Nosivo n:listaStvari) {
			sb.append(n);
			if (listaStvari.indexOf(n) != listaStvari.size()-1) {
				sb.append(",");
			}
		}
		sb.append("]");
		return sb.toString();
	}
	
}
