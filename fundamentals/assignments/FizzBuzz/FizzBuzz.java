public class FizzBuzz{
    public String fizzBuzz(int number){
        String ans;
        if(number % 3 == 0 && number % 5 == 0){
            ans = "FizzBuzz";
            return ans;
        }
        else if(number % 3 == 0){
            ans = "Fizz";
            return ans;
        }
        else if(number % 5 == 0){
            ans = "Buzz";
            return ans;
        }
        String noAnswer = String.valueOf(number);
        return noAnswer;
    }
}