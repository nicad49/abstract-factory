package abstractfactory;

import factories.ExerciseFactory;
import factories.MultiplierFactory;
import factories.RankFactory;
import interfaces.IControl;
import interfaces.IControlFactory;
import models.ExerciseControl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IControlFactory eFactory;
		
		eFactory = new ExerciseFactory();
		IControl exerciseControl = eFactory.CreateControl();
		
		System.out.println(exerciseControl.getId());
		System.out.println(exerciseControl.getLayout());
		
		
		IControlFactory mFactory;
		
		mFactory = new MultiplierFactory();
		IControl multiplierControl = mFactory.CreateControl();
		
		System.out.println(multiplierControl.getId());
		System.out.println(multiplierControl.getLayout());
		
		
		IControlFactory rFactory;
		
		rFactory = new RankFactory();
		IControl rankControl = rFactory.CreateControl();
		
		System.out.println(rankControl.getId());
		System.out.println(rankControl.getLayout());
		

	}

}
