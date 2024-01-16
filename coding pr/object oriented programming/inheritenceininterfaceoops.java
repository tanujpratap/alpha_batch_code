  interface mysampleinterface{
    void meth1();
    void meth2();

  }
  interface childsample extends mysampleinterface{
    void meth3();
    void meth4();
  }
  class mysampleclass implements childsample{
    public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }
    public void meth3(){
        System.out.println("meth3");
    }
    public void meth4(){
        System.out.println("meth4");
    }
  }
  public class inheritenceininterfaceoops {
    public static void main(String[] args) {
        mysampleclass  msc=new mysampleclass();
        msc.meth1();
        msc.meth2();
    }
    
}
