package L11_generics;

public class Box {
    private Object value;

    public void set(Object value){
        this.value = value;
    }
    public Object get(){
        return value;
    }

    public static void main(String[] args) {
        Box b1 = new Box();
        b1.set("SMK");
        String name = (String)b1.get();
        System.out.println(name);
        Box b2 = new Box();
        b2.set(123);
        System.out.println(b2.get());

    }
}

