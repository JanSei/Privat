
public class GradInBogenmass {

	public static void main(String[] args) {
		
		double grad, bogenmass, sinx, cosx, ergebnis;
		grad = 30;
		bogenmass = grad * Math.PI/180;
		
		System.out.println( + grad + 
				" Grad in Bogenmass sind: " + bogenmass);
		sinx = Math.sin( bogenmass );
		cosx = Math.cos( bogenmass );
		ergebnis = (Math.pow(sinx, 2)) + (Math.pow(cosx,2));
		
		System.out.println("Sinus: " + sinx 
				+ "\nCosinus: " + cosx + "\nErgebnis: " + ergebnis);
		
		
	}

}
