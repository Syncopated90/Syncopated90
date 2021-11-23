	import java.util.*; //Scanner,
	import java.lang.*; //Math

class BestamDenKortasteVagen

{
	public static void main (String[] args)
	{
		System.out.println("Den Kortaste Vagen\n");

		Scanner in = new Scanner (System.in);
		in.useLocale (Locale.US);

		System.out.println("Skriv in antal stationer i zon 2:");
		int zon2Antal = in.nextInt();
		int[] vagar12 = new int [zon2Antal]; //Vägarna från zon 1 till 2

		System.out.println("Skriv in antal stationer i zon 3:");
		int zon3Antal = in.nextInt();
		int[] vagar34 = new int [zon3Antal]; //Vägarna från zon 3 till 4

		int[][] vagar23 = new int [zon2Antal][zon3Antal]; //Vägarna från zon 2 till 3

		System.out.println("Skriv in avstanden på vagarna mellan startpunkten och de forsta stationerna: ");
		for (int i = 0; i < zon2Antal; i++)
			vagar12[i] = in.nextInt();

		//System.out.println("Skriv in avstanden på vagarna mellan stationerna i zon 2 och 3: ");
		for (int i = 0; i < zon2Antal; i++)
		{
			System.out.print("Skriv in vagen från station " + (i + 1) +" i zon 2 ");
			for (int j = 0; j<zon3Antal; j++)
			{
				System.out.println("till station " + (j + 1) + " i zon 3: ");
				vagar23[i][j] = in.nextInt();
			}

		}

		System.out.println("Skriv in avstanden på vagarna mellan stationerna i zon 3 och slutstationen: ");
			for (int i = 0; i < zon3Antal; i++)
				vagar34[i] = in.nextInt();

		System.out.println("Stationerna på den kortaste vägen är: ");
		for (int i = 0; i < 2; i++)
		{
		System.out.println (DenKortasteVagen.mellanstationer (vagar12, vagar23, vagar34)[i]);
		}
		System.out.println ("Den ar sa har lang: " + DenKortasteVagen.langd (vagar12, vagar23, vagar34));
	}

}