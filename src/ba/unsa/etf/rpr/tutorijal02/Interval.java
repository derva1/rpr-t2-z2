package ba.unsa.etf.rpr.tutorijal02;

public class Interval {
    double pocetnaTacka;
    double krajnjaTacka;
    boolean pTacka, kTacka;

    public Interval(double pocetnaTacka, double krajnjaTacka, boolean pTacka, boolean kTacka) {
        if(pocetnaTacka > krajnjaTacka) throw new IllegalArgumentException("Pocetna tacka je veca od kranje");
        this.pocetnaTacka = pocetnaTacka; this.krajnjaTacka = krajnjaTacka; this.pTacka = pTacka; this. kTacka = kTacka;

    }
    public Interval(){
        pocetnaTacka = 0 ;
        krajnjaTacka =0;
        pTacka = false;
        kTacka = false;
    }
    public static Interval intersect(Interval i, Interval i2) {
        return new Interval(0,0,false,false);
    }

    public boolean isIn(double v) {
        return  false;
    }

    public boolean isNull() {
        return  false;
    }

    public static Interval intersect(Interval interval) {
        return new Interval(0,0,false,false);
    }
}
