package kduraj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kduraj.component.IPersonService;
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

        Person p = personService.getPersonDetail(id);
        return p;
    }
    /*--------------------------------------------------------------------------------------------*/
    @RequestMapping("/info")
    public Person getPersonInfo(
            @RequestParam(value = "id",
                    required = false,
                    defaultValue = "0") Integer id
    ) {

        Person p = personService.getPersonInfo(id);
        return p;
    }
    /*--------------------------------------------------------------------------------------------*/
}
