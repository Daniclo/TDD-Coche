import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCoche {
    @Test
    public void test_al_crear_un_coche_su_velocidad_es_cero_DanielColl(){
        Coche nuevoCoche = new Coche();
        Assertions.assertEquals(0, nuevoCoche.velocidad);
    }
    @Test
    public void test_al_acelerar_un_coche_su_velocidad_aumenta_DanielColl(){
        Coche nuevoCoche = new Coche();
        nuevoCoche.acelerar(30);
        Assertions.assertEquals(30, nuevoCoche.velocidad);
    }
    @Test
    public void test_al_decelerar_un_coche_su_velocidad_disminuye_DanielColl(){
        Coche nuevoCoche = new Coche();
        nuevoCoche.acelerar(30);
        nuevoCoche.decelerar(20);
        Assertions.assertEquals(10, nuevoCoche.velocidad);
    }
    @Test
    public void test_al_decelerar_un_coche_su_velocidad_no_puede_ser_menor_que_0_DanielColl(){
        Coche nuevoCoche = new Coche();
        nuevoCoche.acelerar(30);
        nuevoCoche.decelerar(50);
        Assertions.assertEquals(0, nuevoCoche.velocidad);
    }
}