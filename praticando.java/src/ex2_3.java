import java.util.Scanner;

public class ex2_3 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int horarioinicial= scanner.nextInt();;
        int horariofinal= scanner.nextInt();
        int duracao;
        if (horariofinal>horarioinicial){
            duracao= horariofinal - horarioinicial;
        } else{
            duracao= 24 - horarioinicial + horariofinal;
        }

        System.out.println("A duração do jogo foi de "+ duracao +" horas");
    }
}
