package largestNumber;

public class GreatestNumber {
int n1;
int n2;
int n3;
int largest;


void greatestOfall() {
	if(n1>n2 && n1> n3 ) {
	largest= n1;
}
	else if (n2>n1 && n2>n3) {
		largest=n2;
		
	}
	else {
		largest=n3;
	}
	System.out.println("The largest of all number is:"+largest);
}
}

