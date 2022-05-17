package net.chukkthedukk.heelermod.entity.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum HeelerVariant {
    BLUE(0),
    BLUE1A(1),
    BLUE1B(2),
    BLUE2(3),
    RED(4),
    RED1A(5),
    RED1B(6),
    RED2(7);

    private static final HeelerVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(HeelerVariant::getId)).toArray(HeelerVariant[]::new);
    private final int id;

    HeelerVariant(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static HeelerVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}