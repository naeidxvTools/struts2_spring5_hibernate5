package net.imwork.zhanlong.ssh.action.person;

import com.opensymphony.xwork2.ActionSupport;
import net.imwork.zhanlong.ssh.model.Person;
import net.imwork.zhanlong.ssh.service.PersonService;

/**
 * @author Administrator
 */
public class DeletePerson extends ActionSupport
{
    private PersonService service;
    private Person person;

    public PersonService getService()
    {
        return service;
    }

    public void setService(PersonService service)
    {
        this.service = service;
    }

    public Person getPerson()
    {
        return person;
    }

    public void setPerson(Person person)
    {
        this.person = person;
    }

    @Override
    public String execute() throws Exception
    {
        this.service.removePerson(person);
        return SUCCESS;
    }
}
