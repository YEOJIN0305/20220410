package D20220608;

public class ExamDTO {

    private String test;
    private int score;

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;//파라미터의 테스트와 String test와 구별하기 위해
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
