package this_is_java.ch2.ex3;

public class VariableTypes {
    public static void main(String[] args){
        int ival1 = 0b1011;
        int ival2 = 013;
        int ival3 = 11;
        int ival4 = 0xB;

        System.out.println("ival1: " + ival1
                + ", ival2:" + ival2
                + ", ival3:" + ival3
                + ", ival4:" + ival4);

        char cval1 = 'A';
        char cval2 = 65;
        System.out.println("cval1: " + cval1
                + ", cval2:" + cval2);

        double dval1 = 0.25;
        double dval2 = 2.5E-1;
        System.out.println("dval1: " + dval1
            + ", dval2: " + dval2);

        boolean bval1 = true;
        boolean bval2 = 3 == 1;
        boolean bval3 = true && false;
        System.out.println("bval1: " + bval1
                + ", bval2: " + bval3
                + ", bval3: " + bval3);

        System.out.println("================");
        System.out.println("""
                오늘 저녁 메뉴
                1. 제육볶음
                2. 우동
                3. 김치찌개
                """);
        System.out.println("================");
    }
}
