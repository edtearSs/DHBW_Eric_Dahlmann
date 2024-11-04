package tdd1;

public class FizzBuzz {
    public String checkFizz(int input){
        if (input % 3 ==0){
            return "Fizz";
        }
        return null;
    }

    public String checkBuzz(int input){
        if (input % 5 == 0){
            return "Buzz";
        }
        return null;
    }
}
