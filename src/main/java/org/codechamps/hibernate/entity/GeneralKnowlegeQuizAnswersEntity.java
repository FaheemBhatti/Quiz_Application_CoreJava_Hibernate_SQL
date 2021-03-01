package org.codechamps.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "GeneralKnowlegeQuizAnswers")
@Entity(name = "GeneralKnowlegeQuizAnswersEntity")
public class GeneralKnowlegeQuizAnswersEntity 
{
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "questionId")
	private int questionId;
	@Column(name = "answer")
	private String answer;
	
	public GeneralKnowlegeQuizAnswersEntity() {}
	
	public GeneralKnowlegeQuizAnswersEntity(int id, int questionId, String answer) {
		this.answer = answer;
		this.id = id;
		this.questionId = questionId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
}
