package Modelos;

public class Carta {
    private String nome;
    private String cor;
    private String custo;
    private int cmc;
    private String tipo;
    private String subtipo;
    private String descricao;
    private String poder;
    private String resistencia;
    private String raridade;
    private String edicao;
    private boolean foil;
    private int quantidade;


    public void setNome(String nome) {
        this.nome = nome;
    };

    public void setCor(String cor) {
        this.cor = cor;
    };

    public void setCusto(String custo) {
        this.custo = custo;
    };

    public void setCmc(int cmc) {
        this.cmc = cmc;
    };

    public void setTipo(String tipo) {
        this.tipo = tipo;
    };

    public void setSubtipo(String subtipo) {
        this.subtipo = subtipo;
    };

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    };

    public void setPoder(String poder) {
        this.poder = poder;
    };

    public void setResistencia(String resistencia) {
        this.resistencia = resistencia;
    };

    public void setRaridade(String raridade) {
        this.raridade = raridade;
    };

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    };

    public void setFoil(boolean foil) {
        this.foil = foil;
    };

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    };

    public void apresentaCarta() {
        System.out.println("Carta: " + nome);
        System.out.println("Cor: " + cor);
        System.out.println("Custo: " + custo);
        System.out.println("CMC: " + cmc);
        System.out.println("Tipo: " + tipo);
        System.out.println("Subtipo: " + subtipo);
        System.out.println("Descrição: " + descricao);
        System.out.println("Ataque/Resistência: " + poder + "/" + resistencia);
        System.out.println("Raridade: " + raridade);
        System.out.println("Edição: " + edicao);
        System.out.println("Foil: " + foil);
        System.out.println("Quantidade: " + quantidade);
    }
}
