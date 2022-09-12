

class Solution {
public int countBattleships(char[][] board) {
    int count = 0;
    
    int m = board.length;
    int n = board[0].length; 
    
    for(int i = 0 ; i < m; i++){
        for(int j = 0; j < n; j++){
            
            if(board[i][j] == 'X'){ //if a hit
                count += 1;
                board[i][j] = '.';
                
                if(j+1 < n && board[i][j+1] == 'X'){ // horizontal
                    j += 1;
                    while(j < n && board[i][j] == 'X'){
                        board[i][j] = '.';
                        j += 1;
                    }
                    
                }
                else if(i+1 < m && board[i+1][j] == 'X'){ //vertically down
                    int temp = i + 1;
                    while(temp < m && board[temp][j] == 'X'){
                        board[temp][j] = '.';
                        temp += 1;
                    }
                }
                //size 1 so nothing

                
                
            }
            
            
        }
    }
    
    
    return count;
}
}
