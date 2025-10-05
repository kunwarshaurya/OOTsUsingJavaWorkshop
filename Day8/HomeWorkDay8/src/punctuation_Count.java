public class punctuation_Count {
    public static void main(String[] args) {
        String p = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.\n" +
                "\n";
        String update = p.trim();
        int count = 0;
        for (int i = 0; i < update.length(); i++) {
            char alpha = update.charAt(i);

            if (alpha=='.'|| alpha==','){
                count++;

            }

        }
        System.out.println(count);



    }
}
