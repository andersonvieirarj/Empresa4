import java.math.BigDecimal;

public class Gerente extends Empregado{
    private int contEmpregados;
    private Empregado[] subordinados;
    public Gerente (){
        }
    public Gerente (String nome, int matricula, BigDecimal salario){
        super (nome, matricula, salario);
        this.subordinados = new Empregado[3];
        super.setSalario(salario.multiply(BigDecimal.valueOf(1.2)));
    }
    public Gerente(String nome, int matricula, BigDecimal salario, int contEmpregados, Empregado[] subordinados) {
        super(nome, matricula, salario);
        this.contEmpregados = contEmpregados;
        this.subordinados = subordinados;
    }
    public int getContEmpregados() {
        return contEmpregados;
    }
    public void setContEmpregados(int contEmpregados) {
        this.contEmpregados = contEmpregados;
    }
    public Empregado[] getSubordinados() {
        return subordinados;
    }

    public void setSubordinados(Empregado[] subordinados) {
        this.subordinados = subordinados;
    }
}
