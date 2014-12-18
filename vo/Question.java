package vo;

public class Question {
	private int id;
	private int movie_id;
	private String question;
	private String answer;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMovie_id() {
		return movie_id;
	}
	public Question setMovie_id(int movie_id) {
		this.movie_id = movie_id;
		return this;
	}
	public String getQuestion() {
		return question;
	}
	public Question setQuestion(String question) {
		this.question = question;
		return this;
	}
	public String getAnswer() {
		return answer;
	}
	public Question setAnswer(String answer) {
		this.answer = answer;
		return this;
	}
}
