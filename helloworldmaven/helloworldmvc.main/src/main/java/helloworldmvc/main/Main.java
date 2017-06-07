package helloworldmvc.main;

import helloworldmvc.model.Model;
import helloworldmvc.view.View;
import helloworlmvc.controller.Controller;

public class Main {
	
	public static void main(String args[]) {
		
		Controller c=new Controller(new View(), new Model());
		c.run();
	}

}
