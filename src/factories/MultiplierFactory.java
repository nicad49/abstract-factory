package factories;

import interfaces.IControl;
import interfaces.IControlFactory;
import models.MultiplierControl;

public class MultiplierFactory implements IControlFactory {

	@Override
	public IControl CreateControl() {
		// TODO Auto-generated method stub
		return new MultiplierControl();
	}

}
