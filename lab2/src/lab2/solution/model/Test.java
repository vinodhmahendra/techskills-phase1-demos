package lab2.solution.model;

public abstract class Test implements Testable{
	private Question[] questions = new Question[3];
	private int counter;

	public Test() {
	}
	public Test(String aText) {
		System.out.println(aText);
		generate();
	}
	public void addQuestion(Question aQuestion) {
		questions[counter] = aQuestion;
		counter+=1;
	}
	protected void finalize() {
		System.out.println("Finalize called on " + this);
	}
	public abstract boolean generate(); 
	
	
	public int getQuestionCount() {
		return questions.length;
	}
	public Question[] getQuestions() {
		return questions;
	}
	public Question getQuestion(int index) {
		return questions[index];
	}
	public void setQuestions(Question[] newQuestions) {
		questions = newQuestions;
	}
}