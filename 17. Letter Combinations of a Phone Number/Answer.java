class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()){
            return new ArrayList<>();
        } 
        return combination("", digits);
    }
    
    public ArrayList<String> combination(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> str = new ArrayList<>();
            str.add(p);
            return str;
        }
        int num = up.charAt(0) - '0';
        int s = (num - 2) * 3;
        int e = s+2;
        
        if(num == 7){
            e = e+1;
        }
        else if(num == 8){
            s = s+1;
            e = e + 1;
        }
        else if(num == 9){
            s = s+1;
            e=e+2;
        }
            
            ArrayList<String> ans = new ArrayList<>();
            for(int i = s; i<= e; i++){
                char ch = (char)('a' + i);
                ans.addAll (combination(p + ch, up.substring(1)));
            }
            return ans;
        }
    }
