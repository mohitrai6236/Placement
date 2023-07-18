import java.util.*;
public class ArraysPractice {
    public static void main(String args[]){




        // @1 Wap Print the spiral order matrix as output for a given matrix of numbers.

        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();

        int matrix[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        System.out.println("The Spiral Order Matrix is : ");
        int rowStart = 0;
        int rowEnd = n-1;
        int colStart = 0;
        int colEnd = m-1;

        //To print the spiral order matrix

        while (rowStart <= rowEnd && colStart <= colEnd){
            //1

            for(int col=colStart; col<=colEnd;col++){
                System.out.print(matrix[rowStart][col] + " ");      //for printing the first row
            }
            rowStart++;// move to next row i.e 2nd row

            //2

            for(int row=rowStart;row<=rowEnd;row++){     //for printing the last column
                System.out.print(matrix[row][colEnd] + " ");
            }
            colEnd--;// move to next column i.e 2nd last column

            //3

            for(int col=colEnd;col>=colStart;col--){      //for printing the last row
                System.out.print(matrix[rowEnd][col] + " ");
            }
            rowEnd--;// move to next row i.e 2nd last row

            //4

            for(int row=rowEnd;row>=rowStart;row--){      //for printing the first column
                System.out.print(matrix[row][colStart] + " ");
            }
            colStart++;// move to next column i.e 2nd column

            System.out.println();
        }
    }
    
}
