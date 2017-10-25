package dataBase;

import javax.persistence.*;

/**
 * Created by danil on 23.10.2017.
 */
@Entity
@Table(name = "PERSON", schema = "SYSTEM")
public class PersonEntity {
    private String login;
    private Long personHash;

    @Id
    @Column(name = "LOGIN")
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Basic
    @Column(name = "PERSON_HASH")
    public Long getPersonHash() {
        return personHash;
    }

    public void setPersonHash(Long personHash) {
        this.personHash = personHash;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonEntity that = (PersonEntity) o;

        if (login != null ? !login.equals(that.login) : that.login != null) return false;
        if (personHash != null ? !personHash.equals(that.personHash) : that.personHash != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = login != null ? login.hashCode() : 0;
        result = 31 * result + (personHash != null ? personHash.hashCode() : 0);
        return result;
    }
}
