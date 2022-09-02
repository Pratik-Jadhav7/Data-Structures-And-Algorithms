class Solution {
	public double calculateTax(int[][] brackets, int income) {
		double res = 0;
		int pre = 0; // record the previous bound 
		for(int [] i: brackets){   
			if(income - pre >= 0){
				res += (Math.min((i[0]-pre), income-pre)  * i[1])/100.0;
				pre = i[0];
			}
		}
		return res; 
	}
}
// Time O(n)
