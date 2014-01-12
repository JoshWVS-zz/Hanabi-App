package village1studios.hanabi;

public class Card {

	String colour;
	int rank;
	
	public Card(int _colour, int _rank)
	{
		//0=blue, 1=green, 2=red, 3=white, 4=yellow 
		//consideration: should we leave colours as ints?
		switch(_colour)
		{
		case 0: colour = "blue";
		break;
		
		case 1: colour = "green";
		break;
		
		case 2: colour = "red";
		break;
		
		case 3: colour = "white";
		break;
		
		case 4: colour = "yellow";
		break;
		}
		
		rank = _rank;
	}
	
	public String toString()
	{
		return rank + " " + colour;
	}
}
