package exec.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import exec.dto.CodeDTO;
import exec.dto.Menu;
import exec.dto.Tableau;

@Component
@Controller
@RequestMapping("/exec")
public class ExecutorServiceImpl implements ExecutorService{

	List<Tableau> codes;
	//List<Menu> cde;
	
	public ExecutorServiceImpl(){
		codes = new ArrayList<Tableau>();
		Tableau code = new Tableau(10);
		Tableau code1 = new Tableau (20);
		
		code.GenerateurTableAleatoire();
		code1.GenerateurTableAleatoire();
		
		code.triTable();
		
		System.out.println(code.toString());
		System.out.println(code1.toString());
		
		if (code.getEstTrie()){
		
		code.setComment("Le Tableau est trié et le programmme est terminé");
		code.setId(1);
		}
		
		else if (!code.getEstTrie()){
			
			code.setComment("Le Tableau n'est pas trié et le programmme est terminé");
			code.setId(2);
		}
		
		if (code1.getEstTrie()){
			
			code1.setComment("Le Tableau est pas trié et le programmme est terminé");
			code1.setId(1);
			}
			
			else if (!code1.getEstTrie()){
				
				code1.setComment("Le Tableau n'est pas trié et le programmme est terminé");
				code1.setId(2);
			}
		
	
		codes.add(code );
		codes.add(code1 ); 
		/*cde = new ArrayList<Menu>();
		Menu cd = new Menu();
		cd.setComment("Le Tableau est trié ");
		cd.setId(2);
		cde.add(cd );*/
	}
	
	@Override
	@RequestMapping(value = "/code", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public List<Tableau> getCodes() {
		return codes;
	}

	/*public List<Menu> getCde() {
		return cde;
	}*/
	
	@Override
	@RequestMapping(value = "/code/{codeId}", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public Tableau getCode(@PathVariable("codeId") int codeId) throws Exception {
		return codes.get(codeId);
	}
	
	/*public Menu getCd(@PathVariable("codeId") int codeId) throws Exception {
		return cde.get(codeId);
	}*/
	
	
}
