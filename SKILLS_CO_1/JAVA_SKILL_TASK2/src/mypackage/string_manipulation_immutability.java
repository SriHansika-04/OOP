package mypackage;

public class string_manipulation_immutability {
	 public static void main(String[] args) {
	        String original = "Hello";
	        System.out.println("Original String: " + original);

	        // Strings are immutable; this creates a new string
	        String modified = original.concat(" World");
	        System.out.println("Modified String: " + modified);

	        // Other operations
	        System.out.println("Uppercase: " + modified.toUpperCase());
	        System.out.println("Lowercase: " + modified.toLowerCase());
	        System.out.println("Character at index 1: " + modified.charAt(1));
	        System.out.println("Substring (0 to 5): " + modified.substring(0, 5));
	        System.out.println("Length: " + modified.length());
	    }
}
