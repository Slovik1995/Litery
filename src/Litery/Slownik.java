package Litery;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class Slownik {
	String file;
	Przyporzadkowanie pr;
	public Slownik(String file, Przyporzadkowanie pr){
		this.file=file;
		this.pr=pr;
	}
	
	public LinkedList<Slowo> szukaj(Slowo slowo){
		Reprezentacja reprez = pr.przyporzadkowanie(slowo);
		LinkedList<Slowo> list = new LinkedList<Slowo>();
		BufferedReader br=null;
		try {
			br = new BufferedReader(new FileReader(new File(file)));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String line=null;
		try {
			while((line=br.readLine())!=null){
				Slowo linia = new Slowo(line, pr);
				Reprezentacja rep = pr.przyporzadkowanie(linia);
				if(rep.porownaj(reprez)){
					list.add(linia);
				
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
}
