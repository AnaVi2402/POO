public class Cliente {

    private String nome;
    private String email;
    private double limiteCredito;

    public Cliente() {this("sem nome", "sem email", 0.0);}

    public Cliente (String nome, String email, double limiteCredito){
        setNome(nome);
        setEmail(email);
        setLimiteCredito(limiteCredito);
    }

    public String getNome (){return this.nome;}
    public String getEmail(){return this.email;}
    public double getLimiteCredito() {return this.limiteCredito;}

    public void setNome(String nome){
        if (nome == null || nome.length() > 50 || nome.isEmpty()){
            System.out.println("\nNome inválido!");
        }
        else {
            this.nome = nome;
        }
    }
    public void setEmail(String email){
        if(email == null || nome.isEmpty() || !email.contains("@")){
            System.out.println("\nEmail inválido!");
        }
        else{
            this.email = email;
        }
    }
    public void setLimiteCredito(double limiteCredito){
        if(limiteCredito <= 0){
            System.out.println("\nLimite de crédito inválido!");
        }
        else{
            this.limiteCredito = limiteCredito;
        }
    }

    public void exibirDados (){
        System.out.println("\nNome: " + this.nome + "\nEmail: " + this.email + "\nLimite de crédito: " + this.limiteCredito);
    }
}
