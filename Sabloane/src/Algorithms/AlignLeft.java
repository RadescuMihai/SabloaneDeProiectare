package Algorithms;

public class AlignLeft  implements AlignStrategy{

    @Override
    public void printAligned(String text) {
        System.out.println("***" + text);
    }
}
