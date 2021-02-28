package org.codechamps.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "GeneralKnowlegeQuizEntity")
@Table(name = "GeneralKnowlegeQuiz")
public class GeneralKnowlegeQuizEntity 
{
	
	public GeneralKnowlegeQuizEntity() {}
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "question")
	private String question;
	@Column(name = "answer")
	private String answer;
	
	public GeneralKnowlegeQuizEntity(int id, String quesiton, String answer)
	{
		this.answer = answer;
		this.id = id;
		this.question = quesiton;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
}
