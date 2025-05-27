package Modelos;

public class Carta {
    String nome;
    String custo;
    String tipo;
    String subtipo;
    String descricao;
    String ataque;
    String resistencia;

    void apresentaCarta() {
        System.out.println("Carta: " + nome);
        System.out.println("Custo: " + custo);
        System.out.println("Tipo: " + tipo);
        System.out.println("Subtipo: " + subtipo);
    }
}
