package domain;
import java.util.List;

public class Atendente extends Pessoa {

    private Double salario;
    private List<Cliente> clientesCadastrados;
    
    public Atendente(String nome, String telefone, Double salario) {
        super(nome, telefone);
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Atendente [nome=" + nome + ", salario=" + salario + ", telefone=" + telefone + ", toString()="
                + super.toString() + ", getNome()=" + getNome() + ", getTelefone()=" + getTelefone() + ", getClass()="
                + getClass() + ", hashCode()=" + hashCode() + "]";
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public List<Cliente> getClientesCadastrados() {
        return clientesCadastrados;
    }

    public void setClientesCadastrados(List<Cliente> clientesCadastrados) {
        this.clientesCadastrados = clientesCadastrados;
    }
    

}
