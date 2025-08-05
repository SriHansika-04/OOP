package mypackage;

public class wrapperclass {

	    public static void main(String[] args) {
	        int a = 10;

	        
	        Integer obj = Integer.valueOf(a); // or Integer obj = a;
	        System.out.println("Boxed Integer: " + obj);

	        
	        int b = obj.intValue(); // or int b = obj;
	        System.out.println("Unboxed int: " + b);
	    }
	}



