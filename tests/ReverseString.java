//23.06.2022
public class ReverseString{
    public static void main(String[] args) {
        String str = "1234567890";
        var ch = str.toCharArray();
        String reverse = "";
        for(int i = ch.length-1; i >= 0; i--) {
            reverse = reverse + ch[i];
        }
        //StringBuilder sb = new StringBuilder(str);
        //String reverse = sb.reverse().toString();
        System.out.println(reverse);
    }
}