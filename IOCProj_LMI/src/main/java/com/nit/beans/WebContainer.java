package com.nit.beans;

public abstract class WebContainer {

	public abstract RequestHandler getHandler();

	public WebContainer() {
		System.out.println("webcontainer.0-param Constructor");

	}

	public void process(String data) {
System.out.println("process method");
		RequestHandler rh = null;
		rh = getHandler();
		System.out.println("web container handling the request to Request handler to process with data" + data);
		System.out.println("the hash code of web container is" + this.hashCode());
		rh.handleRequst(data);

	}

}
