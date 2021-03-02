package org.codechamps.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "SpellingCheckQuizEntity")
@Table(name = "SpellingCheckQuizQuestion")
public class SpellingCheckQuizQuestionEntity{
	
	@Id
	@Column(name = "spelQuestionId")
	private int spelQuestionId;
	@Column(name = "questionText")
	private String questionText;
	
	public SpellingCheckQuizQuestionEntity() {}
	
	public SpellingCheckQuizQuestionEntity(int spelQuestionId, String questionText) {
		this.questionText = questionText;
		this.questionText = questionText;
	}

	public int getSpelQuestionId() {
		return spelQuestionId;
	}

	public void setSpelQuestionId(int spelQuestionId) {
		this.spelQuestionId = spelQuestionId;
	}

	public String getQuestionText() {
		return questionText;
	}

	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}
}