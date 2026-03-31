public class javaCodingBatJEYII 
{

    public boolean sleepIn(boolean weekday, boolean vacation) 
    {
        if (!weekday || vacation)
        {
            return true;
        }  
        return false;
    }

    public int sumDouble(int a, int b) 
    {
        if (a == b)
        {
            return (a+b)*2;
        }
        return a+b;
    }

    public int diff21(int n) 
    {
        if(n>21)
        {
            return (n-21)*2;
        }
        else if(n <= 21)
        {
            return 21-n;
        }
        return -1;
    }

    public boolean makes10(int a, int b) 
    {
        if(a == 10 || b == 10 || a+b ==10)
        {
            return true;
        }
        return false;
    }

    public boolean in1020(int a, int b) 
    {
        if((a >= 10 && a <= 20)||(b >= 10 && b <= 20))
        {
            return true;
        }
        return false;
    }

    public boolean hasTeen(int a, int b, int c) 
    {
        if ((a <= 19 && a >= 13)||(b <= 19 && b >= 13)||(c <= 19 && c >= 13))
        {
            return true;
        }
    return false;
    }
}
