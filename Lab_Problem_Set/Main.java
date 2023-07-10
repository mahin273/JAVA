import java.util.Scanner;

class Line {
    private int x1, y1, x2, y2;

    public Line(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double findSlope() {
        return (double) (y2 - y1) / (x2 - x1);
    }

    public String toString() {
        return "Line has points (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ")";
    }

    public static boolean isIntersecting(Line l1, Line l2) {
        double slope1 = l1.findSlope();
        double slope2 = l2.findSlope();
        if (slope1 == slope2) {
            return false; // Parallel lines, not intersecting
        } else {
            return true; // Intersecting lines
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Line[] lines = new Line[4];
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter the coordinates for Line " + (i + 1) + ":");
            System.out.print("x1: ");
            int x1 = scanner.nextInt();
            System.out.print("y1: ");
            int y1 = scanner.nextInt();
            System.out.print("x2: ");
            int x2 = scanner.nextInt();
            System.out.print("y2: ");
            int y2 = scanner.nextInt();
            lines[i] = new Line(x1, y1, x2, y2);
        }
        System.out.println();
        for (int i = 0; i < 4; i++) {
            System.out.println(lines[i].toString());
        }
        System.out.println();
        System.out.println("Are Line 1 and Line 2 intersecting? " + Line.isIntersecting(lines[0], lines[1]));
        System.out.println("Are Line 2 and Line 3 intersecting? " + Line.isIntersecting(lines[1], lines[2]));
        System.out.println("Are Line 3 and Line 4 intersecting? " + Line.isIntersecting(lines[2], lines[3]));
        System.out.println("Are Line 4 and Line 1 intersecting? " + Line.isIntersecting(lines[3], lines[0]));
        scanner.close();
    }
}