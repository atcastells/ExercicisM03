import java.util.Scanner;

/**
 * Created by Aaron Castells on 29/03/2016.
 */
public class Tasca1 {
    public static void main(String[] args){
        new Tasca1().inici();
    }

    void inici(){
        System.out.print(entrarText("Introdueix una cadena de text: "));
    }

    String entrarText(String text){
        Scanner sc = new Scanner(System.in);
        System.out.print(text+": ");
        String newString = sc.nextLine();
        if(newString.equalsIgnoreCase("")){
            System.out.print("Introdueix una cadena de text que no estiguí buida.\n");
            return entrarText(text);
        }
        return newString;
    }
}
