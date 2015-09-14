import java.util.Scanner;

public class Main{

	public static void main(String[] args){

		String td, yds, intc, comp, att;
		double a, b, c, d, e;

		Scanner scannerName = new Scanner(System.in);
		
		System.out.println("Please input numbers for touchdowns:");
		td = scannerName.next();
		
		System.out.println("Please input numbers for total yards:");
		yds = scannerName.next();
		
		System.out.println("Please input numbers for interceptions:");
		intc = scannerName.next();
		
		System.out.println("Please input numbers for completions:");
		comp = scannerName.next();
		
		System.out.println("Please input numbers for passes attempted:");
		att = scannerName.next();
		
		double doubleCOMP = Double.parseDouble(comp);
		double doubleATT = Double.parseDouble(att);
		a = ((doubleCOMP / doubleATT) -.3 ) * 5;
		
		double doubleYDS = Double.parseDouble(yds);
		b = ((doubleYDS / doubleATT) - 3 ) *.25;
		
		double doubleTD = Double.parseDouble(td);
		c = ((doubleTD / doubleATT) * 20);
		
		double doubleINTC = Double.parseDouble(intc);
		d = 2.375 - ((doubleINTC / doubleATT) * 25);
		
		rate = (((a + b + c + d) / 6 ) * 100);
		
		System.out.printf("The rating is: " + "%.2f", rate);

	}
}