/**
 * 懒汉式（静态内部类）
 * 
 * @author MA
 * 
 */
public class singletion3 {
	private singletion3() {
	}

	private static class staticSingletion {
		private static singletion3 newInstace = new singletion3();
	}

	public synchronized static singletion3 getInstance() {
		return staticSingletion.newInstace;
	}
}
