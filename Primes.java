import java.util.jar.Attributes.Name;

public class Primes {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        boolean [] isPrime = new boolean[N+1];
        isPrime[0] = false;
        isPrime [1] = false;
        int p = 2;
        int prime = 0;
     
       for(int i=2; i<=N; i++)
       {
            isPrime[i] = true;
       }

       while (p <= Math.sqrt(N+1))
       {
            if (isPrime[p]) 
            {
                int p1 = p * p; 
                while (p1 <= N) 
                    {
                        isPrime[p1] = false;
                        p1 += p;
                    }
            }
            p++;
       }
        for(int i=0; i<N+1; i++)
        {
            if(isPrime[i] == true)
            {
                System.out.println(i);  
                prime++;   
            }

        }
        int percent = (int)(100*prime)/N;
        System.out.println("There are " + prime + " primes between 2 to " + N + " (" + percent + "% are prime)");
    }
            
}
