package dataBase;

import javax.persistence.*;

/**
 * Created by danil on 23.10.2017.
 */
@Entity
@Table(name = "POINT", schema = "SYSTEM")
public class PointEntity {
    private long pointId;
    private Long x;
    private Long y;
    private Long r;
    private String pointResult;
    private String personLogin;

    @Id
    @Column(name = "POINT_ID")
    public long getPointId() {
        return pointId;
    }

    public void setPointId(long pointId) {
        this.pointId = pointId;
    }

    @Basic
    @Column(name = "X")
    public Long getX() {
        return x;
    }

    public void setX(Long x) {
        this.x = x;
    }

    @Basic
    @Column(name = "Y")
    public Long getY() {
        return y;
    }

    public void setY(Long y) {
        this.y = y;
    }

    @Basic
    @Column(name = "R")
    public Long getR() {
        return r;
    }

    public void setR(Long r) {
        this.r = r;
    }

    @Basic
    @Column(name = "POINT_RESULT")
    public String getPointResult() {
        return pointResult;
    }

    public void setPointResult(String pointResult) {
        this.pointResult = pointResult;
    }

    @Basic
    @Column(name = "PERSON_LOGIN")
    public String getPersonLogin() {
        return personLogin;
    }

    public void setPersonLogin(String personLogin) {
        this.personLogin = personLogin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PointEntity that = (PointEntity) o;

        if (pointId != that.pointId) return false;
        if (x != null ? !x.equals(that.x) : that.x != null) return false;
        if (y != null ? !y.equals(that.y) : that.y != null) return false;
        if (r != null ? !r.equals(that.r) : that.r != null) return false;
        if (pointResult != null ? !pointResult.equals(that.pointResult) : that.pointResult != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (pointId ^ (pointId >>> 32));
        result = 31 * result + (x != null ? x.hashCode() : 0);
        result = 31 * result + (y != null ? y.hashCode() : 0);
        result = 31 * result + (r != null ? r.hashCode() : 0);
        result = 31 * result + (pointResult != null ? pointResult.hashCode() : 0);
        return result;
    }
}
