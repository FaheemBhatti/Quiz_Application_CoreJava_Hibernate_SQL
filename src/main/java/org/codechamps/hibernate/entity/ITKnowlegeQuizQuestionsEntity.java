package org.codechamps.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "ITKnowlegeQuizQuestionsEntity")
@Table(name = "ITKnowlegeQuizQuestions")
public class ITKnowlegeQuizQuestionsEntity {
	
	@Id
	@Column(name = "itQuestionId")
	private int questionId;
	@Column(name = "itQuestionText")
	private String questionText;
	
	public ITKnowlegeQuizQuestionsEntity() {}
	
	public ITKnowlegeQuizQuestionsEntity(int questionId, String questionText)
	{
		this.questionId = questionId;
		this.questionText = questionText;	
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestionText() {
		return questionText;
	}

	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}
	
	
}

