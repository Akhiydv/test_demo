public class MultithreadingExample1
{
 public static void main(String args[])
 {
        // Create instances of NumP for two threads
        Runnable numP1=new NumP("Thread 1");
        Runnable numP2=new NumP("Thread 2");

        // Create Thread objects
        Thread thread1=new Thread(numP1);
        Thread thread2=new Thread(numP2);

        // Start the threads
        thread1.start();
        thread2.start();

        // Wait for both threads to finish
        try 
		{
            thread1.join();
            thread2.join();
        } 
		catch(InterruptedException e)
		{
            System.out.println("Main thread interrupted.");
        }
     System.out.println("Both threads have finished.");
    }
}

// Define a class that implements the Runnable interface
class NumP implements Runnable 
{
    private String threadName;

    // Constructor to set the thread name
    public NumP(String threadName)
	{
        this.threadName=threadName;
    }

    @Override
    public void run()
	{
        try 
		{
            // Print numbers from 1 to 5 with a delay
            for (int i=1;i<=5;i++)
	    	{
                System.out.println(threadName + " - Number: " + i);
                // Sleep for 500 milliseconds
                Thread.sleep(5000);
            }
        } 
		catch(InterruptedException e)
		{
            System.out.println(threadName + " interrupted.");
        }
        System.out.println(threadName + " finished.");
    }
}

