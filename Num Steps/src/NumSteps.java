
public class NumSteps {
    public static void main(String[] args) {
        int escalones = 4;

        if (escalones > 0) {
            for (int i = 0; i < escalones; i++) {
                for (int j = 0; j < escalones - i - 1; j++) {
                    System.out.print(" ");
                }
                System.out.println("_|");
            }
        } else if (escalones < 0) {
            for (int i = 0; i < Math.abs(escalones); i++) {
                for (int j = 0; j < Math.abs(escalones) - i - 1; j++) {
                    System.out.print(" ");
                }
                System.out.println("_|");
            }
        } else {
            System.out.println("__");
        }
    }
}