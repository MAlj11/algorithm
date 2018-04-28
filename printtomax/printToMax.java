package printtomax;

/**
 * 输入数字n,按顺序打印出从1到最大的n位十进制数，比如输入3,则打印出1,2,3一直到最大的3位数即999.
 * @author MA
 *
 */
public class printToMax {



/*
 * 注意：不可直接用循环输出，当n是一个非常非常大的数的时候，就会造成移除
 * 思路：用字符数组或者是stringbuffer模拟
 * 先从最后一位开始加，每一次都加一，如果最后一位加到了10，则向前进位，当第一位到10时，证明已经到头了
 * 这个时候溢出标志flag=true   并返回，结束循环
 */
	
	public void printtoMax(int n){
		if(n<0){
			return;
		}
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<n;i++){                     //所有位都先归零
			sb.append('0');
		}
		while(!Increment(sb)){                  //在没溢出的情况下输出
			printNum(sb);
		}
	}
	/**
	 * 溢出判断
	 * @param sb
	 * @return
	 */
	private boolean Increment(StringBuffer sb) {   
		boolean flag = false;                 //溢出标志
		int nLength = sb.length();
		int ntakeover = 0;                  //进位标志
		for(int i=nLength-1;i>=0;i--){                   //从最低位开始
			int nSum = sb.charAt(i) - '0' + ntakeover;         //当是位上的数加上进位数，为此时最终数
			if(i == nLength - 1){                   
				nSum++;                                // 最低位加1
			}
			if(nSum >= 10){
				if(i == 0){                          ///当大于10时判断是否是最高位的，如果是。则将溢出标志位置true
					flag = true;
				}else{
					nSum = nSum - 10;               //否则保留各位，然后进位
					ntakeover = 1;
					sb.setCharAt(i, (char) ('0'+nSum));
				}
			}else{
				sb.setCharAt(i, (char)('0'+nSum));
				break;
			}
			
		}
		return flag;
		
	}

    private void printNum(StringBuffer sb) {
		boolean zeroflag = true;
		int nLength = sb.length();
		for(int i=0;i<=nLength-1;i++){
			if(zeroflag && sb.charAt(i) != '0'){
				zeroflag = false;
			}
			if(!zeroflag){
				System.out.print(sb.charAt(i));
			}
		}
	System.out.println();
		
	}
    public static void main(String[] args) {
		printToMax pr = new printToMax();
		pr.printtoMax(3);
	}


}
