package net.imwork.zhanlong.ssh.service.impl;

import net.imwork.zhanlong.ssh.dao.PersonDao;
import net.imwork.zhanlong.ssh.model.Person;
import net.imwork.zhanlong.ssh.service.PersonService;

import java.util.List;

/**
 * @author Administrator
 */
public class PersonServiceImpl implements PersonService
{
    private PersonDao personDao;

    public void setPersonDao(PersonDao personDao)
    {
        this.personDao = personDao;
    }

    @Override
    public void savePerson(Person person)
    {
        personDao.savePerson(person);
    }

    @Override
    public List<Person> listAllPersons()
    {
        return personDao.listAllPersons();
    }

    @Override
    public void removePerson(Person person)
    {
        personDao.removePerson(person);
    }

    @Override
    public void updatePerson(Person person)
    {
        personDao.updatePerson(person);
    }

    @Override
    public Person getPersonById(Integer id)
    {
        return personDao.getPersonById(id);
    }
}
