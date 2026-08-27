import java.lang.reflect.Array;

public class QuestionService {
    Question [] questions = new Question[5];

    public QuestionService()
    {
        questions [0] = new Question(1, "Size of int", "2", "6", "6", "", "4");
        questions [1] = new Question(1, "Size of double", "2", "6", "6", "", "4");
        questions [2] = new Question(1, "Size of char", "2", "6", "6", "", "2");
        questions [3] = new Question(1, "Size of long", "2", "6", "6", "", "8");
        questions [4] = new Question(1, "Size of boolean", "1", "6", "6", "", "1");



    }

    public void displayQuestions()
    {
        for(Question q : questions){
            System.out.println(q);
        }
    }

}
