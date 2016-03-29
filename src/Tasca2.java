/**
 * Created by Aaron Castells on 29/03/2016.
 */
public class Tasca2 {

    String[][] ciclistes = {
            {"Miguel","TEL"},
            {"Ramon","VOD"}
    };
    public static void main(String[] args){
        new Tasca2().inici();
    }

    void inici(){
        for(int i = 0; i < ciclistes.length; i++){
            System.out.print(funcioDorsal(ciclistes[i][0],i,ciclistes[i][1])+"\n");
        }
    }

    String funcioDorsal(String nom,int pos,String equip){
        return ""+nom.charAt(0)+nom.charAt(1)+nom.charAt(2)+pos+equip;
    }
}
