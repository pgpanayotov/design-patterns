package observerVariation;

import java.util.ArrayList;
import java.util.List;

public class Exercise implements Instructor {
	
	private List<Spectator> spectators;
	private String exercise;

	public Exercise() {
		this.spectators = new ArrayList<>();
	}

	@Override
	public void subscribe(Spectator exerciseSubscriber) {
		this.spectators.add(exerciseSubscriber);
		exerciseSubscriber.setExercise(this);
	}

	@Override
	public void unsubscribe(Spectator exerciseSubscriber) {
		this.spectators.remove(exerciseSubscriber);
	}

	@Override
	public void notifySpectators() {
		for(Spectator spectator: this.spectators) {
			spectator.update();
		}

	}

	@Override
	public String getUpdate() {
		return this.getExercise();
	}

	public String getExercise() {
		return exercise;
	}

	public void setExercise(String exercise) {
		this.exercise = exercise;
		this.notifySpectators();
	}
}
