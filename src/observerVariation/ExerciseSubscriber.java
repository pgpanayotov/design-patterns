package observerVariation;

public class ExerciseSubscriber implements Spectator {

	private String name;
	private Instructor exercise;
	
	public ExerciseSubscriber(String name) {
		this.setName(name);
	}

	@Override
	public void update() {
		if(exercise == null) {
			System.out.println(this.getName() + " has no exercise");
			return;
		}
		String newExercise = exercise.getUpdate();
		System.out.println(this.getName() + ": recieved new exercise: " + newExercise);
	}

	@Override
	public void setExercise(Instructor exercise) {
		this.exercise = exercise;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
