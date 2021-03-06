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
    private int borrowed;
    private boolean courseText; 

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean courseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
        borrowed = 0; 
        this.courseText = courseText; 
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
       if (refNumber.length() > 0)
        {
            this.refNumber = refNumber;
        }
        else 
        {
            System.out.println("Error cannot set Reference Number!");
        }
    }
     
    public int getBorrowed()
    {
        return borrowed; 
    }
    
    public void borrow()
    {
        borrowed++; 
    }
    
    public boolean isCourseText()
    {
        return courseText;
    }
    
    public void printAuthor()
    {
        System.out.println("Author: " + getAuthor());  
    }
    
    public void printTitle()
    {
        System.out.println("Title: " + getTitle()); 
    }
    
    public void printDetails()
    {
         System.out.println("Title: " + getTitle() + ", \n Author: " + getAuthor() 
         + ", \n Pages: " + getPages() + ", \n Reference Number: " + getRefNumber() + 
         ", \n Number of times the book has been borrowed: " + getBorrowed());
        
        //if else statement for length of refNumber
        if (refNumber.length() < 0)
        {
            refNumber = "zzz";
        }
        else 
        {
            this.refNumber = refNumber;
        }
        
     
    }
    
    
    
}

