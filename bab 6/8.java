public class PersegiPanjang{
    private int panjang;
    private int lebar;
    public void setPanjang (int p){
        panjang=p;
    }
    public void setLebar (int l){
        lebar=l;
    }
    public void getPanjang(){
        return panjang;
    }
    public void getLebar(){
        return lebar;
    }
    public int Luas(){
        int luas=panjang*lebar;
        return luas;
    }
}