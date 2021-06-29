import java.util.Arrays;
public class SortStringApi
{
public static void main(String[] args) {
String original = "sathya";
char[] chars = original.toCharArray();
Arrays.sort(chars);
String sorted = new String(chars);
System.out.println(sorted);
}
}