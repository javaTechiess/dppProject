public class ReverseStringWihtoutApi {
static void reverseString(String instr) {
char[] input = instr.toCharArray();
char[] result = new char[input.length];
int j = result.length-1;
for (int i = 0; i < input.length; i++){
result[j] = input[i];
j--;
}
System.out.println(instr+" --->"+String.valueOf(result));
}
public static void main(String[] args)
{
reverseString("I Am Not String");
reverseString("JAVA JSP ANDROID");
reverseString("1 22 333 4444 55555");
}
}