import java.util.*;
import java.io.IOException;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.concurrent.ThreadLocalRandom; 
import java.time.LocalDate;
import java.text.DecimalFormat;
import java.util.Random;

public class CallingHome {
    public static void main(String[] args) throws IOException {
    
    MenuInfo menu = new MenuInfo();
    LocalDate myObj3 = LocalDate.now(); 
    DecimalFormat df = new DecimalFormat("0.00");
    boolean wenttocatch;
    // username.equals (username) (true)
    
    Scanner input = new Scanner(System.in);
    String username;
    while(true){
    menu.calWelcome_Login();
    username = input.next();
    ChekInfo check = new ChekInfo(username);
    boolean checkLogin = check.auth();
    if(checkLogin == true){
        break;
    }
    System.out.println("Unknown Username");
    
    }
    // Eng Login
    
        while(true){
        Scanner reader = new Scanner(System.in);
        // Star Bill to MenuInfo.java
        menu.calMenu(username);
        int num = 0;
        try {
            num = reader.nextInt();
        } catch (Exception e) {
            System.out.println("--------------------------------");
            System.out.println("Please specify the number type.");
            System.out.println("--------------------------------");
        }

        if(num == 1){
            // MenuInfo.java
            do{
                int b = 0;
                Scanner reader1 = new Scanner(System.in);
            menu.calBill();
            try {
                wenttocatch = false;
                b = reader1.nextInt();
            } catch (Exception e) {
                wenttocatch = true;
                System.out.println("--------------------------------");
                System.out.println("Please specify the number type.");
                System.out.println("--------------------------------");
            }
    
            if(b == 1){
                ChekID ck = new ChekID();
                System.out.print("Input ID : ");
                String ID = input.next();
                ck.setScan();
                ck.setBin(ID);
                String[] arrayBin = ck.getBin();
                String type = arrayBin[3];
                String x = arrayBin[5];
                Double u = Double.parseDouble(x);
                System.out.println("\t---Show Customer---\t");
                System.out.println("===============================\n");
                System.out.println("ID : \t\t"+arrayBin[0]);
                System.out.println("Name : \t\t"+arrayBin[1]);
                System.out.println("Address : \t"+arrayBin[2]);
                System.out.println("Type : \t\t"+ type);
                System.out.println("Meter : \t"+arrayBin[4]);
                System.out.println("First shell unit : \t"+ x + "Mater");   
                System.out.print("This unit : ");
                double y = input.nextDouble();
                double unit = y - u  ;
                calTotal ct = new calTotal();
                double price = ct.getWaterdisplay(unit,type);
                Double VAT = Double.parseDouble(ct.getVat());
                // String VAT = String.valueOf(ct.getVat());
                // Double v = Double.parseDouble(VAT);
                // df.format(v);
                String vat = String.valueOf(VAT);
                double Sum = ct.getTotal(arrayBin[4]);
                System.out.println("===============================\n");

                String Name = arrayBin[1];
                String Address = arrayBin[2];
                String Meter = arrayBin[4];
                String Unit = String.valueOf(unit);
                String Price = String.valueOf(price);
                String Total = String.valueOf((df.format(Sum)));
                String service = String.valueOf(ct.getService());
                String U =String.valueOf(u);
                
                AddInfo add = new AddInfo();
                add.setID(ID);
                add.setName(Name);
                add.setAddress(Address);
                add.setType(type);
                add.setMeter(Meter);
                add.setU(U);
                add.setUnit(Unit);
                add.setPrice(Price);
                add.setVat(vat);
                add.setSum(Total);
                add.setStreamPay();
                boolean result = add.calPay();
                //scan savn to csutomer.csv//
                if(result == true){
                    System.out.println("----------------");
                    System.out.println("Save sucess");
                    System.out.println("----------------");
                }
                else{
                    System.out.println("----------------");
                    System.out.println("Save Failed");
                    System.out.println("----------------");
                }

                

                

            }
            else if(b==2){
                ChekID ck = new ChekID();
                System.out.print("Input ID : ");
                String ID = input.next();
                ck.setScan3();
                ck.setPay(ID);
                String[] arrayPay = ck.getPay();
                System.out.println("=======================================================\n");
                System.out.println("................Water bill notification................\n");
                System.out.println("............Provincial Waterworks Authority............\n");
                System.out.println("branch:                                          Hatyai\n");
                System.out.println("tel.:                                        02-5896456\n");
                System.out.println("Employee:  \t\t\t\t\t" +username+                     "\n");
                System.out.println("======================================================\n");
                System.out.println("Date of water bill     \tDue date               \n");
                System.out.println(" "+myObj3 + "\t  \t" + myObj3.plusDays(7) + "\n");
                System.out.println("======================================================\n");
                System.out.println("Water user number    \t"+  arrayPay[0]+ "\n");
                System.out.println("User Name:                  " + arrayPay[1]+ "\n");
                System.out.println("User Addass:                " + arrayPay[2]+ "\n");
                System.out.println("Water usage data         Last time          This time\n");
                System.out.println("======================================================\n");
                System.out.println("Date of reading  \t " + myObj3.minusMonths(1) +"\t   " + myObj3 +"\n");
                System.out.println("Numbers in water meters:   " + arrayPay[5]  +"\t\t  "+arrayPay[6] +"\n");
                System.out.println("Weter bill :                              " + arrayPay[7] + " bath \n");
                System.out.println("VAT(7%) :                                 " + arrayPay[8] + " bath \n");
                System.out.println("Total :                                   " + arrayPay[9] + " bath \n");
                System.out.println("======================================================\n"); 
                System.out.println("Please pay before the time specified : \t    " + myObj3.plusDays(7) +"\n");
                System.out.println("If it is overdue :          \t\t    " + myObj3.plusDays(14) + "\n");
                System.out.println("the water supply will be suspended                     \n");  
                System.out.println("======================================================\n");
                System.out.println("......................Vision EGAT.....................\n");
                System.out.println("......Customers are delighted with water quality......\n");
                System.out.println("................And excellent services................\n");
                System.out.println("======================================================\n"); 
                do{
                    int addpro1 = 0;
                Scanner myObj10 = new Scanner(System.in);
                System.out.println("======================================================\n"); 
                System.out.println("Do you want to pay?: ");
                System.out.println("[1] : say yes");
                System.out.println("[2] : say no");
                System.out.print("Input Number :  ");
                try {
                    wenttocatch = false;
                    addpro1 = myObj10.nextInt();
                } catch (Exception e) {
                    wenttocatch = true;
                    System.out.println("--------------------------------");
                    System.out.println("Please specify the number type.");
                    System.out.println("--------------------------------");
                }

                if (addpro1 == 1){
                    System.out.println("Water Price:        " + arrayPay[9]);
                    System.out.println("===============================\n");
                    
                    Scanner myObj12 = new Scanner(System.in);
                    System.out.print("Input payment  :  ");
                    double price = myObj12.nextDouble(); 
                    // c1.setPrice(price);
                    // c1.setWaterprice(waterprice);
    
                    String total = arrayPay[9];
                    Double sum = Double.parseDouble(total);
                    System.out.println("===============================\n");
                    System.out.println("....Water bill notification....\n");
                    System.out.println("Provincial Waterworks Authority\n");
                    System.out.println("branch:                  Hatyai\n");
                    System.out.println("tel :                02-5896456\n");
                    System.out.println("Employee :\t\t" +username+    "\n");
                    System.out.println("Date of water bill:  "+myObj3+"\n");
                    System.out.println("===============================\n");
                    System.out.println("Price :         " + sum +"\t  bath");
                    System.out.println("Service fee :   " + 10 + "\t  bath");
                    System.out.println("Vat(7%) :       " + arrayPay[8] + "\t  bath");
                    System.out.println("Payment :       " + price + "\t  bath");
                    System.out.println("Total :         " + sum + "\t  bath");
                    System.out.println("Change :        " + (df.format((price-sum))) + "\t  bath");
                    System.out.println("===============================\n");
                    System.out.println("..........Vision EGAT..........\n");
                    System.out.println("....Customers are delighted....\n"); 
                    System.out.println(".......with water quality......\n");
                    System.out.println(".....And excellent services....\n");
                    System.out.println("===============================\n");

                    String Name = arrayPay[1];
                    String Address = arrayPay[2];
                    String Unit = String.valueOf(arrayPay[5]);
                    String Sum = String.valueOf(sum); 
                    String Pay = String.valueOf(price);    
                    String Change = String.valueOf((df.format((price-sum))));                   
                    AddInfo add = new AddInfo();
                    add.setID(ID);
                    add.setName(Name);
                    add.setAddress(Address);
                    add.setUnit(Unit);
                    add.setSum(Sum);
                    add.setPay(Pay);
                    add.setChange(Change);
                   
                    add.setHistory();
                    boolean result = add.calHistory();
                    //scan savn to csutomer.csv//
                    if(result == true){
                        System.out.println("----------------");
                        System.out.println("Save sucess");
                        System.out.println("----------------");
                    }
                    else{
                        System.out.println("----------------");
                        System.out.println("Save Failed");
                        System.out.println("----------------");
                    }
                } 
            }while (wenttocatch == true);
            }

            else if(b == 3){
                ChekID ck = new ChekID();
                System.out.print("Input ID : ");
                String ID = input.next();
                ck.setScan4();
                ck.setHistory(ID);
                String[] arrayHistory = ck.getHistory();
                    System.out.println("\t---Show History---\t");
                    System.out.println("===============================\n");
                    System.out.println("ID : \t\t" + arrayHistory[0]);
                    System.out.println("Name : \t\t"+arrayHistory[1]);
                    System.out.println("Address : \t"+arrayHistory[2]);
                    System.out.println("Unit : \t\t"+arrayHistory[3]);
                    System.out.println("Total  : \t"+arrayHistory[4]);
                    System.out.println("Payment  : \t"+arrayHistory[5]);
                    System.out.println("Change  : \t"+arrayHistory[6]);
                    System.out.println("===============================\n");
            }
            else{
                System.out.println("Please Enter number 1 to 3");
            }
        }while (wenttocatch == true);
        //end Bill//

        }else if(num == 2){
          //Star Customer to MenuInfo.java//
            menu.calCustomer();
            int c = input.nextInt();
            ChekID ck = new ChekID();
            if( c == 1){
                do{
                    String ID = "";
                System.out.print("Input ID : ");
                try {
                    wenttocatch = false;
                    ID = input.next();
                } catch (Exception e) {
                    wenttocatch = true;
                    System.out.println("--------------------------------");
                    System.out.println("Please specify the number type.");
                    System.out.println("--------------------------------");
                }
                // String ID = input.next();
                ck.setScan();
                ck.setBin(ID);
                String[] arrayBin = ck.getBin();
                System.out.println("\t---Show Customer---\t");
                System.out.println("===============================\n");
                System.out.println("ID : \t\t"+arrayBin[0]);
                System.out.println("Name : \t\t"+arrayBin[1]);
                System.out.println("Address : \t"+arrayBin[2]);
                System.out.println("Type : \t\t"+arrayBin[3]);
                System.out.println("Meter : \t"+arrayBin[4]);
                System.out.println("===============================\n");
            }while (wenttocatch == true);
            } 

            else if ( c ==2 ){
                AddInfo csutomer = new AddInfo();
                Scanner scan = new Scanner(System.in);
                //Enter ID//
                Random rand = new Random();
                int ID = rand.nextInt(100000);
                System.out.println("ID : " + Math.abs(ID) );
                System.out.print("Input Name : ");
                String Name = scan.next();
                System.out.print("Input Address : ");
                String Address = scan.next();
                System.out.print("Input Type : ");
                String Type = scan.next();
                System.out.print("Input Meter : ");
                String Meter = scan.next();
                System.out.print("Input Unit : ");
                String Unit = scan.next();
                //scan to csutomer//
                String id = String.valueOf(ID);  
                csutomer.setID(id);
                csutomer.setName(Name);
                csutomer.setAddress(Address);
                csutomer.setType(Type);
                csutomer.setMeter(Meter);
                csutomer.setUnit (Unit);
                csutomer.setStreamCust();
                
                boolean result = csutomer.calCust();
                //scan savn to csutomer.csv//
                if(result == true){
                    System.out.println("----------------");
                    System.out.println("Save sucess");
                    System.out.println("----------------");
                }
                else{
                    System.out.println("----------------");
                    System.out.println("Save Failed");
                    System.out.println("----------------");
                }
            }
        }
        //End Customer //

        else if(num == 3){
           //Star Saff to Menu.java//
           menu.calSaff();
            ChekID ck = new ChekID();
            int s = input.nextInt();
            if( s == 1){
                System.out.print("Input Username : ");
                String name = input.next(); 
                ck.setScan2();
                ck.setCustomer(name);
                String[] arrayBin = ck.getCustomer();
                System.out.println("\t---Show Staff---\t");
                System.out.println("===============================\n");
                System.out.println("Name : "+arrayBin[0]);
                System.out.println("===============================\n");
            }
            else if ( s == 2){
                AddInfo saff = new AddInfo();
                Scanner scan = new Scanner(System.in);
                Random rand = new Random();
                int ID = rand.nextInt(100000);
                System.out.println("ID : " + Math.abs(ID) );
                System.out.print("Input Username : ");
                String Name = scan.next();
                saff.setName(Name);
                saff.setStreamSaff();
                boolean result = saff.calSaff();
                if(result == true){
                    System.out.println("----------------");
                    System.out.println("Save sucess");
                    System.out.println("----------------");
                }
                else{
                    System.out.println("----------------");
                    System.out.println("Save Failed");
                    System.out.println("----------------");
                }
            }
        }else if(num == 4){
            System.out.println("Exit Program");
            return;
        }
    }
  }
 }



