public class Strings {
    public static void main(String[] args) {
        System.out.println("A B C D E F G".toCharArray());
        System.out.println("Aula de Java".split(" "));
        String aula = "Aula de Java";
        String[] arrOfAula = aula.split(" ");

        for (String a : arrOfAula)
            System.out.println(a);


        System.out.println("Aula".concat(" de Java"));
        System.out.println("1A79 asda qw".replaceAll("[0-9]", "#"));

    }
}
