package in.library;

import java.util.Scanner;

public class libraryitems {
    Scanner input = new Scanner(System.in);
    protected int itemId;
    protected String title;
    protected String author;
    protected boolean available = true;
    

    public libraryitems(int itemId, String title, String author, boolean available) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.available = available;
    }
    


    @Override
    public String toString() {
        return "libraryitems [itemId=" + itemId + ", title=" + title + ", author=" + author + ", available=" + available
                + "]";
    }



    public void checkout(){
        if(available){
            available = false;
            System.out.println("the item is checked out successfully");
            
        }else{
            System.out.println("sorry the item is already checked out ");
        }

    }
    public void returnitem(){
        available = true;
        System.out.println("the item is returned");
        }

    

    
}
