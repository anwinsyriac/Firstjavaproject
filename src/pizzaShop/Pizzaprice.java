package pizzaShop;
import java.util.Scanner;
public class Pizzaprice {
	
                    
	
	             void main() {
			        
                    	
                   Scanner scanner = new Scanner(System.in);
			        
			        
			        System.out.println("Please enter the size of pizza you would like (S, M, or L):");
			        String size = scanner.nextLine();
			        
			        System.out.println("Would you like to add pepperoni? (Y or N):");
			        String pepperoni = scanner.nextLine();
			        
			        System.out.println("Would you like to add extra cheese? (Y or N):");
			        String cheese = scanner.nextLine();
			        
			        double total = calculatePizzaPrice(size);
			        
			        if (pepperoni.equals("Y")) {
			            total += calculatePepperoniPrice(size);
			        }
			        
			        if (cheese.equals("Y")) {
			            total += calculateExtraCheesePrice();
			        }
			        
			        System.out.println("Your final bill is $" + total);
			    }
			    
			    public static double calculatePizzaPrice(String size) {
			        double price = 0;
			        
			        if (size.equals("S")) {
			            price = 15;
			        } else if (size.equals("M")) {
			            price = 20;
			        } else if (size.equals("L")) {
			            price = 25;
			        }
			        
			        return price;
			    }
			    
			    public static double calculatePepperoniPrice(String size) {
			        double price = 0;
			        
			        if (size.equals("S")) {
			            price = 2;
			        } else {
			            price = 3;
			        }
			        
			        return price;
			    }
			    
			    public static double calculateExtraCheesePrice() {
			        return 1;
			    }
			}



