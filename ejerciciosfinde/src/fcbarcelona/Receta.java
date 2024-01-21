package fcbarcelona;
import java.util.ArrayList;


public class Receta {
	private ArrayList<String> ingredientes;
    private ArrayList<String> pasos;

    public Receta() {
        ingredientes = new ArrayList<>();
        pasos = new ArrayList<>();
    }

    public void agregarIngrediente(String ingrediente) {
        ingredientes.add(ingrediente);
    }

    public void eliminarIngrediente(String ingrediente) {
        ingredientes.remove(ingrediente);
    }

    public void agregarPaso(String paso) {
        pasos.add(paso);
    }

    public void mostrarReceta() {
        System.out.println("Receta:");
        System.out.println("Ingredientes:");
        for (String ingrediente : ingredientes) {
            System.out.println("- " + ingrediente);
        }
        System.out.println("\nPasos:");
        for (int i = 0; i < pasos.size(); i++) {
            System.out.println((i + 1) + ". " + pasos.get(i));
        }
    }
}


