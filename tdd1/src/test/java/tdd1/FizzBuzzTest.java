package tdd1;import org.junit.jupiter.api.Test;import static org.assertj.core.api.Assertions.assertThat;import static org.assertj.core.api.Fail.fail;public class FizzBuzzTest {    FizzBuzz underTest = new FizzBuzz();    @Test    void test3aufFizz(){        int input =3;        String actual = underTest.checkFizz(input);        assertThat(actual).isEqualTo("Fizz");    }    void test5aufBuzz(){        int input =3;        String actual = underTest.checkBuzz(input);        assertThat(actual).isEqualTo("Buzz");    }    void whatDoYouWantToTestToday() {        fail("not implemented yet");    }}