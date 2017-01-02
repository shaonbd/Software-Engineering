package course.registration;

public class Course 
{
    String id, title;
    int credit, tuitionPerCredit;
    
    Course()//constructor
    {
        this.id = "";
        this.title = "";
        this.credit = 0;
        this.tuitionPerCredit = 0;
    }

    
    Course(String a, String b, int c, int d)//constructor
    {
        this.id = a;
        this.title = b;
        this.credit = c;
        this.tuitionPerCredit = d;
    }
        Course(String a)//constructor
    {
        this.id = a;
        this.title = this.title;
        this.credit = this.credit;
        this.tuitionPerCredit = this.tuitionPerCredit;
    }
    //set methods
    public void setID(String a)
    {
        this.id = a;
    }
    public void setTitle(String b)
    {
        this.title = b;
    }
    public void setCredit(int c)
    {
        this.credit = c;
    }
    public void setTuitionPerCredit(int d)
    {
        this.tuitionPerCredit = d;
    }
    
    //get_methods 
    
    public String getID()
    {
        return this.id;
    }
    public String getTitle()
    {
        return this.title;
    }
    public int getCredit()
    {
        return this.credit;
    }
    
    //different
    
    public int getTuitionPerCredit()
    {
        return this.tuitionPerCredit;
    }
    
    public int getSubTotal()
    {
        return credit*this.tuitionPerCredit;
    }
    
}
    