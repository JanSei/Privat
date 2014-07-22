import java.util.*;

//Hier sind die Regeln für das Würfelspiel:
//
//    Das Spiel besteht aus mehreren "Runden".
//    In jeder Runde spielt der Computer zuerst, indem er zwei 6-seitige Würfel wirft und die Punkte addiert.
//    Der Spieler muss jetzt versuchen diese Summe zu übertreffen.
//    Der Spieler kann zwischen zwei 6-seitigen oder einem 11-seitigen Würfel, dessen Seiten von 2 bis 12 nummeriert sind, wählen.
//    Wenn der Wurf des Spielers den Computer schlägt, dann hat der Spieler die Runde gewonnen. Ansonsten gewinnt der Computer die Runde.
//    Das Spiel wird fortgesetzt, bis entweder der Spieler oder der Computer zehn Runden gewonnen hat.

public class WuerfelWahlProgramm {

	private static Scanner scan;

	public static void main(String[] args) {

		// Deklarieren und Initialisieren
		final int ENDSTAND = 10;
		scan = new Scanner(System.in);
		Random rand = new Random();
		int spielerscore = 0, computerscore = 0;
		int spielerwurf = 0, computerwurf = 0;

		// Runden spielen, bis einer der Spieler den ENDSTAND erreicht hat
		while (spielerscore < ENDSTAND && computerscore < ENDSTAND) {

			// Computer wirft
			computerwurf = rand.nextInt(6) + 1 + rand.nextInt(6) + 1;
			System.out.println("Der Computer wirft: " + computerwurf);

			// Spieler wirft
			System.out
					.print("1 -> 11-seitiger Wuerfel | 2 -> 6-seitiger Wuerfel (1 oder 2)? ");
			String wuerfeltyp = scan.nextLine();

			if (!(wuerfeltyp.equals("1") | wuerfeltyp.equals("2")))
				System.out
						.println("Was ist das den für ein Würfel?! Ein Etherischen? \n");
			else {
				if (wuerfeltyp.equals("1")) {

					spielerwurf = rand.nextInt(11) + 2;
					System.out.println("Sie werfen 1 Wuerfel und haben: "
							+ spielerwurf);
				} else if (wuerfeltyp.equals("2")) {

					spielerwurf = rand.nextInt(6) + 1 + rand.nextInt(6) + 1;
					System.out.println("Sie werfen 2 Wuerfel und haben: "
							+ spielerwurf);
				}

				// Gewinner der Runde bestimmen und den Score anpassen
				if (spielerwurf > computerwurf) {

					spielerscore = spielerscore + 1;
					System.out.println("Sie haben die Runde gewonnen!");
				} else if (computerwurf > spielerwurf) {

					computerscore = computerscore + 1;
					System.out.println("Sie haben die Runde verloren!");
				} else if (spielerwurf == computerwurf) {

					spielerscore += 0;
					computerscore += 0;
					System.out
							.println("Unetschieden! Noch eine Runde, bitte! :)");
				}
				System.out.println("Score: Computer " + computerscore
						+ ", Sie " + spielerscore + "\n");
			}
		}

		// Gewinner des Spiels bestimmen
		System.out.println("Endstand: Computer " + computerscore + ", Sie "
				+ spielerscore);

		if (computerscore > spielerscore)
			System.out.println("Der Computer hat das Spiel gewonnen!");
		else
			System.out.println("Sie haben das Spiel gewonnen!");

	}
}