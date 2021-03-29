package observerVariation;

public interface IObservable {
	void subscribe(IObserver exerciseSubscriber);
	void unsubscribe(IObserver exerciseSubscriber);
	void notifyObservers();
	String getUpdate();
}