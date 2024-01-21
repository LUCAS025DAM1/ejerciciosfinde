package elespi;
import java.util.Scanner;
public class RelojAlarma {
	private String horaalarmaa;
    private String horaactualll;
    private boolean alarmaactivadaXD;
    
    public RelojAlarma(){
        Scanner scanner = new Scanner(System.in);
 
        
        System.out.print("Introduce la hora de alarma (formato HH:mm): ");
        String nuevaHoraAlarma = scanner.next();
        this.horaalarmaa = nuevaHoraAlarma;
 
        
        System.out.print("Introduce la hora actual (formato HH:mm): ");
        String nuevaHoraActual = scanner.next();
        this.horaactualll = nuevaHoraActual;
 
        
        this.alarmaactivadaXD = true;
 
        
        scanner.close();
    }
    
    public String gethoraalarmaa() {
        return horaalarmaa;
    }
 
    public String getHoraActual() {
        return horaactualll;
    }
 
    public boolean isalarmaactivadaXD() {
        return alarmaactivadaXD;
    }
 
    public void sethoraalarmaa(String nuevaHoraAlarma) {
        this.horaalarmaa = nuevaHoraAlarma;
    }
 
    public void sethoraactualll(String nuevaHoraActual) {
        this.horaactualll = nuevaHoraActual;
    }
 
    public void setalarmaactivada(boolean alarmaActivada) {
        this.alarmaactivadaXD = alarmaActivada;
    }
 
    public void comprobarAlarma() {
        if (horaactualll.equals(horaalarmaa) && alarmaactivadaXD) {
            System.out.println("¡Venga bro, es hora de levantarte!");
        } else {
            System.out.println("Todavía tienes tiempo de dormir crack, la alarma no ha sonado.");
        }
    }
}
 


