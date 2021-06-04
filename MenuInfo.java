public class MenuInfo {

    public void calWelcome_Login(){
        System.out.println("\t----Welcome Login----\t");
        System.out.print("Username : ");
    }
    
    public void calMenu(String username){
        System.out.println("\t----------------------------\t");
        System.out.println("\t\tEmployee : " + username+"\t\t");
        System.out.println("\t----------------------------\t");
        System.out.println("\t----Menu----\t");
        System.out.println("[1] : Bill");
        System.out.println("[2] : Customer");
        System.out.println("[3] : Saff");
        System.out.println("[4] : Exit Program");
        System.out.print("Input Number : ");
    }

    public void calBill(){
        System.out.println("\t----Bill----\t");
        System.out.println("[1] : Add Bill ");
        System.out.println("[2] : Pay Bill ");
        System.out.println("[3] : Show Show History");
        System.out.print("Input Number : ");
    }

    public void calCustomer(){
        System.out.println("\t----Customer----\t");
        System.out.println("[1] : Show Customer ");
        System.out.println("[2] : Register Customer ");
        System.out.print("Input Number : ");
    }
    public void calSaff(){
        System.out.println("\t----Saff----\t");
        System.out.println("[1] : Show Saff ");
        System.out.println("[2] : Register Saff ");
        System.out.print("Input Number : ");
    }
}