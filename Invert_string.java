/**
 *
 * @author christophe.meynet
 */
public class Invert_string {

    public static void main(String[] args) {
        String q = args[0];
        String r = new String();
        int argslenght = q.length();
        for (int i = 0; i < argslenght; i++) {
            String j = q.substring((argslenght - i - 1), (argslenght - i));
            r = r+j;
        }
        System.out.println(r);
    }

}
