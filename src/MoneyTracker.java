public class MoneyTracker {
    public String name = "null";
    public double curBal;
    public double add;
    public double spent;
    public void createTracker(String name){
        this.name = name;
        curBal = 1;
    }
    public String info(){
        return "Name: " + name + "\nCurrent Balance: " + curBal;
    }
    public void income(double add){
        curBal += add;
        this.add = add;
        System.out.println("Balance updated!");
    }
    public void expense(double spent){
        curBal -= spent;
        if(curBal<0){
            System.out.println("Not enough balance.");
            curBal += spent;
        }
        else if(curBal == 0){
            System.out.println("You're broke!");
            curBal += spent;
        }
        else{
            System.out.println("Balance updated.");
            this.spent = spent;
        }
    }
    public void showHistory(){
        System.out.println("Last added: " + add);
        System.out.println("Last spent: " + spent);
    }
}
