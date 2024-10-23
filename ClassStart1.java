package class1;

public class ClassStart1 {

    public static void main(String[] args) {
        String[] studentName = {"학생1", "학생2"};
        int[] studentAges = {15, 16};
        int[] studentGrades = {90, 80};

        for (int i = 0; i < studentName.length; i++) {
            System.out.println("이름: " + studentName[i] + " 나이: " + studentAges[i] + " 성적: " + studentGrades[i]);
        }
    }
}
