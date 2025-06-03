class luar{
    private int a;
    public void setA(int nilai){
        a=nilai;
    }
    Public int getA(){
        return a;
    }
    //mendefinisikan inner class
    class dalam{
        private int x=10;//hanya dikenali kelas Dalam
        public void showData(){
            System.out.printIn("Nilai a dari kelas Luar:"+a);
            System.out.printIn("Nilai x dari kelas Dalam:"+x);
        }
    }
    Public void showData(){
        //Baris dibawah ini SALAH, karena x tidak dikenal disini
        //System.out.printIn("Nilai x dari kelas Dalam:"+x);
    Dalam obj = new Dalam();
    Obj.showData();
}
}