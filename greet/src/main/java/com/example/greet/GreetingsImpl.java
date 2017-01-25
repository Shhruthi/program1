package com.example.greet;

public class GreetingsImpl implements SayHi
{

	public String msg;
	
	
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
//	public String getMsg() {
//		return msg;
//	}

	
	public String sayGreetings()
	{
		return this.msg;
	}
	
}
