package exercicio03;

import java.util.ArrayList;

public class Casa {
    private String endereco;
    private ArrayList<Comodo> comodos;

    public Casa() {
        this("Sem endereço");
    }

    public Casa(String endereco) {
        this.endereco = endereco;
        this.comodos = new ArrayList<>();
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public ArrayList<Comodo> getComodos() {
        return comodos;
    }

    public void setComodos(ArrayList<Comodo> comodos) {
        this.comodos = comodos;
    }
    public void adicionarComodo (String nome, double areaM2){
        comodos.add(new Comodo (nome,areaM2));
    }
    public void listarComodo() {
        System.out.println("A casa com o endereço: " + this.endereco + " \nPossui: ");
        for (Comodo comodo : this.comodos){
            System.out.println(comodo.toString());
        }
    }
}
