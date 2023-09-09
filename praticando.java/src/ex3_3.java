import java.util.Scanner;

public class ex3_3 {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        int op=0;
        int alcool=0;
        int gasolina=0;
        int diesel=0;

                while(op!=4){
                    System.out.println("1-Alcool");
                    System.out.println("2-Gasolina");
                    System.out.println("3-Diesel");
                    System.out.println("4-Fim");
                    op= scanner.nextInt();
                            if (op==1){
                                alcool= alcool+1;
                            }
                            else if (op==2){
                                gasolina= gasolina+1;
                            }
                            else if (op==3){
                                diesel=diesel+1;
                            }
                            else {
                                System.out.println("Digite uma opção valida!");
                            }
                }
        System.out.println("Muito obrigado!");
        System.out.println("Alcool: "+alcool);
        System.out.println("Gasolina: "+gasolina);
        System.out.println("Diesel: "+diesel);

    }
}
