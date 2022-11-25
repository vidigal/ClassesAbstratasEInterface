import java.util.ArrayList;
import java.util.Collection;

public class Cliente implements Impressao {

    private String nome;
    private Collection<Endereco> enderecos = new ArrayList<Endereco>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Collection<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(Collection<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public void addEndereco(Endereco endereco) {
        this.getEnderecos().add(endereco);
    }

    @Override
    public void imprimirEnderecos() {
        for (Endereco e: getEnderecos()) {
            System.out.println("Logradouro: " + e.getLogradouro() + ", Número: " + e.getNumero());
        }
    }
}
