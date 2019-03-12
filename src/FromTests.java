public class FromTests {

    /**
     * ± - символ +/-
     *
     * https://o7planning.org/ru/11079/javafx-tableview-tutorial#a3624400 - страница с примером TableView
     */
    public static void main(String[] args) {
        SegmentMass vol = new SegmentMass();


        System.out.println(vol.getVolumePart(137.58, 40));

        double vCyl = (Math.PI * Math.pow(20, 2)) * 3.14;

        double vLens = (vol.getVolumePart(137.58, 40) + vCyl) / 1000;  // с переводом мм^3 в см^3

        System.out.println("Объём линзы: " + vLens + " см^3");

        System.out.println("Вес линзы: " + ((vLens * 2.51) / 1000) + " кг.");

        System.out.println("Цена линзы: " + (((vLens * 2.51) / 1000) * 10567.58) + " руб.");


        ///////////////////////////////////////////////////

        System.out.println();

        vCyl = (Math.PI * Math.pow(20, 2)) * 4.6;

        vLens = vCyl / 1000;  // с переводом мм^3 в см^3

        System.out.println("Объём линзы: " + vLens + " см^3");

        System.out.println("Вес линзы: " + ((vLens * 2.51) / 1000) + " кг.");

        System.out.println("Цена линзы: " + (((vLens * 2.51) / 1000) * 10567.58) + " руб.");

    }
}
