import subclass.*;
import superclass.Articulo;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Articulo> articulos = new ArrayList<>();
        articulos.add(new Arroz("12312", "Arroz Gallo", 400, new Date(), "Basmati"));
        articulos.add(new Leche("45687", "Leche Serenísima", 120, new Date(), true));
        articulos.add(new Vino("78995", "Vino Malbec", 650, new Date(), false, 42));
        articulos.add(new Fideos("74152", "Fideos Matarazzo", 160, new Date(), "Tirabuzones"));
        articulos.add(new Cerveza("84951", "Cerveza Guinness", 780, new Date(), false, "Stout", 5.6, true));
        articulos.add(new PapelHigienico("78921", "Papel Higiénico Higienol", 320, new Date(), false, true));

        for (int i = 0; i < articulos.size(); i++) {
        System.out.println("Articulo: " + articulos.get(i).getIdentificador() + ".");
        System.out.println("Nombre: " + articulos.get(i).getNombre() + ".");
        System.out.println("Costo: $" + articulos.get(i).getCosto() + ".");
        System.out.println("Vencimiento: " + articulos.get(i).getFechaDeVencimiento() + ".");
        System.out.println("Precio final: $" + articulos.get(i).ObtenerPrecio() + ".");
        System.out.println(" ");
}
    }
}