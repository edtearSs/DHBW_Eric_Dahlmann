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

    public String checkFizzBuzz(int input){
        if (input % 15 == 0){
            return "FizzBuzz";
        }
        return null;
    }

    public int checkNotFizzBuzz(int input){
        if (input % 15 != 0 || input % 5 != 0 || input % 3 != 0){
            return input;
        }
        return 0;
    }

    public String checkWhizz (int input){
        if (input % 7 == 0){
            return "Whizz";
        }
        return null;
    }
}
