package getleasenumbers;

/**
 * 输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 */
import java.util.ArrayList;

public class getleasenum { 
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k)  
    {  
        ArrayList<Integer> list = new ArrayList<Integer>();  
         if(input==null || input.length ==0 || k<=0||k>input.length)  
            {  
                return list;  
            }  
            int start = 0;int end = input.length - 1;  
            subSort(input,start,end,k);    
          
         for (int i = 0; i < k; i++)  
         {  
            list.add(input[i]);  
         }  
            return list;  
        }  
     private void subSort(int[] array,int start,int end,int k)  
     {  
         int low = -1;  
         if(start <= end)  
         {  
             low = start;int high = end;  
             int base = array[start];  
             while(low < high)  
             {  
               while(low < high && array[high] > base)  
               {  
                 high--;  
               }  
               if(low < high)  
               {  
                 array[low++] = array[high];  
               }  
               while(low < high && array[low] <= base)  
               {  
                   low++;  
               }  
               if(low < high)  
               {  
                   array[high--] = array[low];  
               }  
               
             }  
             array[low] = base;//得到分界点，把分界点跟K-1进行对比  
             //k个数在low之前，只需要对low之前的数再排序即可  
                if(low > k - 1)  
                {  
                    end = low -1;  
                    subSort(array,start,end,k);  
                }  
             //k个数有部分在low之后，对low之后的排序  
                else if(low < k-1)  
                {  
                    start = low + 1;  
                    subSort(array,start,end,k);  
                }  
         }  
                  
     }  
}


