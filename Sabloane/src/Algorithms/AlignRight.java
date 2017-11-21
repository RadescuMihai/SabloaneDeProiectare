package Algorithms;

public class AlignRight implements AlignStrategy{
    @Override
    public void printAligned(String text) {
        System.out.println(text + "***");
    }
}
