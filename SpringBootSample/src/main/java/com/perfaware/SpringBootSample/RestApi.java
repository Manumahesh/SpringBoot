package com.perfaware.SpringBootSample;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApi {
	
	//REST GET METHOD
	@GetMapping("/getdata")
	public String getdata(){
		String a = "hello world";
		return a;
	}
	
	//REST POST METHOD
	@PostMapping("/postdata")
	public String postdata(@RequestBody PostClass name){
		return name.toString();
	}
	
	//REST PUT METHOD
	@PutMapping("/putdata")
	public String putdata(@RequestBody PutClass name1){
		System.out.println(name1);
		return name1.toString();
	}
	
	//REST DELETE METHOD
	@DeleteMapping("/delete")
	public String deletedata(){
		return "hello delete";
	}
}
