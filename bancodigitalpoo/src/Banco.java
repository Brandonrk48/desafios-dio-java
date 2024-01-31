import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> contas;
    //O banco é composto por diversas contas
    /*
     * O cliente compoe a conta, e por conta disso, da mesma forma que temos a lista de 
     * contas, indiretamente, temos a lista de clientes.
     */

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public List<Conta> getContas(){
        return contas;
    }

    public void setContas (List<Conta> contas){
        this.contas = contas;
    }
}