package kduraj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kduraj.component.IPersonService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
/*------------------------------------------------------------------------------------------------
 http://localhost:8084/data/person?id=15
 */

@RestController
@RequestMapping("/data")
public class PersonController {

    @Autowired
    private IPersonService personService;
    /*--------------------------------------------------------------------------------------------*/

    @RequestMapping("/person")
    public Person getPersonDetail(
            @RequestParam(value = "id",
                    required = false,
                    defaultValue = "0") Integer id
    ) {

        Person person = personService.getPersonDetail(id);
        return person;
    }
    /*--------------------------------------------------------------------------------------------*/
    @RequestMapping("/info")
    public Person getPersonInfo(
            @RequestParam(value = "id",
                    required = false,
                    defaultValue = "0") Integer id
    ) {

        Person person = personService.getPersonInfo(id);
        return person;
    }
    /*--------------------------------------------------------------------------------------------
    http://localhost:8084/data/list/15
    */
    @RequestMapping(value = "/list/{id}"
		    , method = RequestMethod.GET
		    , headers = "Accept=application/json")
    
    public Person retrieveBook(@PathVariable int id)  {  
	
        Person person = personService.getPersonInfo(id);
        return person;
	
    }
    /*--------------------------------------------------------------------------------------------
    http://localhost:8084/data/test/kevin/15
    */
    @RequestMapping(value = "/test/{title}/{id}"
		    , method = RequestMethod.GET
		    , headers = "Accept=application/json")
    
    public Person getTitle(@PathVariable String title, @PathVariable int id)  {  
	
        Person person = personService.getPersonInfo(id);
        return person;
	
    }    
    /*--------------------------------------------------------------------------------------------*/ 
}
