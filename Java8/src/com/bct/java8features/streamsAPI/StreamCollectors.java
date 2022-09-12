package com.bct.java8features.streamsAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamCollectors {
	/*
	 * Collectios is a final class(main class) that extends the object class. 
	 * -- Java Stream collectors class make use of labmda and java streams. 
	 */

	public static void main(String[] args) {
		
		//Java- stream collectors groupingBy and Coiuting example.
		
		List<String> colors=
				Arrays.asList("white","orange","pink","indigo","green","red");
		
		//apply on map. 
		Map<String, Long> map=
				colors.stream()
				.collect(Collectors
						.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(map);
	}

}
