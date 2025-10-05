public class substring {

        public static void main(String[] args) {
            String s1 = "Hello World!";
            int n = s1.length();
            String f1 = (n < 2) ? s1 : s1.substring(0, 2);
            String result = "";
            for (int i = 0; i <= n; i++) {
                result += f1;
            }
            System.out.print(result);
        }
    }
