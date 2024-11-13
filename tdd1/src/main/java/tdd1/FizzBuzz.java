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

    public int checkNotFizzBuzzWhizzBang(int input){
        if (input % 5 != 0 && input % 3 != 0 && input % 7 != 0 && input % 11 != 0){
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

    public String checkBang (int input){
        if (input % 11 == 0){
            return "Bang";
        }
        return null;
    }

    public String checkFizzWhizz(int input){
        if (input % 21 == 0){
            return "FizzWhizz";
        }
        return null;
    }

    public String checkFizzBang(int input){
        if (input % 33 == 0){
            return "FizzBang";
        }
        return null;
    }

    public String checkBuzzWhizz(int input){
        if (input % 35 == 0){
            return "BuzzWhizz";
        }
        return null;
    }

    public String checkBuzzBang(int input){
        if (input % 55 == 0){
            return "BuzzBang";
        }
        return null;
    }

    public String checkWhizzBang(int input){
        if (input % 77 == 0){
            return "WhizzBang";
        }
        return null;
    }
    //
    public void checkEverything(){
        String output = null;
        for(int i = 1; i <= 100; i++){

            if(checkWhizzBang(i) != null){
                output = checkWhizzBang(i);
            }else if(checkBuzzBang(i)!=null) {
                output = checkBuzzBang(i);
            }else if(checkBuzzWhizz(i)!=null) {
                output = checkBuzzWhizz(i);
            }else if(checkFizzBang(i)!=null){
                output = checkFizzBang(i);
            }else if(checkFizzWhizz(i)!=null){
                output = checkFizzWhizz(i);
            }else if(checkFizzBuzz(i)!=null){
                output = checkFizzBuzz(i);
            }else if(checkBang(i)!=null){
                output = checkBang(i);
            }else if(checkWhizz(i) != null){
                output = checkWhizz(i);
            }else if(checkBuzz(i) != null){
                output = checkBuzz(i);
            }else if(checkFizz(i)!=null){
                output = checkFizz(i);
            }else if(checkNotFizzBuzzWhizzBang(i)!=0){
                output = String.valueOf(checkNotFizzBuzzWhizzBang(i));
            }

            System.out.println(output);
        }
    }
    public static void main(String[]args){
        FizzBuzz test = new FizzBuzz();
        test.checkEverything();
    }

}
