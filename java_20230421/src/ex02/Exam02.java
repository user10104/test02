package ex02;

import java.util.Arrays;

class Main {
    public static void main(String args[]) {
        Buyer b = new Buyer();
        b.buy(new Tv());
        b.buy(new Computer());
        b.buy(new Tv());
        b.buy(new Audio());
        b.buy(new Computer());
        b.buy(new Computer());
        
        b.summary();
        
        
//        Product[] cart = new Product[3];
//        cart[0] = new Tv();
//        cart[1] = new Computer();
//        cart[2] = new Audio();
//        System.out.println(cart[0]);
//        System.out.println(cart[1].toString());       
//        System.out.println(cart[2].toString());
//        
    }
}
class Buyer {
    int money = 1000;
    Product[] cart = new Product[3]; // 구입한 제품을 저장하기 위한 배열
    int i = 0;                       // Product배열 card에 사용될 index

    
    /*
     * 1.가진돈과물건의 가격비교, 가진돈이 적으면 메소드 종료
     * 2.가진돈 충분시 제품 가격 가진돈에서 빼고 장바구니에 구입한 물건 담기. add메서드 호출
     */
    
    void buy(Product p) {
    	//System.out.println(p.toString());
    	if(money > p.price) {
    		System.out.println("잔액" + money + "부족" + (p.price-money));
    		return;
    	}
    	
    	money -= p.price;
    	add(p); //구입한 물건은 Tv, Audio, Computer, Computer
    }

    void add(Product p) {
    	
    if(i >= cart.length) {
    	Product[] tmp = new Product[cart.length*2];
    		System.arraycopy(cart, 0,tmp , 0, cart.length);	
    	cart[i] = p;
    	i++;
    	
    }
      cart[i] = p;
      i++;
      
    } // add(Product p)

    void summary() {
      for(int i = 0; i <cart.length;i++)
    	  System.out.println(cart[i] + ",");
      System.out.println();
      System.out.println("사용한 금액 : " + (1000-money));
      System.out.println("남은 금액 : " + money);
    }
    
}
class Product {
	int price;
	public Product(int price) {
		this.price = price;
	}
	
 
}

class Tv extends Product {
  public Tv() { super(100); } //super는 생성자인 int값으로
  public String toString() {return "Tv";}
  
}

class Computer extends Product {
    Computer() { super(200); }
    public String toString() {return "Computer";}
    
}

class Audio extends Product {
    Audio() { super(50); }
    public String toString() {return "Audio";}
    

}



