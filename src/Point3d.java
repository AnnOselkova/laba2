public class Point3d extends Point2d{ //объявление координат
    private double zCoord;
    public Point3d(double x, double y, double z){ // конструктор класса
       super.setX(x);
       super.setY(y);
       this.zCoord=z;
    }
    public Point3d(){ // базовый конструктор

        this(0.0,0.0,0.0);
    }
    public double getZ(){
        return zCoord;
    }
    public void setZ(double z){
        this.zCoord=z;
    }
    //Сравниваем объект с другим объектом.
    public boolean compare(Point3d point){
        return (this.getX() == point.getX() && this.getY() == point.getY() && this.zCoord == point.getZ());
    }
    //Возвращаем расстояние между двумя точками.
    public double distanceTo(Point3d point){
        return Math.sqrt(Math.pow(this.getX() - point.getX(), 2) + Math.pow(this.getY() - point.getY(), 2) + Math.pow(this.zCoord - point.getZ(), 2));
    }

}
