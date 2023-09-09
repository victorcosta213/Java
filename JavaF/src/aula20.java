import java.util.Scanner;
// Obs não utilize o == pq ele não compara o conteúdo e sim a posição que está sendo locada a informação
public class aula20 {
    public static void main(String[]args){
        for (int x=2;x>0;){
        String password="123456";
        System.out.println("Digite sua senha: ");
        Scanner scanner= new Scanner(System.in);
        String pass= scanner.nextLine();
        if (password.equals(pass)){
            System.out.println("Bem vindo");
            x=0;
        } else{
            System.out.println("Senha incorreta");
        }}
    }
}
