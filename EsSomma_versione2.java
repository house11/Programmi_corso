//Creare la classe Somma che legge in input da tastiera con il System.in.read() 2 numeri da 1 a 9 chiesti all'utente e ne visualizzi la somma
class EsSomma_versione2 {
public static void main(String[] args) throws java.io.IOException {
	int carattereNumero, somma=0, cont=2;
	
	do
	{
		
			System.out.println("SCRIVI IL numeri da 1 a 9 :");
		do
		{
			
				carattereNumero =(int) System.in.read(); //prende lintero del carattere premuto in ascii es 0 = 48
				
			
		}while(carattereNumero==10 | carattereNumero==13); // evita il doppo ciclo dello spazio e ritorno a capo

		switch(carattereNumero)
		{
			case 48:
			somma = somma + 0;
			cont--;
			break;
			case 49:
			somma = somma + 1;
			cont--;
			break;
			case 50:
			somma = somma + 2;
			cont--;
			break;
			case 51:
			somma = somma + 3;
			cont--;
			break;
			case 52:
			somma = somma + 4;
			cont--;
			break;
			case 53:
			somma = somma + 5;
			cont--;
			break;
			case 54:
			somma = somma + 6;
			cont--;
			break;
			case 55:
			somma = somma + 7;
			cont--;
			break;
			case 56:
			somma = somma + 8;
			cont--;
			break;
			case 57:
			somma = somma + 9;
			cont--;
			break;
			default:
			System.out.println("Non Puoi Sommare Lettere ");
			break;
		}
		
	 }while(cont>0);
	 System.out.println("Somma : "+somma);
}
}