public class Operators {
    public static void main(String[] args) {

        //Operadores aritméticos
            var a = 15;
            var b = 8;

            System.out.println(a + b); // Suma
            System.out.println(a - b); // Resta
            System.out.println(a * b); // Multiplicación
            System.out.println(a / b); // División entera (sin decimales)
            System.out.println(a % b); // Resto de la división (15 dividido entre 8)

        //Asignación

        a = b;
        System.out.println(a); //a ahora vale lo mismo que b (8)

        a = b * 9;
        System.out.println(a); // a ahora vale 72

        //Comparación

        System.out.println(a == b); //¿Son iguales?
        System.out.println(a == 72);

        System.out.println(b == 8);
        System.out.println(72 == a);

        System.out.println(a != b); // ¿son distintos?
        System.out.println(a > b);  // ¿a es mayor que b?
        System.out.println(a >= b); // ¿a es mayor o igual que b?
        System.out.println(a < b); // ¿a es menor que b?
        System.out.println(a <= b);  // ¿a es menor o igual que b?

        //Lógicos

        // AND (&&) → los DOS tienen que ser true
        //Y (AND)

        System.out.println(true && true); //true
        System.out.println(true && false); //true
        System.out.println(false && true);
        System.out.println(false && false);

        System.out.println(3 > 2 && 5 == 7 );

        // OR (||) → basta con que UNO sea true
        // O (Or)
        System.out.println(true || true); //true
        System.out.println(true || false); //false
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println(3 > 2 || 5 == 7 );

        // NOT (!) → invierte el valor
        // NO (NOT)

        System.out.println(! true); //false
        System.out.println(! false ); //true

        //Unarios

        System.out.println(+b); // positivo (no cambia nada)
        System.out.println(-b); // negativo
        System.out.println(--b); // resta 1 ANTES de usarlo
        System.out.println(b);
        System.out.println(++b); // suma 1 ANTES de usarlo


    }
}
