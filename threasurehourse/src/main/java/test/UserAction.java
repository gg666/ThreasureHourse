package test;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {

	public String login() throws Exception {
		System.out.println("login");
		return SUCCESS;
	}

	public String logout() throws Exception {
		System.out.println("logout");
		return SUCCESS;
	}
}

