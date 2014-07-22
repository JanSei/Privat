package programmieraufgaben;

public class Katze extends Haustiere {

	public Katze(String name, double futtervorrat) {
		super(name, futtervorrat);
	}

	@Override
	public void sprich() {
		System.out.println("\nMiau!");
	}

	@Override
	public void friss() {
		futtervorrat -= 0.5;
		System.out.println(name + ": " + futtervorrat);
	}

}
