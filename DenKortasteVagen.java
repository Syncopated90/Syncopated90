	import java.lang.*; //math

class DenKortasteVagen
{
	public static int[] mellanstationer (int[] a, int[][] b, int[] c) //Vilka stationer som ingår i den kortaste vägen
	{
		int[][] avstand = new int [a.length][c.length];//skapar ny vektor avstand och samlar alla vägar i den
		for (int i = 0; i < a.length; i++)
						{
							for(int j = 0; j < c.length; j++)
								avstand[i][j] = a[i] + b[i][j] + c[j];
						}

		int[] mellanstationer = new int [2]; //vektorn som ska returneras
		int langd = avstand[0][0];

		for (int i = 0; i < avstand.length; i++)
		{
			for (int j = 0; j < avstand[0].length; j++)
			{
				if (langd > avstand[i][j])
				{
					langd = avstand[i][j];
					mellanstationer[0] = i;
					mellanstationer[1] = j;
				}
			}
		}

	return mellanstationer;
	}

	public static int langd (int[] a, int[][] b, int[] c) //Längden på den kortaste vägen
	{
		int[][] avstand = new int [a.length][c.length]; // avstand samlar alla avstånden i en vektor
				for (int i = 0; i < a.length; i++)
				{
					for(int j = 0; j < c.length; j++)
						avstand[i][j] = a[i] + b[i][j] + c[j];
				}

		int langd = avstand[0][0];

		for (int i = 0; i < avstand.length; i++) //hittar minsta avståndet och tilldelar det värdet till langd
		{
			for (int j = 0; j < avstand[0].length; j++)
			{
				if (langd > avstand[i][j])
				{
					langd = avstand[i][j];
				}
			}
		}
		return langd;
	}
}