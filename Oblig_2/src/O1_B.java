
public class O1_B {

	public static void main(String[] args) {
		
		final int[][] matrise = { 
				{1,2,3} , 
				{4,5,6} , 
				{7,8,9}
		} ; 
		
		skrivUtv1(matrise); 
		System.out.println(tilStreng(matrise)); 
		
		int tall = 10; 
		skaler(tall, matrise);
 
	
	final int [][] mat1 = { 
			{1,4}, 
			{2,3}
	} ; 
	final int [][] mat2 = { 
			{1,4}, 
			{2,3}
	}; 
	
	System.out.println(erLik(mat1, mat2)); 
}
	
	public static void skrivUtv1(int[][] matrise) { 
		
		for (int i = 0; i < matrise.length; i++) { 
			for (int j = 0; j < matrise[i].length; j++) { 
				System.out.println(matrise[i][j] + " ");
			} 
			System.out.println();
		} 
	}   
	

	 
	public static String tilStreng(int[][] matrise) {   
		
		String stringen; 
		stringen = " ";
		
	for (int i = 0; i < matrise.length; i++) { 
		for (int j = 0; j < matrise[0].length; j++) { 
			stringen = stringen + matrise[i][j]; 
		} 
		stringen = stringen + "\n" ; 
	} 
		return stringen;
	}
}

					
					
				}
			}
		} 
		return stringen;

			
		
	} 
	
	public static int[][] skaler(int tall,int[][] matrise) {  
		
		for (int i = 0; i < matrise.length; i++) { 
			for (int j = 0; j < matrise[0].length; j++) {  
				matrise[i][j] = matrise[i][j] * tall;  
				System.out.println(matrise[i][j]); 
				}
			} 
		return matrise;
	} 
	
	public static boolean erLik(int[][]mat1, int[][] mat2) { 
		
		boolean lik = false;
		for (int i = 0; i < mat1.length; i++) { 
		for (int j = 0; j < mat1[0].length; j++) { 
			if (mat1[i][j] == mat2[i][j]) {   
				lik = true;
				break;
			}
			}
		}
		return lik;
	}
	

}
