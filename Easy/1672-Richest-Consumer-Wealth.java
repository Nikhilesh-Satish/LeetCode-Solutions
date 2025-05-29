class Solution {
    public int maximumWealth(int[][] accounts) {
        int big=0,count=0;
        for(int i=0;i<accounts.length;i++)
        {
            count=0;
            
            for(int j=0;j<accounts[i].length;j++)
            {
                count=count+accounts[i][j];
            }
            if(count>big)
            {
                big=count;
            }

        }
        return big;
    }
}