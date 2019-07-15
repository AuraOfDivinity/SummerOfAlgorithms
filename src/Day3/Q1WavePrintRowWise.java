package Day3;

public class Q1WavePrintRowWise {
    public static void main(String[] args) {
        int mat[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        wavePrintRow(mat);
    }

    private static void wavePrintRow(int matrix[][]){
        int j = 0;

        for(int i = 0; i <= 3; i++){
            if(j == 0){
                for(j = 0; j <= 3; j++){
                    System.out.print(matrix[i][j] + " ");
                }
            }
            else{
                for(j = 3; j >= 0; j--){
                    System.out.print(matrix[i][j] + " ");
                }
                j = 0;
            }
        }
    }
}
