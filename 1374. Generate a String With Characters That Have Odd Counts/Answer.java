class Solution {
    public String generateTheString(int n) {
        String res="";
        if(n%2==0)
        {
            for(int i=0;i<n-1;i++)
            {
                res+='a';
            }
            res+='b';
        }
        else
        {
            for(int i=0;i<n;i++)
            {
                res+='a';
            }
        }
        return res;
     }
    }