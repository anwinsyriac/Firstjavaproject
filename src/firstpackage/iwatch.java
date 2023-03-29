package firstpackage;

public class iwatch {
String brandname;
int Modelnumber;
int batterylife;
int time;
boolean ifgpsturnedon;
boolean ifmovementdetected;
String sendtext;
void sendtext() {
	System.out.print("send text from  "+brandname+"iwatch");
}
void locationtracking() {
	System.out.print("locationtracking  "+ifgpsturnedon+"iwatch");
}
void sleeptracking() {
	System.out.print("sleeptrackingon  "+ifmovementdetected+"iwatch");

}




 
}
