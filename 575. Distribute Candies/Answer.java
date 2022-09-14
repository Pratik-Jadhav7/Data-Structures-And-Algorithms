class Solution {
    public int distributeCandies(int[] a) {
Set st=new HashSet<>();
for(int c:a)
{
st.add(c);
}
return Math.min(st.size(), a.length/2);

}
}
