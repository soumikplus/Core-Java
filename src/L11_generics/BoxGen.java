package L11_generics;

public class BoxGen<T> {
    private T value;

    public void set(T value){
        this.value = value;
    }
    public T get(){
        return value;
    }
}

class BoxGenDemo{
    public static void main(String[] args) {
        BoxGen<String> stringBox = new BoxGen<>();
        stringBox.set("This is a string box");

        String str = stringBox.get();;
        System.out.println(str);
    }

}
