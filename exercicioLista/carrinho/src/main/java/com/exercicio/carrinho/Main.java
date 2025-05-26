package com.exercicio.carrinho;

public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.exibirItens();


        carrinho.adicionarItem("Arroz", 5.50, 2);
        carrinho.adicionarItem("Feijão", 7.00, 1);
        carrinho.adicionarItem("Leite", 4.20, 3);
        carrinho.adicionarItem("Macarrão", 6.20, 4);


        carrinho.exibirItens();

        System.out.printf("Valor total: R$ %.2f%n", carrinho.calcularValorTotal());

        carrinho.removerItem("Macarrão");

        carrinho.exibirItens();

        System.out.printf("Novo valor total: R$ %.2f%n", carrinho.calcularValorTotal());
    }

}
