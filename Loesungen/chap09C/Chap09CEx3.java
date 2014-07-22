class Chap09CEx3
{
  public static void main ( String[] args )
  {
    String erster = new String("    In einem Loch    in der Erde, da lebte ein Hobbit.   ");
    String zweiter;

    int laenge1, laenge2;

    laenge1 = erster.length();
    System.out.println("Die Laenge ist: " + laenge1 );  //  -> 57
    
    zweiter = erster.trim();
    System.out.println( zweiter );  
    	
    laenge2 = zweiter.length();
    System.out.println("Die Laenge ist: " + laenge2 );  // //  -> 50
        
  }
}
