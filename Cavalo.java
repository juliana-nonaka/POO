package POO;

public class Cavalo estend Animal{

			
			private  String  acao ;
			
			public  Cavalo ( String  nome , String  emitirSom , int  idade , String  acao ) {
				super ( nome , emitirSom , idade );
				
				isso . acao = acao ;
			}

			public  String  getCorrer () {
				retornar  acao ;
			}

			public  void  setCorrer ( String  correr ) {
				isso . acao = correr ;
			}

			public  void  imprimirDados () {
				Sistema . fora . println ( "\n\t\tDados do animal: \n\nNome: " + getNome ()+ "\nIdade: " + getIdade ()+ "\nEmite o som: " + getEmitirSom ()+ "\nAção: " + acao );
			}
}
