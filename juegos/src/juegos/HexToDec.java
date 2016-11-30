package juegos;
public class HexToDec {

    public static int hex2Decimal(String s) {
        String digitos = "0123456789ABCDEF";
        s = s.toUpperCase();
        int val = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int d = digitos.indexOf(c);
            val = 16*val + d;
        }
        return val;
    }


    public static String decimal2Hex(int d) {
        String digits = "0123456789ABCDEF";
        if (d == 0) return "0";
        String hex = "";
        while (d > 0) {
            int digit = d % 16;                
            hex = digits.charAt(digit) + hex;  
            d = d / 16;
        }
        return hex;
    }

    public static void main(String[] args) {
        int decimal = hex2Decimal(args[0]);
        System.out.println(decimal);

        String hex = decimal2Hex(decimal);
        System.out.println(hex);
    }
}
