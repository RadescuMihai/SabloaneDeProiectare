package Visitors;

import Elements.*;

public class DocumentStateVisitor implements Visitor{
    private static int imageCount = 0;
    private static int paragraphCount = 0;
    private static int tableCount = 0;
    private static int sectionCount = 0;

    public void printStatistics(){
        System.out.println("There are:");
        System.out.println(sectionCount + " Sections");
        System.out.println(imageCount + " Images");
        System.out.println(paragraphCount + " Paragraphs");
        System.out.println(tableCount + " Tabels");
    }


    @Override
    public void visitImageProxy(ImageProxy imageProxy) {
        imageCount++;
    }

    @Override
    public void visitImage(Image image) {
        imageCount++;
    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        paragraphCount++;
    }

    @Override
    public void visitTable(Tabel table) {
        tableCount++;
    }

    @Override
    public void visitSection(Section section) {
        sectionCount++;

        for(Element e : section.getElements()){
            e.acceptVisitor(this);
        }
    }
}
