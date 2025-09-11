import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Hvad tid på dagen er det? (dag, aften, nat)");
        String time = scanner1.nextLine();

        System.out.println("Hvordan ser trafik mængden ud? (høj, lav) ");
        String traffic = scanner1.nextLine();

        System.out.println("i hvilket områdetype er du? (bolig, erhverv, blandet) ");
        String areaType = scanner1.nextLine();

        System.out.println("Er det en nødsituation? (ja, nej)");
        String emergency = scanner1.nextLine();

        boolean emergencyAnswer = false;
        String lights = "";
        String access = "";
                // Gør så man kan svare ja/nej istedet for True/false
        if (emergency.equalsIgnoreCase("ja")) {
            emergencyAnswer = true;
        }
        else if (emergency.equalsIgnoreCase("nej")) {
            emergencyAnswer = false;
        }

        switch(time) {
            case "dag":
                if (traffic.equalsIgnoreCase("lav")) {
                    lights = "Grønt";
                    break;
        }
            case "aften":
                lights = "Gul";
                    break;
            case "nat":
                if(traffic.equalsIgnoreCase("høj")) {
                    lights = "Rødt";
                }
                else {
                    lights = "Gult";
                }
                break;

        }
        if(areaType.equalsIgnoreCase("bolig") && traffic.equalsIgnoreCase("høj")) {
            lights = "Rødt";
        }

        //adgang

        if (areaType.equalsIgnoreCase("bolig") && time.equalsIgnoreCase("nat")) {
                    access = "forbudt";
        }
        else if (areaType.equalsIgnoreCase("blandet") || areaType.equalsIgnoreCase("Erverv") && traffic.equalsIgnoreCase("lav")) {
                    access = " Tilladt";
                }
        else{
            access = " intet special";
        }

        // Printer endelige besked med info
        if (emergencyAnswer) {
            lights = "Grøn";
            System.out.println("Trafiklys Status: " + lights + " Nødsituation");
        }
        else {
            System.out.println("Trafiklys Status " + lights);
            System.out.println("adgang: " + access);
        }


    }
}