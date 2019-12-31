import java.io.UnsupportedEncodingException;

public class Encoding {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "你好";
        //byte[] bytes = s.getBytes("iso-8859-1");
        byte[] bytes = s.getBytes("gbk");
        for (byte aByte : bytes) {
            System.out.println(aByte);
        }
        String s1 = new String(bytes);
        System.out.println(s1);
        String def = "?";
        byte[] bytes1 = def.getBytes();
        for (byte b : bytes1) {
            System.out.println(b);
        }


        String s2 = "abc";
        byte[] gbks = s2.getBytes("gbk");
        for (byte gbk : gbks) {
            System.out.println(gbk);
        }

    }
}
