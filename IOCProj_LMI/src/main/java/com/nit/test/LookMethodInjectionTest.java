package com.nit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.beans.WebContainer;

public class LookMethodInjectionTest 
{
    public static void main( String[] args ) {
    	ApplicationContext ctx=null;
    	WebContainer wc=null;
    	ctx=new ClassPathXmlApplicationContext("com/nit/cfgs/applicationContext.xml");
    	wc=ctx.getBean("container",WebContainer.class);
    	System.out.println(wc.getClass()+"...."+wc.getClass().getSuperclass());
    	wc.process("corona cases......");
    	System.out.println("----------------------------------------------------------");
    	wc.process("corona deaths.........");
    	System.out.println("-----------------------------------------------------------");
    	wc.process("corona recovries.........");
    	System.out.println("==============================================");
    	wc=ctx.getBean("container",WebContainer.class);
    	wc.process("corona hospiatals......");
    	System.out.println("----------------------------------------------------------");
    	wc.process("corona quarantine centers.........");
    	
    	System.out.println("-----------------------------------------------------------");
    	wc.process("corona isolation wards.........");
    	System.out.println("==============================================");
    	wc=ctx.getBean("container",WebContainer.class);
    	wc.process("corona red zones.....");
    	System.out.println("----------------------------------------------------------");
    	wc.process("corona orange zones.........");
    	System.out.println("-----------------------------------------------------------");
    	wc.process("corona green zones.........");
    	
    	((AbstractApplicationContext) ctx).close();
    	
    }
   
}
