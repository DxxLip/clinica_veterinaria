package domain;
import java.util.List;

public class Cliente extends Pessoa{

    private String endereço;
    private Atendente cadastradoPor;
    private List<Pet> pets;
    
    public Cliente(String nome, String telefone, String endereço, Atendente cadastradoPor) {
        super(nome, telefone);
        this.endereço = endereço;
        this.cadastradoPor = cadastradoPor;
    }

    @Override
    public String toString() {
        return "Cliente [nome=" + nome + ", endereço=" + endereço + ", telefone=" + telefone + ", cadastradoPor="
                + cadastradoPor + ", toString()=" + super.toString() + ", getNome()=" + getNome() + ", getTelefone()="
                + getTelefone() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public Atendente getCadastradoPor() {
        return cadastradoPor;
    }

    public void setCadastradoPor(Atendente cadastradoPor) {
        this.cadastradoPor = cadastradoPor;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }
    

}
