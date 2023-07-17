import java.util.Scanner;

public class MainDiagonalSum{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the Inputs");
        int sizeRow=scanner.nextInt();
        int sizeColumn=scanner.nextInt();
        int array[][]=new int[sizeRow][sizeColumn];
        for(int iterator=0;iterator<sizeRow;iterator++){
            for(int j=0;j<sizeColumn;j++){
                array[iterator][j]=scanner.nextInt();
            }
        }

        int sum=mainDiagonalSum(array,sizeRow,sizeColumn);
        System.out.println("Sum of the main Diagonals :"+sum);
    }

    private static int mainDiagonalSum(int[][] array, int sizeRow, int sizeColumn) {
        int sum=0;
        for(int i=0;i<sizeRow;i++){
            sum+=array[i][i];
        }
        return sum;
    }
}