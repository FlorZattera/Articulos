package subclass;
import superclass.CanastaBasica;
import java.util.Date;
        public class Fideos extends CanastaBasica {
        private String tipo;

        public Fideos(String identificador, String nombre, double costo, Date fechaDeVencimiento, String tipo) {
            super(identificador, nombre, costo, fechaDeVencimiento);
            this.tipo = tipo;
        }

        public String getTipo() {
            return tipo;
        }
    }

