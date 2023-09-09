package praticando.matrizes;

import java.util.Scanner;

public class ex2 {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int[][] mat= new int[a][b];

                for (int i=0; i<mat.length;i++){
                        for (int j=0;j<mat[i].length;j++){
                            mat[i][j]=sc.nextInt();
                        }
                    }
        int number= sc.nextInt();
                for (int i=0;i<mat.length;i++){
                        for (int j=0;j<mat[i].length;j++){
                            if (mat[i][j]==number){
                                System.out.println(" position "+i+","+j);
                            }
                            if (mat[i-1][j]!= -1){
                                System.out.println("up "+mat[i-1][j]);
                            }
                            if (mat[i][j-1]!=-1 && mat[i][j-1]!=4){
                                System.out.println("left "+mat[i][j-1]);
                            }
                            if (mat[i][j+1]>=0 && mat[i][j+1]<=0){
                                System.out.println("right "+mat[i][j+1]);
                            }
                            if (mat[i+1][j]>=0 && mat[i+1][j]<=0){
                                System.out.println("down "+mat[i+1][j]);
                            }
                        }
                    }
    }
}
