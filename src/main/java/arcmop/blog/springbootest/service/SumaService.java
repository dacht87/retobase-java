package arcmop.blog.springbootest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import arcmop.blog.springbootest.entity.Suma;
import arcmop.blog.springbootest.repository.SumaRepository;

@Service
public class SumaService {

	@Autowired
	private SumaRepository repository; 	
	
	public void saveSuma(int num1, int num2, int suma) {
		
		repository.save(new Suma(num1, num2,suma));
	}
}
