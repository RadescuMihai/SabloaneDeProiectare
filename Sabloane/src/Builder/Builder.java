package Builder;

import Elements.Book;
import Elements.Element;

public interface Builder {
    public void build();
    public Element getResult();
}
