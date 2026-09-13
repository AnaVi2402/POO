package Desafio;

public class ConsultaApp {
    public static void main (String[] args){
        Medico m1 = new Medico("Fábio de Melo");
        Medico m2 = new Medico("Eduardo Ruas");
        Medico m3 = new Medico("Mário Jaoaquim");

        Paciente p1 = new Paciente("Fabiola de Fátima");
        Paciente p2 = new Paciente("José Bonifácio");
        Paciente p3 = new Paciente("Marilda Campos");

        Consulta.consultar(200,m1,p1);
        Consulta.consultar(201,m2,p1);
        Consulta.consultar(203,m3,p2);
        Consulta.consultar(204,m3,p3);

        m1.listConsulta();
        m2.listConsulta();
        m3.listConsulta();
    }
}
