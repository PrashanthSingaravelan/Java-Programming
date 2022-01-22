package bounds_on_generics;

interface P {  }
class Q implements P { }
class R implements P { }

class array<T extends P> {   
        
}

public class bounded_types_abstractclass {
    public static void types_abstractclass(String[] args) {
        array<R> obj = new array<>();  
    }
}
