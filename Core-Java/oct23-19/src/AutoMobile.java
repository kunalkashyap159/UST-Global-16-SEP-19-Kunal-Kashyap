// (Interface......., one interface can extend n no of interface.....till jdk 1.7)
public interface AutoMobile {
	int left = 10;
	public static final int right = 20;
	
	abstract public int gear();
	public void gps();
	
	public static void add() {
	
	}
	
	public default void sum() {
		
	}

}
