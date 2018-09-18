/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Daisry Joy Ladignon
 * @version 2018.09.17
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages; 
    private String refNumber;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages,
    String refNumber)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
    }

    // Add the methods here ...
    public String getAuthor()
    {
        return author;
    }
    
   
    
    public String getTitle()
    {
        return title;
    }
    
    public int getPages()
    {
        return pages; 
    }
    
    public String getRefNumber()
    {
        return refNumber; 
    }
    
    public void setRefNumber(String ref)
    {
        
    }
     
    public String printAuthor()
    {
        return "Author: " + getAuthor(); 
    }
    
    public String printTitle()
    {
        return "Title: " + getTitle(); 
    }
    
    public String printDetails()
    {
        return "Title: " + getTitle() + ", Author: " + getAuthor() 
        + ", Pages: " + getPages() + ", Reference Number: " + getRefNumber();  
    }
    
    
    
}
