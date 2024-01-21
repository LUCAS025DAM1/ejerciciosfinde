package fcbarcelona;
import java.util.Scanner;

public class lol {

	public static void main(String[] args) {
	
		 Scanner scanner = new Scanner(System.in);

	        Receta receta = new Receta();

	        int opcion;
	        do {
	            System.out.println("\nMenú:");
	            System.out.println("1. Agregar ingrediente");
	            System.out.println("2. Eliminar ingrediente");
	            System.out.println("3. Agregar paso");
	            System.out.println("4. Mostrar receta");
	            System.out.println("5. Salir");
	            System.out.println("Ingrese su opción:");

	            opcion = scanner.nextInt();
	            scanner.nextLine();

	            switch (opcion) {
	                case 1:
	                    System.out.println("Ingrese el nombre del ingrediente:");
	                    String ingrediente = scanner.nextLine();
	                    receta.agregarIngrediente(ingrediente);
	                    break;
	                case 2:
	                    System.out.println("Ingrese el nombre del ingrediente a eliminar:");
	                    String ingredienteEliminar = scanner.nextLine();
	                    receta.eliminarIngrediente(ingredienteEliminar);
	                    break;
	                case 3:
	                    System.out.println("Ingrese el paso:");
	                    String paso = scanner.nextLine();
	                    receta.agregarPaso(paso);
	                    break;
	                case 4:
	                    receta.mostrarReceta();
	                    break;
	                case 5:
	                    System.out.println("Saliendo del programa.");
	                    break;
	                default:
	                    System.out.println("Opción no válida. Inténtelo de nuevo.");
	                    break;
	            }

	        } while (opcion != 5);

	        scanner.close();
	    }
	}
	
