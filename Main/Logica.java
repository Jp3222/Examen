package examen;

import java.util.List;

/**
 *
 * @author HP
 */
public class Metodos {

    public void Suma(List<Integer> M, int a, int b, int c) {
        int d;
        d = (M.get(a) + M.get(b)) + M.get(c);
        System.out.println(M.get(a) + " + " + M.get(b) + " + " + M.get(c) + " = " + d);
    }

    public void Resta(List<Integer> M, int a, int b) {
        int d;
        d = M.get(a) - M.get(b);
        System.out.println(M.get(a) + " - " + M.get(b) + " = " + d);

    }

    public void Multiplicacion(List<Integer> M, int a, int b, int c) {
        int d;
        d = (M.get(a) * M.get(b)) * M.get(c);
        System.out.println(M.get(a) + " x " + M.get(b) + " x " + M.get(c) + " = " + d);

    }

}
