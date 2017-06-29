//Creare la classe Somma che legge in input da tastiera con il System.in.read() 2 numeri da 1 a 9 chiesti all'utente e ne visualizzi la somma
class EsSomma_versione3 {
public static void main(String[] args) throws java.io.IOException {
	int somma=0;
	boolean cont=true;
	char carattereNumero;
	do
	{
		
			System.out.println("SCRIVI IL numeri da 1 a 9  se vuoi uscire Premi x :");
		do
		{
			
				carattereNumero = (char)System.in.read();
				
			
		}while(carattereNumero=='\n' | carattereNumero=='\r');

			if(carattereNumero=='x')
			{
			cont=false;  // controllo per contare fino a quando non si preme x
			}else
				{
			       if(carattereNumero>47 && carattereNumero<58 ) //controlla se il carattere premuto e un numero
			       	{
			       		String numeri = ""+carattereNumero; // converte il char in string 
						somma = somma+Integer.parseInt(numeri); // converte string in int e somma
			       		System.out.println("Somma : "+somma+"\n"); // ritorna la somma ad ogni giro
			       	}else
			       	{
						 System.out.println("Non Puoi Sommare Lettere ");
			       	}

				}
	}while(cont);
	System.out.println("Somma : Totale Prima di chiudere: "+somma);
}
}