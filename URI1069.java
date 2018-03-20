/**
* Data Structure, Diamond and sand
*	@author :Camila chacón
*	@date 19-03-2019
*	@version 1
**/
package printer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class URI1069 {
	
	public static void main(String[] args) // verify if the text entered have diamonds and how many 
	{
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out));
		
		try
		{
			//catch the number of opportunities
			bw.write(" write how many cases do you want: \n");
			bw.flush();
			int cases = Integer.parseInt(br.readLine());
			String input;
			int counter, temp; // create variables
			
			for(int i = 0; i < cases; i++)
			{
				bw.write(" write the "+i+1+" case: \n");
				bw.flush();
				input = br.readLine();
				temp = 0; counter = 0;
				
				for(int j = 0; j < input.length(); j++)
				{
					//create the conditionals for increase o decrease the temporal variable and increase the counter
					if(input.charAt(j) == '<')
						temp += 1;
					
					if(input.charAt(j) == '>')
						if(temp > 0)
						{
							temp -= 1;
							counter += 1;
						}
				}
				
				bw.write(counter + "\n");
				bw.flush();
			}
		}
		catch(Exception ex) {}
	}

}
