public class FizzBuzzTest{
    public static void main(String[] args){
        FizzBuzz first = new FizzBuzz();
        String statement = first.fizzBuzz(15);
        System.out.println(statement);
        FizzBuzz second = new FizzBuzz();
        String statementSecond = first.fizzBuzz(9);
        System.out.println(statementSecond);
        FizzBuzz third = new FizzBuzz();
        String statementThird = first.fizzBuzz(10);
        System.out.println(statementThird);
        FizzBuzz fourth = new FizzBuzz();
        String statementFourth = first.fizzBuzz(2);
        System.out.println(statementFourth);
    }
}