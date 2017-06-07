package helloworlmvc.controller;

import helloworldmvc.Contract.IModel;
import helloworldmvc.Contract.IView;

public class Controller {

		private final IView view;
		private final IModel model;
		
		public Controller(IView _view, IModel _model) {
			
			super();
			view = _view;
			model = _model;
		}
		
	public void run(){
		this.view.displayMessage(this.model.getHelloWorld());
	}
}
