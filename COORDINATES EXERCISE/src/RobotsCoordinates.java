
public class RobotsCoordinates {
    public static void main(String[] args) {
        int[] steps = {10, 5, -2};
        int x = 0, y = 0;
 // (X) ABAJO , (Y) ARRIBA
        for (int step : steps) {
            if (step > 0) {
                y += step;
            } else {
                y -= Math.abs(step);
            }
            x -= step;
        }

        System.out.println("Final coordinates: (" + x + ", " + y + ")");
    }
}