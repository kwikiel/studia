package Dec19;

public class Ciastko {
    String smak;
    double waga;

    Ciastko(String smak, double waga) {
        this.smak = smak;
        this.waga = waga;
    }

    public void show() {
        System.out.println(this.smak + Double.toString(this.waga));
    }
}
