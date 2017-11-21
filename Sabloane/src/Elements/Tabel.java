package Elements;

import Visitors.Visitor;

public class Tabel implements Element {

    private String title;

    Tabel(String title){
        this.title = title;
    }

    @Override
    public void acceptVisitor(Visitor v) {
        v.visitTable(this);
    }

    @Override
    public void add(Element e) throws Exception{
        throw new Exception("This method cannot be used for this Element");
    }

    @Override
    public void remove(Element e) throws Exception{
        throw new Exception("This method cannot be used for this Element");
    }

    @Override
    public Element getElement(int e) throws Exception{
        throw new Exception("This method cannot be used for this Element");
    }

    @Override
    public void print() {
        // TODO: PRINT OUT THE TABEL
    }
}
