/**
* Data Structure, Where is the Marble?
*	@author :Camila chacón
*	@date 19-03-2019
*	@version 1
**/
package printer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class URI1025 {

	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out) );
		
		bw.write("escriba el numero de canicas y el # de oportunidades \n");
		bw.flush();
		String input = br.readLine();
		int n, q = 0, cases = 1, t, index;
		

		while(!input.equals("0 0")) // denied the conditional
		{
			bw.write("CASE# " + cases + ":\n");
			bw.flush();
			n = Integer.parseInt( input.split(" ")[0] ); //catch the number of marbles
			q= Integer.parseInt(input.split(" ")[1] ); //catch the number of opportunities

			
			int[] array = new int[n]; // create the array
			
			for(int i = 0; i < n; i++) // entry of marbles
				
				array[i] = Integer.parseInt(br.readLine());
			
				array = counting_sort(array.clone()); //call sort method
			
			
				for(int i = 0; i < q; i++) // entry the numbers of the opportunities
				{
					bw.write("escriba el numero de su "+ i + " intento \n");
				    bw.flush();
				    t = Integer.parseInt(br.readLine());
				    index = binary_search(array, t); //call the method of search
				
			    	if(index != -1) {
				    	bw.write(t + " found at " + (index + 1) + "\n");
				        bw.flush();
			    	}
				    
			    	else {
			    		bw.write(t + " not found\n");
			    		bw.flush();
				}
			}
				cases += 1;
		}
					
			
		
		}

	
	// create the methods of sort and search
	public static int[] counting_sort(int[] unsorted)
	{
		int[] sorted = new int[unsorted.length];
		int[] aux = new int[10001];
		int index = 0;
		
		for(int i = 0; i < unsorted.length; i++)
			aux[ unsorted[i] ] += 1;
		
		
		for(int i = 0; i < aux.length; i++)
			if(aux[i] != 0)
				for(int j = 0; j < aux[i]; j++)
				{
					sorted[index] = i;
					index += 1;
				}
		
		return sorted;
	}
	// return the message if the number that the second player index it's in the array
	public static int binary_search(int[] array, int value) throws IOException{
	

		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out) );
		
		int  inicio = 0;
		int  finall = array.length-1;
		int Num=0, result = 0;
		boolean Positive = false ;
		
		while(!(Positive) && inicio <=finall ){
			int mitad = ((inicio + finall)/2);
			
			if ( value == array[mitad]){
				Positive = true;
				Num=mitad;
			}else
				if(value < array[mitad])
					finall=mitad-1;
				 else
					if(value > array[mitad])
					inicio= mitad+1;	
		
		}
		if(Positive)
			 result= Num;
		else
			result=-1;
		
		return result;
		 
	
	}		
	
}