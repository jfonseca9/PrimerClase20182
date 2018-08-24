package operaciones_movil.com.personas20182;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {


    @Test
    public void sumar_dos_numeros(){
        double a =4, b=6,c;
        c=10;
        assertEquals(c, Metodos.sumar(a,b),  0);

    }
    @Test
    public void restar_dos_numeros(){
        double a =4, b=6,c;
        c=-2;
        assertEquals(c, Metodos.restar(a,b),  0);

    }
    @Test
    public void multiplicar_dos_numeros_correctamente(){
        double a=4, b=5, c;
      c=20;
        assertEquals(c, Metodos.multiplicar(a,b), 0);
    }

    @Test
    public void dividir_dos_numeros_correctamente(){
        double a=5, b=5, c;
        c=a/b;
        assertEquals(c, Metodos.dividir(a,b), 0);
    }

}
