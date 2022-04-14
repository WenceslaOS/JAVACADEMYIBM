package Observer;

public interface ISubject {
	
	void register ( IObserver observer );
    void ungister ( IObserver observer );
    void notifyObserver ();

}
