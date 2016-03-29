import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Aaron Castells on 29/03/2016.
 */
public class ExercicisVoltaCiclista {
    public static void main(String[] args){
    new ExercicisVoltaCiclista().inici();

    }

    void inici(){
        System.out.print(entrarUnNumero("Introdueix una xifra: "));

    }

    double entrarUnNumero(String missatge) {
        Scanner sc = new Scanner(System.in);
        try {System.out.print(missatge);
            return sc.nextDouble();
        } catch (InputMismatchException e) {
            System.out.print("Error d'entrada, introdueix una xifra!\n");
            return (entrarUnNumero(missatge));
        }
    }
}
