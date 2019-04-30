package love.programming;

public class VariableScope {

    static int myGlobalint = 5;

    public static void main(String[] args) {

//        System.out.println(my);

        int myMainLocalint = 10;
        System.out.println(myMainLocalint);
        System.out.println(myGlobalint);
        AnotherVariableScopeClass avsc = new AnotherVariableScopeClass();

        AnotherVariableScopeClass abc = new AnotherVariableScopeClass();

        System.out.println(abc.myStaticGlobalint);

        {
            int myCodeblockInt = 100;
            System.out.println(myCodeblockInt);
        }
//        System.out.println(myCodeblockInt);

        VariableScope vs = new VariableScope();
        vs.myMethod();

    }

    void myMethod(){
        int myLocalInt = 10;


//        System.out.println(myMainLocalint );

        System.out.println(myGlobalint);
    }
}

class AnotherVariableScopeClass{

    int myStaticGlobalint;

}