package observerVariation;

import java.util.ArrayList;
import java.util.List;

public class Trainer implements IObservable {
	
	private List<IObserver> observers;
	private String exercise;
	private String name;

	public Trainer(String name) {
		this.observers = new ArrayList<>();
		this.setName(name);
	}

	@Override
	public void subscribe(IObserver exerciseSubscriber) {
		this.observers.add(exerciseSubscriber);
		exerciseSubscriber.setExercise(this);
	}

	@Override
	public void unsubscribe(IObserver exerciseSubscriber) {
		this.observers.remove(exerciseSubscriber);
	}

	@Override
	public void notifyObservers() {
		for(IObserver observer: this.observers) {
			observer.update();
		}
	}

	@Override
	public String getUpdate() {
		// TODO Auto-generated method stub
		return this.getExercise();
	}

	public String getExercise() {
		return exercise;
	}

	public void setExercise(String exercise) {
		this.exercise = exercise;
		this.notifyObservers();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
