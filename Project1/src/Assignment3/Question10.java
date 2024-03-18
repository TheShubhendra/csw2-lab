package Assignment3;

import java.util.Hashtable;

public class Question10 {

	public static void main(String[] args) {
		String s = "data that is imperative for the code to run properly.\r\n"
				+ "Most developers regard the Permanent Generation as a block that is contained in the native memory instead of the heap\r\n"
				+ "memory. Since the Permanent Generation contains class definitions by class loaders, this block has inherently been designed\r\n"
				+ "to expand and grow to ensure that there are no out of memory errors or exceptions that are thrown in the code. However, in\r\n"
				+ "case the block needs more memory than available in the physical memory, the operating system ensures that virtual memory\r\n"
				+ "is made available for the code to run like it should. This virtual memory will certainly allow the code to run; however, in order\r\n"
				+ "to make use of this virtual memory, the constant back and forth will be required between the virtual memory and physical\r\n"
				+ "memory. This affects the performance and smoothness of the code.\r\n"
				+ "Now that you have a basic understanding of memory heap and how it works, we can start talking about the process that\r\n"
				+ "is involved in garbage collection. A daemon thread is created and used by the JVM for garbage collection. Whenever a new\r\n"
				+ "object is created, the JVM attempts to get the space that is required for the object from the Eden Space. As is the rule, the\r\n"
				+ "Survivor Spaces and Tenured Space are empty at the beginning of the code.\r\n"
				+ "In case the JVM is unable to find the required memory from Eden Space, minor garbage collection is initiated to free up\r\n"
				+ "the required space. For this process, one of the two Survivor Spaces, S0 or S1, are regarded as the To Space. Next, all objects\r\n"
				+ "that are not reachable are copied by the JVM to the To Space, and 1 is added to their age. On the other hand, all objects that\r\n"
				+ "are not fit for the Survivor Space are moved to Tenure Space.\r\n"
				+ "Since not every object is meant to move from the Young Generation Space to the Tenured Space, JVM comes with a Max\r\n"
				+ "Tenuring Threshold. This is basically an option that can be modified according to the preferences of the programmer or the\r\n"
				+ "requirements of the application to ensure that there is always enough memory for the creation and initiation of new objects.\r\n"
				+ "While the default value of the Max Tenuring Threshold is set as 15, it can be changed.\r\n"
				+ "As mentioned earlier, a minor garbage collection process occurs in order to reclaim memory that can be freed from the\r\n"
				+ "Young Generation (when objects become mature and move on to Tenured Space). It is important to note that garbage\r\n"
				+ "collection is a Stop The World process in Java, which means that the garbage collector ensures that all the threads that are\r\n"
				+ "being used to run the application or program are stopped and only the threads that are being used for garbage collection are\r\n"
				+ "still running until the process is complete. It is also important to keep in mind that Stop The World will occur regardless of\r\n"
				+ "the algorithm that is being used for garbage collection.\r\n"
				+ "The number of threads being used for garbage collection will depend on the algorithm that is being used for the process.\r\n"
				+ "Based on the algorithm, garbage collection could either be done successfully using a single thread or multiple different threads\r\n"
				+ "working together to clean out memory. Additionally, while the delay caused by the STOP-THE-WORLD application is often\r\n"
				+ "negligible, in cases where there is a lot of memory to be cleaned, garbage collector tuning can also be applied to reduce the\r\n"
				+ "STOP-THE-WORLD time.";
		
		String[] words = s.split(" ");
	
		Pair<String, Integer> mostOccuring = new Pair<String, Integer>(words[0], 0);
		Hashtable<String, Integer> table = new Hashtable<String, Integer>();
		for(String word: words) {
		
			int freq = table.getOrDefault(word, 0) + 1;
			if (freq > mostOccuring.getValue()) {
				mostOccuring.setKey(word);
				mostOccuring.setValue(freq);
			}
			table.put(word, freq);
		}
		
		
		
		System.out.println("Most occuring word is " + mostOccuring.getKey() + " with frequency of "+ mostOccuring.getValue());
	
		
		
		

	}

}
