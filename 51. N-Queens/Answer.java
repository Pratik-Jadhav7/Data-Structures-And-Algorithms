class Solution {
    public List<List<String>> solveNQueens(int n) {
      char[][] board = new char[n][n];

      for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = '.';
            }
        }
        List<List<String>> list = new ArrayList<>();
        posQueens(board, 0, list);
        
        return list;
    }
    
    private void posQueens(char[][] board, int row, List<List<String>> list) {
        if (row == board.length){
            list.add(con(board));
            return;
        }
        for (int col = 0; col < board.length; col++) {
            if (isPlace(board, row, col)){
                board[row][col] = 'Q';
                posQueens(board,row+1, list);
                board[row][col] = '.';

            }
        }
    }

    private boolean isPlace(char[][] board, int row, int col) {
        //check vertical
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q' ) return false;
        }

        //diagonal left
        int maxLeft = Math.min(row, col);
        for (int i = 0; i <= maxLeft; i++) {
            if (board[row - i][col-i] == 'Q') return false;
        }

        //diagonal right
        int maxRight = Math.min(row, board.length - col -1);
        for (int i = 0; i <= maxRight; i++) {
            if (board[row - i][col + i] == 'Q') return false;
        }

        return true;

    }

    private List<String> con(char[][] board) {
        List<String> str = new LinkedList<>();
        for (char[] chars : board) {
            String s = new String(chars);
            str.add(s);
        }
        return str;
    }
}
