package fibonacci;

public class main {

    public static int fibonacci(int contador){
        int a = 0;
        int b = 1;
        int[] vet = new int[contador];
        for (int i = 0; i < contador; i++) {
            vet[i]=a;
            int temp = a;
            a = b;
            b = temp + b;
        }

        return vet[contador/2];
    }

    public static void main(String[] args) {
        int result= fibonacci(7);
        System.out.println("A mediana é: "+result);
    }

}
