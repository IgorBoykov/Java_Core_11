package Task2;

public class Auto {

	public int horsePower;
	public int year;
	public Kermo kermo;
	public Engine engine;

	public Auto(int horsePower, int year, Kermo kermo, Engine engine) {
		super();
		this.horsePower = horsePower;
		this.year = year;
		this.kermo = kermo;
		this.engine = engine;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Kermo getKermo() {
		return kermo;
	}

	public void setKermo(Kermo kermo) {
		this.kermo = kermo;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Auto [horsePower=" + horsePower + ", year=" + year + ", kermo=" + kermo + ", engine=" + engine + "]";
	}

}
