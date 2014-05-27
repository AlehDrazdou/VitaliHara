/**
 * 
 */
package by.epam.training.task1.model;

import java.util.List;


public class Chef {
	private Salad salad;

	public Chef(List<Vegetable> vegetables) {
		createSalad(vegetables);		
	}
	
	private void createSalad(List<Vegetable> vegetables){
		salad = new Salad(vegetables);
	}

	public Salad getSalad() {
		return salad;
	}

	public void setSalad(Salad salad) {
		this.salad = salad;
	}

	
}
