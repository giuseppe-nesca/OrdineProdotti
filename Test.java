import com.poli.ordine1.*;
public class Test{
        public static void main(String[] args) {
        Prodotto p1 = new Prodotto ("p1", 10);
        Prodotto p2 = new Prodotto ("p2", 20);  
        Prodotto p3 = new Prodotto ("p3", 30);
        Ordine o1 = new Ordine("o1");
        o1.aggiungi(p1, 3).aggiungi(p2, 2).aggiungi(p3, 1);
        int importo = o1.importo();
        System.out.println(importo);
        System.out.println(o1);
    }
}
