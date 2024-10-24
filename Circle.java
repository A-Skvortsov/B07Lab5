package lab5;

public class Circle {

    double radius;
    int x_center;
    int y_center;

    public Circle(double rad, int x, int y){
        this.radius = rad;
        this.x_center = x;
        this.y_center = y;
    } 

    public double circumference(double rad){
        return 2*Math.PI*rad;
    }

    //from b41 gg
    public boolean openset(int x, int y){
        double sum = Math.pow(this.x_center - x, 2) + Math.pow(this.y_center-y, 2);
        double dist = Math.sqrt(sum);
        return dist < this.radius;

    }    
}
