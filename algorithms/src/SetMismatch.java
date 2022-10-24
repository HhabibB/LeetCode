public class SetMismatch {

    public static int[] findErrorNums(int[] nums) {
            
			int res[]=new int[2];


			int count[]=new int[10001];
			for(int i=0;i<nums.length;i++)
				++count[nums[i]];


			for(int i=0;i<count.length;i++)
			    if(count[i]>1)
				    res[0]=i;

			int i=1;
			while(count[i]!=0 ){
				res[1]=i;
				i++;
			}

			res[1]++;
			return res;


            
    }
}
