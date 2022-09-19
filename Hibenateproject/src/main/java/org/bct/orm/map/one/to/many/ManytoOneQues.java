package org.bct.orm.map.one.to.many;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class ManytoOneQues {
	@Id
	@Column(name="questionId")
	private int questionId;
	
	private String question;
	
	@OneToMany
	private List<ManytoOne> answers;

	//parameterized constructor
	public ManytoOneQues(int questionId, String question, List<ManytoOne> answers) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answers = answers;
	}

	//default constructor
	public ManytoOneQues() {
		super();
	}

	//getters and setters
	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<ManytoOne> getAnswers() {
		return answers;
	}

	public void setAnswers(List<ManytoOne> answers) {
		this.answers = answers;
	}	
}
