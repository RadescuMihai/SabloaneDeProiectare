package Elements;

import Visitors.Visitor;

import java.util.ArrayList;

public class Section implements Element {

    private String title;
    private ArrayList<Element> elements = new ArrayList<>();

    Section(String title){
        this.title = title;
    }

    @Override
    public void acceptVisitor(Visitor v) {
        v.visitSection(this);
    }

    @Override
    public void add(Element e) {
        this.elements.add(e);
    }

    @Override
    public void remove(Element e) {
        elements.remove(e);
    }

    @Override
    public Element getElement(int index) {
        return elements.get(index);
    }

    @Override
    public void print() {
        System.out.println(title);
        for(Element element : elements){
            element.print();
        }
    }

    public ArrayList<Element> getElements(){
        return elements;
    }

    public void setTitle(String title){
        this.title = title;
    }
}
