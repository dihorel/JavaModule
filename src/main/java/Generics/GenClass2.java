package Generics;

public class GenClass2<T,V> {

    T v1;//type 1
    V v2;//type 2


    GenClass2(T v1,V v2) {          // A Setter method
        this.v1=v1;
        this.v2=v2;
    }

    public T getVal1() {       // A Getter method
        return v1;
    }
    public V getVal2() {       // A Getter method
        return v2;
    }

}
