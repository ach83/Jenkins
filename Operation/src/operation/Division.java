package operation;

public class Division {
	
	public int exe (int val1, int val2) throws Banane{
		int	valeur = 0;
		try{
			valeur = val1 / val2;
		}
		catch (ArithmeticException e){
			throw new Banane("Caprice du client");
		}
		return valeur;
	}

}
