package aula20200313.primeirasClasses;

public class AppLivro {
	
	//+ main(args : String[]) : void 
	//------------------------------    ==> sublinhado, pois se trata de um m�todo est�tico
	public static void main(String[] args) {
		
		//1� Declara��o da vari�vel "bigJava" do tipo Livro: "Livro bigJava"
		//2� Cria��o de um novo objeto do tipo Livro;
		//   ou
		//   Instancia��o de um Livro: "new Livro()"
		//3� Atribui��o do novo objeto criado para a vari�vel "bigJava"
		//   ou seja, bigJava � uma REFER�NCIA para um objeto em mem�ria.
		/*
		Livro bigJava = new Livro();
		bigJava.titulo = "Big Java 5� Edi��o";
		bigJava.numeroDePaginas = 471;
		bigJava.nomeDoAutor="Cay Horstmann";
		bigJava.preco=279.80;
		bigJava.nomeDaEditora="John Wiley & Sons";
		biJava.anoDePublicacao=2008;
		*/
		Livro bigJava = new Livro("Big Java 5� Edi��o",471,"Cay Horstmann",279.80,"John Wiley & Sons",2008);
		
		Livro bibliaSagrada = null;
		//O c�digo abaixo vai gerar um NullPointerException pois a refer�ncia "bibliaSagrada" est� nula (null);
		//bibliaSagrada.titulo="B�blia Sagrada vers�o King James";
		//bibliaSagrada.numeroDePaginas=2208;
		
		System.out.println("bigJava ===> " + bigJava);
		System.out.println("bibliaSagrada ===> " + bibliaSagrada);
		
	}

}
