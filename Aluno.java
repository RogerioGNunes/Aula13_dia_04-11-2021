public class Aluno extends Pessoa{

    private String cursos;
    private double notas1;
    private double notas2;

    public void setCursos(String cursos){
        this.cursos = cursos;
    }
    public String getCursos(){
        return this.cursos;
    }

    public void setNotas1(double notas1){
        this.notas1 = notas1;
    }
    public double getNotas1(){
        return this.notas1;
    }

    public void setNotas2(double notas2){
        this.notas2 = notas2;
    }
    public double getNotas2(){
        return this.notas2;
    }

    public double calculaMedia(){
        
        return (this.notas1 + this.notas2) / 2.0;
    }

    public boolean verificaAprovacao(){

        boolean condicao;

        if(calculaMedia() < 6.0){
            condicao = false;
        }else{
            condicao = true;
        }
        return condicao;
    } 



}