package Day3;

public class Q2WavePrintColumnWise {
    public static void main(String[] args) {
        int[][] mat = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        wavePrintColumn(mat);
    }

    private static void wavePrintColumn(int[][]matrix){
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(matrix[j][i]+ " ");
            }
        }
    }
}
