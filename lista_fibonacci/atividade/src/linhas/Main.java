package linhas;

public class Main {
    public static void linhas(int n){
        for (int i=0;i<n;i++){
            for (int j=0; j<=i;j++){
                System.out.print(i+1);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        linhas(5);
    }
}