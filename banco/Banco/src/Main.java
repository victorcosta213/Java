public class Main {
    public static void main(String[]args) throws Exception {


        Banco imobiliario = new Banco();
        Conta c1= new Conta();
        c1.setNumero("00001");
        c1.setSaldo(20000);
        c1.setTitular("guilherme henrique");

        Conta c2= new Conta();
        c2.setNumero("00002");
        c2.setSaldo(10000);
        c2.setTitular("lucas");

        Conta c3= new Conta();
        c3.setNumero("00003");
        c3.setSaldo(10000);
        c3.setTitular("lucas");

        Conta c4= new Conta();
        c4.setNumero("00004");
        c4.setSaldo(100);
        c4.setTitular("Victor");

        imobiliario.addConta(c1);
        imobiliario.addConta(c2);
        imobiliario.addConta(c3);
        imobiliario.addConta(c4);

        System.out.println(imobiliario.buscarContaPorNumero("00002"));
        System.out.println(imobiliario.buscarConta(c4));




    }
}
