import java.util.List;

public class Banco{
//o banco é formado por várias contas(Criar lista de contas)
    private String nome;
    private List<Conta> contas;
    

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public List<Conta> getContas(){
        return contas;
    }

    public void setContas (List<Conta> Contas){
        this.contas = contas;
    }
}