package funcionarios;

import org.junit.jupiter.api.Test;
import sistema.Sistema;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class funcionariosTest {

    @Test
    //Verificação para ver ser os produtos que tem na loja é iqual a quantidade de protudos que constam no sistema.
    public void verificacaoQtdProdutoSistema () {

        System.out.println("Teste de Verificação de Produtos no Sistema!");
        Sistema produtosNoSistema = new Sistema();
        produtosNoSistema.setQtdProdutos(10);
        assertTrue(produtosNoSistema.verificaQtdProdutos(10));
        System.out.println("A quantidade de Produtos em loja é igual a do sistema.");

    }

    @Test
    //verifica se quando o funcionario registra a venda se diminuir o produto no sistema.
    public void baixaNaVenda (){

        System.out.println("Teste de compravação de venda!");
        Sistema venda = new Sistema();
        venda.setQtdProdutos(10);
        assertTrue(venda.verificaSeVendaFoiComputada(9));
    }

    @Test
    //Lança registro de furto
    public void RegistroFurtoLoja (){
        System.out.println("Resgistro de furto!");
    }






}
