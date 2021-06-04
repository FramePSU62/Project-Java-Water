import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
public class ChekID {
    protected File FileCsutomer = new File("Csutomer.csv");
    protected File FileSaff = new File("Saff.csv");
    protected File FilPay = new File("Pay.csv");
    protected File fileHistory = new File("History.csv");
    protected File fileSaff = new File("Saff.csv");
    private String[] Saff;
    private String[] bin;
    private String[] customer;
    private String[] pay;
    private String[] History;
    BufferedReader scan ;
    String user;


    public void setScan() throws UnsupportedEncodingException, FileNotFoundException {
        scan = new BufferedReader(new InputStreamReader(new FileInputStream(FileCsutomer), "UTF8"));
    }
    public void setScan2() throws UnsupportedEncodingException, FileNotFoundException {
        scan = new BufferedReader(new InputStreamReader(new FileInputStream(FileSaff), "UTF8"));
    }
    public void setScan3() throws UnsupportedEncodingException, FileNotFoundException {
        scan = new BufferedReader(new InputStreamReader(new FileInputStream(FilPay), "UTF8"));
    }
    public void setScan4() throws UnsupportedEncodingException, FileNotFoundException {
        scan = new BufferedReader(new InputStreamReader(new FileInputStream(fileHistory), "UTF8"));
    }
    public void setBin(String bin) throws IOException {
        String str;
        while((str = scan.readLine()) != null){
            String[] arrayCus = str.split(",");
            if(arrayCus[0].equals(bin)){
                this.bin = arrayCus;
            }
        }
    }
    public String[] getBin(){
        return bin;
    }
        
    public void setCustomer(String customer) throws IOException {
        String str;
        while((str = scan.readLine()) != null){
            String[] arrayCus = str.split(",");
            if(arrayCus[0].equals(customer)){
                this.customer = arrayCus;
            }
        }
    }
    public String[] getCustomer(){
        return customer;
    }

    public void setPay(String pay) throws IOException {
        String str;
        while((str = scan.readLine()) != null){
            String[] arrayPay = str.split(",");
            if(arrayPay[0].equals(pay)){
                this.pay = arrayPay;
            }
        }
    }
    public String[] getPay(){
        return pay;
    }
    public void setHistory(String History) throws IOException {
        String str;
        while((str = scan.readLine()) != null){
            String[] arrayHistory = str.split(",");
            if(arrayHistory[0].equals(History)){
                this.History = arrayHistory;
            }
        }
    }
    public String[] getHistory(){
        return History;
    }
        
}