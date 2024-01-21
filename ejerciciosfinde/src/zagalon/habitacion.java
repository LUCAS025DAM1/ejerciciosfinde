package zagalon;
import java.util.Scanner;

public class habitacion {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número de habitaciones en el hotel:");
        int numHabitaciones = scanner.nextInt();
        habitacion hotel=new habitacion();

        int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Mostrar disponibilidad");
            System.out.println("2. Reservar habitación");
            System.out.println("3. Cancelar reserva");
            System.out.println("4. Salir");
            System.out.println("Ingrese su opción:");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    hotel.mostrarDisponibilidad();
                    break;
                case 2:
                    System.out.println("Ingrese el número de habitación a reservar:");
                    int numReserva = scanner.nextInt();
                    hotel.reservarHabitacion(numReserva);
                    break;
                case 3:
                    System.out.println("Ingrese el número de habitación a cancelar:");
                    int numCancelacion = scanner.nextInt();
                    hotel.cancelarReserva(numCancelacion);
                    break;
                case 4:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
                    break;
            }

        } while (opcion != 4);

        scanner.close();
    }

	private void cancelarReserva(int numCancelacion) {
		// TODO Auto-generated method stub
		
	}

	private void reservarHabitacion(int numReserva) {
		// TODO Auto-generated method stub
		
	}

	private void mostrarDisponibilidad() {
		// TODO Auto-generated method stub
		
	}
}


