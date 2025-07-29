
class Solution {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {

        int n=startTime.length;
        int[][] jobs=new int[n][3];
        for(int i=0;i<n;i++)
        {
            jobs[i][0]=startTime[i];
            jobs[i][1]=endTime[i];
            jobs[i][2]=profit[i];

        }

        Arrays.sort(jobs, (a, b) -> {
            return Integer.compare(a[0],b[0]);                 
        });

        int[] start=new int[n];
        int[] dp=new int[n+1];
        for(int i=0;i<n;i++)
        {
            start[i]=jobs[i][0];
        }

        for(int i=n-1;i>=0;i--)
        {
            int low=i+1,high=n;
            while(low<high)
            {
                int mid=(low+high)/2;
                if(start[mid]<jobs[i][1])
                {
                    low=mid+1;
                }
                else
                {
                    high=mid;
                }
            }
            int next=low;
            dp[i]=Math.max(jobs[i][2]+dp[next],dp[i+1]);
        }
        return dp[0];
    }

}