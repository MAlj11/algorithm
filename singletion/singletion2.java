/**
 * 懒汉式(双重同步)
 * @author MA
 *
 */
public class singletion2 {
	
	private singletion2(){};
	private static singletion2 newInstance;

	public static synchronized singletion2 getInstance() {
		if (newInstance == null) {
			synchronized(singletion.class){
				if(newInstance == null){
			newInstance = new singletion2();
				}
			}		
			}
		return newInstance;
		
	}

}
