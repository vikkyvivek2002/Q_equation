import java.util.*;
public class Q_equation {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		double a, b,c;
		double den,root1,root2,det;
		System.out.println("Enter the values of a,b,c :");
		a = s.nextDouble();
		b = s.nextDouble();
		c = s.nextDouble();
		det = b*b-(4*a*c);
		
		if(det>0)
		{
			System.out.println("Roots are real :");
			root1 = -(b+Math.sqrt(det)/2*a);
			root2 = -(b-Math.sqrt(det)/2*a);
			System.out.println(root1);
			System.out.println(root2);
			
		}
		else if(det == 0)
		{
			System.out.println("equal roots ");
			root1 = root2 = -b/(2*a);
			System.out.println(root1);
			System.out.println(root2);
		}
		else
		{
			System.out.println("imaginary roots :");
			double real = -b/(2*a);
			double imaginary = Math.sqrt(-det)/(2*a);
			System.out.format("root1 = %0.2f+%0.2fi",real,imaginary);
			System.out.format("\nroot2 = %0.2f-%0.2fi",real,imaginary);
		}

	}

}
