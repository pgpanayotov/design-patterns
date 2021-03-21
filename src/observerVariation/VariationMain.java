package observerVariation;

public class VariationMain {

	public static void main(String[] args) {
		
		Exercise master = new Exercise();
		Spectator pesho = new ExerciseSubscriber("Pesho");
		Spectator gosho = new ExerciseSubscriber("Gosho");
		Spectator tosho = new ExerciseSubscriber("Tosho");
		
		master.subscribe(tosho);
		master.subscribe(gosho);
		master.subscribe(pesho);
		
		master.setExercise("Lejanka");
		master.setExercise("Licevi upori");
	}

}
