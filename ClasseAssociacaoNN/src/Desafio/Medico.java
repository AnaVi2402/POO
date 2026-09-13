package Desafio;

import java.util.ArrayList;

public class Medico {
    private String nome;
    private ArrayList<Consulta> consultas;

    public Medico() {
        this("Sem nome");
    }

    public Medico(String nome) {
        this.nome = nome;
        this.consultas = new ArrayList<>();
    }
    public void adicionaConsulta(Consulta consulta){
        this.consultas.add(consulta);
    }
    public void listConsulta(){
        System.out.println("\nSegue consultas realizadas pelo médico " + this.nome + ":");
        for(Consulta consulta : this.consultas){
            System.out.println("Consulta: " + consulta.getNumero() + " | Paciente: "+ consulta.getPaciente().getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
