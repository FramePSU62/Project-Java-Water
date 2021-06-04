import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Scanner;

public class ChekInfo {
    private String userstaff;
    private ArrayList<String[]> array = new ArrayList<>();
    private String FileSaff = ("Saff.csv");
    BufferedReader scan;
    String user;

    public ChekInfo(){}

    public ChekInfo(String user) throws UnsupportedEncodingException, FileNotFoundException {
        userstaff = user;
        scan = new BufferedReader(new InputStreamReader(new FileInputStream(FileSaff), "UTF8"));
    }

    public boolean auth() throws IOException {
        while((user = scan.readLine()) != null){
            if((userstaff.equals(user)))return true;
        }
        return false;
        }

    }