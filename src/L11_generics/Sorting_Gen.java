package L11_generics;

public class Sorting_Gen {
    public static void main(String[] args) {
        Integer[] a = {10, 22, 25, 66};
        Character[] c = {'j', 'z', 'r', 'g'};
        String[] s = {"Smk", "Hari", "Tesla"};

        System.out.println("Sorted Integer Array : ");
        sort_generics(a);
        System.out.println("Sorted Character Array : ");
        sort_generics(c);
        System.out.println("Sorted String Array : ");
        sort_generics(s);
    }

    public static <T extends Comparable<T>> void sort_generics(T[] arr) {
        // we are comparing the non-primitive datatypes , so we need Comparable class
        for(int i = 0;i< arr.length-1;i++){
            for(int j = 0;j< arr.length-i-1;j++){
                if(arr[j].compareTo(arr[j+1])>0) swap(j,j+1,arr);
            }
        }
        for(T value : arr){
            System.out.print(value + " ");
        }
        System.out.println();
    }
    public static <T>void swap(int i,int j,T[] a){
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
