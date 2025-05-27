import Modelos.Carta;

//Mika Snowden, 27/5/2025, 12:32 > Classe utilizada majoritariamente para testes.
public class Main {
    public static void main(String[] args) {
        Carta cartaTeste = new Carta();

        cartaTeste.setNome("Reformadora da Metrópole");
        cartaTeste.setCor("Branca");
        cartaTeste.setCusto("2W");
        cartaTeste.setCmc(3);
        cartaTeste.setTipo("Criatura");
        cartaTeste.setSubtipo("Anjo Clérigo");
        cartaTeste.setDescricao("""
            Voar, vigilância
            Você tem resistência a magia.
            Toda vez que Reformadora da Metrópoloe sofre dano, você ganha aquela quantidade de pontos de vida.""");
        cartaTeste.setPoder("2");
        cartaTeste.setResistencia("3");
        cartaTeste.setRaridade("Rara");
        cartaTeste.setEdicao("Marcha das Máquinas: Consequências (2023)");
        cartaTeste.setFoil(false);
        cartaTeste.setQuantidade(1);

        cartaTeste.apresentaCarta();
    }
}