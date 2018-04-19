/**
 * ¶öººÊ½
 * 
 * @author MA
 * 
 */
public class singletion {
	private singletion() {
	}

	private static final singletion newInstance = new singletion();

	public static singletion getInstance() {

		return newInstance;
	}

}
