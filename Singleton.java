public class Singleton {
    /**
     * @return: The same instance of this class every time
     */
	private static Singleton instance;
    public static Singleton getInstance() {
        // write your code here
		if(instance == null){
			instance = new Singleton();
		}
		return instance;
    }

    public static void main(String[] args){
        getInstance();
    }
};