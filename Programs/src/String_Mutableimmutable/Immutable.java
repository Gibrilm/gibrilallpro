package String_Mutableimmutable;

public class Immutable {
public static void main(String[] args) {
	String a = "Fast";
	String b = "Fast";
	int identityHashCode = System.identityHashCode(a);
	System.out.println(identityHashCode);
	int identityHashCode2 = System.identityHashCode(b);
	System.out.println(identityHashCode2);
	String c = a.concat(b);
	int identityHashCode3 = System.identityHashCode(c);
	System.out.println(identityHashCode3);
	System.out.println(c);
	
}
}
