public class Coche {

    public int velocidad;

    public void acelerar(int aceleración) {
        velocidad = velocidad + aceleración;
    }

    public void decelerar(int deceleración) {
        velocidad = velocidad - deceleración;
        if (velocidad<0){
            velocidad=0;
        }
    }
}