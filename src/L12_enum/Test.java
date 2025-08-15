package L12_enum;

enum Color{
    RED,
    GREEN,
    BLUE;

    private Color() {
        System.out.println("Constructor called for : " + this.toString());
    }
    public void colorInfo() {
        System.out.println("Universal Color");
    }
}

// declaration inside or outside the class , both are possible but not inside a method

public class Test {
    public static void main(String[] args) {
        Color c1 = Color.RED;
//        System.out.println(c1);
        for(Color x:Color.values()){
            System.out.println(x);
        }
        System.out.println("using valueOf() printing for BLUE: "+ Color.valueOf("BLUE"));
    }
}
