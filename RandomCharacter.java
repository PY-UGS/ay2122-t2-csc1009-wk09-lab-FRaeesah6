import java.util.Random;

public class RandomCharacter {

    public static void main(String[] args){
        String lowerCase = "";
        String upperCase = "";
        String digits = "";
        String randomChar = "";

        RandomCharacter randChar = new RandomCharacter();

        for (int i = 0; i < 15; i++){
            lowerCase += randChar.getRandomLowerCaseLetter();
            upperCase += randChar.getRandomUpperCaseLetter();
            digits += randChar.getRandomDigit();
            randomChar += randChar.getRandomCharacter();
        }

        System.out.println("15 random lower case letters: " + lowerCase);
        System.out.println("15 random upper case letters: " + upperCase);
        System.out.println("15 random digits: " + digits);
        System.out.println("15 random characters: " + randomChar);
        for (int i = 0; i < 15; i++) {
            randChar.isRandomIntPrime(randChar.getRandomDigit());
        }
    }

    public char getRandomLowerCaseLetter(){
        Random rand = new Random();
        int randNum = rand.nextInt(26);
        char randChar = (char) (randNum + 97);
        return randChar;
    }

    public char getRandomUpperCaseLetter(){
        Random rand = new Random();
        int randNum = rand.nextInt(26);
        char randChar = (char) (randNum + 65);
        return randChar;
    }

    public int getRandomDigit(){
        Random rand = new Random();
        int randNum = rand.nextInt(10);
        return randNum;
    }

    public char getRandomCharacter(){
        char randChar = ' ';
        Random rand = new Random();
        int randNum = rand.nextInt(3);
        switch (randNum){
            case 0:
                randChar = getRandomLowerCaseLetter();
                break;
            case 1:
                randChar = getRandomUpperCaseLetter();
                break;
            case 2:
                randChar = (char) (getRandomDigit()+48);
                break;
        }
        return randChar;
    }

    public boolean isRandomIntPrime(int num){
        boolean flag = true;
        System.out.println("Random Value generated: " + num);
        if (num <= 1){
            flag = false;
        }

        for (int i = 2; i <= num / 2; ++i) {
            // condition for non-prime number
            if (num % i == 0) {
                flag = false;
            }
        }

        if(flag == true){
            System.out.println("Generated value is a prime number.");
        }else{
            System.out.println("Generated value is not a prime number.");
        }
        return flag;
    }

}