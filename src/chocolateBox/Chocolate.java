package chocolateBox;

public class Chocolate {
	public static void main(String[] args) {
        int maxChocolates = 63;
        int chocolatesInBox =24 ;
        
        System.out.println("Adding 5 chocolates to the box until it is full...");
        
        while (chocolatesInBox < maxChocolates) {
            chocolatesInBox += 5;
            
            if (chocolatesInBox > maxChocolates) {
                chocolatesInBox = maxChocolates;
            }
            
            System.out.println("Chocolates in the box: " + chocolatesInBox);
        }
        
        System.out.println("The box is now full with " + chocolatesInBox + " chocolates!");
    }
}

