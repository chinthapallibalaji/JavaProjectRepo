package com.nit.beans;

public class RequestHandler {
	private static int count;

	public RequestHandler() {
		System.out.println("RequestHandler: 0-param constructor");
		count++;
	}

	public void handleRequst(String data) {
		System.out.println(" processsing the  request having  " + data + " with "
				+ count + "object");
		System.out.println("the hashcode of requestHnandler is" + this.hashCode());
	}
}
