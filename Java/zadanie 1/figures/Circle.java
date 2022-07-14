package figures;

class Circle extends Figure {
    private int p1, p2, radius;

    Circle() {
        this.p1 = 0;
        this.p2 = 0;
        this.radius = 0;
    }

    Circle(int p1, int p2, int radius) {
        this.p1 = p1;
        this.p2 = p2;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Koło o środku: (" + p1 + ", " + p2 + ") i promieniu: " + radius;
    }

    void move(int a, int b) {
        p1 += a;
        p2 += b;
    }

    void scale(int k) {
        radius *= k;
    }

    double area() {
        return Math.PI * (radius * radius);
    }

    double perimeter() {
        return 2 * Math.PI * radius;
    }
}
