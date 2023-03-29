package promoCode;

public class Discount {
double priceofproduct;
String promocode;
double totalprice;
void discount() {
	totalprice = priceofproduct*0.5;
	if (promocode =="promo5") {
		totalprice-= priceofproduct*0.05;
		System.out.println("estimated total after promocode5:"+totalprice);
	}
		else if(promocode =="promo10") {
			totalprice-= priceofproduct*0.1;
			System.out.println("estimated total after promocode10:"+totalprice);
		
	}
		else if(promocode =="promo20") {
			totalprice-= priceofproduct*0.2;
			System.out.println("estimated total after promocode20:"+totalprice);
}
		else{
	System.out.println("**no promocodes appled**");
	System.out.println("estimated total after 50% discount: "+totalprice);
}
}
}
