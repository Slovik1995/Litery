package Litery;

import java.util.LinkedList;

public class Podpowiedz {
	public static Slowo[] podpowiedz(Slowo slowo, Slownik slownik){
	 Slowo[] wyniki=null;
	 LinkedList<Slowo> wyn = slownik.szukaj(slowo);
	 if (wyn.size()>0){
		 wyniki = new Slowo[wyn.size()];
		 for(int i=0; i<wyn.size(); i++)
			 wyniki[i] = wyn.get(i);
	 }
	 return wyniki;
	}
}
