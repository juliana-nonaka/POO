package POO;

public class AnimalTeste {

	public static void main(String[] args) {
		
		Cachorro  cachorro = new  Cachorro ( "Cheetos" , 2 , "auau" , 2 );
		Cavalo  cavalo = new  Cavalo ( "max" , 10 , "bluuu" , 10 );
		Preguica  pre = new  Preguica ( "Senhora" , 8 , "bahhhhhh" , 3 );
		
		cachorro . imprimirInfoCão ();
		cachorro . deveCorrerCão ( 12 );
		cachorro . Cachorro ( "auau emitirau" );
		
		cavalo . imprimirInfoCavalo ();
		cavalo . deveCorrerCavalo ( 45 );
		cavalo . emitirSomHorse ( "bluu bluuu" );
		
		pre . imprimirInfoPreguica ();
		pre . deveSubirPreguica ( 20 );
		pre . emitirSomPreguica ( "buhhhhhhh" );
	}

	}

}
