public class Aluno extends Pessoa{

    cursos String cursos;
    notas Double notas1;
    notas Double notas2;

    public void setCursos(String cursos){
        this.cursos = cursos;
    }
    public String getCursos(){
        return this.cursos;
    }

    public void setNotas1(Double setNotas1){
        this.notas1 = notas1;
    }
    public Double getNotas1(){
        return this.notas1;
    }

    public void setNotas2(Double setNotas2){
        this.notas2 = notas2;
    }
    public Double getNotas2(){
        return this.notas2;
    }

    public double calculaMedia(){
        
        return (this.notas1 + this.notas2) / 2.0;
    }

    public double verificaAprovacao(){

        boolean condicao;

        if(calculaMedia() < 6.0){
            condicao = false;
        }else{
            coondicao = True;
        }
        return condicao;
    } 



}