package Elements;

import Visitors.Visitor;

public class AbstractElement implements Element{

    @Override
    public void acceptVisitor(Visitor v) {

    }

    @Override
    public void add(Element e) throws Exception {

    }

    @Override
    public void remove(Element e) throws Exception {

    }

    @Override
    public Element getElement(int index) throws Exception {
        return null;
    }

    @Override
    public void print() {

    }
}
