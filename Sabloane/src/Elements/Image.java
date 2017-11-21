package Elements;

import Visitors.Visitor;

import java.awt.image.BufferedImage;

public class Image extends AbstractElement{

    private String fileName;
    private BufferedImage image;

    Image(String fileName){
//        this.fileName = fileName;
//        try{
//            image = ImageIO.read(new File(fileName));
//        } catch (Exception e){
//            System.out.println(e.getMessage());
//        }
    }

    public void acceptVisitor(Visitor v){
        v.visitImage(this);
    }

    @Override
    public void print() {
        System.out.println("File: " + fileName);
    }
}
