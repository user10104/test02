package ex04;

import button.Button.Clicklistener;

public class Example {

	public static void main(String[] args) {
		
		Button btnOk = new Button();
		btnOk.setClicklistener(new Clicklistener() {
			@Override
			public void onClick() {
				System.out.println("ok");
			}
		});
		
		btnOk.click();
		
		Button btnCancel = new Button();
		btnCancel.setClickListener(()->	System.out.println("cancel"));
		btnCancel.click();
	}

}
