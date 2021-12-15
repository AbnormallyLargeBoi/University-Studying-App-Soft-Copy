public class Main{
    public static void main(String[] args){
        Main q = new Main();
        q.go();
    }
    private void go(){
        QuizCardBuilder quizCardBuilder = new QuizCardBuilder(new Deck());
        quizCardBuilder.build();
    }
}