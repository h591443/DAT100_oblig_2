package uke_38; 
import java.util.*; 

public class O1_A {

	public static void main(String[] args) {  
		int[] tabell = {0, 2, 8, 13, 6} ;   
		int tall = 2; 
			
		int[] tabell1 = {42, 67, 89} ;   
		int[] tabell2 = {13, 83, 101};  
		int[] tabell3 = {9, 24, 88} ;
		 
	
		skrivUt(tabell); 
		tilStreng(tabell1);
		finnesTall(tabell, tall);
		posisjonTall(tabell, tall); 
		reverser(tabell);  
		erSortert(tabell); 
		settSammen(tabell2, tabell3);
 
	}
	
		public static void skrivUt (int[] tabell) {  
	
		for (int i = 0; i < tabell.length; i++){  
				System.out.println(tabell[i]);
	} 
		}
		public static void tilStreng (int[] tabell1) {  
			
			System.out.println(Arrays.toString(tabell1));
		}	 
		
		 public static int summer (int[] tabell)  {   
			 
			 int sum = 0; 
			 
		     for(int i = 0; i < tabell.length; i++){
		         
		         sum = sum + tabell[i]; 
		         
		         System.out.println(sum);
		      }  
		      
		     int summ = 0;
		     int nevner = 0;
		     while (tabell.length > nevner) {  
		    	 summ = summ + tabell[nevner]; 
		    	 nevner++;
		    	 System.out.println(summ);
		    	 
		     } 
		     
		    int total = 0; 
		    for (int i : tabell) { 
		    	total = total + i ;  
		    	i++;
		    	System.out.println(total);
		    }
		    	 
		 return total; 
		 }
				
			public static boolean finnesTall (int[] tabell, int tall)  {
				
				boolean funnet = false; 
				
				for (int i : tabell) { 
					if (i == tall) { 
						funnet = true; 
								break; 
					}
				} 
				
				return funnet;
			 }		
			
			public static int posisjonTall (int[] tabell, int tall) {   
				
				int i = 0; 
				while (i < tabell.length) { 
					if(tabell[i] == tall) { 
						return i;
					} 
					else { 
						i = i + 1;
					}
				} 
				return -1; 
			} 
			
			public static int[] reverser(int[] tabell) {  
				
				for (int i = tabell.length-1; i >= 0; i--) {  
					System.out.println(tabell[i]);
					}
			return tabell;
			} 
			
			public static boolean erSortert (int[] tabell) {  
				
				int[] tabell3 = new int [] {0, 2, 8, 13, 6}; 
				Arrays.sort(tabell3);
				
				if (tabell == tabell3)  { 
					System.out.println("true"); 
					return true;
				}
					else 
						System.out.println("false");
				return false;
			} 
			 
			public static int[] settSammen(int[] tabell2,int[] tabell3) { 
				
				int len = tabell2.length+tabell3.length;
				int tabell4[]=new int[len];
				
			    int j=0;
				for(int i=0; i<tabell4.length; i++) {
					if(i<tabell2.length) {
				            tabell4[i]=tabell2[i];
				        }
				        else
				        {
				            tabell4[i]=tabell3[j];
				            j++;
				        }
				    } 
				    for(int i:tabell4) { 
				    	
				        System.out.print(i+ " "); 
				    }  
				    return tabell4;
			} 
			
}
