package BasicSyntax.variables;

class Person {

    // Here we are not using the static keyword, so each instance has its own eye
    private short eye;

    // Here we are using the static keyword, so all instances share the same 'rna' value (true)
    private static boolean rna = true;

    // 'short eye' is a parameter in the constructor
    public Person(short eye){
        this.eye = eye;
    }
    
    public void showPerson(){
        System.out.printf("Does this person have %d eyes.\n", getEye());
        System.out.printf("Does this person have rna? Response: %b.\n", rna);
        lifeTime();
    }

    public short getEye() {
        return eye;
    }

    private void lifeTime(){

        // This is a local variable. Why? Because this variable is within the method's scope.
        // What is the definition of scope? The scope starts and ends with {} (curly braces).
        // Local variables are only visible within their scope.
        short age = 0;

        // Loop
        for (short i = 0; i < 10; i++) {
            age += i;
        }
        
        System.out.printf("This person lived about %d years.\n", age);
    }   
}