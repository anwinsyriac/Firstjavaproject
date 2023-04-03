package cube;
import java.util.Scanner;
public class Maincalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner calculatorone = new Scanner(System.in);
String operation ="add";
Switch program = new Switch();
program.num1 = 2;

switch(operation) {
case"square":
	program.squareroot();
	break;
case"cube":
	program.cube();
	break;
	default:
	System.out.println("invalid operation");
}
	}

}
