package A0_Questions.A5_2DAarray_Questions;
public class Q7_Flip_Img{
    public static void main(String[] args) {
        int[][] image={{1,1,0},{1,0,1},{0,0,0}};
        int[][] ans=flipAndInvertImage(image);
        int row=image.length;
        int col=image[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        int row=image.length;
        int col=image[0].length;
        for(int i=0;i<row;i++){
            int start=0,end=col-1;
            while(start<=end){
                int temp=image[i][start];
                image[i][start]=image[i][end];
                image[i][end]=temp;
                start++;
                end--;
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<row;j++){
                if(image[i][j]==1)
                    image[i][j]=0;
                else
                    image[i][j]=1;
            }
        }
        return image;
	}
}