package Visitors;

import Elements.*;

public interface Visitor {

    public void visitImageProxy(ImageProxy imageProxy);
    public void visitImage(Image image);
    public void visitParagraph(Paragraph paragraph);
    public void visitTable(Tabel table);
    public void visitSection(Section section);

}
