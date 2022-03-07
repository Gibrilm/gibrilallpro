package String_Mutableimmutable;

public class Mutable {
public static void main(String[] args) {
	StringBuffer a = new StringBuffer("Fast");
	StringBuffer b = new StringBuffer("Fast");
	int identityHashCode = System.identityHashCode(a);
	System.out.println(identityHashCode);
	int identityHashCode2 = System.identityHashCode(b);
	System.out.println(identityHashCode2);
	StringBuffer c =a.append(b);
	System.out.println(c);
	int identityHashCode3 = System.identityHashCode(c);
	System.out.println(identityHashCode3);
	
}
}
