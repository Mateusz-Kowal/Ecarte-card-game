package klasy;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;

public class MainFrame extends JFrame{

	ArrayList<Karta> rekaRozdajacy;
	ArrayList<Karta> rekaNierozdajacy;
	ArrayList<Integer> wylosowaneKarty;
	Karta atu;
	int liczbaGier;
	int liczbaKierowZagrywajacego;
	int liczbaKarowZagrywajacego;
	int liczbaTrefliZagrywajacego;
	int liczbaPikowZagrywajacego;
	int liczbaKierowOdpowiadajacego;
	int liczbaKarowOdpowiadajacego;
	int liczbaTrefliOdpowiadajacego;
	int liczbaPikowOdpowiadajacego;
	int punktyRozdajacego;
	int punktyNierozdajacego;
	int punktyTotalRozdajacego;
	int punktyTotalNierozdajacego;
	int liczbaZwyciestwRozdajacego;
	int liczbaZwyciestwNierozdajacego;
	int punktyTotalZagrywajacego;
	int punktyTotalOdpowiadajacego;
	int taktykaZagrywajacego;				// 1 - od najniższej karty z najliczniejszego koloru
	int wynik50;							// 2 - od najwyższej karty z najlicziejszego koloru
	int wynik41;							// 3 - od najniższej karty koloru atu
	int wynik32;							// 4 - od najwyższej karty koloru atu
	int wynik23;
	int wynik14;
	int wynik05;
	int wygraneRozdajacegoRunda1;
	int wygraneRozdajacegoRunda2;
	int wygraneRozdajacegoRunda3;
	int wygraneRozdajacegoRunda4;
	int wygraneRozdajacegoRunda5;
	int wygraneNierozdajacegoRunda1;
	int wygraneNierozdajacegoRunda2;
	int wygraneNierozdajacegoRunda3;
	int wygraneNierozdajacegoRunda4;
	int wygraneNierozdajacegoRunda5;
	int wygraneZagrywajacegoRunda1;
	int wygraneZagrywajacegoRunda2;
	int wygraneZagrywajacegoRunda3;
	int wygraneZagrywajacegoRunda4;
	int wygraneZagrywajacegoRunda5;
	int wygraneOdpowiadajacegoRunda1;
	int wygraneOdpowiadajacegoRunda2;
	int wygraneOdpowiadajacegoRunda3;
	int wygraneOdpowiadajacegoRunda4;
	int wygraneOdpowiadajacegoRunda5;
	
	
	public MainFrame()
	{
		super("Ecate simulator");
		setSize(640, 460);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		
		zresetujLiczniki();
		liczbaGier=1;
		taktykaZagrywajacego = 1;
		
		for (int i=0; i<liczbaGier; i++)
		{
			rozgrywka();
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Rozdający zdobył "+punktyTotalRozdajacego+" punktów i wygrał "+liczbaZwyciestwRozdajacego+" razy\t\t"+(punktyTotalRozdajacego*100) / (liczbaGier*5)+"%\t\t"+(liczbaZwyciestwRozdajacego*100) / liczbaGier+"%");
		System.out.println("Nierozdający zdobył "+punktyTotalNierozdajacego+" punktów i wygrał "+liczbaZwyciestwNierozdajacego+" razy\t\t"+(punktyTotalNierozdajacego*100) / (liczbaGier*5)+"%\t\t"+(liczbaZwyciestwNierozdajacego*100) / liczbaGier+"%");
		System.out.println();
		System.out.println("Zagrywający zdobył "+punktyTotalZagrywajacego+" punktów\t\t"+(punktyTotalZagrywajacego*100) / (liczbaGier*5)+"%");
		System.out.println("Odpowiadający zdobył "+punktyTotalOdpowiadajacego+" punktów\t\t"+(punktyTotalOdpowiadajacego*100) / (liczbaGier*5)+"%");
		System.out.println();
		System.out.println("5-0\t"+wynik50+"\t"+(wynik50*100/liczbaGier)+"%");
		System.out.println("4-1\t"+wynik41+"\t"+(wynik41*100/liczbaGier)+"%");
		System.out.println("3-2\t"+wynik32+"\t"+(wynik32*100/liczbaGier)+"%");
		System.out.println("2-3\t"+wynik23+"\t"+(wynik23*100/liczbaGier)+"%");
		System.out.println("1-4\t"+wynik14+"\t"+(wynik14*100/liczbaGier)+"%");
		System.out.println("0-5\t"+wynik05+"\t"+(wynik05*100/liczbaGier)+"%");
	}
	
	void zresetujLiczniki()
	{
		punktyTotalRozdajacego=0;
		punktyTotalNierozdajacego=0;
		liczbaZwyciestwRozdajacego=0;
		liczbaZwyciestwNierozdajacego=0;
		punktyTotalZagrywajacego=0;
		punktyTotalOdpowiadajacego=0;
		wynik50=0;
		wynik41=0;
		wynik32=0;
		wynik23=0;
		wynik14=0;
		wynik05=0;
		wygraneRozdajacegoRunda1=0;
		wygraneRozdajacegoRunda2=0;
		wygraneRozdajacegoRunda3=0;
		wygraneRozdajacegoRunda4=0;
		wygraneRozdajacegoRunda5=0;
		wygraneNierozdajacegoRunda1=0;
		wygraneNierozdajacegoRunda2=0;
		wygraneNierozdajacegoRunda3=0;
		wygraneNierozdajacegoRunda4=0;
		wygraneNierozdajacegoRunda5=0;
		wygraneZagrywajacegoRunda1=0;
		wygraneZagrywajacegoRunda2=0;
		wygraneZagrywajacegoRunda3=0;
		wygraneZagrywajacegoRunda4=0;
		wygraneZagrywajacegoRunda5=0;
		wygraneOdpowiadajacegoRunda1=0;
		wygraneOdpowiadajacegoRunda2=0;
		wygraneOdpowiadajacegoRunda3=0;
		wygraneOdpowiadajacegoRunda4=0;
		wygraneOdpowiadajacegoRunda5=0;
	}
	
	Karta wylosujKarte()														// losuje kartę z potasowanej talii
	{
		Random rand = new Random ();
		int nr = rand.nextInt(32);
		while (wylosowaneKarty.contains(nr))
		{
			nr = rand.nextInt(32);
		}
		wylosowaneKarty.add(nr);
		Karta karta = new Karta(nr);
		return karta;
	}
	
	ArrayList<Karta> posortujReke(ArrayList<Karta> karta)
	{
		ArrayList<Karta> posortowaneKarty = new ArrayList<Karta>();
		int index;
		for (int i=0; i<5; i++)
		{
			Karta min = new Karta(31);
			index=0;
			for (int j=0; j<karta.size(); j++)
			{
				if (karta.get(j).numer<min.numer)
				{
					min = karta.get(j);
					index = j;
				}
			}
			posortowaneKarty.add(min);
			karta.remove(index);
		}
		return posortowaneKarty;
	}
	
	void rozdajKarty()															// rozdaje karty
	{
		rekaRozdajacy = new ArrayList<Karta>();									// resetowanie rozdanych kart
		rekaNierozdajacy = new ArrayList<Karta>();
		wylosowaneKarty = new ArrayList<Integer>();								// -> wszystkie karty możliwe do wylosowania
		for (int i=0; i<5; i++)													// rozdawanie kart rozdającemu
		{
			rekaRozdajacy.add(wylosujKarte());
			rekaNierozdajacy.add(wylosujKarte());
		}
		atu = wylosujKarte();
		rekaRozdajacy = posortujReke(rekaRozdajacy);
		rekaNierozdajacy = posortujReke(rekaNierozdajacy);
	}
	
	int wybierzKarteZagrywajacego (ArrayList<Karta> kartyZagrywajacego)
	{
		liczbaKierowZagrywajacego=0;
		liczbaKarowZagrywajacego=0;
		liczbaTrefliZagrywajacego=0;
		liczbaPikowZagrywajacego=0;
		
		switch (taktykaZagrywajacego)
		{
			case 1:
			{
				for (int i=0; i<kartyZagrywajacego.size(); i++)							// zliczanie kolorów, ale omijamy kolor atu, bo jego nie chcemy zagrać
				{
					if (kartyZagrywajacego.get(i).kolorInt != atu.kolorInt)
					{
						switch (kartyZagrywajacego.get(i).kolorInt)
						{
							case 0: liczbaKierowZagrywajacego++; break;
							case 1: liczbaKarowZagrywajacego++; break;
							case 2: liczbaTrefliZagrywajacego++; break;
							case 3: liczbaPikowZagrywajacego++; break;
						}
					}
				}
				
				if (liczbaKierowZagrywajacego>=liczbaKarowZagrywajacego && liczbaKierowZagrywajacego>=liczbaTrefliZagrywajacego && liczbaKierowZagrywajacego>=liczbaPikowZagrywajacego)
				{
					for (int i=0; i<kartyZagrywajacego.size(); i++)
					{
						if (kartyZagrywajacego.get(i).kolorInt==0)						// jeżeli najwięcej jest kierów, to wybieramy najniższą kartę
						{
							return i;
						}
					}
				}
				if (liczbaKarowZagrywajacego>=liczbaKierowZagrywajacego && liczbaKarowZagrywajacego>=liczbaTrefliZagrywajacego && liczbaKarowZagrywajacego>=liczbaPikowZagrywajacego)
				{
					for (int i=0; i<kartyZagrywajacego.size(); i++)
					{
						if (kartyZagrywajacego.get(i).kolorInt==1)						// jeżeli najwięcej jest karów, to wybieramy najniższą kartę
						{
							return i;
						}
					}
				}
				if (liczbaTrefliZagrywajacego>=liczbaKierowZagrywajacego && liczbaTrefliZagrywajacego>=liczbaKarowZagrywajacego && liczbaTrefliZagrywajacego>=liczbaPikowZagrywajacego)
				{
					for (int i=0; i<kartyZagrywajacego.size(); i++)
					{
						if (kartyZagrywajacego.get(i).kolorInt==2)						// jeżeli najwięcej jest trefli, to wybieramy najniższą kartę
						{
							return i;
						}
					}
				}
				if (liczbaPikowZagrywajacego>=liczbaKierowZagrywajacego && liczbaPikowZagrywajacego>=liczbaKarowZagrywajacego && liczbaPikowZagrywajacego>=liczbaTrefliZagrywajacego)
				{
					for (int i=0; i<kartyZagrywajacego.size(); i++)
					{
						if (kartyZagrywajacego.get(i).kolorInt==3)						// jeżeli najwięcej jest pików, to wybieramy najniższą kartę
						{
							return i;
						}
					}
				}
				
				System.out.println("Chyba błąd przy wyborze karty zagrywającego!");
				return 0;
			}
			case 2:
			{
				for (int i=0; i<kartyZagrywajacego.size(); i++)							// zliczanie kolorów, ale omijamy kolor atu, bo jego nie chcemy zagrać
				{
					if (kartyZagrywajacego.get(i).kolorInt != atu.kolorInt)
					{
						switch (kartyZagrywajacego.get(i).kolorInt)
						{
							case 0: liczbaKierowZagrywajacego++; break;
							case 1: liczbaKarowZagrywajacego++; break;
							case 2: liczbaTrefliZagrywajacego++; break;
							case 3: liczbaPikowZagrywajacego++; break;
						}
					}
				}
				
				if (liczbaKierowZagrywajacego>=liczbaKarowZagrywajacego && liczbaKierowZagrywajacego>=liczbaTrefliZagrywajacego && liczbaKierowZagrywajacego>=liczbaPikowZagrywajacego)
				{
					for (int i=kartyZagrywajacego.size()-1; i>=0; i--)
					{
						if (kartyZagrywajacego.get(i).kolorInt==0)						// jeżeli najwięcej jest kierów, to wybieramy najwyższą kartę
						{
							return i;
						}
					}
				}
				if (liczbaKarowZagrywajacego>=liczbaKierowZagrywajacego && liczbaKarowZagrywajacego>=liczbaTrefliZagrywajacego && liczbaKarowZagrywajacego>=liczbaPikowZagrywajacego)
				{
					for (int i=kartyZagrywajacego.size()-1; i>=0; i--)
					{
						if (kartyZagrywajacego.get(i).kolorInt==1)						// jeżeli najwięcej jest karów, to wybieramy najwyższą kartę
						{
							return i;
						}
					}
				}
				if (liczbaTrefliZagrywajacego>=liczbaKierowZagrywajacego && liczbaTrefliZagrywajacego>=liczbaKarowZagrywajacego && liczbaTrefliZagrywajacego>=liczbaPikowZagrywajacego)
				{
					for (int i=kartyZagrywajacego.size()-1; i>=0; i--)
					{
						if (kartyZagrywajacego.get(i).kolorInt==2)						// jeżeli najwięcej jest trefli, to wybieramy najwyższą kartę
						{
							return i;
						}
					}
				}
				if (liczbaPikowZagrywajacego>=liczbaKierowZagrywajacego && liczbaPikowZagrywajacego>=liczbaKarowZagrywajacego && liczbaPikowZagrywajacego>=liczbaTrefliZagrywajacego)
				{
					for (int i=kartyZagrywajacego.size()-1; i>=0; i--)
					{
						if (kartyZagrywajacego.get(i).kolorInt==3)						// jeżeli najwięcej jest pików, to wybieramy najwyższą kartę
						{
							return i;
						}
					}
				}
				
				System.out.println("Chyba błąd przy wyborze karty zagrywającego!");
				return 0;
			}
		default:
			{
				System.out.println("Błąd w taktyce zagrywającego!");
				return 0;
			}
		}
	}
	
	int wybierzKarteOdpowiadajacego(Karta kartaZagrywajacego, ArrayList<Karta> kartyOdpowiadajacego)			// wybiera którą kartę ma zagrać odbierający (indeks z ręki odpowiadającego)
	{
		int liczbaKartKoloruZagrywajacego=0;													// ile odpowiadający ma kart tego samego koloru co karta zagrywającego
		liczbaKierowOdpowiadajacego=0;
		liczbaKarowOdpowiadajacego=0;
		liczbaTrefliOdpowiadajacego=0;
		liczbaPikowOdpowiadajacego=0;
		
		for (int i = 0; i<kartyOdpowiadajacego.size(); i++)										// przelatujemy po wszystkich kartach odpowiadającego
		{
			if (kartyOdpowiadajacego.get(i).kolorInt == kartaZagrywajacego.kolorInt)				// czy dana karta jest koloru karty zagrywającego
			{
				liczbaKartKoloruZagrywajacego++;
				if (kartyOdpowiadajacego.get(i).wartoscInt>kartaZagrywajacego.wartoscInt)			// czy karta odpowiadającego jest wyższa od karty zagrywającego, jeżeli tak to chcemy wybrać pierwszą najniższą z nich (karty są posortowane od najniższej do najwyższej)
				{
					return i;
				}
			}
		}
		
		if (liczbaKartKoloruZagrywajacego>0)														// jeżeli nie ma wyższej karty, to zagrywamy najniższą, koloru karty rozgrywającego (o ile mamy kartę w tym kolorze)
		{
			for (int i = 0; i<kartyOdpowiadajacego.size(); i++)										// przelatujemy po wszystkich kartach odpowiadającego
			{
				if (kartyOdpowiadajacego.get(i).kolorInt == kartaZagrywajacego.kolorInt)				// czy dana karta jest koloru karty zagrywającego
				{
					return i;
				}
			}
		}
		
		for (int i = 0; i<kartyOdpowiadajacego.size(); i++)											// jeżeli mamy kartę koloru atu, to rzucamy najniższą
		{
			if (kartyOdpowiadajacego.get(i).kolorInt == atu.kolorInt)				// czy dana karta jest koloru atu
			{
				return i;
			}
			switch (kartyOdpowiadajacego.get(i).kolorInt)
			{
				case 0: liczbaKierowOdpowiadajacego++; break;
				case 1: liczbaKarowOdpowiadajacego++; break;
				case 2: liczbaTrefliOdpowiadajacego++; break;
				case 3: liczbaPikowOdpowiadajacego++; break;
			}
		}
		
		if (liczbaKierowOdpowiadajacego>=liczbaKarowOdpowiadajacego && liczbaKierowOdpowiadajacego>=liczbaTrefliOdpowiadajacego && liczbaKierowOdpowiadajacego>=liczbaPikowOdpowiadajacego)
		{
			for (int i=0; i<kartyOdpowiadajacego.size(); i++)
			{
				if (kartyOdpowiadajacego.get(i).kolorInt==0)						// jeżeli najwięcej jest kierów, to wybieramy najniższą kartę, i tak przegramy z zagrywającym, gdyż jest to inny kolor
				{
					return i;
				}
			}
		}
		if (liczbaKarowOdpowiadajacego>=liczbaKierowOdpowiadajacego && liczbaKarowOdpowiadajacego>=liczbaTrefliOdpowiadajacego && liczbaKarowOdpowiadajacego>=liczbaPikowOdpowiadajacego)
		{
			for (int i=0; i<kartyOdpowiadajacego.size(); i++)
			{
				if (kartyOdpowiadajacego.get(i).kolorInt==1)						// jeżeli najwięcej jest karów, to wybieramy najniższą kartę, i tak przegramy z zagrywającym, gdyż jest to inny kolor
				{
					return i;
				}
			}
		}
		if (liczbaTrefliOdpowiadajacego>=liczbaKierowOdpowiadajacego && liczbaTrefliOdpowiadajacego>=liczbaKarowOdpowiadajacego && liczbaTrefliOdpowiadajacego>=liczbaPikowOdpowiadajacego)
		{
			for (int i=0; i<kartyOdpowiadajacego.size(); i++)
			{
				if (kartyOdpowiadajacego.get(i).kolorInt==2)						// jeżeli najwięcej jest trefli, to wybieramy najniższą kartę, i tak przegramy z zagrywającym, gdyż jest to inny kolor
				{
					return i;
				}
			}
		}
		if (liczbaPikowOdpowiadajacego>=liczbaKierowOdpowiadajacego && liczbaPikowOdpowiadajacego>=liczbaKarowOdpowiadajacego && liczbaPikowOdpowiadajacego>=liczbaTrefliOdpowiadajacego)
		{
			for (int i=0; i<kartyOdpowiadajacego.size(); i++)
			{
				if (kartyOdpowiadajacego.get(i).kolorInt==3)						// jeżeli najwięcej jest pików, to wybieramy najniższą kartę, i tak przegramy z zagrywającym, gdyż jest to inny kolor
				{
					return i;
				}
			}
		}
		
		System.out.println("Błąd przy wyborze zagranej karty! (Odpowiadający)");
		return 0;
		
	}
	
	boolean porownajKarty(Karta kartaZagrywajacego, Karta kartaOdpowiadajacego)
	{
		if (kartaZagrywajacego.kolorInt == kartaOdpowiadajacego.kolorInt)
		{
			if (kartaZagrywajacego.wartoscInt>kartaOdpowiadajacego.wartoscInt)
			{
				punktyTotalZagrywajacego++;
				return true;
			}
			else
			{
				punktyTotalOdpowiadajacego++;
				return false;
			}
		}
		if (kartaZagrywajacego.kolorInt == atu.kolorInt)
		{
			punktyTotalZagrywajacego++;
			return true;
		}
		if (kartaOdpowiadajacego.kolorInt == atu.kolorInt)
		{
			punktyTotalOdpowiadajacego++;
			return false;
		}
		if (kartaOdpowiadajacego.kolorInt != kartaZagrywajacego.kolorInt)
		{
			punktyTotalZagrywajacego++;
			return true;
		}
		
		System.out.println("Błąd przy porównaniu karty!");
		return false;
	}
	
	void rozgrywka()															// przebieg jednej gry
	{
		rozdajKarty();
		punktyRozdajacego = 0;
		punktyNierozdajacego = 0;
		
		System.out.println();
		System.out.println();
		System.out.print("Karty rozdającego: ");
		for (int i=0; i<rekaRozdajacy.size(); i++)
		{
			System.out.print(rekaRozdajacy.get(i).napis+" ");
		}
		System.out.println();
		System.out.print("Karty nierozdającego: ");
		for (int i=0; i<rekaNierozdajacy.size(); i++)
		{
			System.out.print(rekaNierozdajacy.get(i).napis+" ");
		}
		System.out.println();
		System.out.println("Wyświęcona karta: "+atu.napis);
		System.out.println("Atu: "+atu.kolorString+"("+atu.kolorInt+")");
		
		
		// START GRY
		
		int indeksWybranejKartyZagrywajacego;
		int indeksWybranejKartyOdpowiadajacego;
		
		indeksWybranejKartyZagrywajacego = wybierzKarteZagrywajacego(rekaRozdajacy);
		indeksWybranejKartyOdpowiadajacego = wybierzKarteOdpowiadajacego(rekaRozdajacy.get(indeksWybranejKartyZagrywajacego), rekaNierozdajacy);
		
		System.out.println("Na kartę rozdającego "+rekaRozdajacy.get(indeksWybranejKartyZagrywajacego).napis+" nierozdajacy odpowiada "+rekaNierozdajacy.get(indeksWybranejKartyOdpowiadajacego).napis);			// rozgrywający rzuca pierwszą kartę, a nierozgrywający decyduje, którą kartę zagrać
		
		if (porownajKarty(rekaRozdajacy.get(indeksWybranejKartyZagrywajacego), rekaNierozdajacy.get(indeksWybranejKartyOdpowiadajacego)) == true)
		{
			System.out.println("Rozdający wygrał! 1-0");										// 1-0 R
			punktyRozdajacego++;
			wygraneRozdajacegoRunda1++;
			rekaRozdajacy.remove(indeksWybranejKartyZagrywajacego);
			rekaNierozdajacy.remove(indeksWybranejKartyOdpowiadajacego);
			
			System.out.println();
			indeksWybranejKartyZagrywajacego = wybierzKarteZagrywajacego(rekaRozdajacy);
			indeksWybranejKartyOdpowiadajacego = wybierzKarteOdpowiadajacego(rekaRozdajacy.get(indeksWybranejKartyZagrywajacego), rekaNierozdajacy);
			System.out.println("Na kartę rozdającego "+rekaRozdajacy.get(indeksWybranejKartyZagrywajacego).napis+" nierozdajacy odpowiada "+rekaNierozdajacy.get(indeksWybranejKartyOdpowiadajacego).napis);
			if (porownajKarty(rekaRozdajacy.get(indeksWybranejKartyZagrywajacego), rekaNierozdajacy.get(indeksWybranejKartyOdpowiadajacego)) == true)
			{
				System.out.println("Rozdający wygrał! 2-0");									// 2-0 RR
				punktyRozdajacego++;
				wygraneRozdajacegoRunda2++;
				rekaRozdajacy.remove(indeksWybranejKartyZagrywajacego);
				rekaNierozdajacy.remove(indeksWybranejKartyOdpowiadajacego);
				
				System.out.println();
				indeksWybranejKartyZagrywajacego = wybierzKarteZagrywajacego(rekaRozdajacy);
				indeksWybranejKartyOdpowiadajacego = wybierzKarteOdpowiadajacego(rekaRozdajacy.get(indeksWybranejKartyZagrywajacego), rekaNierozdajacy);
				System.out.println("Na kartę rozdającego "+rekaRozdajacy.get(indeksWybranejKartyZagrywajacego).napis+" nierozdajacy odpowiada "+rekaNierozdajacy.get(indeksWybranejKartyOdpowiadajacego).napis);
				if (porownajKarty(rekaRozdajacy.get(indeksWybranejKartyZagrywajacego), rekaNierozdajacy.get(indeksWybranejKartyOdpowiadajacego)) == true)
				{
					System.out.println("Rozdający wygrał! 3-0");								// 3-0 RRR
					punktyRozdajacego++;
					wygraneRozdajacegoRunda3++;
					rekaRozdajacy.remove(indeksWybranejKartyZagrywajacego);
					rekaNierozdajacy.remove(indeksWybranejKartyOdpowiadajacego);
					
					System.out.println();
					indeksWybranejKartyZagrywajacego = wybierzKarteZagrywajacego(rekaRozdajacy);
					indeksWybranejKartyOdpowiadajacego = wybierzKarteOdpowiadajacego(rekaRozdajacy.get(indeksWybranejKartyZagrywajacego), rekaNierozdajacy);
					System.out.println("Na kartę rozdającego "+rekaRozdajacy.get(indeksWybranejKartyZagrywajacego).napis+" nierozdajacy odpowiada "+rekaNierozdajacy.get(indeksWybranejKartyOdpowiadajacego).napis);
					if (porownajKarty(rekaRozdajacy.get(indeksWybranejKartyZagrywajacego), rekaNierozdajacy.get(indeksWybranejKartyOdpowiadajacego)) == true)
					{
						System.out.println("Rozdający wygrał! 4-0");							// 4-0 RRRR
						punktyRozdajacego++;
						wygraneRozdajacegoRunda4++;
						rekaRozdajacy.remove(indeksWybranejKartyZagrywajacego);
						rekaNierozdajacy.remove(indeksWybranejKartyOdpowiadajacego);
						
						System.out.println();
						indeksWybranejKartyZagrywajacego = wybierzKarteZagrywajacego(rekaRozdajacy);
						indeksWybranejKartyOdpowiadajacego = wybierzKarteOdpowiadajacego(rekaRozdajacy.get(indeksWybranejKartyZagrywajacego), rekaNierozdajacy);
						System.out.println("Na kartę rozdającego "+rekaRozdajacy.get(indeksWybranejKartyZagrywajacego).napis+" nierozdajacy odpowiada "+rekaNierozdajacy.get(indeksWybranejKartyOdpowiadajacego).napis);
						if (porownajKarty(rekaRozdajacy.get(indeksWybranejKartyZagrywajacego), rekaNierozdajacy.get(indeksWybranejKartyOdpowiadajacego)) == true)
						{
							System.out.println("Rozdający wygrał! 5-0");						// 5-0 RRRRR
							punktyRozdajacego++;
							wygraneRozdajacegoRunda5++;
							rekaRozdajacy.remove(indeksWybranejKartyZagrywajacego);
							rekaNierozdajacy.remove(indeksWybranejKartyOdpowiadajacego);
							
							System.out.println();
							System.out.println("Grę wygrał rozdający! 5-0");
							liczbaZwyciestwRozdajacego++;
							wynik50++;
						}
						else
						{
							System.out.println("Nierozdający wygrał! 4-1");						// 4-1 RRRRN
							punktyNierozdajacego++;
							wygraneNierozdajacegoRunda5++;
							rekaRozdajacy.remove(indeksWybranejKartyZagrywajacego);
							rekaNierozdajacy.remove(indeksWybranejKartyOdpowiadajacego);
							
							System.out.println();
							System.out.println("Grę wygrał rozdający! 4-1");
							liczbaZwyciestwRozdajacego++;
							wynik41++;
						}
					}
					else
					{
						System.out.println("Nierozdający wygrał! 3-1");						// 3-1 RRRN
						punktyNierozdajacego++;
						wygraneNierozdajacegoRunda4++;
						rekaRozdajacy.remove(indeksWybranejKartyZagrywajacego);
						rekaNierozdajacy.remove(indeksWybranejKartyOdpowiadajacego);
						
						System.out.println();
						indeksWybranejKartyZagrywajacego = wybierzKarteZagrywajacego(rekaNierozdajacy);
						indeksWybranejKartyOdpowiadajacego = wybierzKarteOdpowiadajacego(rekaNierozdajacy.get(indeksWybranejKartyZagrywajacego), rekaRozdajacy);
						System.out.println("Na kartę nierozdającego "+rekaNierozdajacy.get(indeksWybranejKartyZagrywajacego).napis+" rozdajacy odpowiada "+rekaRozdajacy.get(indeksWybranejKartyOdpowiadajacego).napis);
						if (porownajKarty(rekaNierozdajacy.get(indeksWybranejKartyZagrywajacego), rekaRozdajacy.get(indeksWybranejKartyOdpowiadajacego)) == false)
						{
							System.out.println("Rozdający wygrał! 4-1");						// 4-1 RRRNR
							punktyRozdajacego++;
							wygraneRozdajacegoRunda5++;
							rekaRozdajacy.remove(indeksWybranejKartyZagrywajacego);
							rekaNierozdajacy.remove(indeksWybranejKartyOdpowiadajacego);
							
							System.out.println();
							System.out.println("Grę wygrał rozdający! 4-1");
							liczbaZwyciestwRozdajacego++;
							wynik41++;
						}
						else
						{
							System.out.println("Nierozdający wygrał! 3-2");						// 3-2 RRRNN
							punktyNierozdajacego++;
							wygraneNierozdajacegoRunda5++;
							rekaRozdajacy.remove(indeksWybranejKartyZagrywajacego);
							rekaNierozdajacy.remove(indeksWybranejKartyOdpowiadajacego);
							
							System.out.println();
							System.out.println("Grę wygrał rozdający! 3-2");
							liczbaZwyciestwRozdajacego++;
							wynik32++;
						}
					}
				}
				else
				{
					System.out.println("Nierozdający wygrał! 2-1");						// 2-1 RRN
					punktyNierozdajacego++;
					wygraneNierozdajacegoRunda3++;
					rekaRozdajacy.remove(indeksWybranejKartyZagrywajacego);
					rekaNierozdajacy.remove(indeksWybranejKartyOdpowiadajacego);
					
					System.out.println();
					indeksWybranejKartyZagrywajacego = wybierzKarteZagrywajacego(rekaNierozdajacy);
					indeksWybranejKartyOdpowiadajacego = wybierzKarteOdpowiadajacego(rekaNierozdajacy.get(indeksWybranejKartyZagrywajacego), rekaRozdajacy);
					System.out.println("Na kartę nierozdającego "+rekaNierozdajacy.get(indeksWybranejKartyZagrywajacego).napis+" rozdajacy odpowiada "+rekaRozdajacy.get(indeksWybranejKartyOdpowiadajacego).napis);
					if (porownajKarty(rekaNierozdajacy.get(indeksWybranejKartyZagrywajacego), rekaRozdajacy.get(indeksWybranejKartyOdpowiadajacego)) == false)
					{
						System.out.println("Rozdający wygrał! 3-1");						// 3-1 RRNR
						punktyRozdajacego++;
						wygraneRozdajacegoRunda4++;
						rekaRozdajacy.remove(indeksWybranejKartyZagrywajacego);
						rekaNierozdajacy.remove(indeksWybranejKartyOdpowiadajacego);
						
						System.out.println();
						indeksWybranejKartyZagrywajacego = wybierzKarteZagrywajacego(rekaRozdajacy);
						indeksWybranejKartyOdpowiadajacego = wybierzKarteOdpowiadajacego(rekaRozdajacy.get(indeksWybranejKartyZagrywajacego), rekaNierozdajacy);
						System.out.println("Na kartę rozdającego "+rekaRozdajacy.get(indeksWybranejKartyZagrywajacego).napis+" nierozdajacy odpowiada "+rekaNierozdajacy.get(indeksWybranejKartyOdpowiadajacego).napis);
						if (porownajKarty(rekaRozdajacy.get(indeksWybranejKartyZagrywajacego), rekaNierozdajacy.get(indeksWybranejKartyOdpowiadajacego)) == true)
						{
							System.out.println("Rozdający wygrał! 4-1");						// 4-1 RRNRR
							punktyRozdajacego++;
							wygraneRozdajacegoRunda5++;
							rekaRozdajacy.remove(indeksWybranejKartyZagrywajacego);
							rekaNierozdajacy.remove(indeksWybranejKartyOdpowiadajacego);
							
							System.out.println();
							System.out.println("Grę wygrał rozdający! 4-1");
							liczbaZwyciestwRozdajacego++;
							wynik41++;
						}
						else
						{
							System.out.println("Nierozdający wygrał! 3-2");						// 3-2 RRNRN
							punktyNierozdajacego++;
							wygraneNierozdajacegoRunda5++;
							rekaRozdajacy.remove(indeksWybranejKartyZagrywajacego);
							rekaNierozdajacy.remove(indeksWybranejKartyOdpowiadajacego);
							
							System.out.println();
							System.out.println("Grę wygrał rozdający! 3-2");
							liczbaZwyciestwRozdajacego++;
							wynik32++;
						}
					}
					else
					{
						System.out.println("Nierozdający wygrał! 2-2");						// 2-2 RRNN
						punktyNierozdajacego++;
						wygraneNierozdajacegoRunda4++;
						rekaRozdajacy.remove(indeksWybranejKartyZagrywajacego);
						rekaNierozdajacy.remove(indeksWybranejKartyOdpowiadajacego);
						
						System.out.println();
						indeksWybranejKartyZagrywajacego = wybierzKarteZagrywajacego(rekaNierozdajacy);
						indeksWybranejKartyOdpowiadajacego = wybierzKarteOdpowiadajacego(rekaNierozdajacy.get(indeksWybranejKartyZagrywajacego), rekaRozdajacy);
						System.out.println("Na kartę nierozdającego "+rekaNierozdajacy.get(indeksWybranejKartyZagrywajacego).napis+" rozdajacy odpowiada "+rekaRozdajacy.get(indeksWybranejKartyOdpowiadajacego).napis);
						if (porownajKarty(rekaNierozdajacy.get(indeksWybranejKartyZagrywajacego), rekaRozdajacy.get(indeksWybranejKartyOdpowiadajacego)) == false)
						{
							System.out.println("Rozdający wygrał! 3-2");						// 3-2 RRNNR
							punktyRozdajacego++;
							wygraneRozdajacegoRunda5++;
							rekaRozdajacy.remove(indeksWybranejKartyZagrywajacego);
							rekaNierozdajacy.remove(indeksWybranejKartyOdpowiadajacego);
							
							System.out.println();
							System.out.println("Grę wygrał rozdający! 3-2");
							liczbaZwyciestwRozdajacego++;
							wynik32++;
						}
						else
						{
							System.out.println("Nierozdający wygrał! 2-3");						// 2-3 RRNNN
							punktyNierozdajacego++;
							wygraneNierozdajacegoRunda5++;
							rekaRozdajacy.remove(indeksWybranejKartyZagrywajacego);
							rekaNierozdajacy.remove(indeksWybranejKartyOdpowiadajacego);
							
							System.out.println();
							System.out.println("Grę wygrał nierozdający! 2-3");
							liczbaZwyciestwNierozdajacego++;
							wynik23++;
						}
					}
				}
			}
			else
			{
				System.out.println("Nierozdający wygrał! 1-1");						// 1-1 RN
				punktyNierozdajacego++;
				wygraneNierozdajacegoRunda2++;
				rekaRozdajacy.remove(indeksWybranejKartyZagrywajacego);
				rekaNierozdajacy.remove(indeksWybranejKartyOdpowiadajacego);
				
				System.out.println();
				indeksWybranejKartyZagrywajacego = wybierzKarteZagrywajacego(rekaNierozdajacy);
				indeksWybranejKartyOdpowiadajacego = wybierzKarteOdpowiadajacego(rekaNierozdajacy.get(indeksWybranejKartyZagrywajacego), rekaRozdajacy);
				System.out.println("Na kartę nierozdającego "+rekaNierozdajacy.get(indeksWybranejKartyZagrywajacego).napis+" rozdajacy odpowiada "+rekaRozdajacy.get(indeksWybranejKartyOdpowiadajacego).napis);
				if (porownajKarty(rekaNierozdajacy.get(indeksWybranejKartyZagrywajacego), rekaRozdajacy.get(indeksWybranejKartyOdpowiadajacego)) == false)
				{
					System.out.println("Rozdający wygrał! 2-1");						// 2-1 RNR
					punktyRozdajacego++;
					wygraneRozdajacegoRunda3++;
					rekaRozdajacy.remove(indeksWybranejKartyZagrywajacego);
					rekaNierozdajacy.remove(indeksWybranejKartyOdpowiadajacego);
					
					System.out.println();
					indeksWybranejKartyZagrywajacego = wybierzKarteZagrywajacego(rekaRozdajacy);
					indeksWybranejKartyOdpowiadajacego = wybierzKarteOdpowiadajacego(rekaRozdajacy.get(indeksWybranejKartyZagrywajacego), rekaNierozdajacy);
					System.out.println("Na kartę rozdającego "+rekaRozdajacy.get(indeksWybranejKartyZagrywajacego).napis+" nierozdajacy odpowiada "+rekaNierozdajacy.get(indeksWybranejKartyOdpowiadajacego).napis);
					if (porownajKarty(rekaRozdajacy.get(indeksWybranejKartyZagrywajacego), rekaNierozdajacy.get(indeksWybranejKartyOdpowiadajacego)) == true)
					{
						System.out.println("Rozdający wygrał! 3-1");						// 3-1 RNRR
						punktyRozdajacego++;
						wygraneRozdajacegoRunda4++;
						rekaRozdajacy.remove(indeksWybranejKartyZagrywajacego);
						rekaNierozdajacy.remove(indeksWybranejKartyOdpowiadajacego);
						
						System.out.println();
						indeksWybranejKartyZagrywajacego = wybierzKarteZagrywajacego(rekaRozdajacy);
						indeksWybranejKartyOdpowiadajacego = wybierzKarteOdpowiadajacego(rekaRozdajacy.get(indeksWybranejKartyZagrywajacego), rekaNierozdajacy);
						System.out.println("Na kartę rozdającego "+rekaRozdajacy.get(indeksWybranejKartyZagrywajacego).napis+" nierozdajacy odpowiada "+rekaNierozdajacy.get(indeksWybranejKartyOdpowiadajacego).napis);
						if (porownajKarty(rekaRozdajacy.get(indeksWybranejKartyZagrywajacego), rekaNierozdajacy.get(indeksWybranejKartyOdpowiadajacego)) == true)
						{
							System.out.println("Rozdający wygrał! 4-1");						// 4-1 RNRRR
							punktyRozdajacego++;
							wygraneRozdajacegoRunda5++;
							rekaRozdajacy.remove(indeksWybranejKartyZagrywajacego);
							rekaNierozdajacy.remove(indeksWybranejKartyOdpowiadajacego);
							
							System.out.println();
							System.out.println("Grę wygrał rozdający! 4-1");
							liczbaZwyciestwRozdajacego++;
							wynik41++;
						}
						else
						{
							System.out.println("Nierozdający wygrał! 3-2");						// 3-2 RNRRN
							punktyNierozdajacego++;
							wygraneNierozdajacegoRunda5++;
							rekaRozdajacy.remove(indeksWybranejKartyZagrywajacego);
							rekaNierozdajacy.remove(indeksWybranejKartyOdpowiadajacego);
							
							System.out.println();
							System.out.println("Grę wygrał rozdający! 3-2");
							liczbaZwyciestwRozdajacego++;
							wynik32++;
						}
					}
					else
					{
						System.out.println("Nierozdający wygrał! 2-2");						// 2-2 RNRN
						punktyNierozdajacego++;
						wygraneNierozdajacegoRunda4++;
						rekaRozdajacy.remove(indeksWybranejKartyZagrywajacego);
						rekaNierozdajacy.remove(indeksWybranejKartyOdpowiadajacego);
						
						System.out.println();
						indeksWybranejKartyZagrywajacego = wybierzKarteZagrywajacego(rekaNierozdajacy);
						indeksWybranejKartyOdpowiadajacego = wybierzKarteOdpowiadajacego(rekaNierozdajacy.get(indeksWybranejKartyZagrywajacego), rekaRozdajacy);
						System.out.println("Na kartę nierozdającego "+rekaNierozdajacy.get(indeksWybranejKartyZagrywajacego).napis+" rozdajacy odpowiada "+rekaRozdajacy.get(indeksWybranejKartyOdpowiadajacego).napis);
						if (porownajKarty(rekaNierozdajacy.get(indeksWybranejKartyZagrywajacego), rekaRozdajacy.get(indeksWybranejKartyOdpowiadajacego)) == false)
						{
							System.out.println("Rozdający wygrał! 3-2");						// 3-2 RNRNR
							punktyRozdajacego++;
							wygraneRozdajacegoRunda5++;
							rekaRozdajacy.remove(indeksWybranejKartyZagrywajacego);
							rekaNierozdajacy.remove(indeksWybranejKartyOdpowiadajacego);
							
							System.out.println();
							System.out.println("Grę wygrał rozdający! 3-2");
							liczbaZwyciestwRozdajacego++;
							wynik32++;
						}
						else
						{
							System.out.println("Nierozdający wygrał! 2-3");						// 2-3 RNRNN
							punktyNierozdajacego++;
							wygraneNierozdajacegoRunda5++;
							rekaRozdajacy.remove(indeksWybranejKartyZagrywajacego);
							rekaNierozdajacy.remove(indeksWybranejKartyOdpowiadajacego);
							
							System.out.println();
							System.out.println("Grę wygrał nierozdający! 2-3");
							liczbaZwyciestwNierozdajacego++;
							wynik23++;
						}
					}
				}
				else
				{
					System.out.println("Nierozdający wygrał! 1-2");						// 1-2 RNN
					punktyNierozdajacego++;
					wygraneNierozdajacegoRunda3++;
					rekaRozdajacy.remove(indeksWybranejKartyZagrywajacego);
					rekaNierozdajacy.remove(indeksWybranejKartyOdpowiadajacego);
					
					System.out.println();
					indeksWybranejKartyZagrywajacego = wybierzKarteZagrywajacego(rekaNierozdajacy);
					indeksWybranejKartyOdpowiadajacego = wybierzKarteOdpowiadajacego(rekaNierozdajacy.get(indeksWybranejKartyZagrywajacego), rekaRozdajacy);
					System.out.println("Na kartę nierozdającego "+rekaNierozdajacy.get(indeksWybranejKartyZagrywajacego).napis+" rozdajacy odpowiada "+rekaRozdajacy.get(indeksWybranejKartyOdpowiadajacego).napis);
					if (porownajKarty(rekaNierozdajacy.get(indeksWybranejKartyZagrywajacego), rekaRozdajacy.get(indeksWybranejKartyOdpowiadajacego)) == false)
					{
						System.out.println("Rozdający wygrał! 2-2");						// 2-2 RNNR
						punktyRozdajacego++;
						wygraneRozdajacegoRunda4++;
						rekaRozdajacy.remove(indeksWybranejKartyZagrywajacego);
						rekaNierozdajacy.remove(indeksWybranejKartyOdpowiadajacego);
						
						System.out.println();
						indeksWybranejKartyZagrywajacego = wybierzKarteZagrywajacego(rekaRozdajacy);
						indeksWybranejKartyOdpowiadajacego = wybierzKarteOdpowiadajacego(rekaRozdajacy.get(indeksWybranejKartyZagrywajacego), rekaNierozdajacy);
						System.out.println("Na kartę rozdającego "+rekaRozdajacy.get(indeksWybranejKartyZagrywajacego).napis+" nierozdajacy odpowiada "+rekaNierozdajacy.get(indeksWybranejKartyOdpowiadajacego).napis);
						if (porownajKarty(rekaRozdajacy.get(indeksWybranejKartyZagrywajacego), rekaNierozdajacy.get(indeksWybranejKartyOdpowiadajacego)) == true)
						{
							System.out.println("Rozdający wygrał! 3-2");						// 3-2 RNNRR
							punktyRozdajacego++;
							wygraneRozdajacegoRunda5++;
							rekaRozdajacy.remove(indeksWybranejKartyZagrywajacego);
							rekaNierozdajacy.remove(indeksWybranejKartyOdpowiadajacego);
							
							System.out.println();
							System.out.println("Grę wygrał rozdający! 3-2");
							liczbaZwyciestwRozdajacego++;
							wynik32++;
						}
						else
						{
							System.out.println("Nierozdający wygrał! 2-3");						// 2-3 RNNRN
							punktyNierozdajacego++;
							wygraneNierozdajacegoRunda5++;
							rekaRozdajacy.remove(indeksWybranejKartyZagrywajacego);
							rekaNierozdajacy.remove(indeksWybranejKartyOdpowiadajacego);
							
							System.out.println();
							System.out.println("Grę wygrał nierozdający! 2-3");
							liczbaZwyciestwNierozdajacego++;
							wynik23++;
						}
					}
					else
					{
						System.out.println("Nierozdający wygrał! 1-3");						// 1-3 RNNN
						punktyNierozdajacego++;
						wygraneNierozdajacegoRunda4++;
						rekaRozdajacy.remove(indeksWybranejKartyZagrywajacego);
						rekaNierozdajacy.remove(indeksWybranejKartyOdpowiadajacego);
						
						System.out.println();
						indeksWybranejKartyZagrywajacego = wybierzKarteZagrywajacego(rekaNierozdajacy);
						indeksWybranejKartyOdpowiadajacego = wybierzKarteOdpowiadajacego(rekaNierozdajacy.get(indeksWybranejKartyZagrywajacego), rekaRozdajacy);
						System.out.println("Na kartę nierozdającego "+rekaNierozdajacy.get(indeksWybranejKartyZagrywajacego).napis+" rozdajacy odpowiada "+rekaRozdajacy.get(indeksWybranejKartyOdpowiadajacego).napis);
						if (porownajKarty(rekaNierozdajacy.get(indeksWybranejKartyZagrywajacego), rekaRozdajacy.get(indeksWybranejKartyOdpowiadajacego)) == false)
						{
							System.out.println("Rozdający wygrał! 2-3");						// 2-3 RNNNR
							punktyRozdajacego++;
							wygraneRozdajacegoRunda5++;
							rekaRozdajacy.remove(indeksWybranejKartyZagrywajacego);
							rekaNierozdajacy.remove(indeksWybranejKartyOdpowiadajacego);
							
							System.out.println();
							System.out.println("Grę wygrał rozdający! 2-3");
							liczbaZwyciestwNierozdajacego++;
							wynik23++;
						}
						else
						{
							System.out.println("Nierozdający wygrał! 1-4");						// 1-4 RNNNN
							punktyNierozdajacego++;
							wygraneNierozdajacegoRunda5++;
							rekaRozdajacy.remove(indeksWybranejKartyZagrywajacego);
							rekaNierozdajacy.remove(indeksWybranejKartyOdpowiadajacego);
							
							System.out.println();
							System.out.println("Grę wygrał nierozdający! 1-4");
							liczbaZwyciestwNierozdajacego++;
							wynik14++;
						}
					}
				}
			}
		}
		
		
		
		else
			
			
			
		{
			System.out.println("Nierozdający wygrał! 0-1");									// 0-1 N
			punktyNierozdajacego++;
			rekaRozdajacy.remove(indeksWybranejKartyZagrywajacego);
			rekaNierozdajacy.remove(indeksWybranejKartyOdpowiadajacego);
			
			System.out.println();
			indeksWybranejKartyZagrywajacego = wybierzKarteZagrywajacego(rekaNierozdajacy);
			indeksWybranejKartyOdpowiadajacego = wybierzKarteOdpowiadajacego(rekaNierozdajacy.get(indeksWybranejKartyZagrywajacego), rekaRozdajacy);
			System.out.println("Na kartę nierozdającego "+rekaNierozdajacy.get(indeksWybranejKartyZagrywajacego).napis+" rozdajacy odpowiada "+rekaRozdajacy.get(indeksWybranejKartyOdpowiadajacego).napis);
			if (porownajKarty(rekaNierozdajacy.get(indeksWybranejKartyZagrywajacego), rekaRozdajacy.get(indeksWybranejKartyOdpowiadajacego)) == false)
			{
				System.out.println("Rozdający wygrał! 1-1");									// 1-1 NR
				punktyRozdajacego++;
				rekaRozdajacy.remove(indeksWybranejKartyZagrywajacego);
				rekaNierozdajacy.remove(indeksWybranejKartyOdpowiadajacego);
				
				System.out.println();
				indeksWybranejKartyZagrywajacego = wybierzKarteZagrywajacego(rekaRozdajacy);
				indeksWybranejKartyOdpowiadajacego = wybierzKarteOdpowiadajacego(rekaRozdajacy.get(indeksWybranejKartyZagrywajacego), rekaNierozdajacy);
				System.out.println("Na kartę rozdającego "+rekaRozdajacy.get(indeksWybranejKartyZagrywajacego).napis+" nierozdajacy odpowiada "+rekaNierozdajacy.get(indeksWybranejKartyOdpowiadajacego).napis);
				if (porownajKarty(rekaRozdajacy.get(indeksWybranejKartyZagrywajacego), rekaNierozdajacy.get(indeksWybranejKartyOdpowiadajacego)) == true)
				{
					System.out.println("Rozdający wygrał! 2-1");								// 2-1 NRR
					punktyRozdajacego++;
					rekaRozdajacy.remove(indeksWybranejKartyZagrywajacego);
					rekaNierozdajacy.remove(indeksWybranejKartyOdpowiadajacego);
					
					System.out.println();
					indeksWybranejKartyZagrywajacego = wybierzKarteZagrywajacego(rekaRozdajacy);
					indeksWybranejKartyOdpowiadajacego = wybierzKarteOdpowiadajacego(rekaRozdajacy.get(indeksWybranejKartyZagrywajacego), rekaNierozdajacy);
					System.out.println("Na kartę rozdającego "+rekaRozdajacy.get(indeksWybranejKartyZagrywajacego).napis+" nierozdajacy odpowiada "+rekaNierozdajacy.get(indeksWybranejKartyOdpowiadajacego).napis);
					if (porownajKarty(rekaRozdajacy.get(indeksWybranejKartyZagrywajacego), rekaNierozdajacy.get(indeksWybranejKartyOdpowiadajacego)) == true)
					{
						System.out.println("Rozdający wygrał! 3-1");							// 3-1 NRRR
						punktyRozdajacego++;
						rekaRozdajacy.remove(indeksWybranejKartyZagrywajacego);
						rekaNierozdajacy.remove(indeksWybranejKartyOdpowiadajacego);
						
						System.out.println();
						indeksWybranejKartyZagrywajacego = wybierzKarteZagrywajacego(rekaRozdajacy);
						indeksWybranejKartyOdpowiadajacego = wybierzKarteOdpowiadajacego(rekaRozdajacy.get(indeksWybranejKartyZagrywajacego), rekaNierozdajacy);
						System.out.println("Na kartę rozdającego "+rekaRozdajacy.get(indeksWybranejKartyZagrywajacego).napis+" nierozdajacy odpowiada "+rekaNierozdajacy.get(indeksWybranejKartyOdpowiadajacego).napis);
						if (porownajKarty(rekaRozdajacy.get(indeksWybranejKartyZagrywajacego), rekaNierozdajacy.get(indeksWybranejKartyOdpowiadajacego)) == true)
						{
							System.out.println("Rozdający wygrał! 4-1");						// 4-1 NRRRR
							punktyRozdajacego++;
							rekaRozdajacy.remove(indeksWybranejKartyZagrywajacego);
							rekaNierozdajacy.remove(indeksWybranejKartyOdpowiadajacego);
							
							System.out.println();
							System.out.println("Grę wygrał rozdający! 4-1");
							liczbaZwyciestwRozdajacego++;
							wynik41++;
						}
						else
						{
							System.out.println("Nierozdający wygrał! 3-2");						// 3-2 NRRRN
							punktyNierozdajacego++;
							rekaRozdajacy.remove(indeksWybranejKartyZagrywajacego);
							rekaNierozdajacy.remove(indeksWybranejKartyOdpowiadajacego);
							
							System.out.println();
							System.out.println("Grę wygrał rozdający! 3-2");
							liczbaZwyciestwRozdajacego++;
							wynik32++;
						}
					}
					else
					{
						System.out.println("Nierozdający wygrał! 2-2");						// 2-2 NRRN
						punktyNierozdajacego++;
						rekaRozdajacy.remove(indeksWybranejKartyZagrywajacego);
						rekaNierozdajacy.remove(indeksWybranejKartyOdpowiadajacego);
						
						System.out.println();
						indeksWybranejKartyZagrywajacego = wybierzKarteZagrywajacego(rekaNierozdajacy);
						indeksWybranejKartyOdpowiadajacego = wybierzKarteOdpowiadajacego(rekaNierozdajacy.get(indeksWybranejKartyZagrywajacego), rekaRozdajacy);
						System.out.println("Na kartę nierozdającego "+rekaNierozdajacy.get(indeksWybranejKartyZagrywajacego).napis+" rozdajacy odpowiada "+rekaRozdajacy.get(indeksWybranejKartyOdpowiadajacego).napis);
						if (porownajKarty(rekaNierozdajacy.get(indeksWybranejKartyZagrywajacego), rekaRozdajacy.get(indeksWybranejKartyOdpowiadajacego)) == false)
						{
							System.out.println("Rozdający wygrał! 3-2");						// 4-1 NRRNR
							punktyRozdajacego++;
							rekaRozdajacy.remove(indeksWybranejKartyZagrywajacego);
							rekaNierozdajacy.remove(indeksWybranejKartyOdpowiadajacego);
							
							System.out.println();
							System.out.println("Grę wygrał rozdający! 3-2");
							liczbaZwyciestwRozdajacego++;
							wynik32++;
						}
						else
						{
							System.out.println("Nierozdający wygrał! 2-3");						// 2-3 NRRNN
							punktyNierozdajacego++;
							rekaRozdajacy.remove(indeksWybranejKartyZagrywajacego);
							rekaNierozdajacy.remove(indeksWybranejKartyOdpowiadajacego);
							
							System.out.println();
							System.out.println("Grę wygrał nierozdający! 2-3");
							liczbaZwyciestwNierozdajacego++;
							wynik23++;
						}
					}
				}
				else
				{
					System.out.println("Nierozdający wygrał! 1-2");						// 1-2 NRN
					punktyNierozdajacego++;
					rekaRozdajacy.remove(indeksWybranejKartyZagrywajacego);
					rekaNierozdajacy.remove(indeksWybranejKartyOdpowiadajacego);
					
					System.out.println();
					indeksWybranejKartyZagrywajacego = wybierzKarteZagrywajacego(rekaNierozdajacy);
					indeksWybranejKartyOdpowiadajacego = wybierzKarteOdpowiadajacego(rekaNierozdajacy.get(indeksWybranejKartyZagrywajacego), rekaRozdajacy);
					System.out.println("Na kartę nierozdającego "+rekaNierozdajacy.get(indeksWybranejKartyZagrywajacego).napis+" rozdajacy odpowiada "+rekaRozdajacy.get(indeksWybranejKartyOdpowiadajacego).napis);
					if (porownajKarty(rekaNierozdajacy.get(indeksWybranejKartyZagrywajacego), rekaRozdajacy.get(indeksWybranejKartyOdpowiadajacego)) == false)
					{
						System.out.println("Rozdający wygrał! 2-2");						// 3-1 NRNR
						punktyRozdajacego++;
						rekaRozdajacy.remove(indeksWybranejKartyZagrywajacego);
						rekaNierozdajacy.remove(indeksWybranejKartyOdpowiadajacego);
						
						System.out.println();
						indeksWybranejKartyZagrywajacego = wybierzKarteZagrywajacego(rekaRozdajacy);
						indeksWybranejKartyOdpowiadajacego = wybierzKarteOdpowiadajacego(rekaRozdajacy.get(indeksWybranejKartyZagrywajacego), rekaNierozdajacy);
						System.out.println("Na kartę rozdającego "+rekaRozdajacy.get(indeksWybranejKartyZagrywajacego).napis+" nierozdajacy odpowiada "+rekaNierozdajacy.get(indeksWybranejKartyOdpowiadajacego).napis);
						if (porownajKarty(rekaRozdajacy.get(indeksWybranejKartyZagrywajacego), rekaNierozdajacy.get(indeksWybranejKartyOdpowiadajacego)) == true)
						{
							System.out.println("Rozdający wygrał! 3-2");						// 3-2 NRNRR
							punktyRozdajacego++;
							rekaRozdajacy.remove(indeksWybranejKartyZagrywajacego);
							rekaNierozdajacy.remove(indeksWybranejKartyOdpowiadajacego);
							
							System.out.println();
							System.out.println("Grę wygrał rozdający! 3-2");
							liczbaZwyciestwRozdajacego++;
							wynik32++;
						}
						else
						{
							System.out.println("Nierozdający wygrał! 2-3");						// 3-2 NRNRN
							punktyNierozdajacego++;
							rekaRozdajacy.remove(indeksWybranejKartyZagrywajacego);
							rekaNierozdajacy.remove(indeksWybranejKartyOdpowiadajacego);
							
							System.out.println();
							System.out.println("Grę wygrał nierozdający! 2-3");
							liczbaZwyciestwNierozdajacego++;
							wynik23++;
						}
					}
					else
					{
						System.out.println("Nierozdający wygrał! 1-3");						// 1-3 NRNN
						punktyNierozdajacego++;
						rekaRozdajacy.remove(indeksWybranejKartyZagrywajacego);
						rekaNierozdajacy.remove(indeksWybranejKartyOdpowiadajacego);
						
						System.out.println();
						indeksWybranejKartyZagrywajacego = wybierzKarteZagrywajacego(rekaNierozdajacy);
						indeksWybranejKartyOdpowiadajacego = wybierzKarteOdpowiadajacego(rekaNierozdajacy.get(indeksWybranejKartyZagrywajacego), rekaRozdajacy);
						System.out.println("Na kartę nierozdającego "+rekaNierozdajacy.get(indeksWybranejKartyZagrywajacego).napis+" rozdajacy odpowiada "+rekaRozdajacy.get(indeksWybranejKartyOdpowiadajacego).napis);
						if (porownajKarty(rekaNierozdajacy.get(indeksWybranejKartyZagrywajacego), rekaRozdajacy.get(indeksWybranejKartyOdpowiadajacego)) == false)
						{
							System.out.println("Rozdający wygrał! 2-3");						// 2-3 NRNNR
							punktyRozdajacego++;
							rekaRozdajacy.remove(indeksWybranejKartyZagrywajacego);
							rekaNierozdajacy.remove(indeksWybranejKartyOdpowiadajacego);
							
							System.out.println();
							System.out.println("Grę wygrał nierozdający! 2-3");
							liczbaZwyciestwNierozdajacego++;
							wynik23++;
						}
						else
						{
							System.out.println("Nierozdający wygrał! 1-4");						// 1-4 NRNNN
							punktyNierozdajacego++;
							rekaRozdajacy.remove(indeksWybranejKartyZagrywajacego);
							rekaNierozdajacy.remove(indeksWybranejKartyOdpowiadajacego);
							
							System.out.println();
							System.out.println("Grę wygrał nierozdający! 1-4");
							liczbaZwyciestwNierozdajacego++;
							wynik14++;
						}
					}
				}
			}
			else
			{
				System.out.println("Nierozdający wygrał! 0-2");						// 0-2 NN
				punktyNierozdajacego++;
				rekaRozdajacy.remove(indeksWybranejKartyZagrywajacego);
				rekaNierozdajacy.remove(indeksWybranejKartyOdpowiadajacego);
				
				System.out.println();
				indeksWybranejKartyZagrywajacego = wybierzKarteZagrywajacego(rekaNierozdajacy);
				indeksWybranejKartyOdpowiadajacego = wybierzKarteOdpowiadajacego(rekaNierozdajacy.get(indeksWybranejKartyZagrywajacego), rekaRozdajacy);
				System.out.println("Na kartę nierozdającego "+rekaNierozdajacy.get(indeksWybranejKartyZagrywajacego).napis+" rozdajacy odpowiada "+rekaRozdajacy.get(indeksWybranejKartyOdpowiadajacego).napis);
				if (porownajKarty(rekaNierozdajacy.get(indeksWybranejKartyZagrywajacego), rekaRozdajacy.get(indeksWybranejKartyOdpowiadajacego)) == false)
				{
					System.out.println("Rozdający wygrał! 1-2");						// 1-2 NNR
					punktyRozdajacego++;
					rekaRozdajacy.remove(indeksWybranejKartyZagrywajacego);
					rekaNierozdajacy.remove(indeksWybranejKartyOdpowiadajacego);
					
					System.out.println();
					indeksWybranejKartyZagrywajacego = wybierzKarteZagrywajacego(rekaRozdajacy);
					indeksWybranejKartyOdpowiadajacego = wybierzKarteOdpowiadajacego(rekaRozdajacy.get(indeksWybranejKartyZagrywajacego), rekaNierozdajacy);
					System.out.println("Na kartę rozdającego "+rekaRozdajacy.get(indeksWybranejKartyZagrywajacego).napis+" nierozdajacy odpowiada "+rekaNierozdajacy.get(indeksWybranejKartyOdpowiadajacego).napis);
					if (porownajKarty(rekaRozdajacy.get(indeksWybranejKartyZagrywajacego), rekaNierozdajacy.get(indeksWybranejKartyOdpowiadajacego)) == true)
					{
						System.out.println("Rozdający wygrał! 2-2");						// 2-2 NNRR
						punktyRozdajacego++;
						rekaRozdajacy.remove(indeksWybranejKartyZagrywajacego);
						rekaNierozdajacy.remove(indeksWybranejKartyOdpowiadajacego);
						
						System.out.println();
						indeksWybranejKartyZagrywajacego = wybierzKarteZagrywajacego(rekaRozdajacy);
						indeksWybranejKartyOdpowiadajacego = wybierzKarteOdpowiadajacego(rekaRozdajacy.get(indeksWybranejKartyZagrywajacego), rekaNierozdajacy);
						System.out.println("Na kartę rozdającego "+rekaRozdajacy.get(indeksWybranejKartyZagrywajacego).napis+" nierozdajacy odpowiada "+rekaNierozdajacy.get(indeksWybranejKartyOdpowiadajacego).napis);
						if (porownajKarty(rekaRozdajacy.get(indeksWybranejKartyZagrywajacego), rekaNierozdajacy.get(indeksWybranejKartyOdpowiadajacego)) == true)
						{
							System.out.println("Rozdający wygrał! 3-2");						// 3-2 NNRRR
							punktyRozdajacego++;
							rekaRozdajacy.remove(indeksWybranejKartyZagrywajacego);
							rekaNierozdajacy.remove(indeksWybranejKartyOdpowiadajacego);
							
							System.out.println();
							System.out.println("Grę wygrał rozdający! 3-2");
							liczbaZwyciestwRozdajacego++;
							wynik32++;
						}
						else
						{
							System.out.println("Nierozdający wygrał! 2-3");						// 2-3 NNRRN
							punktyNierozdajacego++;
							rekaRozdajacy.remove(indeksWybranejKartyZagrywajacego);
							rekaNierozdajacy.remove(indeksWybranejKartyOdpowiadajacego);
							
							System.out.println();
							System.out.println("Grę wygrał nierozdający! 2-3");
							liczbaZwyciestwNierozdajacego++;
							wynik23++;
						}
					}
					else
					{
						System.out.println("Nierozdający wygrał! 1-3");						// 1-3 NNRN
						punktyNierozdajacego++;
						rekaRozdajacy.remove(indeksWybranejKartyZagrywajacego);
						rekaNierozdajacy.remove(indeksWybranejKartyOdpowiadajacego);
						
						System.out.println();
						indeksWybranejKartyZagrywajacego = wybierzKarteZagrywajacego(rekaNierozdajacy);
						indeksWybranejKartyOdpowiadajacego = wybierzKarteOdpowiadajacego(rekaNierozdajacy.get(indeksWybranejKartyZagrywajacego), rekaRozdajacy);
						System.out.println("Na kartę nierozdającego "+rekaNierozdajacy.get(indeksWybranejKartyZagrywajacego).napis+" rozdajacy odpowiada "+rekaRozdajacy.get(indeksWybranejKartyOdpowiadajacego).napis);
						if (porownajKarty(rekaNierozdajacy.get(indeksWybranejKartyZagrywajacego), rekaRozdajacy.get(indeksWybranejKartyOdpowiadajacego)) == false)
						{
							System.out.println("Rozdający wygrał! 2-3");						// 2-3 NNRNR
							punktyRozdajacego++;
							rekaRozdajacy.remove(indeksWybranejKartyZagrywajacego);
							rekaNierozdajacy.remove(indeksWybranejKartyOdpowiadajacego);
							
							System.out.println();
							System.out.println("Grę wygrał nierozdający! 2-3");
							liczbaZwyciestwNierozdajacego++;
							wynik23++;
						}
						else
						{
							System.out.println("Nierozdający wygrał! 1-4");						// 1-4 NNRNN
							punktyNierozdajacego++;
							rekaRozdajacy.remove(indeksWybranejKartyZagrywajacego);
							rekaNierozdajacy.remove(indeksWybranejKartyOdpowiadajacego);
							
							System.out.println();
							System.out.println("Grę wygrał nierozdający! 1-4");
							liczbaZwyciestwNierozdajacego++;
							wynik14++;
						}
					}
				}
				else
				{
					System.out.println("Nierozdający wygrał! 0-3");						// 0-3 NNN
					punktyNierozdajacego++;
					rekaRozdajacy.remove(indeksWybranejKartyZagrywajacego);
					rekaNierozdajacy.remove(indeksWybranejKartyOdpowiadajacego);
					
					System.out.println();
					indeksWybranejKartyZagrywajacego = wybierzKarteZagrywajacego(rekaNierozdajacy);
					indeksWybranejKartyOdpowiadajacego = wybierzKarteOdpowiadajacego(rekaNierozdajacy.get(indeksWybranejKartyZagrywajacego), rekaRozdajacy);
					System.out.println("Na kartę nierozdającego "+rekaNierozdajacy.get(indeksWybranejKartyZagrywajacego).napis+" rozdajacy odpowiada "+rekaRozdajacy.get(indeksWybranejKartyOdpowiadajacego).napis);
					if (porownajKarty(rekaNierozdajacy.get(indeksWybranejKartyZagrywajacego), rekaRozdajacy.get(indeksWybranejKartyOdpowiadajacego)) == false)
					{
						System.out.println("Rozdający wygrał! 1-3");						// 1-3 NNNR
						punktyRozdajacego++;
						rekaRozdajacy.remove(indeksWybranejKartyZagrywajacego);
						rekaNierozdajacy.remove(indeksWybranejKartyOdpowiadajacego);
						
						System.out.println();
						indeksWybranejKartyZagrywajacego = wybierzKarteZagrywajacego(rekaRozdajacy);
						indeksWybranejKartyOdpowiadajacego = wybierzKarteOdpowiadajacego(rekaRozdajacy.get(indeksWybranejKartyZagrywajacego), rekaNierozdajacy);
						System.out.println("Na kartę rozdającego "+rekaRozdajacy.get(indeksWybranejKartyZagrywajacego).napis+" nierozdajacy odpowiada "+rekaNierozdajacy.get(indeksWybranejKartyOdpowiadajacego).napis);
						if (porownajKarty(rekaRozdajacy.get(indeksWybranejKartyZagrywajacego), rekaNierozdajacy.get(indeksWybranejKartyOdpowiadajacego)) == true)
						{
							System.out.println("Rozdający wygrał! 2-3");						// 2-3 NNNRR
							punktyRozdajacego++;
							rekaRozdajacy.remove(indeksWybranejKartyZagrywajacego);
							rekaNierozdajacy.remove(indeksWybranejKartyOdpowiadajacego);
							
							System.out.println();
							System.out.println("Grę wygrał nierozdający! 2-3");
							liczbaZwyciestwNierozdajacego++;
							wynik23++;
						}
						else
						{
							System.out.println("Nierozdający wygrał! 1-4");						// 1-4 NNNRN
							punktyNierozdajacego++;
							rekaRozdajacy.remove(indeksWybranejKartyZagrywajacego);
							rekaNierozdajacy.remove(indeksWybranejKartyOdpowiadajacego);
							
							System.out.println();
							System.out.println("Grę wygrał nierozdający! 1-4");
							liczbaZwyciestwNierozdajacego++;
							wynik14++;
						}
					}
					else
					{
						System.out.println("Nierozdający wygrał! 0-4");						// 0-4 NNNN
						punktyNierozdajacego++;
						rekaRozdajacy.remove(indeksWybranejKartyZagrywajacego);
						rekaNierozdajacy.remove(indeksWybranejKartyOdpowiadajacego);
						
						System.out.println();
						indeksWybranejKartyZagrywajacego = wybierzKarteZagrywajacego(rekaNierozdajacy);
						indeksWybranejKartyOdpowiadajacego = wybierzKarteOdpowiadajacego(rekaNierozdajacy.get(indeksWybranejKartyZagrywajacego), rekaRozdajacy);
						System.out.println("Na kartę nierozdającego "+rekaNierozdajacy.get(indeksWybranejKartyZagrywajacego).napis+" rozdajacy odpowiada "+rekaRozdajacy.get(indeksWybranejKartyOdpowiadajacego).napis);
						if (porownajKarty(rekaNierozdajacy.get(indeksWybranejKartyZagrywajacego), rekaRozdajacy.get(indeksWybranejKartyOdpowiadajacego)) == false)
						{
							System.out.println("Rozdający wygrał! 1-4");						// 1-4 NNNNR
							punktyRozdajacego++;
							rekaRozdajacy.remove(indeksWybranejKartyZagrywajacego);
							rekaNierozdajacy.remove(indeksWybranejKartyOdpowiadajacego);
							
							System.out.println();
							System.out.println("Grę wygrał rozdający! 1-4");
							liczbaZwyciestwNierozdajacego++;
							wynik14++;
						}
						else
						{
							System.out.println("Nierozdający wygrał! 0-5");						// 0-5 NNNNN
							punktyNierozdajacego++;
							rekaRozdajacy.remove(indeksWybranejKartyZagrywajacego);
							rekaNierozdajacy.remove(indeksWybranejKartyOdpowiadajacego);
							
							System.out.println();
							System.out.println("Grę wygrał nierozdający! 0-5");
							liczbaZwyciestwNierozdajacego++;
							wynik05++;
						}
					}
				}
			}
		}
		
		punktyTotalRozdajacego+=punktyRozdajacego;
		punktyTotalNierozdajacego+=punktyNierozdajacego;
	}

	public static void main(String[] args) 
	{
		JFrame okno = new MainFrame();
	//	okno.setVisible(true);
	//	okno.setLocationRelativeTo(null);
	}

}
