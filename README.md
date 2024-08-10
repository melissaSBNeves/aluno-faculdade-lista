# Projeto Aluno Faculdade

Este projeto consiste em uma aplicação Java que simula a gestão de alunos em uma faculdade. Ele inclui as classes `Aluno` e `Faculdade`, que permitem a manipulação de dados relacionados aos alunos, como matrícula, cancelamento de matrícula e consultas diversas.

## Estrutura do Projeto

- **AlunoFaculdade/Aluno.java**: Representa um aluno da faculdade com atributos como RA (Registro Acadêmico), nome, semestre e estado da matrícula (ativo ou inativo).
- **AlunoFaculdade/Faculdade.java**: Gerencia uma lista de alunos, oferecendo métodos para matricular, cancelar matrícula, verificar a existência de alunos por nome ou RA, e obter informações sobre a quantidade de alunos.
- **AlunoFaculdade/FaculdadeTest.java**: Contém testes unitários utilizando o JUnit para validar o comportamento dos métodos da classe `Faculdade`.

## Funcionalidades

- **Aluno**
  - Atributos:
    - `ra`: Registro Acadêmico do aluno.
    - `nome`: Nome do aluno.
    - `semestre`: Semestre em que o aluno está matriculado.
    - `ativo`: Status da matrícula do aluno.
  - Métodos:
    - Getters e setters para os atributos.
    - `toString()`: Retorna uma representação em string do aluno.

- **Faculdade**
  - Métodos:
    - `existsAlunoPorNome(String nome)`: Verifica se existe um aluno com o nome informado.
    - `existsAlunoPorRa(String ra)`: Verifica se existe um aluno com o RA informado.
    - `matricularAluno(Aluno aluno)`: Matricula um aluno na faculdade, caso não exista um aluno com o mesmo nome.
    - `cancelarMatricula(String ra)`: Cancela a matrícula de um aluno com o RA informado.
    - `getQuantidadeAlunos()`: Retorna a quantidade total de alunos matriculados.
    - `getQuantidadeAlunosPorSemestre(Integer semestre)`: Retorna a quantidade de alunos matriculados em um semestre específico.
    - `getQuantidadeAlunosComMatriculaCancelada()`: Retorna a quantidade de alunos com matrícula cancelada.

## Testes

Os testes estão localizados na classe `FaculdadeTest.java`. Eles validam os seguintes cenários:

- Verificação da existência de um aluno por nome e RA.
- Matricular um aluno, garantindo que não sejam feitas duplicatas.
- Cancelamento de matrícula.
- Verificação da quantidade de alunos por semestre e com matrícula cancelada.
