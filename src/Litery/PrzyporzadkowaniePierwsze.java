package Litery;

public class PrzyporzadkowaniePierwsze implements Przyporzadkowanie{

	@Override
	public Reprezentacja przyporzadkowanie(Slowo slowo) {
		long wynik=1;
		for(int i=0; i<slowo.slowo.length(); i++){
			wynik*=znajdzLiczbe(slowo.slowo.charAt(i));
		}
		return new ReprezentacjaPierwsze(wynik);
	}
	
	private long znajdzLiczbe(Character c){
		c=c.toLowerCase(c);
		if(c.equals('a'))
			return 2;
		if(c.equals('b'))
			return 3;
		
		int a = 'a';
		int counter=0;
		long wynik=0;
		while(c>a){
			a++;
			counter++;
		}	
		int i=3;
		while(counter>0){
			boolean war=true;
			for(int k=2; k<i; k++){
				if((i%k)==0){
					war=false;
					break;
				}
					
			}
			wynik=i;
			i++;
			if(war==true)
			counter--;
		}
		return wynik;
	}

}
