package com.github.vasiljeu95.tmsLesson9;

public final class ImmutableClass {
    private final int[] array;

    public ImmutableClass(int[] array) {
        this.array = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            this.array[i] = array[i];
        }
    }

    public int[] getArray() {
        int[] copy = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }

        return copy;
    }

    // через наследование
    // через модификатор доступа
    // через передачи ссылки в конструктор
    // через отсутствие сеттера
    // через передачу getArray копии, а не ссылки
    // невозможность создания нового объекта (поле final а массиве)
}
