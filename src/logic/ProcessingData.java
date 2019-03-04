package logic;

public class ProcessingData {

    private double d;           //диаметр готовой линзы
    private double mass;        //масса итоговой заготовки
    private double price;       //цена заготовки
    private double volume;      //объём сегмета линзы
    private double density;    //материал стекла

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
     * Этот метод возвращает объём одной из частей линзы.
     * На вход получает радиус рабочей поверхности и диаметр.
     */
    public double getVolumePart(double radius, double diametr) {
        double diamR = diametr / 2;                                                     //радиус основания сегмента
        double h = radius - Math.sqrt((Math.pow(radius, 2) - Math.pow(diamR, 2)));      //высота сегмента от основания
        volume = ((Math.PI * Math.pow(h, 2)) * (radius - ((1 / 3) * h)));               //объём вычисляемого сегмента
        return volume;
    }
}