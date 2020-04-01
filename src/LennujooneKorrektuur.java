import java.util.ArrayList;

public class LennujooneKorrektuur {
    private Topograafia topograafia;
    private double algkiiruseMuut;
    private double kauguseMuut;
    private double suunaMuut;
    private double algkiirus = 20;     //koefitsent millekski?
    private double derivatsioon = 10;  //koefitsent millekski?

    //konstruktor
    public LennujooneKorrektuur(Topograafia topograafia, double algkiiruseMuut, double kauguseMuut, double suunaMuut) {
        this.topograafia = topograafia;
        this.algkiiruseMuut = algkiiruseMuut;
        this.kauguseMuut = kauguseMuut;
        this.suunaMuut = suunaMuut;
    }

    //meetod uue tabamispunkti C koordinaatide leidmiseks
    //hetkel leiab ainult tabamispunkti kauguse ja suuna
    public double tabamispunkt(){
        Topograafia tabamus = new Topograafia(topograafia.getKaugus()+kauguseMuut,topograafia.getSuund()+suunaMuut);
        double tabamispunkt = 4;
        return tabamispunkt;
    }

    //meetod, mis leiab palju mööda lasime
    public double eksimus(double sihtpunkt){           //Siia valem kuidas tabamuspunkti ja sihtpunkti vaheline kaugus leidmiseks
        Topograafia eksimus = new Topograafia(tabamispunkt(), sihtpunkt);
        return eksimus.getKaugus() ;
    }

    //meetod, mis leiab kuhu peame sihtima
    public Topograafia uusSihtpunkt(){      //Siia sisu vaja

        return null;
    }

}
