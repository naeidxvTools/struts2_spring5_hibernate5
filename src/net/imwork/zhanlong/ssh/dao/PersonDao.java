package net.imwork.zhanlong.ssh.dao;

import net.imwork.zhanlong.ssh.model.Person;

import java.util.List;

/**
 * @author Administrator
 */
@SuppressWarnings("all")
public interface PersonDao
{
    public void savePerson(Person person);

    public List<Person> listAllPersons();

    public void removePerson(Person person);

    public void updatePerson(Person person);

    public Person getPersonById(Integer id);
}
