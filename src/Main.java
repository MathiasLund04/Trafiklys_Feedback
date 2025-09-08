import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Hvad tid på dagen er det? ");
        String time = scanner1.nextLine();
        System.out.println("Hvordan ser trafik mængden ud? ");
        String trafic = scanner1.nextLine();
        System.out.println("i hvilket områdetype er du? ");
        String areaType = scanner1.nextLine();
        System.out.println("Er det en nødsituation? ");
        boolean emergency = scanner1.nextBoolean();

        String lys;

        //Grønt Lys
        if(time.equalsIgnoreCase("dag") && trafic.equalsIgnoreCase("høj") || emergency){
            lys = "Grøn";
            System.out.println("Trafiklys status: " + lys + "Trafikken flyder fint");

        }
        //Gult Lys
        else if(time.equalsIgnoreCase("aften") || time.equalsIgnoreCase("nat") && trafic.equalsIgnoreCase("lav")){
            lys = "Gul";
            System.out.println("Trfiklys status: " + lys);
        }
        //Rødt Lys
        else if(time.equalsIgnoreCase("nat") && trafic.equalsIgnoreCase("høj") ){

        }

    }
}