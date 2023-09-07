package backtracking;

public class sudoko {
    public boolean isSafe(char[][] board,int row,int col, int number) { // true yani number ko place karna safe false = not safe
        //row and column

        
        for(int i=0;i<board.length; i++){

            //this condition is for row
            if(board[i][col] == (char)(number + '0')) {
                return false;
            }

            //this condition is for column
            if(board[row][i] == (char)(number + '0')) {
                return false;
            }
        }

        // grid
        int sr = (row/3) * 3;
        int sc = (col/3) * 3;

        for(int i=sr;i<sr+3;i++) { // this is used to check the 3x3 matrix
            for(int j=sc;j<sc+3;j++) {
                if(board[i][j] == (char)(number + '0')) {
                    return false;
                }
            }
        }

        return true;
    }
    public  boolean helper(char[][] board, int row,int col) {
        if(row == board.length){ // jab puri row fill ho jaye
              return true;   
        }
 
        int nrow =0;
        int ncol =0;
        if(col !=board.length-1) { // if the element is not at the any of the row last col 

            nrow = row;
            ncol = col+1;
        } else { 
             nrow = row+1;
             ncol = 0;

        }

         if(board[row][col]!= '.' ) { // this line means that at that part their is no element
              if(helper(board, nrow, ncol)) {
                return true;
              }
         }   else {
            for(int i=1;i<=9;i++) {
                if(isSafe(board, row, col, i)){ // this function is used to check wheather to put new element is safe or not
                    board[row][col] = (char)(i+'0');

                    if(helper(board, nrow, ncol)) {
                        return true;
                    } else {
                        board[row][col] = '.';
                    }
                }   
            }
         }

         return false; // agar koi bhi uppar wali statement sahi ni hui to hum false return kar denge
    }
 
    
        
    
    public void main(char[][] board) {
        helper(board,0,0);
    }

}
