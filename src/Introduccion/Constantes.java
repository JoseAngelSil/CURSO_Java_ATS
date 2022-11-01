package Introduccion;

/**
 * Las constantes son datos que no inmutan con el pasar de la ejecucion del programa,
 * por lo que tiene una ejecucion y declaracion especial
 *
 */
public class Constantes {
    public static void main(String[] args) {

        /*
        Las declaciones de una constante es importante poner como sintanxis especial
        final <Tipo de dato> [variable] = valor
        y el nombre de las constantes tiene que ser en MAYUSCULAS
         */
        final float PI = 3.141516f;
        System.out.println("PI = " + PI);
        final float DOLAR_PESOMXC = 20.26f;
        System.out.println("DOLAR_PESOMXC = " + DOLAR_PESOMXC);
    }
}
