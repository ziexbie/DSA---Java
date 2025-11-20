public class CountDigitsAndSpaces {
    public static void main(String[] args) {
        String s = "Heyy Yo 112";
        int d = 0;
        int space = 0;

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch>='0' && ch<='9'){
                d++;
            } else if (ch == ' '){
                space++;
            }
        }
       System.out.println(d);
       System.out.println(space);
    }
}
