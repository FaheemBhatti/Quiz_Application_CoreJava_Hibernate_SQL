package org.codechamps.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "ITKnowledgeQuizAnswers")
@Entity(name = "ITKnowlegeQuizAnswersEntity")
public class ITKnowlegeQuizAnswersEntity {
	
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "itQuestionId")
	private int itQuestionId;
	@Column(name = "itAnswer")
	private String itAnswer;
	
	public ITKnowlegeQuizAnswersEntity() {}
	
	public ITKnowlegeQuizAnswersEntity(int id, int itQuestionId, String itAnswer) {
		this.id = id;
		this.itAnswer = itAnswer;
		this.itQuestionId = itQuestionId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getItQuestionId() {
		return itQuestionId;
	}

	public void setItQuestionId(int itQuestionId) {
		this.itQuestionId = itQuestionId;
	}

	public String getItAnswer() {
		return itAnswer;
	}

	public void setItAnswer(String itAnswer) {
		this.itAnswer = itAnswer;
	}
}
