import java.io.FileWriter;
import java.io.IOException;

public class AddInfo extends HomeInfo {
    private FileWriter streamCust;
    private FileWriter streamSaff;
    private FileWriter streamPay;
    private FileWriter streamHistory;

    
    public void setStreamCust() throws IOException {
        streamCust = new FileWriter(fileCust,true);
        
    }
    public FileWriter getStreamCust(){
        return streamCust;
    }

    public void setStreamSaff() throws IOException {
        streamSaff = new FileWriter(fileSaff, true);
    }
    
    public FileWriter getStreamSaff() {
        return streamSaff;
    }

    public void setStreamPay() throws IOException {
        streamPay = new FileWriter(filePay,true);
        
    }
    public FileWriter getStreamPay(){
        return streamPay;
    }

    public void setHistory() throws IOException {
        streamHistory = new FileWriter(fileHistory,true);
        
    }
    public FileWriter getHistoryt(){
        return streamHistory;
    }

    public boolean calCust() throws IOException {
        streamCust.append(ID);
        streamCust.append(",");
        streamCust.append(Name);
        streamCust.append(",");
        streamCust.append(Address);
        streamCust.append(",");
        streamCust.append(Type);
        streamCust.append(",");
        streamCust.append(Meter);
        streamCust.append(",");
        streamCust.append(Unit);
        streamCust.append("\n");
        streamCust.flush();
        streamCust.close();
        return true;
    }

    public boolean calSaff() throws IOException {
        streamSaff.append(Name);
        streamSaff.append("\n");
        streamSaff.flush();
        streamSaff.close();
        return true;
    }

    public boolean calPay() throws IOException {
        streamPay.append(ID);
        streamPay.append(",");
        streamPay.append(Name);
        streamPay.append(",");
        streamPay.append(Address);
        streamPay.append(",");
        streamPay.append(Type);
        streamPay.append(",");
        streamPay.append(Meter);
        streamPay.append(",");
        streamPay.append(u);
        streamPay.append(",");
        streamPay.append(Unit);
        streamPay.append(",");
        streamPay.append(Price);
        streamPay.append(",");
        streamPay.append(Vat);
        streamPay.append(",");
        streamPay.append(sum);
        streamPay.append("\n");
        streamPay.flush();
        streamPay.close();
        return true;
    }
    public boolean calHistory() throws IOException {
        streamHistory.append(ID);
        streamHistory.append(",");
        streamHistory.append(Name);
        streamHistory.append(",");
        streamHistory.append(Address);
        streamHistory.append(",");
        streamHistory.append(Unit);
        streamHistory.append(",");
        streamHistory.append(sum);
        streamHistory.append(",");
        streamHistory.append(Pay);
        streamHistory.append(",");
        streamHistory.append(Change);
        streamHistory.append("\n");
        streamHistory.flush();
        streamHistory.close();
        return true;
    }

}