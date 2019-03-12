public class SegmentMass {
    private double volumePart;

    /**
     * Метод для получения объёма сегмента линзы
     *
     * Основные формулы для расчёта:
     * V = PI * r^2 * h     - расчёт объёма цилиндра
     * где:
     * V    - объём
     * PI   - 3.14
     * r    - радиус основания цилиндра
     * h    - высота цилиндра
     *
     * V = PI * h^2 * (R - h / 3)   - расчёт объёма шарового сегмента
     * где:
     * V    - объём
     * PI   - 3.14
     * h    - высота сегмента
     * R    - радиус сегмента
     *
     * Входные данные:
     * radius   - радиус одной из сторон линзы
     * diameter - диаметр сегмента
     *
     * Промежуточные данные:
     * rBase    - радиус основания сегмента
     * hSeg     - высота сегмента
     *
     * Выходные данные:
     * volumePart - расчитаный объём сегмента
     */
    public double getVolumePart(double radius, double diameter) {
        if (radius == 0 | diameter == 0) {
            volumePart = 0;
        } else {
            double rBase = diameter / 2;                                                             //радиус основания сегмента
            double hSeg = Math.abs(radius) - Math.sqrt((Math.pow(radius, 2) - Math.pow(rBase, 2)));  //высота сегмента от основания
            volumePart = ((Math.PI * Math.pow(hSeg, 2)) * (Math.abs(radius) - (hSeg / 3)));          //объём вычисляемого сегмента

            if (radius < 0) volumePart = (-volumePart);
        }

        return volumePart;
    }
}
