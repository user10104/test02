package ex03;

import java.util.Optional;

public class OptionalTest {

	public static void main(String[] args) {

//		Optional<T> 와 of()사용
		Optional<String> os1 = Optional.of(new String("Toy1"));
		Optional<String> os2 = Optional.of(new String("Toy2"));
		
		if(os1.isPresent())
			System.out.println(os1.get());
		else
			System.out.println(os1.orElse("No."));
	}

}
