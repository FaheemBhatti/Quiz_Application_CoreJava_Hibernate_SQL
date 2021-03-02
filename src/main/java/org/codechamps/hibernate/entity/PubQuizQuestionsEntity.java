package org.codechamps.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "pubQuizQuestionsEntity")
@Table(name = "pubQuizQuestions")
public class PubQuizQuestionsEntity {
	
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "question")
	private String question;
	
	public PubQuizQuestionsEntity() {}
	
	public PubQuizQuestionsEntity(int id, String question) {
		this.id = id;
		this.question = question;
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
	
	
	

}
