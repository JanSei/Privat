class Plaetzchen
{

  // Instanzvariablen
  String sorte;
  String groesse;
  String form;
  boolean istVerziert = false;

  // Instanzmethoden
  public void ausgeben()
  {
    String verzierung;
    if( istVerziert == true )
      verzierung = "ja";
    else
      verzierung = "nein";

    System.out.println(
    	  "Sorte"       + sorte   +
        ", Groesse "    + groesse +
        ", Form "       + form    +
        ", Verzierung " + verzierung );
    }
}

public class Chap25Ex2
{
  public static void main(String[] args)
  {
    // Ein Objekt der Klasse Plaetzchen erzeugen
    Plaetzchen plaetzchen1 = new Plaetzchen();

    // Die Eigeschaften des Objekts festlegen
    plaetzchen1.sorte   = "Kokos";
    plaetzchen1.groesse = "mittel";
    plaetzchen1.form    = "rund";

    System.out.println("+++ Plaetzchenliste +++\n");
    // Informationen über das Objekt abrufen
    plaetzchen1.ausgeben();

    // Ein weiteres Objekt der Klasse Plaetzchen erzeugen
    Plaetzchen plaetzchen2 = new Plaetzchen();

    // Die Eigenschaften des Objekts festlegen
    plaetzchen2.sorte     = "Affennuss";
    plaetzchen2.groesse   = "klein";
    plaetzchen2.form      = "rund";

    // Informationen über das Objekt abrufen
    plaetzchen2.ausgeben();

    // Ein weiteres Objekt der Klasse Plaetzchen erzeugen
    Plaetzchen plaetzchen3 = new Plaetzchen();

    // Die Eigenschaften des Objekts festlegen
    plaetzchen3.sorte      = "Honigkuchen";
    plaetzchen3.groesse    = "gross";
    plaetzchen3.form       = "rechteckig";
    plaetzchen3.istVerziert = true;

    // Informationen über das Objekt abrufen
    plaetzchen3.ausgeben();
  }
}