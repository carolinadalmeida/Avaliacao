import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class base {
    public static void main (String [] args) {
        List<laboratorio> laboratorios = new ArrayList<>();
        laboratorios.add(new laboratorio("LAB1", 20));
        laboratorios.add(new laboratorio("LAB2", 20));
        laboratorios.add(new laboratorio("LAB3", 20));
        laboratorios.add(new laboratorio("LAB4", 20));
        laboratorios.add(new laboratorio("LAB5", 15));
        laboratorios.add(new laboratorio("LAB6", 15));
        laboratorios.add(new laboratorio("LAB7", 15));
        laboratorios.add(new laboratorio("LAB8", 15));
        laboratorios.add(new laboratorio("LAB9", 15));
        laboratorios.add(new laboratorio("LAB10", 15));
        laboratorios.add(new laboratorio("LAB11", 15));
        laboratorios.add(new laboratorio("LAB12", 30));

        List<alunos> alunos = new ArrayList<>();
        alunos.add(new alunos(20222001, "Aluno001"));
        alunos.add(new alunos(20222002, "Aluno002"));
        alunos.add(new alunos(20222003, "Aluno003"));
        alunos.add(new alunos(20222004, "Aluno004"));
        alunos.add(new alunos(20222005, "Aluno005"));
        alunos.add(new alunos(20222006, "Aluno006"));
        alunos.add(new alunos(20222007, "Aluno007"));
        alunos.add(new alunos(20222008, "Aluno008"));
        alunos.add(new alunos(20222009, "Aluno009"));
        alunos.add(new alunos(20222010, "Aluno010"));
        alunos.add(new alunos(20222011, "Aluno011"));

        List<professor> professores = new ArrayList<>();
        professores.add(new professor("Professor01", new disciplina("LPA005", "Lógica de Programação e Algoritmos")));
        professores.add(new professor("Professor02", new disciplina("ED006", "Estrutura de Dados")));
        professores.add(new professor("Professor03", new disciplina("POO008", "Programação Orientada a Objetos")));
        professores.add(new professor("Professor04", new disciplina("BD011", "Banco de Dados")));
        professores.add(new professor("Professor05", new disciplina("ER012", "Engenharia de Requisitos")));
        professores.add(new professor("Professor06", new disciplina("PDM020", "Programação Para Dispositivos Móveis")));
        professores.add(new professor("Professor07", new disciplina("SD026", "Sistemas Distruibuidos")));
        professores.add(new professor("Professor08", new disciplina("IA038", "Inteligência Artificial")));
        professores.add(new professor("Professor09", new disciplina("PFE048", "Programação Front-End")));
        professores.add(new professor("Professor10", new disciplina("PW049", "Programação WEB")));

        List<curso> cursos = new ArrayList<>();
        cursos.add(new curso("BES", "Bacharelado em Engenharia de Software", 200));
        cursos.add(new curso("ADS", "Análise e Desenvolvimento de Sistemas", 120));
        cursos.add(new curso("JGD", "Jogos Digitais", 90));
        cursos.add(new curso("GTI", "Governança de Tecnologia", 40));
        cursos.add(new curso("INF", "Informática", 20));
        cursos.add(new curso("RDC", "Redes de Computadores", 30));

        List<disciplina> disciplinas = new ArrayList<>();
        disciplinas.add(new disciplina("LPA005", "Lógica de Programação e Algoritmos"));
        disciplinas.add(new disciplina("ED006", "Estrutura de Dados"));
        disciplinas.add(new disciplina("POO008", "Programação Orientada a Objetos"));
        disciplinas.add(new disciplina("BD011", "Banco de Dados"));
        disciplinas.add(new disciplina("ER012", "Engenharia de Requisitos"));
        disciplinas.add(new disciplina("PDM020", "Programação Para Dispositivos Móveis"));
        disciplinas.add(new disciplina("SD026", "Sistemas Distruibuidos"));
        disciplinas.add(new disciplina("IA038", "Inteligência Artificial"));
        disciplinas.add(new disciplina("PFE048", "Programação Front-End"));
        disciplinas.add(new disciplina("PW049", "Programação WEB"));

        System.out.println(cursos);
    }
}
