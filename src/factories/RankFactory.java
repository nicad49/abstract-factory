package factories;

import interfaces.IControl;
import interfaces.IControlFactory;
import models.RankControl;

public class RankFactory implements IControlFactory {

	@Override
	public IControl CreateControl() {
		// TODO Auto-generated method stub
		return new RankControl();
	}

}
