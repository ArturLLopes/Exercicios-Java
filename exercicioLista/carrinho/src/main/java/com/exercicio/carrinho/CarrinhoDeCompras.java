package com.exercicio.carrinho;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class CarrinhoDeCompras {

private List<Item> itens;

public CarrinhoDeCompras(){
    this.itens = new ArrayList<>();
}

        public void adicionarItem(String nome, double preco, int quantidade){
            itens.add(new Item(nome, preco, quantidade));
            System.out.println( nome + " adicionado ao carrinho de compras!");
        }

        public void removerItem(String nome){
            itens.removeIf(item -> item.getNome().equalsIgnoreCase(nome));

            System.out.println("\n" +  nome +" Removido do carrinho " );
        }

        public double calcularValorTotal(){
            double total = 0.0;
            for (Item i : itens) {
                total += i.getSubtotal();
            }
            return total;
        }

        public void  exibirItens(){
            if (itens.isEmpty()){
                System.out.println("O carrinho esta vazio");
            }else {
                System.out.println("Itens no carrinho " + itens);


            }
        }

}
