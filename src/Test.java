import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        System.out.println("See siin on tervitustekst ja kirjeldus mida programmiga teha saab.");

        //Kasutajalt küsitakse tanki A ja sihtmärgi B koordinaadid
        Scanner scan = new Scanner(System.in);
        System.out.println("Sisesta punkti oma asukoha koordinaat: ");
        double tank = scan.nextDouble();
        System.out.println("Sisesta sihtpunkti koordinaat: ");
        double sihtpunkt = scan.nextDouble();
        Topograafia topograafia1 = new Topograafia(tank,sihtpunkt);

        //Kasutajale kuvatakse sihtpunkti suund ja kaugus
        System.out.println("Sihtpunkt paikneb " + topograafia1.toString() + ".");

        //Kasutajalt küsitakse täiendavat infot olude kohta
        System.out.println("Sisesta kui palju on mürsu algkiirus muutunud: ");
        double algkiiruseMuut = scan.nextInt();
        System.out.println("Sisesta parand kaugusele: ");
        double kauguseMuut = scan.nextInt();
        System.out.println("Sisesta parand suunale: ");
        double suunaMuut = scan.nextInt();
        LennujooneKorrektuur lennujooneKorrektuur1 = new LennujooneKorrektuur(topograafia1,algkiiruseMuut,kauguseMuut,suunaMuut);


        //Kasutajale näidatakse uue tabamispunkti koordinaadid ja kui palju on mööda lastud
        System.out.println("Tabasime punkti " + lennujooneKorrektuur1.tabamispunkt() );
        System.out.println("Lasime mööda " + lennujooneKorrektuur1.eksimus(sihtpunkt));
        System.out.println("Et tabaksime õiget kohta peame muutma suunda" + lennujooneKorrektuur1.uusSihtpunkt());
    }
}
