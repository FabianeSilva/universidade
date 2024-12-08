package universidade;

import java.time.LocalDate;

public class Pessoa {

    private int idade;
    private String nome;
    private LocalDate dataNascimento;

    private Universidade universidade;

    public Pessoa(String nome, int anoNascimento, int mesNascimento, int diaNascimento) {
        this.nome = nome;
        this.dataNascimento = LocalDate.of(anoNascimento, mesNascimento, diaNascimento);
    }

    public void setUniversidade(Universidade universidade) {
        this.universidade = universidade;
    }

    public void mostraNomeEUniversidade() {
        System.out.println("Nome: " + nome + "\nUniversidade: " + universidade.getNome());
    }

    public void calculaIdade(){
        LocalDate dataAtual = LocalDate.now();

        idade = dataAtual.getYear() - dataNascimento.getYear();
    }

    public int informaIdade() {
        return idade;
    }

    public String informanome() {
        return nome;
    }

    public void ajustaDataDeNascimento(int anoNascimento, int mesNascimento, int diaNascimento) {
        this.dataNascimento = LocalDate.of(anoNascimento, mesNascimento, diaNascimento);
    }
}
