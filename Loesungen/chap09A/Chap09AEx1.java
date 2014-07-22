public class Chap09AEx1
{
  public static void main(String[] args)
  {
    long   gearbeiteteStunden;
    double stundenLohn, steuerSatz;

    gearbeiteteStunden = 40;
    stundenLohn        = 10.0;
    steuerSatz         = 0.10;

    System.out.println(
      "Arbeitszeit: " + gearbeiteteStunden );
    System.out.println(
      "Bruttolohn: " + (gearbeiteteStunden * stundenLohn) );
    System.out.println(
	    "Steuerbetrag: " +
	    (gearbeiteteStunden * stundenLohn * steuerSatz) );
  }
}