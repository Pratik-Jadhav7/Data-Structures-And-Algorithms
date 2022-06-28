class Solution
{
    public int numJewelsInStones(String jewels, String stones)
    {
        int stone_len=stones.length();
        int jewel_len=jewels.length();
        int c=0;
        for(int i=0;i<stone_len;i++)
        {
            for( int j=0;j<jewel_len;j++)
            {
                if(stones.charAt(i)==jewels.charAt(j))
                    c++;
            }
        }
        return c;
        
    }
}