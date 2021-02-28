package org.codechamps.service;

import java.util.List;

import org.codechamps.hibernate.DAO.GeneralKnowlegeQuizDAO;
import org.codechamps.hibernate.entity.GeneralKnowlegeQuizEntity;

public class GeneralKnowlegeQuizService 
{
	GeneralKnowlegeQuizDAO dao = new GeneralKnowlegeQuizDAO();
	
	public List<GeneralKnowlegeQuizEntity> getQuizElements(){
		return dao.getQuizElements();
	}
	
	public void addQuizEntity(GeneralKnowlegeQuizEntity entity) {
		dao.addQuizEntity(entity);
	}
	
	public void deleteQuizElement(int QuizId) {
		dao.deleteQuizElement(QuizId);
	}
	
	public void updateQuizElement(GeneralKnowlegeQuizEntity updatedQuiz) {
		dao.updateQuizElement(updatedQuiz);
	}
	
	public List<GeneralKnowlegeQuizEntity> getQuizElement(int QuizId) {
		return dao.getQuizElement(QuizId);
	}
	
}
