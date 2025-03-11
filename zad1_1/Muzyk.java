
package zad1_1;

public abstract class Muzyk {
    private String imie;
    private double czas;

    public Muzyk(String imie, double czas){
        this.imie=imie;
        this.czas=czas;
    }

    public abstract String instrument();
    public abstract double stawka();

    public String imie() {
        return imie;
    }

    public double czas() {
        return czas;
    }

    public static String maxHonorarium(Muzyk[] muzycy){
        double max = 0;
        Muzyk maxHonorariumMuzyk=muzycy[0];
        for(Muzyk m : muzycy){
            if(m.czas()*m.stawka()>max){
                max=m.czas()*m.stawka();
                maxHonorariumMuzyk=m;
            }
        }
        return maxHonorariumMuzyk.imie + ", czas = "+ maxHonorariumMuzyk.czas+
                " godz., stawka = "+maxHonorariumMuzyk.stawka();

    }
}
