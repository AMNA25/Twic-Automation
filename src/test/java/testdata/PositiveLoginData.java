package testdata;

import org.testng.annotations.DataProvider;

public class PositiveLoginData {
    @DataProvider(name = "PositiveLogin")
    public static Object [][] positiveSignInData(){
        Object data [] [] = new Object[2][2];
        data [0][0] = "max@twic.ai";   data[0][1]= "foobar";
        data[1][0] = "amna.bibi@emumba.com";  data[1][1] = "foobar123456";
        return data;
    }

}
