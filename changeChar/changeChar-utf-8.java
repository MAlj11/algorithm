/**
 * 将一个字符串中的空格替换成“%20”。 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 * 
 * @author MA
 * 
 */
public class changeChar {
	public static String cchar(String str) {
		StringBuffer sb = new StringBuffer(str);
		StringBuilder sbu = new StringBuilder();         //单线程下StringBuffer的替换，比StringBuffer快

		for (int i = 0; i < sb.length(); i++) {
			if (String.valueOf(sb.charAt(i)).equals(" ")) {//String.values()  返回该字符的字符串表示形式
				sbu.append("%20");
			} else {
				sbu.append(String.valueOf(sb.charAt(i)));
			}
		}
		return sbu.toString();
	}

	
	
	public static void main(String[] args) {
		String before = "We Are Happy";
		String after = changeChar.cchar(before);
		System.out.println(after);
	}
}
