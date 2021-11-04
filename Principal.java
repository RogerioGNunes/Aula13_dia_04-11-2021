public class Principal{
    public static void main(String[]args){
        Aluno a = new Aluno();
        Professor p = new Professor();

        //Dados do Aluno
        a.setNome("Rogerio");
        a.setEndereco("Rua B");
        a.setTelefone("11 99999-8877");
        a.setCpf("123.456.789-10");

        //Notas do Aluno
        a.setCursos("Big Data AGronegócio");
        a.setNotas1(10.0);
        a.setNotas2(9.0);

        //Prints
        System.out.println("o aluno");
        System.out.println(a.getNome());
        System.out.println(a.getEndereco());
        System.out.println(a.getTelefone());
        System.out.println(a.getCpf());
        System.out.println(a.getCursos());

        if(a.verificaAprovacao()){
            System.out.println("Aprovado");
        }
        else{
            System.out.println("Reprovado");
            
        }


    }

}