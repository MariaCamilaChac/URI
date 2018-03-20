/**
* Data Structure, TDA Rational
*	@author :Camila chacón
*	@date 19-03-2019
*	@version 1
**/
package printer;
import java.io.*;

public class URI1022 {

	
	public static void main(String[] args) {
	
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out) );

		try
		{
			//first input
			bw.write(" write how many cases \n");
			bw.flush();
			int cases = Integer.parseInt(br.readLine());
			
			int n, d;
			
			bw.write(" escriba la expresión separando cada caracter con un espacio \n ");
			bw.flush();
			for(int i = 0; i < cases; i++)
			{
				String[] expression = br.readLine().split(" "); //separate the parameters
				
				switch(expression[3].charAt(0)) //menu 
				{
					case '+': //Sum: (N1*D2 + N2*D1) / (D1*D2)
					{
						n = ( (Integer.parseInt(expression[0]) * Integer.parseInt(expression[6]))
							 + (Integer.parseInt(expression[4]) * Integer.parseInt(expression[2])) );
						d = Integer.parseInt(expression[2]) * Integer.parseInt(expression[6]);
						bw.write(n + " / " + d + "\n");
						bw.flush();
						int MCD = MCD(n, d); //call the function
						bw.write("the maximum common denominator " + MCD(n, d) + "\n");
						bw.flush();
						n /= MCD;
						d /= MCD;
						bw.write(n + " / " + d + "\n");
						bw.flush();
						
					}	
					break;
					
					case '-': // Res: (N1*D2 - N2*D1) / (D1*D2)
					{
						
						n = ( (Integer.parseInt(expression[0]) * Integer.parseInt(expression[6]))
							 - (Integer.parseInt(expression[4]) * Integer.parseInt(expression[2])) );
						d = Integer.parseInt(expression[2]) * Integer.parseInt(expression[6]);
						bw.write(n + " / " + d + "\n");
						bw.flush();
						int MCD = MCD(n, d); //call the function
						bw.write("the maximum common denominator " + MCD(n, d) + "\n");
						bw.flush();
						n /= MCD;
						d /= MCD;
						bw.write(n + " / " + d + "\n");
						bw.flush();
						
					}
					break;
					
					case '*': // Mult: (N1*N2 - D1*D2)
					{
						
						n = ((Integer.parseInt(expression[0]) * Integer.parseInt(expression[4])));
						d = Integer.parseInt(expression[2]) * Integer.parseInt(expression[6]);
						bw.write(n + " / " + d + "\n");
						bw.flush();
						int MCD = MCD(n, d); //call the function
						bw.write("the maximum common denominator " + MCD(n, d) + "\n");
						bw.flush();
						n /= MCD;
						d /= MCD;
						bw.write(n + " / " + d + "\n");
						bw.flush();
					}
					break;
					
					case '/': // Div: (N1*D2 - N2*D1)
					{
						
						n = ( (Integer.parseInt(expression[0]) * Integer.parseInt(expression[6])));
						d = Integer.parseInt(expression[2]) * Integer.parseInt(expression[4]);
						bw.write(n + " / " + d + "\n");
						bw.flush();
						int MCD = MCD(n, d); //call the function
						bw.write("the maximum common denominator " + MCD(n, d) + "\n");
						bw.flush();
						n /= MCD;
						d /= MCD;
						bw.write(n + " / " + d + "\n");
						bw.flush();
					}
					break;
				}
			}
		}
		catch(Exception ex) {}
		
	}
	//create the function
	public static int MCD(int n,int d) {
		
		if(d==0) {
			return n;
		}else {
			return MCD(d,n%d);
		}
		
	}
}