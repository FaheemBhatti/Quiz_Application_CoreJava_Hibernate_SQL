package org.codechamps.service;

import java.util.List;

import org.codechamps.hibernate.DAO.GeneralKnowlegeQuizQuestionDAO;
import org.codechamps.hibernate.entity.GeneralKnowlegeQuizAnswersEntity;
import org.codechamps.hibernate.entity.GeneralKnowlegeQuizQuestionsEntity;

public class GeneralKnowlegeQuizQuestionsService 
{
	GeneralKnowlegeQuizQuestionDAO dao = new GeneralKnowlegeQuizQuestionDAO();
	
	public List<GeneralKnowlegeQuizQuestionsEntity> getQuizElements(){
		return dao.getQuizElements();
	}
	
	public void addQuizEntity(GeneralKnowlegeQuizQuestionsEntity entity) {
		dao.addQuizEntity(entity);
	}
	
	public void deleteQuizElement(int QuizId) {
		dao.deleteQuizElement(QuizId);
	}
	
	public List<GeneralKnowlegeQuizQuestionsEntity> getQuizElement(int QuizId) {
		return dao.getQuizElement(QuizId);
	}
	
	

	
}
