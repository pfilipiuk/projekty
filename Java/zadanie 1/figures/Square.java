package figures;

class Square extends Figure {
    private int p1, p2, side;

    Square() {
        this.p1 = 0;
        this.p2 = 0;
        this.side = 0;
    }

    Square(int p1, int p2, int side) {
        this.p1 = p1;
        this.p2 = p2;
        this.side = side;
    }

    @Override
    public String toString() {
        return "Kwadrat o środku: (" + p1 + ", " + p2 + ") i boku: " + side;
    }

    void move(int a, int b) {
        p1 += a;
        p2 += b;
    }

    void scale(int k) {
        side *= k;
    }

    double area() {
        return side * side;
    }

    double perimeter() {
        return side * 4;
    }
}
