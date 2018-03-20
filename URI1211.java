/**
* Data Structure, Economic Phonebook
*	@author :Camila chacón
*	@date 19-03-2019
*	@version 1
**/
package printer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class URI1211 {
	
	public static void main(String[] args) { //find the number that i can't delete of the phone book
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		
		try {
			bw.write("amount of numbers \n"); 
			bw.flush();
			String input = br.readLine(); //catch the cases
			String PhoneNumber;
			char[] Phone_Number;
			int cases, counter;
			
			while (!input.equals("")) {

				cases= Integer.parseInt(input);
				counter=0;
				
				PhoneNumber = br.readLine(); // read the numbers
				Phone_Number = new char [PhoneNumber.length()]; //create the array
				
				for (int i = 0; i < Phone_Number.length; i++) 
					Phone_Number[i]= PhoneNumber.charAt(i);
				
				for (int i = 1; i < Phone_Number.length; i++) {
					PhoneNumber = br.readLine();
					
					int j=0;
					
					
					
					while(true) {
						 //counter increase if the number of the index is equal at the second telephone number
						if (Phone_Number[j] == PhoneNumber.charAt(j)) {
							counter +=1;
							
						}
						else
							break;
						j++;
						
					}
				}
				
				bw.write(counter);
				bw.flush();
				input=br.readLine();
			}
	
			
			
		}
		
		catch (Exception ex) {} 
		
		
	}
	
	
	public static char[] RadixSort(char[]array){ // sort method
		
		for (int x = Integer.SIZE-1; x >=0; x--) {
			char auxiliar[]= new char [array.length];
			int j=0;
		
			for (int i = 0; i < array.length; i++) {
				boolean mover= array[i] << x >=0;
				
				if(x==0 ? !mover:mover){
					auxiliar[j]= array[i];
					j++;
				}else
					array[i-j]=array[i];

			}
			
			for (int i = j; i < auxiliar.length; i++) 
				
				auxiliar[i] = array[i-j];
			
			array=auxiliar;
							
		}
		
	return array;	
		
	}
 

}