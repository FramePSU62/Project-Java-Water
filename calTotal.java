public class calTotal extends HomeInfo{

    private double sumTotal;
    private double vat;
    protected double Total;
    private double service;

    public void setSumTotal(double sumTotal) {
        this.sumTotal = sumTotal;
    }
    public double getSumTotal() {
        return sumTotal;
    }
    public void setVat(double vat) {
        this.vat = vat;
    }
    public void setService(double service) {
        this.service = service;
    }
    
    
    

    

    public double getWaterdisplay(double unit , String type){
        
        if (type.equals("Home")){
            if(unit >= 1 && unit <=10){
                sumTotal = unit * 10.20;
                System.out.println("Price : " + sumTotal);

            }else if(unit >=11 && unit <=20){
                sumTotal = unit * 16;
                System.out.println("Price : " +sumTotal);

            }else if(unit >=21 && unit <=30){
                sumTotal = unit * 19;
                System.out.println("Price : " +sumTotal);

            }else {
                sumTotal = unit * 21.20;
                System.out.println("Price : " +sumTotal);
            }
        }else if (type.equals("Small")){
            if(unit >=1 && unit <=10){
                sumTotal = unit * 17.00;
                System.out.println("Price : " +sumTotal);

            }else if(unit >=11 && unit <=20){
                sumTotal = unit * 20.00;
                System.out.println("Price : " +sumTotal);

            }else if(unit >=21 && unit <=30){
                sumTotal = unit * 21.00;
                System.out.println("Price : " +sumTotal);

            }else if(unit >=31 && unit <=50){
                sumTotal = unit * 22.00;
                System.out.println("Price : " +sumTotal);

            }else if(unit >=51 && unit <=80){
                sumTotal = unit * 23.00;
                System.out.println("Price : " +sumTotal);

            }else if(unit >=81 && unit <=100){
                sumTotal = unit * 24.00;
                System.out.println("Price : " +sumTotal);

            }else if(unit >=101 && unit <=300){
                sumTotal = unit * 27.40;
                System.out.println("Price : " +sumTotal);

            }else if(unit >=301 && unit <=1000){
                sumTotal = unit * 27.50;
                System.out.println("Price : " +sumTotal);

            }else if(unit >=1001 && unit <=2000){
                sumTotal = unit * 27.60;
                System.out.println("Price : " +sumTotal);
            }else if(unit >=2001 && unit <=3000){
                sumTotal = unit * 27.80;
                System.out.println("Price : " +sumTotal);
            }else{
                sumTotal = unit * 28.00;
                System.out.println("Price : " +sumTotal);
            }
        }else if (type.equals("Big")){
            if(unit >=1 && unit <=10){
                sumTotal = unit * 18.00;
                System.out.println("Price : " +sumTotal);

            }else if(unit >=11 && unit <=20){
                sumTotal = unit * 21.50;
                System.out.println("Price : " +sumTotal);

            }else if(unit >=21 && unit <=30){
                sumTotal = unit * 25.50;
                System.out.println("Price : " +sumTotal);

            }else if(unit >=31 && unit <=50){
                sumTotal = unit * 28.50;
                System.out.println("Price : " +sumTotal);

            }else if(unit >=51 && unit <=80){
                sumTotal = unit * 31.00;
                System.out.println("Price : " +sumTotal);

            }else if(unit >=81 && unit <=100){
                sumTotal = unit * 31.25;
                System.out.println("Price : " +sumTotal);

            }else if(unit >=101 && unit <=300){
                sumTotal = unit * 31.50;
                System.out.println("Price : " +sumTotal);

            }else if(unit >=301 && unit <=1000){
                sumTotal = unit * 31.75;
                System.out.println("Price : " +sumTotal);

            }else if(unit >=1001 && unit <=2000){
                sumTotal = unit * 32.00;
                System.out.println("Price : " +sumTotal);

            }else if(unit >=2001 && unit <=3000){
                sumTotal = unit * 32.25;
                System.out.println("Price : " +sumTotal);

            }else{
                sumTotal = unit * 32.50;
                System.out.println("Price : " +sumTotal);
            }
        }else{
            System.out.println("ERROR");
        }
        return sumTotal;
    }
    public String getVat() {
        this.vat = sumTotal * 0.07;
        System.out.println("Vat : "+ vat);
        String Vat = String.valueOf(vat);
        return Vat;
    }
    public double getTotal(String x){
        if(x.equals("1/2")){
            this.service =30;
            this.Total = sumTotal + vat + 30;
            System.out.println("Service : "+service);
            System.out.println("Total : "+Total);
            String Service = String.valueOf(service);
            String sum = String.valueOf(Total);

        }else if(x.equals("3/4")){
            this.service =50;
            this.Total = sumTotal + vat + 50;
            System.out.println("Service : "+service);
            System.out.println("Total : "+Total);
            String Service = String.valueOf(service);
            String sum = String.valueOf(Total);

        }else if(x.equals("1")){
            this.service =60;
            this.Total = sumTotal + vat + 60;
            System.out.println("Service : "+service);
            System.out.println("Total : "+Total);
            String Service = String.valueOf(service);
            String sum = String.valueOf(Total);

        }else if(x.equals("1.1/2")){
            this.service =90;
            this.Total = sumTotal + vat + 90;
            System.out.println("Service : "+service);
            System.out.println("Total : "+Total);
            String Service = String.valueOf(service);
            String sum = String.valueOf(Total);

        }else if(x.equals("2")){
            this.service =350;
            this.Total = sumTotal + vat + 350;
            System.out.println("Service : "+service);
            System.out.println("Total : "+Total);
            String Service = String.valueOf(service);
            String sum = String.valueOf(Total);

        }else if(x.equals("2.1/2")){
            this.service =450;
            this.Total = sumTotal + vat + 450;
            System.out.println("Service : "+service);
            System.out.println("Total : "+Total);
            String Service = String.valueOf(service);
            String sum = String.valueOf(Total);

        }else if(x.equals("3")){
            this.service =450;
            this.Total = sumTotal + vat + 450;
            System.out.println("Service : "+service);
            System.out.println("Total : "+Total);
            String Service = String.valueOf(service);
            String sum = String.valueOf(Total);

        }else if(x.equals("4")){
            this.service =450;
            this.Total = sumTotal + vat + 450;
            System.out.println("Service : "+service);
            System.out.println("Total : "+Total);
            String ser = String.valueOf(service);
            String Sum = String.valueOf(Total);
            String Service = String.valueOf(service);
            String sum = String.valueOf(Total);

        }else if(x.equals("6")){
            this.service =950;
            this.Total = sumTotal + vat + 950;
            System.out.println("Service : "+service);
            System.out.println("Total : "+Total);
            String Service = String.valueOf(service);
            String Sum = String.valueOf(Total);
            
        }else if(x.equals("8")){
            this.service =1200;
            this.Total = sumTotal + vat + 1200;
            System.out.println("Service : "+service);
            System.out.println("Total : "+Total);
            String Service = String.valueOf(service);
            String sum = String.valueOf(Total);
        }
        return Total;
    }
    public String getService() {
        return Service;
    }
    
}

