import org.testng.annotations.Test;

public class TargetTest extends Target {

    @Test
    public void test1(){

        search();
    }

    @Test
    public void test2 (){
        signIn();
    }


    @Test
    public void test3 () { createAccount();
    }

    @Test
    public void test4 () {
       giftCard();
    }

    @Test
    public void test5 (){
        registriesLists();
    }




}
