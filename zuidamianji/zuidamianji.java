package zuidamianji;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 给定一组非负整数组成的数组h，代表一组柱状图的高度，其中每个柱子的宽度都为1。 在这组柱状图中找到能组成的最大矩形的面积（如图所示）。
 *  入参h为一个整型数组，代表每个柱子的高度，返回面积的值。
 * @author MA
 * 
 * 例子：输入6
         2 1 5 6 2 3
 *       输出
 *       10
 */

public class zuidamianji {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] nums = new int[n];
	   
	    for(int i=0;i<n;i++){
	    	 Scanner sc1  = new Scanner(System.in);
	         nums[i] = sc1.nextInt();
	    }
	    
	    sou(n,nums);
	}
	
	public static void sou(int n,int[] nums){
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<n;i++){
			int j = i;
			int wide = 1;
			int area = 0;
			while(j<n || nums[i]<nums[j]){
				j++;
				wide++;
			}
			j=i;
			while(j>0 || nums[i]<nums[j]){
				j--;
				wide++;
			}
			area = nums[i]*wide;
			list.add(area);
		}
		//Collections.sort(list);
		for(int i : list){
			System.out.print(i + "  ");
		}
	}
}
