package Litery;

public class ReprezentacjaPierwsze extends Reprezentacja{
	public ReprezentacjaPierwsze(Long ob){
		reprezentacjaWewnetrzna=ob;
	}

	@Override
	public boolean porownaj(Reprezentacja rep) {
		if(((Long)reprezentacjaWewnetrzna%(Long)rep.reprezentacjaWewnetrzna)==0)
			return true;
		return false;
	}
	

}
