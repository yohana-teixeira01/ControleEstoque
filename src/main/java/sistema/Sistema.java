package sistema;

public class Sistema {
    private String nomeProduto;
    private int qtd = 10;

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public Sistema() {
        this.nomeProduto = nomeProduto;
        this.qtd = qtd;
    }

    public int setQtdProdutos(int qtd) {

        return qtd;
    }

    public boolean verificaQtdProdutos(int qtdProdutos) {
        if(qtdProdutos > 10 || qtdProdutos < 10){
            throw new IllegalArgumentException("Não está compatível a quantidade de produtos.");
        }
        return true;
    }


    public boolean verificaSeVendaFoiComputada(int valor) {
        if(valor == qtd - 1){
             return true;
    }
        return false;
    }
}
