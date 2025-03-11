package zad1;

public class Skrzypek extends Muzyk{

    public Skrzypek(String imie, double czas) {
        super(imie, czas);
    }

    @Override
    public String instrument() {
        return "skrzypce";
    }

    @Override
    public double stawka() {
        return 200;
    }
}
