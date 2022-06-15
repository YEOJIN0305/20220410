package D20220608;

public class Exam {
    public static void main(String[] args) {

        ExamDTO eDtO = new ExamDTO();

        eDtO.setTest("기말고사");
        eDtO.setScore(100);

        System.out.println("시험 : "+eDtO.getTest());
        System.out.println("점수 : "+eDtO.getScore());
    }
}
