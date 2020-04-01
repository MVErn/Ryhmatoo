public class Topograafia {
    private double suund;
    private double kaugus;

    //konstruktor
    public Topograafia(double tank, double sihtpunkt) {
        this.suund = sihtpunkt-tank;  //Siia vaja suuna valemit
        this.kaugus = sihtpunkt-tank; //Siia vaja kauguse valemit
    }

    public double getSuund() {
        return suund;
    }

    public double getKaugus() {
        return kaugus;
    }

    //toString meetod

    @Override
    public String toString() {
        return "punkt " + suund +
                " suunal " + kaugus +
                " kaugusel";
    }
}

