
public class Main {
    public static void main(String[] args) {

        int[] nums = {1,2,3,3,5};

        for (int i : SetMismatch.findErrorNums(nums)) {
            System.out.println(i);
        }
}
}
