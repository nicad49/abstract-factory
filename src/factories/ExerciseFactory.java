package factories;

import interfaces.IControl;
import interfaces.IControlFactory;
import models.ExerciseControl;

public class ExerciseFactory implements IControlFactory {

	@Override
	public IControl CreateControl() {
		// TODO Auto-generated method stub
		return new ExerciseControl();
	}

}
