
package livraria;

public class Pessoa 
{
    Pessoa(String nome,int idade, String login, String senha){
        this.idade = idade;
        this.login = login;
        this.nome = nome;
        this.senha = senha;   
    }
    private String nome, login, senha;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    @Override
    public String toString(){
    return "nome"+getNome()+"idade"+getIdade()+"login"+getLogin();
    }
    

    
    
        
}    




    

