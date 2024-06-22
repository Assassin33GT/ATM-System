package investmentt1234;

public class anualinvestment {
	investor a;
	public anualinvestment( investor a ) {
		this.a=a;
	}
	public double anual_bonus() {
		return a.balance=(a.balance+(a.balance/20));
		}
	public double monthy_bonus() {
		return a.balance=(a.balance+(a.balance/40));
	}
}
