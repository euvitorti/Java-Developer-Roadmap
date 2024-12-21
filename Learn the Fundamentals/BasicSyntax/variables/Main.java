package BasicSyntax.variables;

class Main{
    
    private static Person firstPersonWithOutStaticKeyWord = new Person((short) 2);
    private static Person secondPersonWithOutStaticKeyWord = new Person((short) 1);

    public static void main(String[] args) {
        firstPersonWithOutStaticKeyWord.showPerson();
        secondPersonWithOutStaticKeyWord.showPerson();
    }
}