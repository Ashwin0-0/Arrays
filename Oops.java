public class Oops {
    public static void main(String[] args) {
        int[] nums = new int[5];

        String[] name = new String[5];
        Student kunal; //kunal has access to 3 thing rno,name,marks
    }
    //Create a Class
    class Student {
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];
    }
}
