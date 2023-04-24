package ex06;


class Tv { 
	boolean power; 	// 전원상태
	int channel; 	// 채널
	
	void power() 		{ power = !power; 	}
	void channelUp()	{	++channel;		}
	void channelDown()	{	--channel;		}
}


class CaptionTv extends Tv { //ctv가 접근할수있는건 디스플레이와 캡션뿐만이다. 익스텐드를 붙여야 접근 가능,.
	boolean caption;//위의 부모클래스 상속
	void displayCaption(String text) {
		if (caption) { // 캡션상태가 on(true) 일때만 text를 보여준다.
			System.out.println(text);
		}
	}
	
}
class CaptionTvTest { 
	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;
		ctv.channelUp();
		System.out.println(ctv.channel);
		ctv.displayCaption("Hello, world");
		ctv.caption = true;
		ctv.displayCaption("Hello, world");
	}

}
