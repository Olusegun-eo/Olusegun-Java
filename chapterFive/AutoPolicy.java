package chapterFive;

public class AutoPolicy {

    //NOTE: For Naming Simplicity: Try and declare your instance Variables

    private int accountNumber;
    private String makeAndModel;
    private String state;
    private String accountHolderFirstName;
    private String accountHolderLastName;
    private String accountHolderAddress;


    public AutoPolicy(int accountNumber, String makeAndModel, String state){
        this.accountNumber = accountNumber;
        this.makeAndModel = makeAndModel;
        this.state = state;

    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public  void setMakeAndModel(String makeAndModel){
        this.makeAndModel = makeAndModel;
    }

    public String getMakeAndModel() {
        return makeAndModel;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public boolean isNoFaultState() {

        boolean noFaultState;
        switch (getState() ){
            case "MA":
            case "NJ":
            case "NY":
            case" PA":
                noFaultState = true;
                break;
            default:
                noFaultState = false;
        }
        return  noFaultState;
    }
}
