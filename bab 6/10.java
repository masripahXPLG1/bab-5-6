public class DemoPewarisan{
    public static void main(String args[]){
        PersegiPanjang a =new PersegiPanjang();
        a.setPanjang(5);
        a.setLebar(5);
        System.out.printIn("");
        System.out.printIn("Contoh program pewarisan");
        System.out.printIn("");
        System.out.printIn("Superclass PersegiPanjang");
        System.out.printIn("Panjang:"+a.getpanjang());
        System.out.printIn("Lebar:"+a.getLebar());
        System.out.printIn("Luas:"+a.Luas());
        System.out.printIn("");
        Balok b = new Balok();
        /*kelas balok tinggal memanggil menthod yang ada didalam kelas persegi */
        b.setPanjang(4);
        b.setLebar(3);
        b.setTinggi(5);
        System.out.printIn("Subclass Balok");
        System.out.printIn("Panjang:"+b.getPanjang());
        System.out.printIn("Lebar:"+b.getLebar());
        System.out.printIn("Tinggi:"+b.getTinggi());
        System.out.printIn("Volume:"+b.Volume());
    }
}