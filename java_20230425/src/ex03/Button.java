package ex03;

public class Button {

	public static interface ClickListener{
		void onClick();
		
	}
	
	private ClickListener clickListener;
	
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
	public void click() {//버튼이 클릭되었을때 실행되는 메소드 선언
		this.clickListener.onClick();
	}
		
}
