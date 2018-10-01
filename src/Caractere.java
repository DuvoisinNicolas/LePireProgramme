import java.lang.Integer;

public class Caractere {

    private char myChar;

    public Caractere (char _char) {myChar = _char;}

    private int getMyCharInAscii (){
        return (int) myChar;
    }

    public int getMyChar() {

    }

    public String getMyCharInBinary () {
        return Integer.toBinaryString(getMyCharInAscii());
    }

    public void getMyCharInHexadecimals () {

    }


    private void getMyCharInAnArray () {

    }

    private void getMyChar () {

    }



}
