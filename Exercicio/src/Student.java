public class Student {
    private int student_id;
    private String student_name;
    private double notas;

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }


    public String addGrid (double notas){
        if(notas>5){
            this.notas = notas;
            return "Nota validada com Sucesso!";
        }else{
            return "Digite uma nota maior que 5!";
        }
    }
}
