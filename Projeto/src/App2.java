import java.util.ArrayList;
import java.util.Collection;

public class App2 {

    public static void main(String[] args) {

        Endereco e1 = new Endereco();
        e1.setLogradouro("Rua A");
        e1.setNumero("123");
        Endereco e2 = new Endereco();
        e2.setLogradouro("Rua B");
        e2.setNumero("222");
        Endereco e3 = new Endereco();
        e3.setLogradouro("Rua C");
        e3.setNumero("333");

        Endereco e4 = new Endereco();
        e4.setLogradouro("Rua D");
        e4.setNumero("4544");

        FuncionarioHorista fh = new FuncionarioHorista();
        fh.setNome("João");
        fh.addEndereco(e1);
        fh.addEndereco(e2);
        FuncionarioMensalista fm = new FuncionarioMensalista();
        fm.setNome("Maria");
        fm.addEndereco(e3);

        Cliente c = new Cliente();
        c.setNome("Marcio");
        c.addEndereco(e4);

        Collection<Impressao> pessoas = new ArrayList<Impressao>();
        pessoas.add(fh);
        pessoas.add(fm);
        pessoas.add(c);

        for (Impressao f: pessoas) {
            f.imprimirEnderecos();
        }

    }


}
