package fitnessTraining;

public class FitnessTrainingMain {

	public static void main(String[] args) {
		Instructor instructor = new Instructor("Pesho");
		Trainer trainer = new Trainer("Gosho");
		Spectator spec1 = new Spectator("Fon4o 1");
		Spectator spec2 = new Spectator("Fon4o 2");
		Spectator spec3 = new Spectator("Fon4o 3");
		
		trainer.subscribe(spec3);
		trainer.subscribe(spec2);
		trainer.subscribe(spec1);
		
		CommandFactory cf = new CommandFactory(trainer);
		
		ICommand lieDowncommand = cf.getInstance("Lie Down");
		ICommand getUpCommand = cf.getInstance("GetUp");
		
		instructor.setCommand(getUpCommand);
		instructor.setExerciseToTrainer();
		
		instructor.setCommand(lieDowncommand);
		instructor.setExerciseToTrainer();
	}

}
