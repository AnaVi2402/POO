package Desafio;

import java.util.ArrayList;

public class Paciente {
    private String nome;
    private ArrayList<Consulta> consultas;

    public Paciente() {
        this("Sem nome");
    }

    public Paciente(String nome) {
        this.nome = nome;
        this.consultas = new ArrayList<>();
    }
    public void adicionaConsulta(Consulta consulta){
        this.consultas.add(consulta);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
