package zad1;

public class Flecista extends Muzyk{
    public Flecista(String imie, double czas) {
        super(imie, czas);
    }

    @Override
    public String instrument() {
        return "flet";
    }

    @Override
    public double stawka() {
        return 300;
    }
}
