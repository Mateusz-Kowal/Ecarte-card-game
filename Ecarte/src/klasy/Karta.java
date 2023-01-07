package klasy;

public class Karta
{
	int numer;						// od 0 do 31
	int wartoscInt;					// od 2 do 10, A=11, J=12, Q=13, K=14
	int kolorInt;					// 0=kier, 1=karo, 2=trefl, 3=pik
	String kolorString;				// np TREFL
	String napis;					// np 7♥
	
	Karta (int nr)
	{
		numer = nr;
		switch (numer)
		{
			case 0: napis="7♥"; wartoscInt=7; kolorInt = 0; kolorString = "Kier"; break;
			case 1: napis="8♥"; wartoscInt=8; kolorInt = 0; kolorString = "Kier"; break;
			case 2: napis="9♥"; wartoscInt=9; kolorInt = 0; kolorString = "Kier"; break;
			case 3: napis="10♥"; wartoscInt=10; kolorInt = 0; kolorString = "Kier"; break;
			case 4: napis="A♥"; wartoscInt=11; kolorInt = 0; kolorString = "Kier"; break;
			case 5: napis="J♥"; wartoscInt=12; kolorInt = 0; kolorString = "Kier"; break;
			case 6: napis="Q♥"; wartoscInt=13; kolorInt = 0; kolorString = "Kier"; break;
			case 7: napis="K♥"; wartoscInt=14; kolorInt = 0; kolorString = "Kier"; break;
			case 8: napis="7♦"; wartoscInt=7; kolorInt = 1; kolorString = "Karo"; break;
			case 9: napis="8♦"; wartoscInt=8; kolorInt = 1; kolorString = "Kier"; break;
			case 10: napis="9♦"; wartoscInt=9; kolorInt = 1; kolorString = "Karo"; break;
			case 11: napis="10♦"; wartoscInt=10; kolorInt = 1; kolorString = "Karo"; break;
			case 12: napis="A♦"; wartoscInt=11; kolorInt = 1; kolorString = "Karo"; break;
			case 13: napis="J♦"; wartoscInt=12; kolorInt = 1; kolorString = "Karo"; break;
			case 14: napis="Q♦"; wartoscInt=13; kolorInt = 1; kolorString = "Karo"; break;
			case 15: napis="K♦"; wartoscInt=14; kolorInt = 1; kolorString = "Karo"; break;
			case 16: napis="7♣"; wartoscInt=7; kolorInt = 2; kolorString = "Trefl"; break;
			case 17: napis="8♣"; wartoscInt=8; kolorInt = 2; kolorString = "Trefl"; break;
			case 18: napis="9♣"; wartoscInt=9; kolorInt = 2; kolorString = "Trefl"; break;
			case 19: napis="10♣"; wartoscInt=10; kolorInt = 2; kolorString = "Trefl"; break;
			case 20: napis="A♣"; wartoscInt=11; kolorInt = 2; kolorString = "Trefl"; break;
			case 21: napis="J♣"; wartoscInt=12; kolorInt = 2; kolorString = "Trefl"; break;
			case 22: napis="Q♣"; wartoscInt=13; kolorInt = 2; kolorString = "Trefl"; break;
			case 23: napis="K♣"; wartoscInt=14; kolorInt = 2; kolorString = "Trefl"; break;
			case 24: napis="7♠"; wartoscInt=7; kolorInt = 3; kolorString = "Pik"; break;
			case 25: napis="8♠"; wartoscInt=8; kolorInt = 3; kolorString = "Pik"; break;
			case 26: napis="9♠"; wartoscInt=9; kolorInt = 3; kolorString = "Pik"; break;
			case 27: napis="10♠"; wartoscInt=10; kolorInt = 3; kolorString = "Pik"; break;
			case 28: napis="A♠"; wartoscInt=11; kolorInt = 3; kolorString = "Pik"; break;
			case 29: napis="J♠"; wartoscInt=12; kolorInt = 3; kolorString = "Pik"; break;
			case 30: napis="Q♠"; wartoscInt=13; kolorInt = 3; kolorString = "Pik"; break;
			case 31: napis="K♠"; wartoscInt=14; kolorInt = 3; kolorString = "Pik"; break;
			default: napis="Zły numer karty! ("+nr+")"; break;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	String zamienNumerNaNapis(int nr, boolean b)								// zamienia numer karty na napis (ef. wiz.)
	{
		String napis;
		if (b==true)
		{
			switch (nr)
			{
				case 0: napis="7♥"; break;
				case 1: napis="8♥"; break;
				case 2: napis="9♥"; break;
				case 3: napis="10♥"; break;
				case 4: napis="A♥"; break;
				case 5: napis="J♥"; break;
				case 6: napis="Q♥"; break;
				case 7: napis="K♥"; break;
				case 8: napis="7♦"; break;
				case 9: napis="8♦"; break;
				case 10: napis="9♦"; break;
				case 11: napis="10♦"; break;
				case 12: napis="A♦"; break;
				case 13: napis="J♦"; break;
				case 14: napis="Q♦"; break;
				case 15: napis="K♦"; break;
				case 16: napis="7♣"; break;
				case 17: napis="8♣"; break;
				case 18: napis="9♣"; break;
				case 19: napis="10♣"; break;
				case 20: napis="A♣"; break;
				case 21: napis="J♣"; break;
				case 22: napis="Q♣"; break;
				case 23: napis="K♣"; break;
				case 24: napis="7♠"; break;
				case 25: napis="8♠"; break;
				case 26: napis="9♠"; break;
				case 27: napis="10♠"; break;
				case 28: napis="A♠"; break;
				case 29: napis="J♠"; break;
				case 30: napis="Q♠"; break;
				case 31: napis="K♠"; break;
				default: napis="Zły numer karty! ("+nr+")"; break;
			}
		}
		else
		{
			switch (nr)
			{
				case 1: napis="7♡"; break;
				case 2: napis="8♡"; break;
				case 3: napis="9♡"; break;
				case 4: napis="10♡"; break;
				case 5: napis="A♡"; break;
				case 6: napis="J♡"; break;
				case 7: napis="Q♡"; break;
				case 8: napis="K♡"; break;
				case 9: napis="7♢"; break;
				case 10: napis="8♢"; break;
				case 11: napis="9♢"; break;
				case 12: napis="10♢"; break;
				case 13: napis="A♢"; break;
				case 14: napis="J♢"; break;
				case 15: napis="Q♢"; break;
				case 16: napis="K♢"; break;
				case 17: napis="7♧"; break;
				case 18: napis="8♧"; break;
				case 19: napis="9♧"; break;
				case 20: napis="10♧"; break;
				case 21: napis="A♧"; break;
				case 22: napis="J♧"; break;
				case 23: napis="Q♧"; break;
				case 24: napis="K♧"; break;
				case 25: napis="7♤"; break;
				case 26: napis="8♤"; break;
				case 27: napis="9♤"; break;
				case 28: napis="10♤"; break;
				case 29: napis="A♤"; break;
				case 30: napis="J♤"; break;
				case 31: napis="Q♤"; break;
				case 32: napis="K♤"; break;
				default: napis="Zły numer karty!"; break;
			}
		}
		return napis;
	}
	*/
	
}
