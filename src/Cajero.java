public class Cajero {

    private int[] denominaciones = {500, 200, 100, 50, 20, 10, 5, 2, 1};
    private int cantidad ;
    private int [] cambioDeno={0,0,0,0,0,0,0,0,0};

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int [] darCambio(){
        while (true) {


            if (this.cantidad == 0) {
                break;
            }

            System.out.println(this.cantidad);

            for (int i=0; i<this.denominaciones.length;i++) {
                this.cambioDeno[i] = this.cantidad / this.denominaciones[i];
                this.cantidad %= this.denominaciones[i];
            }
        }
        return this.cambioDeno;
    }

    public void mostrarCambio(int[] cantidades) {
        for (int i = 0; i < denominaciones.length; i++) {
            System.out.println(cantidades[i] + " de " + denominaciones[i]);
        }
    }
}

