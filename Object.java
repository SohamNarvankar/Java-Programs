class Backend{
    int a;
    public Backend(int a){
         this.a=a;
    }
    public int Increment(Backend s){
        return ++s.a;
    }
    public void Display(int print){
       System.out.println("The value after incrementing is:"+print);
    }
}
class Object{
    public static void main(String[] args) {
        Backend back=new Backend(4);
        back.Increment(back);
        back.Display(back.Increment(back));
    }
}