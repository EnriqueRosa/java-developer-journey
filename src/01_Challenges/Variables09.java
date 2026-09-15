// 9. Imprime el tipo de dos variables creadas anteriormente.
public class Variables09 {
    public static void main(String[] args) {
        String myString = ("Soy Enrique y estoy empezando a aprender la base de Java");
        int a = 21;

    //Imprime el tipo de cada variable
        System.out.println(myString.getClass() .getSimpleName()); //String
        System.out.println(((Object) a).getClass() .getSimpleName()); //Integer
    }
}
