package exercicioAula3;

import java.util.Scanner;

public class Primos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int n;
		int i = 0;
		int total = 0;
		
		n = entrada.nextInt();
		
		while(total < n) {
			boolean flag = false;
		    for (int j = 2; j <= i / 2; ++j) {
		
		    	if (i % j == 0) {
		    		flag = true;
		    		break;
		    	}
		    }

		    if (i > 2 && !flag) {
		    	System.out.print(i+" ");
		    	total++;
		    }
		    	
		    i++;
		}
		
		entrada.close();
	}

}
