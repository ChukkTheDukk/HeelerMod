package net.chukkthedukk.heelermod.entity.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum HeelerVariant {
    BLUE(0),
    BLUE1A(1),
    BLUE1B(2),
    BLUE2(3);

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