public class Funcionario {

    private String nome;
    private double salario;
    private int cargaHorarioSemanal;

    public Funcionario() {
        this("sem nome", 0.0, 0); //contrutor padrão
    }

    public Funcionario(String nome, double salario, int cargaHorarioSemanal) {
        setNome(nome);
        setSalario(salario);
        setCargaHorariaSemanal(cargaHorarioSemanal);
    }

    public String getNome() {
        return this.nome;
    }

    public double getSalario() {
        return this.salario;
    }

    public int getCargaHorarioSemanal() {
        return this.cargaHorarioSemanal;
    }

    public void setNome(String nome) {
        if (nome == null || nome.length() > 50 || nome.isEmpty()) {
            System.out.println("Nome inválido!");
        } else {
            this.nome = nome;
        }
    }

    public void setSalario(double salario) {
        if (salario <= 0) {
            System.out.println("Salário inválido!");
        } else {
            this.salario = salario;
        }
    }

    public void setCargaHorariaSemanal(int cargaHorarioSemanal) {
        if (cargaHorarioSemanal < 1 || cargaHorarioSemanal > 44) {
            System.out.println("Carga horária inválida!");
        } else {
            this.cargaHorarioSemanal = cargaHorarioSemanal;
        }
    }

    public void exibirDados(){
        System.out.println("\nNome: " + this.nome + "\nSalário: " + this.salario + "\nCarga horária: "+ this.cargaHorarioSemanal);
    }
}
