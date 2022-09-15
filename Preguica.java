package POO;

public class Preguica {

	
private  String  acao ;
	
	public  Preguica ( String  nome , String  emitirSom , int  idade , String  acao ) {
		super ( nome , emitirSom , idade );
		
		isso . acao = acao ;
	}

	public  String  getAcao () {
		retornar  acao ;
	}

	public  void  setAcao ( String  acao ) {
		isso . acao = acao ;
	}
	
	public  void  imprimirDados () {
		Sistema . fora . println ( "\n\t\tDados do animal: \n\nNome: " + getNome ()+ "\nIdade: " + getIdade ()+ "\nEmite o som: " + getEmitirSom ()+ "\nAção: " + acao );
	}
}
