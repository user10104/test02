package ex04;

public class Button {
		// 정적 멤버 인터페이스 (함수형 인터페이스)
			
		
		@FunctionalInterface
			public static interface Clicklistener{
				void onClick();
			}
			

		private Clicklistener clickListener;

		public void setClickListener (Clicklistener clickListener){
			this.clickListener = clickListener;
			
		}

		public void click() {
			this.clickListener.onClick();
		}
		}



