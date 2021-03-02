package org.codechamps.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "SpellingCheckQuizAnswer")
@Entity(name = "SpellingCheckQuizAnswerEntity")
public class SpellingCheckQuizAnswerEntity {
	
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "spelQuestionId")
	private int spelQuestionId;
	@Column(name = "answerText")
	private String answerText;
	
	public SpellingCheckQuizAnswerEntity() {}
	
	public SpellingCheckQuizAnswerEntity(int id , int spelQuestionId, String answerText) {
		this.answerText = answerText;
		this.id = id;
		this.spelQuestionId = spelQuestionId; 
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSpelQuestionId() {
		return spelQuestionId;
	}

	public void setSpelQuestionId(int spelQuestionId) {
		this.spelQuestionId = spelQuestionId;
	}

	public String getAnswerText() {
		return answerText;
	}

	public void setAnswerText(String answerText) {
		this.answerText = answerText;
	}
}
