package aula20200320.testesGerais;

public class GerenciadorDeComissao {
	
	public static double calcularComissaoPadrao(double valorDaVenda, double percentualDeComissao) {
		return valorDaVenda * (percentualDeComissao/100.00);
	}

	public static double calcularComissaoComValorMinimo(double valorMinimo, double valorDaVenda, double percentualDeComissao) {
		
		if (valorMinimo > (valorDaVenda * (percentualDeComissao/100.00))) {
			return valorMinimo;
		}
		return calcularComissaoPadrao(valorDaVenda,percentualDeComissao);
	}

	public static double calcularComissaoComFaixa(double valorMinimo, double valorMaximo, double valorDaVenda, double percentualDeComissao) {
		if ( valorMinimo > (valorDaVenda * (percentualDeComissao/100.00)) ) {
			return valorMinimo;
		}
		if ( valorMaximo < (valorDaVenda * (percentualDeComissao/100.00)) ) {
			return valorMaximo;
		}
		return calcularComissaoPadrao(valorDaVenda,percentualDeComissao);
	}
}
	
