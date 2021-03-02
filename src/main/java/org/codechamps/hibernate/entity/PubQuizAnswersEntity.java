package org.codechamps.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "pubQuizAnswers")
@Entity(name = "PubQuizAnswersEntity")
public class PubQuizAnswersEntity {
	
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "pubQuestionId")
	private int pubQuestionId;
	@Column(name = "pubAnswer")
	private String pubAnswer;
	
	public PubQuizAnswersEntity() {}
	
	public PubQuizAnswersEntity(int id, int pubQuestionId, String pubAnswer) {
		this.id = id;
		this.pubAnswer = pubAnswer;
		this.pubQuestionId = pubQuestionId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPubQuestionId() {
		return pubQuestionId;
	}

	public void setPubQuestionId(int pubQuestionId) {
		this.pubQuestionId = pubQuestionId;
	}

	public String getPubAnswer() {
		return pubAnswer;
	}

	public void setPubAnswer(String pubAnswer) {
		this.pubAnswer = pubAnswer;
	}
}
