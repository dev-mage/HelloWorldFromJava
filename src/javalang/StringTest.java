package javalang;
public class StringTest {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("abc");
        sb.append("123");
        StringBuffer sb2 = sb.append("ZZ");

        System.out.println(sb); // abc123ZZ
        System.out.println(sb2); // abc123ZZ
    }
}
