public class StringManipulation{
    public String trimAndConcat(String str1, String str2){
        String answer = str1.trim() + str2.trim();
        return answer;
    }

    public Integer getIndexOrNull(String str, char letter){
        Integer answer;
        if(str.indexOf(letter)>=0){
            answer = str.indexOf(letter);
        }
        else{
            answer = null;
        }
        return answer;
    }

    public Integer getIndexOrNull(String str, String subStr){
        Integer answer;
        if(str.indexOf(subStr)>=0){
            answer = str.indexOf(subStr);
        }
        else{
            answer = null;
        }
        return answer;
    }

    public String concatSubstring(String str1, int val1, int val2, String str2){
        String answer = str1.substring(val1, val2) + str2;
        return answer;
    }
}