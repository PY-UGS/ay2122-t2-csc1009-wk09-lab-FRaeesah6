import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class RandomCharacterTest extends RandomCharacter{
    RandomCharacter randCharTest = new RandomCharacter();


    public RandomCharacterTest(){

    }

    @Test
    public void testLowerCase() {
        String charsLC = String.valueOf(randCharTest.getRandomLowerCaseLetter());
        int length = charsLC.length();
        boolean flag = false;

        for (int i = 0; i < length; i++) {

            char charLC = charsLC.charAt(i);

            if (Character.isLowerCase(charLC)) {

                System.out.println("The character " + charsLC.charAt(i) + " is a Lowercase letter");
                flag = false;

            } else {

                flag = true;
                throw new IllegalArgumentException("Generated String is not Lower Case");

            }

            assertFalse(flag);
        }
    }


    @Test
    public void testUpperCase() {
        String charsUC = String.valueOf(randCharTest.getRandomUpperCaseLetter());
        int length = charsUC.length();
        boolean flag = false;

        for (int i = 0; i < length; i++) {

            char charUC = charsUC.charAt(i);

            if (Character.isUpperCase(charUC)) {

                System.out.println("The character " + charsUC.charAt(i) + " is an Uppercase Letter");
                flag = false;

            } else {

                flag = true;
                throw new IllegalArgumentException("Generated String is not Upper Case");

            }

            assertFalse(flag);
        }
    }


    @Test
    public void testDigitCase() {
        String charsDC = String.valueOf(randCharTest.getRandomDigit());
        int length = charsDC.length();
        boolean flag = true;
        for (int i = 0; i < length; i++) {

            char charDC = charsDC.charAt(i);

            if (Character.isDigit(charDC)) {

                System.out.println("The character " + charsDC.charAt(i) + " is a Digit");
                flag = false;

            } else {

                flag = true;
                throw new IllegalArgumentException("Generated String is not a Digit");

            }

            if (charsDC.charAt(i) >= 0 && charsDC.charAt(i) < 10){

                flag = false;

            }

            assertFalse(flag);
        }
    }


    @Test
    public void testCharCase() {
        String charsC = String.valueOf(randCharTest.getRandomCharacter());
        int length = charsC.length();
        boolean flag = false;

        for (int i = 0; i < length; i++) {

            char charC = charsC.charAt(i);

            if (Character.isLowerCase(charC) || Character.isUpperCase(charC) || Character.isDigit(charC)) {

                System.out.println("The character " + charsC.charAt(i) + " is an Alphanumeric");
                flag = false;

            } else {

                flag = true;
                throw new IllegalArgumentException("Generated String is not an Alphanumeric");

            }

            assertFalse(flag);
        }
    }

    @Test
    public void testPrime() {
        Random rand = new Random();
        int randNum = rand.nextInt(10);
        boolean flag = false;

        //known prime numbers < 10
        int[] array = new int[]{2, 3, 5, 7};
        for (int i = 0; i < array.length; i++){
                assertTrue(randCharTest.isRandomIntPrime(array[i]));
        }
    }
}
