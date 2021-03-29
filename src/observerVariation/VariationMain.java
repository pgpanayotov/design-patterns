package observerVariation;

public class VariationMain {

	public static void main(String[] args) {
		
		Trainer trainer = new Trainer("Tan4o");
		Spectator pesho = new Spectator("Pesho");
		Spectator gosho = new Spectator("Gosho");
		Spectator tosho = new Spectator("Tosho");
		
		trainer.subscribe(tosho);
		trainer.subscribe(gosho);
		trainer.subscribe(pesho);
		
		trainer.setExercise("Lejanka");
		trainer.setExercise("Licevi upori");
	}

}
