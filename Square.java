package lab4;

public class Square {
    Point startingPoint;
    double length;

    Point A;
    Point B;
    Point C;
    Point D;

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
        boolean cond = A.equals(square.A) && B.equals(square.B)
                && C.equals(square.C) && D.equals(square.D);
        if (cond) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 5*this.A.hashCode()*this.B.hashCode()+17*this.C.hashCode()*this.D.hashCode();
    }

    @Override
    public String toString() {
        return "Point 1: " + this.A + "\n" + "Point 2: " + this.B + "\n"
                + "Point 3: " + this.C + "\n" + "Point 4: " + this.D + "\n"
                + "Perimeter:" + perimeter() + "\n" + "Area: " + area();
    }


}