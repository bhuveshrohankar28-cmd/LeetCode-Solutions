
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>();
        for (int i = 1; i <=n; i++) {
            String currentStr="";
            if (i%3==0) currentStr+="Fizz";
            if (i%5==0) currentStr+="Buzz";
            if (currentStr.isEmpty()) {currentStr+=Integer.toString(i);
                
            }answer.add(currentStr);
            
            
        }
return answer;
        }
    }

