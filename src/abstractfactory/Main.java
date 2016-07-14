package abstractfactory;

import java.util.ArrayList;

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
			
		IControlFactory mFactory;
		
		mFactory = new MultiplierFactory();
		IControl multiplierControl = mFactory.CreateControl();
		
		IControlFactory rFactory;
		
		rFactory = new RankFactory();
		IControl rankControl = rFactory.CreateControl();
		
		ArrayList<IControl> controls = new ArrayList<>();
		controls.add(exerciseControl);
		controls.add(multiplierControl);
		controls.add(rankControl);
		
		for (IControl control : controls) {
			System.out.println(control.getId());
			System.out.println(control.getLayout());
		}
		

	}

}
