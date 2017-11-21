package Elements;

import Visitors.Visitor;

public interface Element {
    public void acceptVisitor(Visitor v);
    public void add(Element e) throws Exception;
    public void remove(Element e) throws Exception;
    public Element getElement(int index) throws Exception;
    public void print();
}
