import java.util.Scanner;

public class EquipoEsports {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Jugador[] equipo = {
                new Top("Juan"),
                new Jungla("Luis"),
                new Mid("Carlos"),
                new ADC("Ana"),
                new Support("Marta")
        };

        Jugador[] oponentes = {
                new Top("EnemigoTop"),
                new Jungla("EnemigoJungla"),
                new Mid("EnemigoMid"),
                new ADC("EnemigoADC"),
                new Support("EnemigoSupport")
        };

        boolean continuarEntrenando = true;

        while (continuarEntrenando) {
            System.out.println("¿Qué deseas hacer?");
            System.out.println("1. Ver estadísticas del equipo");
            System.out.println("2. Entrenar jugadores");
            System.out.println("3. Entrar al torneo");
            System.out.println("4. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    for (Jugador jugador : equipo) {
                        jugador.mostrarEstadisticas();
                    }
                    break;

                case 2:
                    System.out.println("Selecciona al jugador que quieres entrenar:");
                    for (int i = 0; i < equipo.length; i++) {
                        System.out.println((i + 1) + ". " + equipo[i].nombre);
                    }
                    int jugadorSeleccionado = scanner.nextInt() - 1;
                    equipo[jugadorSeleccionado].entrenar();
                    break;

                case 3:
                    continuarEntrenando = false;
                    Torneo.simularTorneo(equipo, oponentes);
                    break;

                case 4:
                    continuarEntrenando = false;
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
