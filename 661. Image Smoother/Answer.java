class Solution {
    int[] dx=new int[]{-1,-1,-1,0,0,0,1,1,1};
    int[] dy=new int[]{-1,0,1,-1,0,1,-1,0,1};
    public int[][] imageSmoother(int[][] M) {
        int m=M.length, n=M[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                updateM(M,i,j);
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                M[i][j]=M[i][j]/256;
            }
        }
        return M;
    }
    private void updateM(int[][]M, int i, int j){
        int num=0;
        int sum=0;
        for(int ind=0;ind<9;ind++){
            int nexti=i+dx[ind], nextj=j+dy[ind];
            if(nexti>=0&&nexti<M.length&&nextj>=0&&nextj<M[0].length){
                num++;
                sum+=M[nexti][nextj]%256;
            }
        }
        M[i][j]+=sum/num*256;
    }
}
