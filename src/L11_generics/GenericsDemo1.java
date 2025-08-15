package L11_generics;

class Test<T>{
    // declare an object of type T
    T obj;
    Test(T obj){
        this.obj = obj;
    }
    public T getObj(){
        return this.obj;
    }

}
public class GenericsDemo1 {
    public static void main(String[] args) {
        Test<Integer> integerObj = new Test<Integer>(15);
        System.out.println(integerObj.getObj());
        Test<String>stringObj = new Test<String>("Srijan");
        System.out.println(stringObj.getObj());
    }
}
