package fitnessTraining;

public class CommandFactory {
	private Trainer trainer;
	public CommandFactory(Trainer trainer) {
		this.trainer = trainer;
	}

	public ICommand getInstance(String str) {
		if(str.equals("Lie Down")) {
			return new LieDownCommand(trainer);
		}
		else
		{
			return new GetUpCommand(trainer);
		}
	}

}
