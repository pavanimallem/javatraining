package com.hcl.logger;

import org.apache.log4j.Logger;

public class LogTest {
	static Logger logger=Logger.getLogger(LogTest.class);
	public static void main(String[] args) {
		int a,b,c;
		try {
			a=Integer.parseInt(args[0]);
			b=Integer.parseInt(args[1]);
			c=a/b;
			System.out.println(c);
			logger.info("succes result=" +c);
		} catch(ArithmeticException e) {
			logger.info(e.getClass());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			logger.info(e.getClass());
		}
		catch (NumberFormatException e) {
			logger.info(e.getMessage());
		}
	}
}
