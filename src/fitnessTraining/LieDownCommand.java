package fitnessTraining;

public class LieDownCommand implements ICommand {

	private Trainer trainer;

	public LieDownCommand(Trainer trainer) {
		this.trainer = trainer;
	}

	@Override
	public void execute() {
		trainer.setExercise("Lie Down !!!");
	}

	@Override
	public void unexecute() {
		trainer.setExercise("Get Up !!!");		
	}

}
