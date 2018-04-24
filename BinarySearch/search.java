package BinarySearch;

/**
 * 题目：把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。输入一个递增排序数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1
 * 
 * @author MA
 * 
 */
public class search {

	/*
	 * 思路： 1、可分为两部分，每部分都是升序排列 2、最大和最小数都在分界出并且挨着
	 * 
	 * 可用二分法查找 判断中间数midIndex分别于左右两边索引的值的大小 如果比左边索引大，则左索引为这次比较的中间数
	 * 如果比右索引小，则右索引为中间数
	 */

	public static int Min(int[] arr) {
		if (arr == null && arr.length <= 0) {                          //数组判空
			System.out.println("数组为空");
			return -1;
		}

		int index1 = 0;
		int index2 = arr.length - 1;
		int midIndex = 0;

		while (arr[index2] <= arr[index1]) {                     //确定循环范围：一直循环到两个索引挨在一起
			midIndex = (index2 - index1) / 2;                    
			if (index2 - index1 == 1) {                          //如果挨在一起，则两个是必定是左边是最大值，右边是最小值
				midIndex = index2;
				// System.out.println(2);
				break;
			}

			if (arr[index1] == arr[midIndex] && arr[index1] == arr[index2]) {  //如果左值=中间值=右值   出现这种的可能性不大，但是也应该指出
				int min1 = arr[index2];                                        //一旦出现这种情况，则只能按照顺序查找
				for (int i = 1; i <= index2; i++) {
					if (min1 > arr[i]) {
						min1 = arr[i];
					}

				}
				return min1;
			}

			if (arr[midIndex] > arr[index1]) {
				index1 = midIndex;
			}
			if (arr[midIndex] < arr[index2]) {
				index2 = midIndex;
			}
			// System.out.println(1);
		}
		return arr[midIndex];
	}

	public static void main(String[] args) {
		int[] a = { 4, 5, 1, 2, 3 };

		System.out.println(search.Min(a));
	}
}
