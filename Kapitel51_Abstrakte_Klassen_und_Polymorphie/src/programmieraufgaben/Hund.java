package programmieraufgaben;

public class Hund extends Haustiere{

	public Hund(String name, double futtervorrat) {
		super(name, futtervorrat);
	}

	@Override
	public void sprich() {
		System.out.println("\nWuff!");
	}

	@Override
	public void friss() {
		futtervorrat -= 1.0;
		System.out.println(name + ": " + futtervorrat);
	}

}
