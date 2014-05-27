package by.epam.training.task1.model.util;

import by.epam.training.task1.exception.BuildException;
import by.epam.training.task1.model.Radish;
import by.epam.training.task1.util.DataStringUtil;

/**
 * Created with IntelliJ IDEA.
 * User: Senbon
 * Date: 18.05.14
 * Time: 13:54
 * To change this template use File | Settings | File Templates.
 */
public class RadishBuilder extends AbstractVegetableBuilder {
    @Override
    public void createVegetable() {
        vegetable = new Radish();
    }

    @Override
    public void buildSizeCapacity(String size){
        ((Radish) getVegetable()).setSize(size);
    }

	@Override
	public void buildColorCapacity(String color) throws BuildException {
		throw new BuildException(DataStringUtil.BAD_ATTRIBUTE);		
	}

	@Override
	public void buildSalinityCapacity(String salinity) throws BuildException {
		throw new BuildException(DataStringUtil.BAD_ATTRIBUTE);		
	}

	@Override
	public void buildKindCapacity(String kind) throws BuildException {
		throw new BuildException(DataStringUtil.BAD_ATTRIBUTE);		
	}
}
