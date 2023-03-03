package br.com.ada.polotech.americanas.adapolotechamericanascadastrodecliente;

public class Usuario {
    private String nome;
    private String cpf;

    public Usuario(String nome, String cpf){
        setNome(nome);
        setCpf(cpf);
    }

    public Usuario(){}

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

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
