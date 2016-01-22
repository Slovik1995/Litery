package Litery;

import java.util.LinkedList;

public class Test {
	public static void main(String[] s){
		String slow="wumklkooi";
		String plik="C:\\Users\\Jack\\Desktop\\plik.txt";
		
		Przyporzadkowanie pp = new PrzyporzadkowaniePierwsze();
		Slowo slowo = new Slowo(slow,pp);
		Slownik slownik = new Slownik(plik,pp);
		Slowo[] wyniki = Podpowiedz.podpowiedz(slowo, slownik);
		for(int i=0; i<wyniki.length; i++)
			System.out.println(wyniki[i].slowo);
	}
}
