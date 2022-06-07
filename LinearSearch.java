public class LinearSearch {
    public static void main(String[] args) {
       String name = "Ashwin";
       char target = 'y';
        System.out.println(linear(name, target));
    }
    static boolean linear(String str, char target) {
        if(str.length() == 0){
            return false;
        }
        for(char ch : str.toCharArray()) {
            if(ch == target){
                return true;
            }
        }
        return false;
    }
}
