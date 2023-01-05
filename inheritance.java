class account
{
    public int id = 101;
    protected String name = "rohan";
}
public class inheritance extends account
{
    private String dept = "Networking";
    public void display()
    {
        System.out.println("account Id : "+id);
        System.out.println("account name : "+name);
        System.out.println("account Department : "+dept);
    }
    public static void main(String args[])
    {
        inheritance pd = new inheritance();
        pd.display();
    }
}