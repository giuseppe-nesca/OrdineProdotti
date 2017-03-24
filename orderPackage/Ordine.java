package com.poli.ordine1;

public class Ordine{
    private int numProdotti=0;
    private String name;
    private Linea head;
    private Linea last;
    public Ordine(String name){ this.name=name;}
    public Ordine aggiungi(Prodotto prod, int id){
      /*  if(numProdotti==0){
            head=new Linea(id, prod );
            last=head;
        }
        else{
            last=last.newLine(id,prod);            
        }
        return linea;*/

        if(head==null){
            head=new Linea(id,prod);
            last=head;
        }
        else{
            last=last.newLine(id,prod);
        }
        return this;
    }
    public int importo(){
        return head.sum();
    }
    public String toString(){
        return head.getString();
    }
}
