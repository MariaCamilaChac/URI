/**
* Data Structure, Balance of Parentheses I
*	@author :Camila chacón
*	@date 19-03-2019
*	@version 1
**/
package printer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class URI1068 {
	
	public static void main(String[] args) // verify if the text entered with parentheses is correct or incorrect
	{
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out));
		
		try
		{
			String input = br.readLine();
			
			while(!input.equals("")) // denied the conditional
			{
				int counter = 0; // initialize the variable
				
				for(int i = 0; i < input.length(); i++)
				{
					//conditional for increase the counter
					if(input.charAt(i) == '(')
						counter += 1;
					//conditional for decrease the counter
					if(input.charAt(i) == ')')
						if(counter > 0)
							counter -= 1;
						else
						{
							counter = -1;
							break;
						}	
				}
				
				if(counter == 0)
					bw.write("correct\n");
				else
					bw.write("incorrect\n");
				
				bw.flush();
				input = br.readLine();
			}
		}
		catch(Exception ex) {}
	}

}
