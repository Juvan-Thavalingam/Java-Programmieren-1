public class Auto {
    private String marke;
    private String typ;
    private double hubRaum;
    private boolean turbo;
    private int lagerBestand;

    private String checkTurbo;
    private String checkTurboSub;

    public Auto(String marke, String typ, double hubRaum, boolean turbo){
        setMarke(marke);
        setTyp(typ);
        setHubRaum(hubRaum);
        this.turbo = turbo;
    }

    public void setMarke(String marke){
        if(marke.length() < 3 || marke.length() > 10){
            this.marke = "___";
            System.err.println("Marke ungültig. Zeichen dürfen nicht kleiner als 3 oder nicht grösser als 10 sein!");
        } else {
            this.marke = marke;
        }
    }

    public void setTyp(String typ){
        if(typ.length() < 3 || typ.length() > 10){
            this.typ = "___";
            System.err.println("Typ ungültig. Anzahl Zeichen dürfen nicht kleiner als 3 oder grösser als 10 sein!");
        } else {
            this.typ = typ;
        }
    }

    public void setHubRaum(double hubRaum){
        if(hubRaum < 0.5 || hubRaum > 8){
            this.hubRaum = 0;
            System.err.println("Hubraum ungültig. Wert darf nicht kleiner als 0.5 oder grösser als 8 betragen!");
        } else {
            this.hubRaum = hubRaum;
        }
    }

    public void setTurbo(boolean turbo){
        this.turbo = turbo;
    }

    public void checkTurbo(){
        if(turbo){
            checkTurbo = "turbo";
            checkTurboSub = "-t";
        } else {
            checkTurbo = "";
            checkTurboSub = "";
        }
    }

    public void changeBestand(int zahl) {
        if (zahl > 10 || zahl < -10) {
            System.err.println("Fehler: Bestandsdaten dürfen nur bis zum Wert 10 verändert werden.");
        } else if(lagerBestand + zahl < 0){
            System.err.println("Lagerbestand darf nicht kleiner als 0 sein.");
        } else {
            System.out.println("Alter Bestand: " + lagerBestand);
            lagerBestand += zahl;
            System.out.println("Neuer Bestand: " + lagerBestand + "\n");
        }
    }

    public void print(){
        checkTurbo();
        System.out.println(marke + " " + typ + " " + hubRaum + " Liter " + checkTurbo);
        System.out.println("Code: " + marke.substring(0,3) + "-" + typ.substring(0,3)+"-"+ hubRaum + checkTurboSub);
        System.out.println("Lagerbestand: " + lagerBestand + "\n");
    }

    public static void main(String[] args) {
        Auto auto = new Auto("Mitsubishi", "Colt", 1.4, false);
        Auto auto1 = new Auto("BMW", "330i", 3.0, true);
        auto.changeBestand(4);
        auto1.changeBestand(1);
        auto.print();
        auto1.print();
    }
}
