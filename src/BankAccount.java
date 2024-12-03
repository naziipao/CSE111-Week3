public class BankAccount {
    public int acNo;
    public String type = "Not set";
    public String printDetails(){
        return "Account No: " + acNo + "\nType: " + type;
    }
    public void setInfo(int acNo , String type){
        this.acNo = acNo;
        this.type = type;
        System.out.println("Account information updated!");
    }
}
