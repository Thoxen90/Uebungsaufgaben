
public class Zahlendreher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=3,b=1,c=2;
		
		
			
			if(b>c) {
				b=b+c;
				c=b-c;
				b=b-c;			
			}
			if(a>c) {
				a=a+c;
				c=a-c;
				a=a-c;
			}
			if(a>b) {
				a=a+b;
				b=a-b;
				a=a-b;
			}
System.out.println(a+""+b+""+c);

 a=2;b=3;c=1;

if(b>c) {
	b=b+c;
	c=b-c;
	b=b-c;			
}
if(a>c) {
	a=a+c;
	c=a-c;
	a=a-c;
}
if(a>b) {
	a=a+b;
	b=a-b;
	a=a-b;
}
System.out.println(a+""+b+""+c);
	
a=2;b=1;c=3;

if(b>c) {
	b=b+c;
	c=b-c;
	b=b-c;			
}
if(a>c) {
	a=a+c;
	c=a-c;
	a=a-c;
}
if(a>b) {
	a=a+b;
	b=a-b;
	a=a-b;
}
System.out.println(a+""+b+""+c);
	}
}