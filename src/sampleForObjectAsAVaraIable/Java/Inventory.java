package sampleForObjectAsAVaraIable.Java;

public class Inventory {
    SupplyOutward so;
    String chairs,tables,racks;
    public Inventory(){
        so=new SupplyOutward();
    }
    public void outwardChairs(){
        System.out.println(so.outgoingProduct());
    }
    public void outwardTables(){
        System.out.println(so.outgoingProduct());
    }
    public void outwardRacks(){
        System.out.println(so.outgoingProduct());
    }
    public static void main(String[] args) {
        Inventory obj=new Inventory();
        obj.outwardChairs();
        obj.outwardTables();
        obj.outwardRacks();
    }
}
