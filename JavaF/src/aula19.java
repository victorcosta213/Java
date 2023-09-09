public class aula19 {
    public static void main(String[]args){
        String x= "   olá mundo, esse é o novo mundo    ";
        System.out.println(x.length()); // Quantos caracteres existe no string
        System.out.println(x.toUpperCase()); // coloca todos os caracteres em maiusculo
        System.out.println(x.toLowerCase()); // coloca todos os caracteres em minusculo
        System.out.println(x.contains("novo")); // Informa se contém esse termo na string
        System.out.println(x.indexOf("mundo")); // Informa em Qual posição começa a palavra.
        System.out.println(x.lastIndexOf("mundo")); // informa a posição da utima aparição do termo.
        System.out.println(x.trim()); // elimina os espaçamentos desnecessarios
        System.out.println(x.substring(9)); // pega os elemntos aparti do index informado.
        System.out.println(x.equals("olá")); // informa de o conteúdo da string é igual ao informado.


    }
}
