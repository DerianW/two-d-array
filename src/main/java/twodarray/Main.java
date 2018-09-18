package twodarray;

public class Main {
    public static void main(String[] args) {
//        String[][] names =
//                {
//                        {"MR", "MRS", "MC"},
//                        {"T", "HAMMER", "JONES"}
//                };
//        System.out.println(names[0][0] + " " + names[1][0]);
//        System.out.println(names[0][2] + " " + names[1][1]);
//        System.out.println(names[0][1] + " " + names[1][2]);
        int[][] magicSquare =
                {
                        {16, 3, 2, 13},
                        {5, 10, 11, 8},
                        {9, 6, 7, 12},
                        {4, 15, 14, 1}
                };
        for (int i = 0; i < magicSquare.length; i++)
        {
            for (int j = 0; j < magicSquare[i].length; j++)
            {
                System.out.println("Value at arr[" + i + "][" + j + "] is " + magicSquare[i][j]);
            }
        }
    }
}