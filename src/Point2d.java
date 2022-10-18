public class Point2d {
    private double xCoord; // координата x
    private double yCoord; // координата y
    public Point2d(double x, double y){ // конструктор инициализации
        xCoord=x;
        yCoord=y;
    }

    public Point2d (){ // конструктор по умолчанию
        this(0.0,0.0); // вызовите конструктор с двуми параметрами
    }
    public double getX(){ // возвращение координаты x
        return xCoord;
    }
    public double getY() { // возвращение координаты y
        return yCoord;
    }
    public void setX(double x){
        xCoord = x;
    }
    public void setY(double y){
        yCoord = y;
    }

}
