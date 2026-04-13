package entities;

public class Inquilino {
    private String nome;
    private String email;
    private int numeroQuarto;

    public Inquilino(String nome, String email, int numeroQuarto) {
        this.nome = nome;
        this.email = email;
        this.numeroQuarto = numeroQuarto;
    }

    public String getNome() {
        return this.nome;
    }

    public String getEmail(){
        return this.email;
    }

    public int getNumeroQuarto(){
        return this.numeroQuarto;
    }

    public String toString() {
        return numeroQuarto + ": " + nome + ", " + email;
    }


}
