package AlunoFaculdade;

import java.util.ArrayList;
import java.util.List;

public class Faculdade {

    private String nome;
    private List<Aluno> alunos;

    public Faculdade(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }

    /*
        Deve verificar se existe um aluno com o nome informado, caso não exista,
        retorne false;
    */
    public Boolean existsAlunoPorNome(String nome) {

        Boolean existeAluno = false;

        for (int i = 0; i < alunos.size(); i++) {

            if(alunos.get(i).getNome().equalsIgnoreCase(nome)){
                existeAluno = true;
            }

        }

        return existeAluno;
    }


    public Boolean existsAlunoPorRa(String ra) {

        Boolean existeAluno = false;

        for (int i = 0; i < alunos.size(); i++) {
            if(alunos.get(i).getRa().equalsIgnoreCase(ra)){
                existeAluno = true;
            }
        }

        return existeAluno;
    }


    /*
        Deve matricular um aluno na faculdade (inserir na lista), se a lista já
        possuir um aluno com o nome informado, não deve matricular;
    */
    public void matricularAluno(Aluno aluno) {

        if(aluno != null && !existsAlunoPorNome(aluno.getNome())){
            alunos.add(aluno);
        }
    }

    /*
        Deve cancelar a matricula de um aluno na faculdade (ativo = false), se não existir
        um aluno com o RA informado, não faça nada.
    */
    public void cancelarMatricula(String ra) {

            for (int i = 0; i < alunos.size(); i++) {
                if(alunos.get(i).getRa().equals(ra)){
                    Aluno aluno = alunos.get(i);
                    aluno.setAtivo(false);
                }
            }
    }

    /*
        Deve retornar a quantidade de alunos contidos na lista (matriculados);
    */
    public Integer getQuantidadeAlunos() {
        return alunos.size();
    }

    /*
        Deve retornar a quantidade de alunos matriculados (contidos na lista)
        que estão no semestre informado;
    */
    public Integer getQuantidadeAlunosPorSemestre(Integer semestre) {

        Integer somaAlunos = 0;

        for (int i = 0; i < alunos.size(); i++) {

            if (alunos.get(i).getSemestre().equals(semestre)){
                somaAlunos++;
            }

        }
        return somaAlunos;
    }

    /*
        Deve retornar a quantidade de alunos com matricula cancelada (contidos na lista);
    */
    public Integer getQuantidadeAlunosComMatriculaCancelada() {
        Integer somaAlunos = 0;

        for (int i = 0; i < alunos.size(); i++) {

            if(!alunos.get(i).isAtivo()){
                somaAlunos++;
            }
        }

        return somaAlunos;
    }

    public String getNome() {
        return this.nome;
    }
}
