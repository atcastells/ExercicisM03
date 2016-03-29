/**
 * Created by Aaron Castells on 29/03/2016.
 */
public class Tasca4 {

    String[][] equips = {
            {"ONZ", "ONZE"}
            ,{"TNK", "Tinkof"}
            ,{"BCH", "Biancho"}
            ,{"BRW", "Bartoloworld"}
            ,{"MVX", "Movixtar"}
            ,{"BIC", "Bich"}
            ,{"CFD", "Cofidos"}
            ,{"FON", "Fono"}
            ,{"MTX", "Matrix"}
    };

    int[] inscrits = {4,3,1,2,5,2,3,5,0};

    public static void main(String[] args){
        new Tasca4().inici();
    }
    void inici(){
        mostrarLlistaEquips();
    }

    void mostrarLlistaEquips(){
        String titol = "\tCODI EQUIP\t\tCICLISTES INSCRITS";
        System.out.print(titol+"\n");
        for(int i = 0; i < titol.length(); i++){
            System.out.print("-");
        }
        System.out.print("\n");
        for(int i = 0; i < equips.length; i++){
            for(int j = 0; j < equips[1].length; j++){
                System.out.print(equips[i][j]+"  ");
            }
            System.out.print("\t\t\t\t"+inscrits[i]+"\n");
        }

    }
}
