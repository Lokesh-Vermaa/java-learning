package in.library;

import java.util.Scanner;

public class magazine extends libraryitems{

    public magazine(int itemId, String title, String author, boolean available) {
        super(itemId, title, author, available);
    }
    public int issuenumber;
    public magazine(int itemId, String title, String author, boolean available, int issuenumber) {
        super(itemId, title, author, available);
        this.issuenumber = issuenumber;
    }
    @Override
    public String toString() {
        return "magazine [issuenumber=" + issuenumber + "]";
    }
}
