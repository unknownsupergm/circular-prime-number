class circularprime
{
    private int isprime(int n)
    {
        int s = 0, k;
        for(int i = 1; i<=n; i++)
        {
            if(n%i==0)
            {
                s = s+1;
            }
        }
        if(s==2)
        {
            k = 1;
            return k;
        }
        else
        {
            k = 0;
            return k;
        }
    }
    private int digitno(int n)
    {
        int s=0, d;
        while(n>0)
        {
            d = n%10;
            n = n/10;
            s = s +1;
        }
        return s;
    }
    private int rotateno(int n)
    {
        int c, nn = 0, nn1;
        c = n%10;
        int digitcount = digitno(n);
        nn1 = (int) Math.pow(10, digitcount-1);
        nn = c * nn1 + n / 10;
        return nn;
    }
    public void main(int n)
    {
        int a = digitno(n), s=0;
        for(int i=1; i<=a; i++)
        {
            n = rotateno(n);
            if(isprime(n) ==1)
            {
                s = s+1;
            }
        }
        if(s==a)
        {
            System.out.println("Circular prime");
        }
        else
        {
            System.out.println("Not a circular prime");
        }
    }
}

