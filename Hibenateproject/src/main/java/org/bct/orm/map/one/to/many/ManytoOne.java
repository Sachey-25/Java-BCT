package org.bct.orm.map.one.to.many;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ManytoOne {
	@Id
	@Column(name="answer_id")
	private int answerId;
	private String answer;
	
	@ManyToOne
	private ManytoOneQues question;

	public ManytoOne(int answerId, String answer, ManytoOneQues question) {
		super();
		this.answerId = answerId;
		this.answer = answer;
		this.question = question;
	}

	public ManytoOne() {
		super();
	}

	public int getAnswerId() {
		return answerId;
	}

	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public ManytoOneQues getQuestion() {
		return question;
	}

	public void setQuestion(ManytoOneQues question) {
		this.question = question;
	}
		
}