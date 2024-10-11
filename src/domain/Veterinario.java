package domain;

public class Veterinario extends Pessoa {

    private String crmv;

    public Veterinario(String nome, String telefone, String crmv) {
        super(nome, telefone);
        this.crmv = crmv;
    }

    @Override
    public String toString() {
        return "Veterinario [crmv=" + crmv + ", nome=" + nome + ", telefone=" + telefone + ", toString()="
                + super.toString() + ", getNome()=" + getNome() + ", getTelefone()=" + getTelefone() + ", getClass()="
                + getClass() + ", hashCode()=" + hashCode() + "]";
    }

    public String getCrmv() {
        return crmv;
    }

    public void setCrmv(String crmv) {
        this.crmv = crmv;
    }


}
