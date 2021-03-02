package org.codechamps.Main;

import java.util.List;

import org.codechamps.hibernate.entity.GeneralKnowlegeQuizAnswersEntity;
import org.codechamps.hibernate.entity.ITKnowlegeQuizAnswersEntity;
import org.codechamps.hibernate.entity.PubQuizAnswersEntity;
import org.codechamps.hibernate.entity.SpellingCheckQuizAnswerEntity;
import org.codechamps.service.GeneralKnowlegeQuizAnswerService;
import org.codechamps.service.ITKnowlegeQuizAnswersService;
import org.codechamps.service.PubQuizAnswersService;
import org.codechamps.service.SpellingCheckQuizAnswersService;

public class Main {
	public static void main(String[] args) {
		
		List<GeneralKnowlegeQuizAnswersEntity> list;
		List<ITKnowlegeQuizAnswersEntity> list2;
		List<SpellingCheckQuizAnswerEntity> list3;
		List<PubQuizAnswersEntity> list4;
		
		GeneralKnowlegeQuizAnswerService service = new GeneralKnowlegeQuizAnswerService();
		ITKnowlegeQuizAnswersService service2 = new ITKnowlegeQuizAnswersService();
		SpellingCheckQuizAnswersService service3 = new SpellingCheckQuizAnswersService();
		PubQuizAnswersService service4 = new PubQuizAnswersService();
		
		list = service.getAnswers(5);
		list2 = service2.getAnswers(1);
		list3 = service3.getAnswers(1);
		list4 = service4.getAnswers(1);
		
		for (GeneralKnowlegeQuizAnswersEntity var : list) 
		{ 
		    System.out.println(var.getAnswer());
		}
		
		for (ITKnowlegeQuizAnswersEntity var : list2) 
		{ 
		    System.out.println(var.getItAnswer());
		}
		
		for (SpellingCheckQuizAnswerEntity var : list3) 
		{ 
		    System.out.println(var.getAnswerText());
		}
		
		for (PubQuizAnswersEntity var : list4) 
		{ 
		    System.out.println(var.getPubAnswer());
		}
		
		
		
		//GraphicalInstanceController.guiInit();
	}
}
