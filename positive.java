package positive;

import java.util.Scanner;

public class positive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("ENTER THE NUMBER  ");
Scanner s=new Scanner(System.in);
int a=s.nextInt();
if(a==0)
	System.out.println("zero");
else if(a<0)
	System.out.println("negative number");
else
	System.out.println("positive number");
	}

}
