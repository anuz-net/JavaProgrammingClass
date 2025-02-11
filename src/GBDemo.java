public class GBDemo {
    public static void main(String[] args) {
        GBDemo g1 = new GBDemo();
        GBDemo g2 = new GBDemo();

        g1=null;
        g2=null;
        System.gc();
        
    }
    protected void finalize() throws Throwable {
        System.out.println("Garbage is collected");
    }
}
