package fitnessTraining;

public interface IObserver {
	void update();
	void setExercise(IObservable exercise);
}