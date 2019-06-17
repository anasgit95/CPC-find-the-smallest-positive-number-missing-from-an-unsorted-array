package test;


	import java.io.File;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.io.PrintStream;

	public class java {

		public static void main(String[] args) throws FileNotFoundException {
			// TODO Auto-generated method stub
		     ReadFile rf = new ReadFile();
	         
		        // The text file location of your choice
		   //  File file = new File("/home/anas/eclipse-workspace/episousse.ex3/src/hashcode/first.txt"); //Your file
		    //   FileOutputStream fos = new FileOutputStream(file);
		     //  PrintStream ps = new PrintStream(fos);
		    //   System.setOut(ps);
		        String filename = "/home/anas/eclipse-workspace/episousse.ex3/src/hashcode/c_memorable_moments.txt";
		        int[][] t ;
		        int[] result;
		        int dim=0;
	            
		       
		        try
		        {
		          
		          String[] lines = rf.readLines(filename);
                    String  m = lines[1];
                   System.out.println(m.charAt(2));
		        	  }
		        	
		      	
				
		        catch(IOException e)
		        {
		            // Print out the exception that occurred
		            System.out.println("Unable to create "+filename+": "+e.getMessage());              
		        }
		}

	}


	
