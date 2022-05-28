package funcionario;

public class Funcionario {

    private boolean validade;
    private boolean produto;

    public boolean isValidade() {
        return validade;
    }

    public void setValidade(boolean validade) {
        this.validade = validade;
    }

    public boolean isProduto() {
        return produto;
    }

    public void setProduto(boolean produto) {
        this.produto = produto;
    }

    public Funcionario() {
        this.validade = validade;
        this.produto = produto;
    }

    public void setIrregularidade(boolean sem_validade) {
        validade = true;

    }

    public boolean verificaIrregularidade(String produto_invalido) {
        if(validade == true){
            System.out.println("O produto está irregular, pois não consta a sua validade.");
            return true;
        }
        return false;
    }

    public void setregularidade(boolean com_validade) {
        validade = false;
    }

    public boolean verificaregularidade(String produto_invalido) {
        if(validade == false){
            System.out.println("O produto está regular, pois consta a sua validade.");
            return false;
        }
        return true;
    }
}
