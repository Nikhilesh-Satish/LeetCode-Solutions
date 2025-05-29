class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] a=new int[n];
        int[] b=new int[n];
        int[] c=new int[2*n];
        int k=0;
        for(int i=0;i<n;i++)
        {
            a[i]=nums[i];
        }

        for(int i=n;i<2*n;i++)
        {
            b[k]=nums[i];
            k++;
        }
        int j=0;
        k=1;
        c[0]=a[0];
        c[c.length-1]=b[b.length-1];
        for(int i=1;i<2*n-1;i++)
        {
            if(i%2!=0)
            {
                c[i]=b[j];
                j++;
            }
            else
            {
                c[i]=a[k];
                k++;
            }
        }

        return c;
        
    }
}