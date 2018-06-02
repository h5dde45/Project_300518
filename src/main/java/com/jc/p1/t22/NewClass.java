package com.jc.p1.t22;

public class NewClass {
    private Long id;
    private String name;

    public NewClass(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NewClass newClass = (NewClass) o;

        if (id != null ? !id.equals(newClass.id) : newClass.id != null) return false;
        return name != null ? name.equals(newClass.name) : newClass.name == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
