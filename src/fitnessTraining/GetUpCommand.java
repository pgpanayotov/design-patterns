package fitnessTraining;

public class GetUpCommand implements ICommand {
	
	private Trainer trainer;

	public GetUpCommand(Trainer trainer) {
		this.trainer = trainer;
	}

	@Override
	public void execute() {
		trainer.setExercise("Get Up !!!");
	}

	@Override
	public void unexecute() {
		trainer.setExercise("Lie Down !!!");
	}
}
