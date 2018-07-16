class PhoneNumberTest {

    private static PhoneNumber phoneNumber;

    public static final String[] validNumber = new String[]{"(84)-(0123456789)", "(84)-(0912345678)"};
    public static final String[] invalidNumber = new String[]{"84-012345678", "(84),1234566789", "(00)-(5678910006)", "(04)-(113)"};

    public static void main(String[] args) {
        phoneNumber = new PhoneNumber();
        boolean isValid;
        for (String number : validNumber) {
            isValid = phoneNumber.validate(number);
            System.out.println("Your phone number : " + number + " is " + isValid);
        }

        for (String number : invalidNumber) {
            isValid = phoneNumber.validate(number);
            System.out.println("Your phone number: " + number + " is " + isValid);
        }

    }


}