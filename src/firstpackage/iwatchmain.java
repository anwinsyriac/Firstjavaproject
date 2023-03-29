package firstpackage;

public class iwatchmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		iwatch smartwatch = new iwatch();
		smartwatch.brandname = "smartwatch";
		smartwatch.sendtext();
		smartwatch.Modelnumber = 8;
		smartwatch.batterylife = 80;
		smartwatch.time = 1400;
		smartwatch.ifgpsturnedon = true;
		smartwatch.ifmovementdetected = true;
		smartwatch.sendtext();
		smartwatch.locationtracking();
		smartwatch.sleeptracking();
System.out.print("............anwin............");
	}

}
