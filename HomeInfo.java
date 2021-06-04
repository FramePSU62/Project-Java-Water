import java.io.File;

public class HomeInfo {
    protected String ID;
    protected String Name;
    protected String Address;
    protected String Type;
    protected String Meter;
    protected String u;
    protected String Unit;
    protected String Price;
    protected String Vat;
    protected String Service;
    protected String sum;
    protected String Pay;
    protected String Change;
    protected File fileCust = new File("Csutomer.csv");
    protected File fileSaff = new File("Saff.csv");
    protected File filePay = new File("Pay.csv");
    protected File fileHistory = new File("History.csv");
    protected File fileMeter = new File("Meter.csv");
    protected File fileType = new File("Type.csv");
    
    public void setID(String ID){
        this.ID = ID;
    }
    public String getID(){
        return ID;
    }
    public void setName(String Name){
        this.Name = Name;
    }
    public String getName(){
        return Name;
    }
    public void setAddress(String Address){
        this.Address = Address;
    }
    public String getAddress(){
        return Address;
    }
    public void setType(String Type){
        this.Type = Type;
    }
    public String getType(){
        return Type;
    }
    public void setMeter(String Meter){
        this.Meter = Meter;
    }
    public String getMeter(){
        return Meter;
    }
    public void setUnit(String Unit){
        this.Unit = Unit;
    }
    public String getUnit(){
        return Unit;
    }
    public void setPrice(String Price){
        this.Price = Price;
    }
    public String getPrice(){
        return Price;
    }
    public void setVat(String vat) {
        Vat = vat;
    }
    public String getVat() {
        return Vat;
    }
    
    public void setSum(String sum) {
        this.sum = sum;
    }
    public String getSum() {
        return sum;
    }
    public void setService(String service) {
        this.Service = service;
    }
    public String getService() {
        return Service;
    }

    public void setU(String u) {
        this.u = u;
    }
    public String getU() {
        return u;
    }
    public void setPay(String Pay) {
        this.Pay = Pay;
    }
    public String getPay() {
        return u;
    }
    public void setChange(String change) {
        Change = change;
    }
    public String getChange() {
        return Change;
    }
    
}