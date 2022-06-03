package goodpack.barcodecalc;
//fx:controller="goodpack.barcodecalc.HelloController">


import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;

import java.util.Arrays;
import java.util.List;


public class HelloController {
    public MenuButton FourthBar;
    public CheckBox chAllow;

    public Button Black4;
    public Button Brown4;
    public Button Red4;
    public Button Orange4;
    public Button Yellow4;
    public Button Green4;
    public Button Blue4;
    public Button Purple4;
    public Button Gray4;
    public Button White4;

    public Button Black3;
    public Button Brown3;
    public Button Red3;
    public Button Orange3;
    public Button Yellow3;
    public Button Green3;
    public Button Blue3;
    public Button Purple3;
    public Button Gray3;
    public Button White3;

    public Button Black2;
    public Button Brown2;
    public Button Red2;
    public Button Orange2;
    public Button Yellow2;
    public Button Green2;
    public Button Blue2;
    public Button Purple2;
    public Button Gray2;
    public Button White2;

    public Button Black1;
    public Button Brown1;
    public Button Red1;
    public Button Orange1;
    public Button Yellow1;
    public Button Green1;
    public Button Blue1;
    public Button Purple1;
    public Button Gray1;
    public Button White1;

    public Button dispTabBtn;

    //public TextField ResultField;
    public Label ResultDisplay;
    public String result;
    //List ResultList = new ArrayList();
    //public int number;

    /*TODO
        Pierwsze: koniecznie używaj poniższych skrótów:
        CTRL+ALT+L - wyrównuje kod
        CTRL+ALT+O - usuwa niepotrzebne importy
     */

    /*TODO
        Po drugie zanim uznasz, ze to co zrobiłeś jest ok przejdź do:
        Analyze -> Inspect Code -> Whole project (później wystarczy uncommited)
        Wtedy na dole pojawią ci się sugestie poprawek i aplikacja sama jest w stanie większość dodać, jeżeli je zaakceptujesz
        Oczywiście nie ma potrzeby przerabiania wszystkiego co sugeruje Inspection Results, ale tak 80% wskazówek jest do zastosowania
        I będzie to dla ciebie lekcja
     */
    
    /*TODO
        Właściwie to czemu to jest lista, a nie tablica? Masz tam tylko cyfry.
        Zamiast tych dwóch linijek:
            Object [] number =new Object[5];
            List<Object> number= Arrays.asList(number);
        wystarczy:
            int[] number = new int[5];
        Będzie to wymagało wielu poprawek więc polecam: CTRL+R
     */

    //Object[] number = new Object[5];
    int[] number=new int[5];
    //List<Object> ResultFinal = Arrays.asList(number);
    public Button Calculatebtn;
    public int ResultInOhms;
    public int a, b, c, d;


    public void chAllowChange() {

        /*TODO
            --------DONE-------------
            To może być uproszczone.
            Jedyne co robi blok if/else to wywołanie funkcji setDisable, która przyjmuje wartość typu boolean,
            a ta wartość to nic innego jak warunek bloku if/else
            To oznacza, że blok if/else może być zastąpiony pojedynczym wywołaniem funkcji setDisable, która jako parametr przyjmie warunek isSelected:
                FourthBar.setDisable(!chAllow.isSelected());
            Wykrzyknik oznacza zaprzeczenie. Cały blok if/else może być zastąpiony powyższą linijką.
         */

        FourthBar.setDisable(!chAllow.isSelected());
//        if (chAllow.isSelected()) {
//            FourthBar.setDisable(false);
//        } else {
//            FourthBar.setDisable(true);
//        }
    }

    public void getResult() {

        /*TODO DONE
             Tak jak wcześniej mówiłam, wspólne liniki wyciągnąć poza blok if/else, łącznie z przypisaniem wartości do zmiennej d
         */
//        a = (int) ResultFinal.get(0);
//        b = (int) ResultFinal.get(1);
//        c = (int) ResultFinal.get(2);
//        d = (int) ResultFinal.get(3);
        a=number[0];
        b=number[1];
        c=number[2];
        d=number[3];


        if (chAllow.isSelected()) {
            a *= 100;
            b *= 10;
            this.d = (int) Math.pow(10, d);

            ResultInOhms = (a + b + c) * d;
        } else {
            a *= 10;
            this.c = (int) Math.pow(10, c);

            ResultInOhms = (a + b) * c;
        }
        if(ResultInOhms>=1000 && ResultInOhms<1000000){
            ResultDisplay.setText(ResultInOhms/1000 + "KOhms");
            System.out.println("zm1");
        }
        else if(ResultInOhms>1000000){
            ResultDisplay.setText(ResultInOhms/1000000 + "MOhms");
            System.out.println("zm2");
        }
        else {
            ResultDisplay.setText(ResultInOhms + "Ohms");
            System.out.println("zm3");
        }

    }

    public void btnBlack4() {
        number[3] = 0;
        System.out.println("Black4");
        result = "black";
        //ResultField.setText(result);
        System.out.println(number[3]);
        System.out.println(number[2]);
        System.out.println(number[1]);
        System.out.println(number[0]);
    }

    public void btnBrown4() {
        System.out.println("Brown4");
        number[3] = 1;
//        ResultList.add(3,"1");
//        System.out.println(ResultList);
        System.out.println(number[3]);
        System.out.println(number[2]);
        System.out.println(number[1]);
        System.out.println(number[0]);
        System.out.println(number);

    }

