import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Criar uma aplicação que guarde os dados de um Empregado, e em "separado"
// os dados de um Gerente. Monte a aplicação principal para fazer
// a entrada dos dados, organize a lista e mostre a lista organizada
public class Main {
    public static void main(String[] args) {
        // Entrada de dados no objeto
        Empregado igor = new Empregado ("Igor", 100, BigDecimal.valueOf(6000d));
        Empregado helio = new Empregado ("Helio",200, BigDecimal.valueOf(5500d));
        Empregado wallace = new Empregado ("Wallace", 150, BigDecimal.valueOf(5500d));

        // Criação de uma lista em ArrayList, inserindo os objetos
        List<Empregado> listaF1rst = new ArrayList<>();
        listaF1rst.add(igor);
        listaF1rst.add(helio);
        listaF1rst.add(wallace);

        // Remoção de um item da lista
        listaF1rst.remove(igor);

        //Exibição dos dados ANTES DA ORDENAÇÃO
        System.out.println("Antes da Ordenação:");
        for (Empregado lista : listaF1rst){
            System.out.println(lista);
        }

        Collections.sort(listaF1rst);

        //Exibição dos dados DEPOIS DA ORDENAÇÃO
        System.out.println("Depois da Ordenação:");
        for (Empregado lista : listaF1rst){
            System.out.println(lista);
        }




    }
}