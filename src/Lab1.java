import java.util.Scanner;
public class Lab1 {
    public static void main(String[] args) { //массив из 3-х точек и координат
        Point3d[] points = new Point3d[3];
        double[] coords = new double[3];
        Scanner scanner = new Scanner(System.in); //считываем координаты точек
        for(int i = 0; i < 3; i++) {
            //считывание координат и запись их в массив
            for(int k = 0; k < 3; k++){
                char coord;
                if(k == 0)coord = 'x';
                else if (k == 1)coord = 'y';
                else coord = 'z';
                System.out.print("Введите координату " + coord + " точки " + (i + 1) + ": ");
                coords[k] = scanner.nextDouble();
            }
            points[i] = new Point3d(coords[0], coords[1], coords[2]);
        }
        // проверяем на совпаление
        if(points[0].compare(points[1]) || points[0].compare(points[2]) || points[1].compare(points[2])) {
            System.out.println("Точки совпадают!");
            return;
        }
        System.out.println("Площадь треугольника: " + computeArea(points[0], points[1], points[2]));
    }

    // вычисление площади треугольника
    public static double computeArea(Point3d point1, Point3d point2, Point3d point3){
        double a = point1.distanceTo(point2);
        double b = point1.distanceTo(point3);
        double c = point2.distanceTo(point3);
        double per = (a + b + c) / 2;
        return Math.sqrt(per * (per - a) * (per - b) * (per - c));
    }

}