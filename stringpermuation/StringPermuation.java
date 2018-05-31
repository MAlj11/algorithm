package stringpermuation;

/**
 * 输入一个字符串，打印出该字符串中字符的所有排列。
 * 
 * @author MA
 *
 */
public class StringPermuation {

	public static void stringPermuation(char[] str, int index) {
		if (str == null || str.length == 0) {
			System.out.println("null");
		}
		int length = str.length;
		if (index == length) {
			for (int i = 0; i < str.length; i++) {
				System.out.print(str[i] + "");
			}
			System.out.println();
		} else {
			for (int i = index; i < length; i++) {
				char temp = str[i];
				str[i] = str[index];
				str[index] = temp;
				stringPermuation(str, index + 1);
				temp = str[i];
				str[i] = str[index];
				str[index] = temp;

			}
		}
	}

	public static void main(String[] args) {
		char[] str = { 'a', 'b', 'c' };
		stringPermuation(str, 0);
	}
}
