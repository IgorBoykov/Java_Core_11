package Task2;

public class Engine {

	public int tsilindres;

	public Engine(int tsilindres) {
		super();
		this.tsilindres = tsilindres;
	}

	public int getTsilindres() {
		return tsilindres;
	}

	public void setTsilindres(int tsilindres) {
		this.tsilindres = tsilindres;
	}

	@Override
	public String toString() {
		return "Engine [tsilindres=" + tsilindres + "]";
	}

}
