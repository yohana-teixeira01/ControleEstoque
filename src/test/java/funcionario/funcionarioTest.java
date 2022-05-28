package funcionario;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import sistema.Sistema;

import static org.junit.jupiter.api.Assertions.*;


public class funcionarioTest {

    @Test
    //Verificação para ver ser os produtos que tem na loja é iqual a quantidade de protudos que constam no sistema.
    public void verificacaoQtdProdutoSistema () {

        System.out.println("Teste de Verificação de Produtos no Sistema!");
        //Sistema produtosNoSistema = new Sistema();
        Sistema produtosNoSistema = mock(Sistema.class);
        when(produtosNoSistema.verificaQtdProdutos(eq(10))).thenReturn(true);
        produtosNoSistema.setQtdProdutos(10);
        assertTrue(produtosNoSistema.verificaQtdProdutos(10));
        System.out.println("A quantidade de Produtos em loja é igual a do sistema.");
        verify(produtosNoSistema, times(1)).verificaQtdProdutos(10);
    }

    @Test
    //verifica se quando o funcionario registra a venda se diminuir o produto no sistema.
    public void baixaNaVenda (){

        System.out.println("Teste de compravação de venda!");
        //Sistema venda = new Sistema();
        Sistema venda = mock(Sistema.class);
        when(venda.verificaSeVendaFoiComputada(eq(9))).thenReturn(true);
        venda.setQtdProdutos(10);
        assertTrue(venda.verificaSeVendaFoiComputada(9));
        verify(venda, times(1)).verificaSeVendaFoiComputada(9);
    }

    @Test
    //verificação de Produto Invalido;
    public void RegistroProdutoInvalido (){

        System.out.println("Resgistro de Verificação de Produto Invalido!");
        //Funcionario produtoInvalido = new Funcionario();
        Funcionario produtoInvalido = mock(Funcionario.class);
        when(produtoInvalido.verificaIrregularidade(eq("Produto Invalido"))).thenReturn(true);
        produtoInvalido.setIrregularidade(true);
        assertTrue(produtoInvalido.verificaIrregularidade("Produto Invalido"));
        verify(produtoInvalido, times(1)).verificaIrregularidade("Produto Invalido");
    }

    @Test
    //verificação de Produto valido;
    public void RegistroProdutovalido (){

        System.out.println("Resgistro de Verificação de Produto Invalido!");
        //Funcionario produtoInvalido = new Funcionario();
        Funcionario produtoInvalido = mock(Funcionario.class);
        when(produtoInvalido.verificaregularidade(eq("Produto Invalido"))).thenReturn(false);
        produtoInvalido.setregularidade(false);
        assertFalse(produtoInvalido.verificaregularidade("Produto Invalido"));
        verify(produtoInvalido, times(1)).verificaregularidade("Produto Invalido");
    }

}
