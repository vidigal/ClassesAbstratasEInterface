import java.util.ArrayList;
import java.util.Collection;

public abstract class Funcionario implements Impressao {

    private String nome;
    private String cpf;

    private Collection<Endereco> enderecos = new ArrayList<Endereco>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean validarCPF() {
        return true;
    }

    public Double calcularSalario() {
        return 0.0;
    }

    public void addEndereco(Endereco endereco) {
        this.getEnderecos().add(endereco);
    }

    public Collection<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(Collection<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public void imprimirEnderecos() {
        for (Endereco e: getEnderecos()) {
            System.out.println("Logradouro: " + e.getLogradouro() + ", Número: " + e.getNumero());
        }
    }
}
