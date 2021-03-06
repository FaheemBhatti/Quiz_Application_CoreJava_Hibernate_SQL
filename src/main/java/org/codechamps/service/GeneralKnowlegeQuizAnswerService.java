package org.codechamps.service;

import java.util.List;

import org.codechamps.hibernate.DAO.GeneralKnowlegeQuizAnswerDAO;
import org.codechamps.hibernate.entity.GeneralKnowlegeQuizAnswersEntity;

public class GeneralKnowlegeQuizAnswerService 
{
	GeneralKnowlegeQuizAnswerDAO dao = new GeneralKnowlegeQuizAnswerDAO();
	
	public List<GeneralKnowlegeQuizAnswersEntity> getAnswers(int questionId){
		return dao.getAnswers(questionId);
	}
	
	public String getCorrectAnswer(int questionId){
		return  dao.getCorrectAnswer(questionId);
	}
	
	public List<GeneralKnowlegeQuizAnswersEntity> getAnswers() {
		return dao.getAnswers();
	}

}
