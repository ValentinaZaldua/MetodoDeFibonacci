package Logica;

import java.util.Scanner;

public class SerieDeFibonacci {
	
	public static void main(String[] args){
		
		/*int n,f1,f2,i;     
     
     Scanner sc = new Scanner (System.in);
     n = sc.nextInt();
     
     f1=1;
     f2=1;

     System.out.print(f1 + " ");
     for(i=2;i<=n;i++){
         System.out.print(f2 + " ");
         f2 = f1 + f2;
         f1 = f2 - f1;
     }*/
		
		Scanner sc = new Scanner (System.in);
		
		int  f1, f2, i;
		int nu;
		System.out.println("Digite hasta que numero llegue la serie fibonacci");
		nu = sc.nextInt();
		f1=1;
		f2=1;
		
        System.out.print(f1 + " ");
        for(i=2;f2<=nu;i++){
            System.out.print(f2 + " ");
            f2 = f1 + f2;
            f1 = f2 - f1;
        }
        
	}
}
