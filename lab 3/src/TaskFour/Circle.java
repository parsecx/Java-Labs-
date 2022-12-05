package TaskFour;

public class Circle {
    public double x;
    public double y;
    public double r;

    public Circle() {
        x = 0;
        y = 0;
    }

    public Circle(int x , int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public void printCircle() {
        System.out.println("Окружность с центром ("+x+";"+y+") и радиусом "+r);
    }

    public void moveCircle(double a, double b) {
        x = x + a;
        y = y + b;
    }

    public void zoomCircle(double k) {
        r = r * k;
    }

    public void moveCircleCenter(int x , int y) {
        if(x < 99 && x > -99 && y < 99 && y > -99) {
            this.x = x;
            this.y = y;
        } else {
            this.x = 0;
            this.y = 0;
        }
    }

    public double distanceBetweenCircles(Circle cOne, Circle cTwo) {
        double result;
        result = Math.sqrt(Math.pow(cTwo.x-cOne.x, 2) + Math.pow(cTwo.y - cOne.y, 2));
        return result;
    }

    public boolean circlesTouching (Circle cOne, Circle cTwo) {
        return distanceBetweenCircles(cOne, cTwo) <= cOne.r + cTwo.r;
    }
}

