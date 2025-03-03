package ProgramSet3;

public class ClassObject {
    public static void main(String[] args) {
        int a = 5; 
        int b =6;
        ClassObject add = new ClassObject();
        add.add(a,b);
    }    
    public void add(int a, int b){
    int sum=0;
        sum=a+b;
        System.out.println("Your Sum is "+ sum);
    }
}