    public void btnRed4() {
        System.out.println("btnRed4");
        number[3] = 2;
        System.out.println(number);
    }

    public void btnOrange4() {
        System.out.println("btnOrange4");
        number[3] = 3;
        System.out.println(number);
    }

    public void btnYellow4() {
        System.out.println("btnYellow4");
        number[3] = 4;
        System.out.println(number);
    }

    public void btnGreen4() {
        System.out.println("btnGreen4");
        number[3] = 5;
        System.out.println(number);
    }

    public void btnBlue4() {
        System.out.println("btnBlue4");
        number[3] = 6;
        System.out.println(number);
    }

    public void btnPurple4() {
        System.out.println("btnPurple4");
        number[3] = 7;
        System.out.println(number);
    }

    public void btnGray4() {
        System.out.println("btnGray4");
        number[3] = 8;
        System.out.println(number);
    }

    public void btnWhite4() {
        System.out.println("btnWhite4");
        number[3] = 9;
        System.out.println(number);
    }

    ////////////////////////////////////////////////////////////////
    public void btnBlack3() {
        System.out.println("btnBlack3");
        number[2] = 0;
        System.out.println(number);
    }

    public void btnBrown3() {
        System.out.println("btnBrown3");
        number[2] = 1;
        System.out.println(number[3]);
        System.out.println(number[2]);
        System.out.println(number[1]);
        System.out.println(number[0]);
    }

    public void btnRed3() {
        System.out.println("btnRed3");
        number[2] = 2;
        System.out.println(number);
    }

    public void btnOrange3() {
        System.out.println("btnOrange3");
        number[2] = 3;
        System.out.println(number);
    }

    public void btnYellow3() {
        System.out.println("btnYellow3");
        number[2] = 4;
        System.out.println(number);
    }

    public void btnGreen3() {
        System.out.println("btnGreen3");
        number[2] = 5;
        System.out.println(number);
    }

    public void btnBlue3() {
        System.out.println("btnBlue3");
        number[2] = 6;
        System.out.println(number);
    }

    public void btnPurple3() {
        System.out.println("btnPurple3");
        number[2] = 7;
        System.out.println(number);
    }

    public void btnGray3() {
        System.out.println("btnGray3");
        number[2] = 8;
        System.out.println(number);
    }

    public void btnWhite3() {
        System.out.println("btnWhite3");
        number[2] = 9;
        System.out.println(number);
    }

    ////////////////////////////////////////////////////////////////
    public void btnBlack2() {
        System.out.println("btnBlack2");
        number[1] = 0;
        System.out.println(number);
    }

    public void btnBrown2() {
        System.out.println("btnBrown2");
        number[1] = 1;
        System.out.println(number);
    }

    public void btnRed2() {
        System.out.println("btnRed2");
        number[1] = 2;
        System.out.println(number[3]);
        System.out.println(number[2]);
        System.out.println(number[1]);
        System.out.println(number[0]);
    }

    public void btnOrange2() {
        System.out.println("btnOrange2");
        number[1] = 3;
        System.out.println(number);
    }

    public void btnYellow2() {
        System.out.println("btnYellow2");
        number[1] = 4;
        System.out.println(number);
    }

    public void btnGreen2() {
        System.out.println("btnGreen2");
        number[1] = 5;
        System.out.println(number);
    }

    public void btnBlue2() {
        System.out.println("btnBlue2");
        number[1] = 6;
        System.out.println(number);
    }

    public void btnPurple2() {
        System.out.println("btnPurple2");
        number[1] = 7;
        System.out.println(number);
    }

    public void btnGray2() {
        System.out.println("btnGray2");
        number[1] = 8;
        System.out.println(number);
    }

    public void btnWhite2() {
        System.out.println("btnWhite2");
        number[1] = 9;
        System.out.println(number);
    }

    ////////////////////////////////////////////////////////////////
    public void btnBlack1() {
        System.out.println("btnBlack1");
        number[0] = 0;
        System.out.println(number);
    }

    public void btnBrown1() {
        System.out.println("btnBrown1");
        number[0] = 1;
        System.out.println(number);
    }

    public void btnRed1() {
        System.out.println("btnRed1");
        number[0] = 2;
        System.out.println(number[3]);
        System.out.println(number[2]);
        System.out.println(number[1]);
        System.out.println(number[0]);
    }

    public void btnOrange1() {
        System.out.println("btnOrange1");
        number[0] = 3;
        System.out.println(number);
    }

    public void btnYellow1() {
        System.out.println("btnYellow1");
        number[0] = 4;
        System.out.println(number);
    }

    public void btnGreen1() {
        System.out.println("btnGreen1");
        number[0] = 5;
        System.out.println(number);
    }

    public void btnBlue1() {
        System.out.println("btnBlue1");
        number[0] = 6;
        System.out.println(number);
    }

    public void btnPurple1() {
        System.out.println("btnPurple1");
        number[0] = 7;
        System.out.println(number);
    }

    public void btnGray1() {
        System.out.println("btnGray1");
        number[0] = 8;
        System.out.println(number);
    }

    public void btnWhite1() {
        System.out.println("btnWhite1");
        number[0] = 9;
        System.out.println(number);
    }

    public void getTab(){
        System.out.println("4 bar: "+number[3]);
        System.out.println("3 bar: "+number[2]);
        System.out.println("2 bar: "+number[1]);
        System.out.println("1 bar: "+number[0]);
    }


//    @Override
//    public void start(Stage stage) throws Exception {
//
//    }
}