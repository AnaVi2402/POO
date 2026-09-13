package Desafio;

public class Consulta {
    private int numero;
    private Medico medico;
    private Paciente paciente;

    public Consulta() {
        this(0,new Medico(),new Paciente());
    }

    public Consulta(int numero, Medico medico, Paciente paciente) {
        this.numero = numero;
        this.medico = medico;
        this.paciente = paciente;
    }
    public static Consulta consultar (int numero, Medico medico, Paciente paciente){
        Consulta c = new Consulta(numero, medico, paciente);
        medico.adicionaConsulta(c);
        paciente.adicionaConsulta(c);
        return c;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        return "Consulta{" +
                "numero=" + numero +
                ", medico=" + medico +
                ", paciente=" + paciente +
                '}';
    }
}
