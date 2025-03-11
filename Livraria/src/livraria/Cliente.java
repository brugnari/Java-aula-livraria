package livraria;

public class Cliente extends Pessoa implements Usuario {
    private int NumeroCartao;
    Cliente(String nome,int idade,String login, String senha, int numeroCartao)
    {
        super(nome,idade,login,senha);
        this.NumeroCartao = numeroCartao;
    }

    public int getNumeroCartao() {
        return NumeroCartao;
    }

    public void setNumeroCartao(int NumeroCartao) {
        this.NumeroCartao = NumeroCartao;
    }
    @Override
    public void ValidarLogin(String login, String senha){
        if(this.getLogin().equals(login) && this.getLogin().equals(senha)){
            System.out.println("usuario valido");
        }
        else{
        System.out.println("usuario invalido");
        }
    }
    
    
}
