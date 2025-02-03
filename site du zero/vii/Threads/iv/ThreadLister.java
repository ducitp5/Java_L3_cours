package vii.Threads.iv;

import java.util.Map;

public interface ThreadLister {

	default void listThreads() {

		Map<Thread, StackTraceElement[]> threadMap = Thread.getAllStackTraces();

		System.out.println("--------------------");

		for (Thread t : threadMap.keySet()) {
			System.out.println(t.getId() + " - Thread Name: " + t.getName() + ", State: " + t.getState());
		}
		System.out.println("_____________________");

	}

	default void listThreads2() {

		Map<Thread, StackTraceElement[]> threadMap = Thread.getAllStackTraces();

		for (Map.Entry<Thread, StackTraceElement[]> entry : threadMap.entrySet()) {
			Thread t = entry.getKey();
			StackTraceElement[] stackTrace = entry.getValue();

			System.out.println("Thread Name: " + t.getName() + ", State: " + t.getState());
			System.out.println("Stack Trace:");
			for (StackTraceElement element : stackTrace) {
				System.out.println("  " + element);
			}
			System.out.println();
		}
	}

	default void listThreads3() {

		Map<Thread, StackTraceElement[]> threadMap = Thread.getAllStackTraces();

		System.out.printf("%-10s %-20s %-15s%n", "Thread ID", "Name", "State");
		System.out.println("-----------------------------------------");

		threadMap.keySet().stream().sorted((t1, t2) -> Long.compare(t1.getId(), t2.getId())) // Sort by thread ID
				.forEach(t -> {
					System.out.printf("%-10d %-20s %-15s%n", t.getId(), t.getName(), t.getState());
				});

		System.out.println("__________________________________________");
	}
}
