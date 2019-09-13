package ua.khpi.oop.pumnya01;

public class Main {

    public static void main(String[] args) {
        final short recBookNum = 0x4668;
        final long phone = 380966244151L;
        final byte binaryPhonePart = 0b110011;
        final short octalPhonePart = 010067;
        final byte jNum = 14;
        final byte number = (jNum - 1) % 26 + 1;
        final char engChar = (char) number + 65;

        byte even = 0, odd = 0, oneCount = 0;
        String str;

        str = Short.toString(recBookNum) + Long.toString(phone) + Byte.toString(binaryPhonePart)
                + Short.toString(octalPhonePart) + Byte.toString(number) + Integer.toString((int) engChar);
        for (byte i = 0; i < str.length(); i++) {
            if (str.charAt(i) % 2 == 0) even++;
            else odd++;
        }

        str = null;
        str = Integer.toBinaryString(recBookNum) + Long.toBinaryString(phone) + Integer.toBinaryString(binaryPhonePart)
                + Integer.toBinaryString(octalPhonePart) + Integer.toBinaryString(number) + Integer.toBinaryString((int) engChar);
        for (byte i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') oneCount++;
        }
    }
}