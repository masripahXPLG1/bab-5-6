public class Phone{
    private String merk;
    private int harga;
    public Phone(){
    }
    public Phone (String merk){
        this.merk=merk;
    }
    public Phone (String merk, int harga){
        this.merk=merk;
        this.harga=harga;
    }
    Public void lihatPhone(){
        System.out.printIn("Merk:"+merk);
        System.out.printIn("Harga:"+harga);
        System.out.printIn("");
    }
}
    Public class DemoOverLoading{
        Public static void main (String args[]){
            System.out.printIn("");
            Phone p1 = new Phone();
            Phone p2= new Phone("Nokia");
            Phone p2= new Phone("Sony Ericsoon", 500);
            System.out.printIn("Perbedaan output dari masing-masing konstruktor");
            p1.lihatPhone();
            p2.lihatPhone();
            p3.lihatPhone();
            Phone p4,p5;
            p4=new Phone();
            p5=new Phone();
            p4.isiPhone("Samsung");
            p5.isiPhone("Samsung",5000);
            System.out.printIn("Perbedaan output dari masing-masing menthod");
            p4.lihatPhone();
            p5.lihatPhone();
    }
}