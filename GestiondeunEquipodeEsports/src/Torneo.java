import java.util.Scanner;

public class Torneo {

    public static void simularTorneo(Jugador[] equipo, Jugador[] oponentes) {
        Scanner scanner = new Scanner(System.in);

        int victorias = 0;

        for (int partida = 1; partida <= 3; partida++) {
            System.out.println("\nPartida " + partida + " del torneo");

            // Para cada jugador se toma una decisión
            for (Jugador jugador : equipo) {
                System.out.println("Decide qué debería hacer " + jugador.nombre + " (" + jugador.rol + "):");
                System.out.println("1. Jugar de manera agresiva");
                System.out.println("2. Jugar de manera defensiva");

                int decision = scanner.nextInt();

                if (decision == 1 && jugador.nivelHabilidad >= 70) {
                    System.out.println(jugador.nombre + " ha tenido éxito jugando de manera agresiva.");
                    victorias++;
                } else if (decision == 2 && jugador.nivelHabilidad >= 60) {
                    System.out.println(jugador.nombre + " ha tenido éxito jugando de manera defensiva.");
                    victorias++;
                } else {
                    System.out.println(jugador.nombre + " ha fallado en su rol.");
                }
            }

            // Verificar el resultado de la partida
            if (victorias < 3) {
                System.out.println("El equipo ha perdido la partida " + partida + " y ha sido descalificado del torneo.");
                System.out.println("Fin del programa.");
                return; // Terminar el programa si el equipo pierde
            } else {
                System.out.println("El equipo ha ganado la partida " + partida + ".");
            }

            victorias = 0;  // Reiniciar el contador de victorias para la siguiente partida
        }

        System.out.println("¡Felicidades! El equipo ha ganado el torneo.");
    }
}
