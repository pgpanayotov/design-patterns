package observerVariation;

public interface Instructor {
	void subscribe(Spectator exerciseSubscriber);
	void unsubscribe(Spectator exerciseSubscriber);
	void notifySpectators();
	String getUpdate();
}