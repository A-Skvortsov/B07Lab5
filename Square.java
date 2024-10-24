package lab4;

public class Square {
    Point startingPoint;
    double length;

    public Point A;
    public Point B;
    public Point C;
    public Point D;

    public Square() {
        this.startingPoint = new Point(0,0);
        this.length = 0;

        this.A = new Point(0,0); this.B = new Point(0,0);
        this.C = new Point(0,0); this.D = new Point(0,0);
    }

    public Square(double length) {
        this.startingPoint = new Point(0,0);
        this.length = length;

        this.A = new Point(0,0); this.B = new Point(0,length);
        this.C = new Point(length,length); this.D = new Point(length,0);
    }

    public Square(Point point, double length) {
        this.startingPoint = point;
        this.length = length;

        this.A = new Point(startingPoint.x,startingPoint.y);
        this.B = new Point(startingPoint.x,startingPoint.y+length);
        this.C = new Point(startingPoint.x+length,startingPoint.y+length);
        this.D = new Point(startingPoint.x+length,startingPoint.y);
    }

    public double area() {
        return this.length*this.length;
    }

    public double perimeter() {
        return 4*this.length;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Square)) {
            return false;
        }
        Square square = (Square)o;
        boolean cond = this.A == square.A && this.B == square.B
                && this.C == square.C && this.D == square.D;
        if (cond) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Point 1: " + this.A + "\n" + "Point 2: " + this.B + "\n"
                + "Point 3: " + this.C + "\n" + "Point 4: " + this.D + "\n"
                + "Perimeter:" + perimeter() + "\n" + "Area: " + area();
    }
}