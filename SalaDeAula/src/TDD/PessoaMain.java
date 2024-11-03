package TDD;

public class PessoaMain {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(1, "Lucas Miles", "Rua A, 123", 2021001);
        System.out.println("Aluno: " + aluno.getNome() + ", Matrícula: " + aluno.getMatricula());

        Professor professor = new Professor(2, "Rodrigo Curvello", "Rua B, 456", "POO 1");
        System.out.println("Professor: " + professor.getNome() + ", Disciplina: " + professor.getDisciplina());
    }
}