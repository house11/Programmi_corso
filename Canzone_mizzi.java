import java.util.ArrayList;

public class Canzone
{
  public static void main(String[] args)
  {
    String canzone = "It's been a long day without you, my friend And I'll tell you all about it when I see you again We've come a long way from where we began Oh, I'll tell you all about it when I see you again When I see you again Dang, who knew? All the planes we flew Good things we've been through That I'll be standing right here talking to you 'Bout another path I know we loved to hit the road and laugh But something told me that it wouldn't last Had to switch up Look at things different, see the bigger picture Those were the days Hard work forever pays Now I see you in a better place (see you in a better place) Uh How can we not talk about family when family's all that we got? Everything I went through you were standing there by my side And now you gon' be with me for the last ride It's been a long day without you, my friend And I'll tell you all about it when I see you again We've come a long way from where we began Oh, I'll tell you all about it when I see you again When I see you again (Aah oh, aah oh Wooooh-oh-oh-oh-oh-oh) Yeah First you both go out your way And the vibe is feeling strong And what's small turn to a friendship A friendship turn to a bond And that bond will never be broken The love will never get lost And when brotherhood come first Then the line will never be crossed Established it on our own When that line had to be drawn And that line is what we reach So remember me when I'm gone How can we not talk about family when family's all that we got? Everything I went through you were standing there by my side And now you gon' be with me for the last ride So let the light guide your way, yeah Hold every memory as you go And every road you take, will always lead you home, home It's been a long day without you, my friend And I'll tell you all about it when I see you again We've come a long way from where we began Oh, I'll tell you all about it when I see you again When I see you again Aah oh, aah oh Wooooh-oh-oh-oh-oh-oh Yeah When I see you again See you again When I see you again Aah oh, aah oh Wooooh-oh-oh-oh-oh-oh Yeah When I see you again" ;

    ArrayList<String> parole = new ArrayList<>();
  /* prendiamo la prima parola della canzone
  cancelliamo la prima parola dalla cazone
  */

    canzone = canzone + " ";

    while(!canzone.equals(""))
    {
      parole.add(getPrimaParola(canzone));
      canzone = cancellaPrimaParola(canzone);
    }
    System.out.println("timenzione : "+parole);
	
	conta_parola(parole);
  }

  static String getPrimaParola(String canzone)
  {
    return canzone.substring(0, canzone.indexOf(" "));
  }

  static String cancellaPrimaParola(String canzone)
  {
    return canzone.substring(canzone.indexOf(" ") + 1);
  }

static void conta_parola(ArrayList<String> parole)
	{

System.out.println(parole.size());
    int max=0;
    String parolapiuripetuta="";

		while(parole.size()!=0)
		{
			int cont=0;
			String temp=parole.get(0);

			for(int i =0 ; i <= parole.size()-1; i++)
		 	{
		 		if(temp.equals(parole.get(i)))
		 		{
		 			cont++;
		 			parole.remove(i);
		 			//System.out.println(parole);
		 		//	System.out.println(temp+ " : "+ cont);
		 		}
		 	}
		 		if(cont>max) 
		 			{
		 				max=cont; 
		 				parolapiuripetuta=temp+" : "+max;
		 			}

		 	//System.out.println("-----   "+temp+ " : "+ cont);
		}
		//System.out.println(parole);
		System.out.println("parola piu' ripetuta :    "+ parolapiuripetuta);

	}


}
