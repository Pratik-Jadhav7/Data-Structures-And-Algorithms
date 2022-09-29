class Solution {

public int[] numberOfLines(int[] widths, String s) {
    int line=0;
    int pix=0;
    for(int i=0;i<s.length();i++)
    {
        int a=s.charAt(i)-97;
        pix=pix+widths[a];
        if(pix==100)
        {
            line++;
            if(i!=s.length()-1)
            {
                pix=0;
            }
        }
        else if(pix>100)
        {
            i--;
            line++;
            pix=0;
        }
    }
    if(pix>0 && pix!=100)
    {
        line++;
    }
    int[] result=new int[2];
    result[0]=line;
    result[1]=pix;
    return result;
}
}
