/**
 * floyadsTriangle
 */
public class floyadsTriangle {

    public static void floyads_triangle(int n) {

        int counter = 1;
        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner Loop
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
        floyads_triangle(5);

    }
}