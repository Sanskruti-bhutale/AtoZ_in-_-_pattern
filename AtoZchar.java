public class AtoZchar {
	public static void main(String[] args) {
		int n = 6;
		for (int i = 0; i < n; i++) {
			// code for A

			for (int j = 0; j < n; j++) 
            {
				if ((i == 0 && j > 0 && j < (n - 1) / 2) || (j == 0 && i > 0) || (i == (n - 1) / 2 && j < (n - 1) / 2)
						|| (j == (n - 1) / 2 && i > 0))
                         {
					System.out.print("#");
				} else {

					System.out.print(" ");
				}
			}
			// code for B

			for (int j = 0; j < n; j++) 
            {
				if (j == 0 || i == 0 && j < (n - 1) / 2 || i == (n - 1) / 2 && j < (n - 1) / 2
						|| i == n - 1 && j < (n - 1) / 2
						|| j == (n - 1) / 2 && i != 0 && i != (n - 1) / 2 && i < n - 1)
                         {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}

			// code for C

			for (int j = 0; j < n; j++) 
            {
				if (i == 0 && j > 0 && j <= (3 * n) / 4 || j == 0 && i > 0 && i < n - 1
						|| i == n - 1 && j > 0 && j <= (3 * n) / 4) 
                         {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}

			// code for D
			System.out.print(" ");
			for (int j = 0; j < n; j++)
             {
				if (j == 0 || i == 0 && j < 3 * n / 4 || i == n - 1 && j < 3 * n / 4
						|| j == 3 * n / 4 && i > 0 && i < n - 1) 
                        {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}

			// code for E
			System.out.print(" ");

			for (int j = 0; j < n; j++)
             {
				if (j == 0 || i == 0 && j <= 3 * n / 4 || i == (n - 1) / 2 && j < 3 * n / 4
						|| i == n - 1 && j <= 3 * n / 4) 
                        {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}

			// code for F
			System.out.print(" ");
			for (int j = 0; j < n; j++)
             {
				if (j == 0 || i == 0 && j <= 3 * n / 4 || i == (n - 1) / 2 && j < 3 * n / 4) 
                {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}

			// code for G

			for (int j = 0; j < n; j++) 
            {
				if (i == 0 && j > 0 && j <= (n - 1) / 2 || j == 0 && i > 0 && i < n - 1
						|| i == n - 1 && j > 0 && j <= (n - 1) / 2 || j == (n - 1) / 2 && i > (n - 1) / 2
						|| i == (n - 1) / 2 && j > (n - 1) / 2 && j <= n - 1 && j < n - 1
						|| j == n - 1 && i > (n - 1) / 2) 
                        {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}

			// code for H

			System.out.print("  ");
			for (int j = 0; j < n; j++)
             {
				if (j == 0 || j == 3 * n / 4 || i == (n - 1) / 2 && j < 3 * n / 4) 
                {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}

               System.out.print(" ");
			// code for I
               
			for (int j = 0; j < n; j++) 
            {
				if (i == 0 || j == (n - 1) / 2 || i == n - 1)
                {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}

			// code for J

			System.out.print(" ");
			for (int j = 0; j < n; j++) 
            {
				if (i == 0 || j == (n - 1) / 2 && i < n - 1 || i - j == (n - 1) / 2 && i < n - 1)
                 {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}

			// code for K
                System.out.print("  ");

			for (int j = 0; j < n; j++)
             {
				if (j == 0 || i + j == (n - 1) / 2 || i - j == (n - 1) / 2) 
                {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}
            
			System.out.print("  ");
			// code for L
			for (int j = 0; j < n; j++) 
            {
				if (j == 0 || i == n - 1 && j <= 3 * n / 4) 
                {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}
            System.out.print("  ");
			// code for M

			for (int j = 0; j < n; j++) 
            {
				if (j == 0 || i == j && i < (n - 1) / 2 || i + j == n - 1 && i < (n - 1) / 2 || j == n - 1||i==(n-1)/2&&j==(n-1)/2)
                 {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("   ");
			// code for N
			for (int j = 0; j < n; j++)
             {
				if (j == 0 || i == j || j == n - 1) 
                {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			// coe for O
			for (int j = 0; j < n; j++) 
            {
				if (i == 0 && j > 0 && j < n - 1 || j == 0 && i > 0 && i < n - 1 || i == n - 1 && j > 0 && j < n - 1
						|| j == n - 1 && i > 0 && i < n - 1)
                         {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}

			// code for P
			System.out.print("  ");
			for (int j = 0; j < n; j++)
             {
				if (j == 0 || i == 0 && j < 3 * n / 4 || j == 3 * n / 4 && i < (n - 1) / 2 && i > 0 && i < (n - 1) / 2
						|| i == (n - 1) / 2 && j < 3 * n / 4) 
                        {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}

			// code for Q
			System.out.print("  ");
			for (int j = 0; j < n; j++)
             {
				if (i == n / 4 && j > n / 4 && j < 3 * n / 4 || j == n / 4 && i > n / 4 && i < 3 * n / 4
						|| i == 3 * n / 4 && j > n / 4 && j < 3 * n / 4 || j == 3 * n / 4 && i > n / 4 && i < 3 * n / 4
						|| i == j && i > (n - 1) / 2) 
                        {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("   ");
			// code for R
			for (int j = 0; j < n; j++)
             {
				if (j == 0 && i > 0 || i == 0 && j > 0 && j < (n - 1) / 2
						|| j == (n - 1) / 2 && i > 0 && i < (n - 1) / 2 || i == (n - 1) / 2 && j < (n - 1) / 2
						|| i - j == (n - 1) / 2)
                         {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}
			// code for S
			// System.out.print(" ");
			for (int j = 0; j < n; j++)
             {
				if (i == 0 && j > 0 && j <= 3 * n / 4 || j == 0 && i > 0 && i < (n - 1) / 2
						|| i == (n - 1) / 2 && j < 3 * n / 4 && j > 0 || j == 3 * n / 4 && i > (n - 1) / 2 && i < n - 1
						|| i == n - 1 && j < 3 * n / 4)
                         {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			// code for T
			for (int j = 0; j < n; j++) 
            {
				if (j == (n - 1 )/ 2 || i == 0)
                 {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			// code for U
			for (int j = 0; j < n; j++) 
            {
				if (j == 0 && i < n - 1 || i == n - 1 && j > 0 && j < n - 1 || j == n - 1 && i < n - 1)
                 {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			// code for v
			for (int j = 0; j < n; j++) 
            {
				if (i - j == (n - 1) / 2 || i + j == n + (n - 1) / 2) 
                {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("   ");
			// code for W
			for (int j = 0; j < n; j++) 
            {
				if (j == 0 || i + j == n - 1 && i > (n - 1) / 2 || i == j && i > (n - 1) / 2 || j == n - 1) 
                {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("   ");
			// code for X
			for (int j = 0; j < n; j++) 
            {
				if (i == j || i + j == n - 1) {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("   ");
			// code for Y
			for (int j = 0; j < n; j++) 
            {
				if (i == j && i < (n - 1) / 2 || i + j == n - 1) 
                {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("   ");
			// code for Z
			for (int j = 0; j < n; j++)
             {
				if (i == 0 || i == n - 1 || i + j == n - 1) 
                {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}

			System.out.println();
		}
	}

}
