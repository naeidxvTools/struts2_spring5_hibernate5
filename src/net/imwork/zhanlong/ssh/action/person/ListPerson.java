package net.imwork.zhanlong.ssh.action.person;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import net.imwork.zhanlong.ssh.model.Person;
import net.imwork.zhanlong.ssh.service.PersonService;

import java.util.List;
import java.util.Map;

public class ListPerson extends ActionSupport
{
    private PersonService service;

    public PersonService getService()
    {
        return service;
    }

    public void setService(PersonService service)
    {
        this.service = service;
    }

    @Override
    public String execute() throws Exception
    {
        List<Person> list = service.listAllPersons();

        Map request = (Map) ActionContext.getContext().get("request");

        request.put("list", list);

        return SUCCESS;
    }
}
