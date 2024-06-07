
public class WinsGame {
    public static void main(String[] args) {
        String[] jugadas = {"R", "S", "S", "R", "P", "S"};

        int puntuacionJugador1 = 0;
        int puntuacionJugador2 = 0;

        for (String jugada : jugadas) {
            if (jugada.equals("R") && jugadas[1].equals("S")) {
                puntuacionJugador1++;
            } else if (jugada.equals("S") && jugadas[1].equals("P")) {
                puntuacionJugador1++;
            } else if (jugada.equals("P") && jugadas[1].equals("R")) {
                puntuacionJugador1++;
            } else {
                puntuacionJugador2++;
            }
        }

        if (puntuacionJugador1 > puntuacionJugador2) {
            System.out.println("Player 1 wins");
        } else if (puntuacionJugador2 > puntuacionJugador1) {
            System.out.println("Player 2 wins");
        } else {
            System.out.println("Tie");
        }
    }
}