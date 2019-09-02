package leetcode;

//fill elements into square matrix
public class MatrixSpiralMatrixII{
    public int[][] generateMatrix(int n) {
        int top = 0;
        int left = 0;
        int bottom = n-1;
        int right = n-1;
        int num = 1;
        int[][] res = new int[n][n];
        while (top<bottom && left<right){
            for (int i=left;i<right;i++){
                res[top][i] = num;
                num++;
            }
            for (int i=top;i<bottom;i++){
                res[i][right] = num;
                num++;
            }
            for (int i=right;i>left;i--){
                res[bottom][i] = num;
                num++;
            }
            for (int i=bottom;i>top;i--){
                res[i][left] = num;
                num++;
            }
            top++;
            bottom--;
            left++;
            right--;
        }
        //if n is odd, the center one should be taken care seperately
        if (n%2==1){
            res[top][left] = num;
        }
        return res;
    }
}