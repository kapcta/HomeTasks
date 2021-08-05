import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        int[][] myArray = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                myArray[i][j] = (i + 1) * (j + 1);

            }

        }

        String my2Arrray = Arrays.deepToString(myArray);
        System.out.println(my2Arrray);

        /*for (int i = 0; i < my2Arrray.length(); i++) {
            for (int j = 0; j < my2Arrray.length(); j++) {
                System.out.print(my2Arrray[i][j]);

            }
            System.out.println("");
        }
    }*/
    }
}
