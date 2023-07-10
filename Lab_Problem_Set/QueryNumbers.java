import java.util.ArrayList;
import java.util.Scanner;
 public class QueryNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int n = scanner.nextInt();
        ArrayList<ArrayList<Integer>> lines = new ArrayList<>();
         for (int i = 0; i < n; i++) {
            System.out.print("Enter the integers for line " + (i + 1) + ": ");
            int d = scanner.nextInt();
            ArrayList<Integer> line = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                line.add(scanner.nextInt());
            }
            lines.add(line);
        }
         System.out.print("Enter the number of queries: ");
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            System.out.print("Enter query " + (i + 1) + " (x y): ");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int number = getNumberAtPosition(lines, x, y);
            if (number != -1) {
                System.out.println(number);
            } else {
                System.out.println("ERROR!");
            }
        }
        scanner.close();
    }
     public static int getNumberAtPosition(ArrayList<ArrayList<Integer>> lines, int x, int y) {
        if (x > lines.size() || x <= 0) {
            return -1;
        }
        ArrayList<Integer> line = lines.get(x - 1);
        if (y > line.size() || y <= 0) {
            return -1;
        }
        return line.get(y - 1);
    }
}
