public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Funçoes para Strings!");

        String original = "abcde FGHIJ ABC abc DEFG     ";

        String s = "Você é top!";

        // string para maiusculas
        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.substring(3);
        String s05 = original.substring(2, 9);
        String s06 = original.replace('a', 'Z');
        String s07 = original.replace("abc", "xyz");
        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");
        String[] vect = s.split(" "); 


        System.out.printf("Original -> -%s-\n", original);
        System.out.printf("toLowerCase Ficou assim -> -%s-\n", s01);
        System.out.printf("toUpperCase Ficou assim -> -%s-\n", s02);
        System.out.printf("trim Ficou assim -> -%s-\n", s03);
        System.out.printf("substring Ficou assim -> -%s-\n", s04);
        System.out.printf("substring de 2 a 9 Ficou assim -> -%s-\n", s05);
        System.out.printf("replace( 'a' por 'z') Ficou assim -> -%s-\n", s06);
        System.out.printf("replace( 'abc' por 'xyz') Ficou assim -> -%s-\n", s07);
        System.out.printf("indexOf(bc) Ficou assim -> %d\n", i);
        System.out.printf("lastIndexOf(bc) Ficou assim -> %d\n", j);
        System.out.println("split Ficou assim -> " + vect[0]);
        System.out.println("split Ficou assim -> " + vect[1]);
        System.out.println("split Ficou assim -> " + vect[2]);
    }
}
