package net.imwork.zhanlong.ssh.dao.impl;

import net.imwork.zhanlong.ssh.dao.PersonDao;
import net.imwork.zhanlong.ssh.model.Person;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

/**
 * @author Administrator
 */
@SuppressWarnings("all")
public class PersonDaoImpl extends HibernateDaoSupport implements PersonDao
{
    @Override
    public void savePerson(Person person)
    {
        this.getHibernateTemplate().save(person);
    }

    @Override
    public List<Person> listAllPersons()
    {
        List<Person> list = (List<Person>)this.getHibernateTemplate().
                find("from Person p order by p.id desc ");
        return list;
    }

    @Override
    public void removePerson(Person person)
    {
        this.getHibernateTemplate().delete(person);
    }

    @Override
    public void updatePerson(Person person)
    {
        this.getHibernateTemplate().update(person);
    }

    @Override
    public Person getPersonById(Integer id)
    {
        return this.getHibernateTemplate().get(Person.class, id);
    }
}
