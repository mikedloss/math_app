import java.util.*;

class computeAlgorithm {
	int a,b;
	Scanner keyboard = new Scanner(System.in);
}

class computeDA extends computeAlgorithm {
	int q,r;
	public void divisonAlgorithm () {
		a = keyboard.nextInt();
		b = keyboard.nextInt();
		
		if (a>=0) {
			this.q = a/b;
			this.r = a%b;
		} else {
			this.q = a/b;
			this.r = a%b;
			this.r = (r+(Math.abs(b)));
			this.q = (q - ((Math.abs(b)/b)));
		}
	}

	int getA () {
		return a;
	}

	int getB () {
		return b;
	}

	int getQ () {
		return q;
	}

	int getR () {
		return r;
	}
}

class computeGCD extends computeAlgorithm {
	int mod,d,x,y,signA=1,signB=1;
	boolean isCongruent = false;
	public void gcd () {
		a = keyboard.nextInt();
		b = keyboard.nextInt();
		mod = keyboard.nextInt();
		int tempa = a;
		int tempb = b;

		if (a==0 && b==0) {
			System.out.println("Error: a and b can't both = 0\n");
		} else if (a==0 && b>0) {
			d=b;
			x=0;
			y=1;
		} else if (a>0 && b==0) {
			d=a;
			x=1;
			y=0;
		} else if (a>0 && b>0) {
			int u1=1,u2=0,u3=a,v1=0,v2=1,v3=b,q=0,t1=0,t2=0,t3=0;
			maths(u1,u2,u3,v1,v2,v3,q,t1,t2,t3);
		} else if (a<=0 || b<=0) {
			if (a<0) {
				signA = -1;
			}
			if (b<0) {
				signB = -1;
			}
			this.a = Math.abs(a);
			this.b = Math.abs(b);
			int u1=1,u2=0,u3=a,v1=0,v2=1,v3=b,q=0,t1=0,t2=0,t3=0;
			maths(u1,u2,u3,v1,v2,v3,q,t1,t2,t3);
			x=x*signA;
			y=y*signB;
			a=a*signA;
			b=b*signB;
		}

		if (congruence(a,b,mod)) {
			isCongruent = true;
		}
	}

	private void maths(int u1, int u2, int u3, int v1, int v2, int v3, int q, int t1, int t2, int t3) {
		while (v3!=0) {
			if (u3>=0) {
				q=u3/v3;
			} else {
				q=u3/v3;		//real divison
				q=(q-((Math.abs(v3)/b)));
			}
			t1=u1-q*v1;
			t2=u2-q*v2;
			t3=u3-q*v3;
			u1=v1;
			u2=v2;
			u3=v3;
			v1=t1;
			v2=t2;
			v3=t3;
			}
		x=u1;
		y=u2;
		d=u3;
	}

	private boolean congruence(int a, int b, int mod) {
		int c=a-b;
		if (!(c%mod==0)) {
			return false;
		} else {
			return true;
		}
	}

	boolean getCongruence () {
		return isCongruent;
	}

	int getX () {
		return x;
	}

	int getY () {
		return y;
	}

	int getA () {
		return a;
	}

	int getB () {
		return b;
	}

	int getD () {
		return d;
	}

}

public class privateStudy
{	
	public static void main(String[] args)
	{
		int input;
		boolean flag=false;
		while (!flag) {
			System.out.println("\nWhat do you want to do? (type the # in of your choice)");
			System.out.println("1) Divison Algorithm");
			System.out.println("2) Compute GCD/Congruence");
		
			Scanner kb = new Scanner(System.in);
			input = kb.nextInt();
		
			switch(input) {
				case 1: input=1;
					computeDA hereWeGo = new computeDA();
					System.out.println("\n*******\nDivision algorithm\n*******\n\nGive me 2 integers (numerator first):");
					hereWeGo.divisonAlgorithm();
					System.out.println("Quotient: "+hereWeGo.getQ()+"\nRemainder: "+hereWeGo.getR()+"\n");
					System.out.println("Returning to menu...\n\n");
					break;
				case 2: input=2;
					computeGCD letsDoThis = new computeGCD();
					System.out.println("\n*******\nGCD using Extended Divison Algorithm\nCongruence\n*******\n\nGive me 3 integers:");
					System.out.println("(The first 2 integers, a and b, are for computing the GCD)");
					System.out.println("(The 3rd integer is to test for congruency between a and b)");
					letsDoThis.gcd();
					System.out.println("\nGCD (or d) = "+letsDoThis.getD());
					System.out.println("x = " + letsDoThis.getX());
					System.out.println("y = " + letsDoThis.getY());
					System.out.println("\nIn the form of d = ax+by ...");
					System.out.println(" " + letsDoThis.getD() + " = " + letsDoThis.getA() + "(" + letsDoThis.getX() + ") + " + letsDoThis.getB() + "(" + letsDoThis.getY() + ")");
					System.out.println("\nAre they congruent?: " + letsDoThis.getCongruence());
					System.out.println("\nReturning to menu...\n\n");
					break;
				default:
					flag=true;
					System.out.println("Quitting...");
			}
		}
		
	}
}