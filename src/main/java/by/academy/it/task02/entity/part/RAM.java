package by.academy.it.task02.entity.part;

import by.academy.it.task02.entity.part.abstraction.Part;

import java.util.Objects;

public class RAM extends Part {
    private final String name = "RAM";

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        return o != null && getClass() == o.getClass();
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name;
    }
}
