package logic;

public class ProcessingData {

    private double d;

    public double getLimitDiameter(double x) {
        if (x <= 2) {
            return d = (x + 0.4);
        } else if (x <= 4) {
            return d = (x + 0.6);
        } else if (x <= 10) {
            return d = (x + 0.8);
        } else if (x <= 15) {
            return d = (x + 1);
        } else if (x <= 25) {
            return d = (x + 1.2);
        } else if (x <= 65) {
            return d = (x + 1.5);
        } else if (x <= 100) {
            return d = (x + 2.5);
        } else return d = (x + 4);
    }
}
