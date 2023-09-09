package praticando.listas;

public class funcionarios {
    private Integer id;
    private String nome;
    private Double salario;


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double getSalario() {
        return salario;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public Double incremento(Double porcent){
        double res= this.salario * (1+ (porcent/100));
        return res;

    }
}
