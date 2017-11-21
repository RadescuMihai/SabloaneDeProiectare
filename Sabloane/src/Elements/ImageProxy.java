package Elements;

import Visitors.Visitor;

public class ImageProxy extends AbstractElement {
    private String fileName;
    private Image realImage = null;

    ImageProxy(String fileName){
        this.fileName = fileName;
    }

    public void acceptVisitor(Visitor v){
        v.visitImageProxy(this);
    }

    public void print(){
        if(realImage == null){
            realImage = new Image(fileName);
            realImage.print();
        }
    }
}
