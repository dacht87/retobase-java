package arcmop.blog.springbootest.controladores;

import java.util.Collections;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import arcmop.blog.springbootest.entity.Suma;
import arcmop.blog.springbootest.repository.SumaRepository;
import arcmop.blog.springbootest.service.SumaService;

@RestController
@RequestMapping
public class ControladorHolaMundo {

	//@Autowired
	//private SumaRepository repository; 
	
	@Autowired
	private SumaService suma; 
	
    @RequestMapping(value = "/sumar/{sum01}/{sum02}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    Map saludar(@PathVariable("sum01") Integer sum01, @PathVariable("sum02") Integer sum02) {
        
    	suma.saveSuma(sum01, sum02, sum02); 
        
    	return Collections.singletonMap("resultado", String.valueOf(sum01 + sum02));
    }

}
