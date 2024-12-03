public class TaxiLagbe {
    public String number;
    public String location;
    public int totalFare;
    public String[] arr1 = new String[4];
    public int count;

    public void storeInfo(String number, String location) {
        this.number = number;
        this.location = location;
    }

    public void addPassenger(String name, int fare) {
        if (count < 4) {
            arr1[count] = name;
            totalFare += fare;
            System.out.println("Dear " + name + " ! Welcome to Taxilagbe");
            count++;
        } else {
            System.out.println("Taxi Full! No more passengers can be added");
        }
    }

    public void addPassenger(String name1, int fare1, String name2, int fare2) {
        if (count < 4) {
            arr1[count] = name1;
            totalFare += fare1;
            System.out.println("Dear " + name1 + " ! Welcome to Taxilagbe");
            count++;
        }
        if (count < 4) {
            arr1[count] = name2;
            totalFare += fare2;
            System.out.println("Dear " + name2 + " ! Welcome to Taxilagbe");
            count++;
        } else {
            System.out.println("Taxi Full! No more passengers can be added");
        }
    }
    public void printDetails(){
        System.out.println("Taxi number: " + number);
        System.out.println("This taxi can cover " + location + " area");
        System.out.println("Total Passenger: " + count);
        System.out.println("Passenger Lists:");
        if(count >0) {
            for (int i = 0; i < count; i++) {
                System.out.print(arr1[i] + " ");
            }
            System.out.println();
        }
        System.out.println("Total collected fare: " + totalFare + " Taka");
    }
}