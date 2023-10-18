class Solution {
    public boolean isValidSudoku(char[][] bd) {
        int[][] row = new int[9][9],col = new int[9][9],block = new int[9][9];
        for(int i=0; i<9; ++i){
            for(int j=0; j<9; ++j){
                if(bd[i][j]!='.'){
                    int num= bd[i][j]-'0'-1;
                    int k= (i/3)*3+j/3;
                    if(row[i][num]==1 || col[j][num]==1 || block[k][num]==1) return false;
                    row[i][num] = col[j][num] = block[k][num] = 1;
                }
            }
        }
        return true;
    }
}