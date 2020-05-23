package br.com.opasystems.comanda.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "RC_CONTROL")
public class RcControl {
    @Id
    private String code;
    private String description;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RcControl rcControl = (RcControl) o;
        return Objects.equals(code, rcControl.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }
}
