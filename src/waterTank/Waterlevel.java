package waterTank;

public class Waterlevel {
    public static void main(String[] args) {
        int tankCapacity = 100; 
        int bucketCapacity = 10; 
        int waterLevel = 0;
        
        System.out.println("Filling the water tank with " + bucketCapacity + "-litre buckets...");
        
        while (waterLevel < tankCapacity) {
            waterLevel += bucketCapacity;
            
            if (waterLevel > tankCapacity) {
                waterLevel = tankCapacity;
            }
            
            System.out.println("Water level: " + waterLevel + " litres");
        }
        
        System.out.println("The water tank is now full!");
    }
}