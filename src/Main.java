import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);

        Quiz quiz = new Quiz();






    }
    public static class Quiz {

//    private String Question;

        public Quiz() {

            Scanner sc = new Scanner(System.in);

            int correctAns=0;

            ArrayList<Question> questions = new ArrayList<>();
            //        ArrayList<ArrayList<String>> allOptions = new ArrayList<>();
            ArrayList<String> op = new ArrayList<>();
//        op.add("6");


            Collections.addAll(op, "6", "7", "8", "9");
            questions.add(new Question("4 + 3 = ", op, 2));
//    File classFile = new File();

            op.removeAll(op);

            Collections.addAll(op, "8", "9", "10", "11");
            questions.add(new Question("7 + 4 = ", op, 4));

            op.removeAll(op);

//        System.out.println("2");

            Collections.addAll(op, "6", "7", "8", "5");
            questions.add(new Question("5 + 1 =", op, 1));

            op.removeAll(op);

//        System.out.println("hi");


//        allOptions.add(op);
//        Collections.removeAll()

//        questions.add(new Question("What is your age?"));
            int qn = 1;
            for (Question q : questions) {
            System.out.println("Q"+qn+") "+q.getQuestion());
//            System.out.println(q.getOptions());
//            int index = 1;
                for (int i = 0; i < 4; i++) {
                    System.out.println(i + 1 + ": " + q.getOptions().get(i));
//                index++;
                }

                int choice = sc.nextInt();

                if(choice == q.getCorrect()){
                    correctAns++;
                }
//                System.out.println(q.getCorrect());
            }

            System.out.println("Result: "+ correctAns+"/"+questions.size());
            System.out.println("");
        }

        public static class Question {

            String ques;
            ArrayList<String> options = new ArrayList<>();
            int correct;

            public Question(String q, ArrayList<String> opts, int corr) {
                ques = q;
                options.addAll(opts);
                correct = corr;
            }

            ;

            public String getQuestion() {
                return this.ques;
            }

            public ArrayList<String> getOptions() {
                return this.options;
            }

            public int getCorrect() {
                return this.correct;
            }

        }
    }
}



