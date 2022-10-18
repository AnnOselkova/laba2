public class Point3d extends Point2d{
    private double xCoord;
    private double yCoord;
    private double zCoord;
    public Point3d(double x, double y, double z){
       this. xCoord=x;
       this.yCoord=y;
       this.zCoord=z;
    }
    public Point3d(){ // базовый конструктор
        this(0.0,0.0,0.0);
    }
    public double getZ(){
        return zCoord;
    }
    public void setZ(double val){
        this.zCoord=val;
    }
    //Сравнивает объект с другим объектом.
    public boolean compare(Point3d point){
        return (this.xCoord == point.getX() && this.yCoord == point.getY() && this.zCoord == point.getZ());
    }
    //Возвращает геометрическое расстояние между двумя точками.
    public double distanceTo(Point3d point){
        return Math.sqrt(Math.pow(this.xCoord - point.getX(), 2) + Math.pow(this.yCoord - point.getY(), 2) + Math.pow(this.zCoord - point.getZ(), 2));
    }

}
