package creditCard;

import static creditCard.CreditCardName.*;

public class CreditCard {
    private CreditCardName creditCardName=VISA_CARD;


    public CreditCardName getCurrentCreditCard() {
        return creditCardName;
    }

    public CreditCardName changeCurrentCreditCardName(CreditCardName newCreditCardName) {
        creditCardName = newCreditCardName;
        return newCreditCardName;
    }

//    Sadness is rottenness to the bone==>The Joy of the Lord is my Strength

    public boolean isCreditCardValidWhenItStartWithFour(String creditCardNumber, CreditCardName creditCardName){
        if(creditCardNumber.charAt(0) == '4' && creditCardName == VISA_CARD) return  true;
        return false;
    }

    public boolean isCreditCardValidWhenItStartWithFive(String creditCardNumber, CreditCardName creditCardName){
        if(creditCardNumber.charAt(0) == '5' && creditCardName == MASTER_CARD) return  true;
        return false;
    }

    public boolean isCreditCardValidWhenItStartWithSix(String creditCardNumber, CreditCardName creditCardName){
        if(creditCardNumber.charAt(0) == '6' && creditCardName == AMERICAN_EXPRESS_CARD) return  true;
        return false;
    }

    public boolean isCreditCardValidWhenItStartWithThreeAndSeven(String creditCardNumber, CreditCardName creditCardName){
        if(creditCardNumber.charAt(0) == '3' && creditCardNumber.charAt(1) == '7' && creditCardName == DISCOVER_CARD) return true;
        return false;
    }


    public boolean isCreditCardValid(String creditCardNumber, CreditCardName creditCardName) {
    if (creditCardNumber.charAt(0) == '4' && creditCardName == VISA_CARD) return  true;

    if (creditCardNumber.charAt(0) == '5' && creditCardName == MASTER_CARD) return true;

    if (creditCardNumber.charAt(0) == '6' && creditCardName == AMERICAN_EXPRESS_CARD){ return true;
    }
        return creditCardNumber.charAt(0) == '3' && creditCardNumber.charAt(1) == '7' && creditCardName == DISCOVER_CARD;
    }


    public boolean isCreditCardStartWithFourthDigitBetweenThirteenAndSixteen(String creditCardNumber, CreditCardName creditCardName) {
        if (creditCardNumber.length() >= 13 && creditCardNumber.length() <= 16 && isCreditCardValidWhenItStartWithFour(creditCardNumber,creditCardName))
            return true;
        System.out.println(creditCardNumber.length());
        return false;
    }


    public boolean isCreditCardStartWithFifthDigitBetweenThirteenAndSixteen(String creditCardNumber, CreditCardName creditCardName) {
        if (creditCardNumber.length() >= 13 && creditCardNumber.length() <= 16 && isCreditCardValidWhenItStartWithFive(creditCardNumber,creditCardName))
            return true;
        System.out.println(creditCardNumber.length());
        return false;
    }

    public boolean isCreditCardStartWithSixthDigitBetweenThirteenAndSixteen(String creditCardNumber, CreditCardName creditCardName){
        if (creditCardNumber.length() >= 13 && creditCardNumber.length() <= 16 && isCreditCardValidWhenItStartWithSix(creditCardNumber,creditCardName))
            return true;
        System.out.println(creditCardNumber.length());
        return false;
    }

    public boolean isCreditCardStartWithThirdAndSeventhDigitBetweenThirteenAndSixteen(String creditCardNumber, CreditCardName creditCardName) {
        if (creditCardNumber.length() >= 13 && creditCardNumber.length() <= 16 && isCreditCardValidWhenItStartWithThreeAndSeven(creditCardNumber,creditCardName))
            return true;
        System.out.println(creditCardNumber.length());
        return false;
    }


    public boolean creditCardIsBetweenThirteenAndSixteenDigits(String creditCardNumber){
        if (creditCardNumber.length() >= 13 && creditCardNumber.length() <= 16) return true;
        System.out.println(creditCardNumber.length());
        return false;
    }
//
//    public void sumOfDoubleEvenIndexNumber() {
//        creditCardIsBetweenThirteenAndSixteenDigits();
//        int total = 0;
//        for (int countDigit = creditCardNumber.length() - 2; countDigit >= 0; countDigit-=2) {
//            total = creditCardNumber.charAt(countDigit) * total;
//        }
//    }
}



//        if ( Character.getNumericValue(creditCardNumber.charAt(0)) == 4 ) return true;
//        return false;