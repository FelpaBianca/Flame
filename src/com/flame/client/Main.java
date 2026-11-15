package com.flame.client;

public class Main {
	final static String DEVMODE_KEY = "noBug@dev";
	static int exitCode;

	public static void main (String[] args) {
		if (args.length > 0) {
			if (args[0].equals(DEVMODE_KEY)) {
				System.out.println("DevMode is on.");
				System.out.println("(pls no bugs)");

				exitCode = test();
			}
		} else {
			exitCode = test();
		}

		System.out.printf("Exited with the code %d.", exitCode);
		System.exit(0);
	}

	public static int test () {
		return 0;
	}

	public static int execute () {
		return 0;
	}
}
