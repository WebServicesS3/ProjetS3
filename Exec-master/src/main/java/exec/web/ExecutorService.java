package exec.web;

import java.util.List;

import org.springframework.hateoas.ResourceSupport;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import exec.dto.CodeDTO;
import exec.dto.Menu;
import exec.dto.Tableau;

public interface ExecutorService {
	

	@RequestMapping(value = "/code", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public List<Tableau> getCodes();
	
	@RequestMapping(value = "/code/{codeId}", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public Tableau getCode(@PathVariable("codeId") int codeId) throws Exception;

	/*@RequestMapping(value = "/code", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public List<Menu> getCde();

	@RequestMapping(value = "/code/{codeId}", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public Menu getCd(@PathVariable("codeId") int codeId) throws Exception;*/
	
}
