import java.util.StringTokenizer;
public class StringTokenCount {
public static void main(String a[]){
String msg = "This is hello from sathya";
StringTokenizer st = new StringTokenizer(msg," ");
System.out.println("Count: "+st.countTokens());
}
}