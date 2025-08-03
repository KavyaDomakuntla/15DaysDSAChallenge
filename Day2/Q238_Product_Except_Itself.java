package Day2;

public class Q2_Product_Except_Itself {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int product=1;
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]!=0)
            product=product*nums[i];
            else
            c++;
        }
        for(int i=0;i<n;i++)
        {
            if(c==0)
            {
                nums[i]=product/nums[i];
            }
            else if(c==1)
            {
                if(nums[i]==0)
                nums[i]=product;
                else
                nums[i]=0;
            }
            else
            nums[i]=0;
        }
        return nums;
     }
}
