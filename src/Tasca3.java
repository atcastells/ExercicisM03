/**
 * Created by Aaron Castells on 29/03/2016.
 */
public class Tasca3 {

    String[][] etapes = {
            {"Etapa 1","Barcelona", "Girona","Plana"}
            ,{"Etapa 2","Girona", "Berga", "Muntanya"}
            ,{"Etapa 3","Berga", "Sort", "Alta muntanya"}
            ,{"Etapa 4","Sort", "Balaguer", "Alta muntanya"}
            ,{"Etapa 5","Balaguer", "Amposta", "Plana"}
            ,{"Etapa 6","Amposta", "Manresa", "Plana"}
            ,{"Etapa 7","Manresa", "Mataró", "Muntanya"}
    };

    double[] distanciaEtapa ={185.2, 191.8, 156.6, 188.4, 195.4, 194.1, 126.6};

    public static void main(String[] args){
        new Tasca3().inici();
    }

    void inici(){
        System.out.print(posEtapaMesLlarga()+"\n");
        System.out.print (informacio(posEtapaMesLlarga()));
    }

    int posEtapaMesLlarga(){
        double temp = 0;
        int pos = 0;
        for(int i = 0; i < distanciaEtapa.length; i++){
            if(temp < distanciaEtapa[i]){
                temp = distanciaEtapa[i];
                pos = i;
            }
        }
        return pos;
    }

    String informacio(int x){
        String informacio = "";
        for(int i = 0; i < etapes[1].length; i++){
        informacio += etapes[x][i] + "\t";
        }
        return informacio;
    }
}
