package metodosexercicio1;

public class Main {
    public static void main(String[] args) {

        //Calculadora
        System.out.println("\nExercício Calculadora");
        Calculadora.soma(2, 4);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(5, 5);
        Calculadora.dvisao(5, 2.5);

        //Mensagem
        System.out.println("\nExercício Mensagem");
        Mensagem.obterMensagem(8);
        Mensagem.obterMensagem(15);
        Mensagem.obterMensagem(22);

        //Empréstimo
        System.out.println("\nExercício Empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);
    }
}
