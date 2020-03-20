//aula20200313.primeirasClasses
package aula20200313.primeirasClasses;

//Livro
public class Livro {
	//+ titulo : String
	public String titulo;
	//+ numeroDePaginas : int
	public int numeroDePaginas;
	//+ anoDePublicacao : int
	public int anoDePublicacao;
	//+ nomeDaEditora : String
	public String nomeDaEditora;
	//+ nomeDoAutor : String
	public String nomeDoAutor;
	//+ preco : double
	public double preco;
	
	//CONSTRUTOR ***DEFAULT/PADR�O***: S�o construtores que N�O POSSUEM par�metros
	//+ Livro()
	public Livro() {
		
	}
	
	//CONSTRUTOR ***ALTERNATIVO*** DA CLASSE LIVRO: Construtores alternativos s�o aqueles que POSSUEM par�metros.
	//+ Livro(titulo : String, numeroDePaginas : int, nomeDoAutor : String, preco : double, nomeDaEditora : String, anoDePublicacao : int)
	public Livro(String titulo, int numeroDePaginas, String nomeDoAutor, double preco, String nomeDaEditora, int anoDePublicacao) {
		this.titulo = titulo;
		this.numeroDePaginas = numeroDePaginas;
		this.nomeDoAutor = nomeDoAutor;
		this.preco = preco;
		this.nomeDaEditora = nomeDaEditora;
		this.anoDePublicacao = anoDePublicacao;
		
	}

}
