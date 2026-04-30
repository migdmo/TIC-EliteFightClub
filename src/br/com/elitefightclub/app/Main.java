package br.com.elitefightclub.app;

import br.com.elitefightclub.pessoa.Professor;

public class Main {
    static void main() {
        Professor p1 = new Professor("miguel", "441333", "Jiu-Jitsu", "miguel@email.com");
        System.out.println(p1.exibirIdentificacao());
    }
}
