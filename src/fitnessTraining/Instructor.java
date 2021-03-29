package fitnessTraining;

public class Instructor {
	
	private ICommand command;
	private String Name;
	
	public Instructor(String name) {
		this.setName(name);
	}
	public void setCommand(ICommand command) {
		this.command = command;
	}
	
	void setExerciseToTrainer() {
		System.out.println(this.Name + " :Shows new exercise to trainer");
		this.command.execute();
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
}
