class Vechile {
    double speed;
    void go(){
        System.out.println("This Vechile is Moving !!");
    }
    void stop(){
        System.out.println("This vechile is stopped !!!");
    }
}
class Bicycle extends Vechile{

}
public class Inheritance{
    public static void main(String[] args) {
        Bicycle bi = new Bicycle();
        bi.stop();
    }
}