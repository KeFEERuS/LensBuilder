package logic;

public class ProcessingData {

    private double d;           //диаметр готовой линзы
    private double mass;        //масса итоговой заготовки
    private double price;       //цена заготовки
    private double volumePart;  //объём сегмета линзы
    private double volumeCyl;   //объём цилиндра
    private double stokRadius;  //припуск на радиус
    private double volumeLens;  //объём заготовки
    private double density;     //материал стекла

    /**
     * Этот метод возвращает оптимальный диаметр для заготовки
     * в зависимости от деаметра готовой линзы.
     * На вход подаётся диаметр готовой линзы,
     * На выходе получаем оптимальный диаметр заготовки.
     */
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

    public double getLimitRadius(double radius, double diametr) {
        stokRadius = 0.3 * (3 + Math.pow((radius / diametr), 2));
        return stokRadius;
    }

    /**
     * Этот метод возвращает плотность материала.
     * На вход подаётся строка с названием марки стекла,
     * метод находит данную мару стекла в базе данных и возвращает
     * его плотность в г/см^3
     */
    private double getDensity(String lensMaterial) {
        return density;
    }

    /**
     * Этот метод возвращает массу заготовки.
     * На вход подаются объём заготовки и марка стекла
     */
    public double getMassLens(double volume, String sort) {
        mass = getDensity(sort) * volume;
        return mass;
    }

    /**
     * Метод для возврата стоимости заготовки.
     * На вход подаются масса заготовки и цена за Кг материала
     */
    public double getPriceLens(double mass, double price) {
        this.price = mass * price;
        return this.price;
    }

    /**
     * Метод для получения объёма сегмента линзы
     *
     * Основные формулы:
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
     *
     * Описание метода:
     */
    public double getVolumePart(double radius, double diameter) {
        if (radius == 0 | diameter == 0) {
            return volumePart = 0;
        } else {
            double rBase = diameter / 2;                                                             //радиус основания сегмента
            double hSeg = Math.abs(radius) - Math.sqrt((Math.pow(radius, 2) - Math.pow(rBase, 2)));  //высота сегмента от основания
            volumePart = ((Math.PI * Math.pow(hSeg, 2)) * (Math.abs(radius) - (hSeg / 3)));          //объём вычисляемого сегмента

            if (radius < 0)
                return -volumePart;
            else return volumePart;
        }
    }

    /**
     * Метод для получения объёма цилиндрической части линзы
     *
     * Основные формулы:
     * V = PI * r^2 * h     - расчёт объёма цилиндра
     * где:
     * V    - объём
     * PI   - 3.14
     * r    - радиус основания цилиндра
     * h    - высота цилиндра
     */
    public double getVolumeCyl(double diameter, double hCyl) {
        double rCyl = diameter / 2;
        volumeCyl = Math.PI * Math.pow(rCyl, 2) * hCyl;
        return volumeCyl;
    }

    /**
     * Метод для полного расчёта объёма заготовки
     * volumeLens   - объём линзы
     * volumeCyl    - объём цилиндра (средний сегмент)
     * volumeR1     - объём шарового сегмента первой стороны (левый сегмент)
     * volumeR2     - объём шарового сегмента второй стороны (правый сегмент)
     */
    public double getVolumeLens(double volumeCyl, double volumeR1, double volumeR2) {
        volumeLens = volumeCyl + volumeR1 + volumeR2;
        return volumeLens;
    }
}