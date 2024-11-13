import java.util.Comparator;
import java.util.List;

class Arrays {
    // Бинарный поиск для массива byte
    public static int binarySearch(byte[] a, byte key) {
        return binarySearch(a, 0, a.length, key);
    }

    // Бинарный поиск для массива byte с заданным диапазоном
    public static int binarySearch(byte[] a, int fromIndex, int toIndex, byte key) {
        if (fromIndex < 0 || toIndex > a.length || fromIndex > toIndex) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            byte midVal = a[mid];

            if (midVal < key) {
                low = mid + 1;
            } else if (midVal > key) {
                high = mid - 1;
            } else {
                return mid; // Найдено совпадение
            }
        }
        return -(low + 1); // Элемент не найден
    }

    // Бинарный поиск для массива char
    public static int binarySearch(char[] a, char key) {
        return binarySearch(a, 0, a.length, key);
    }

    // Бинарный поиск для массива char с заданным диапазоном
    public static int binarySearch(char[] a, int fromIndex, int toIndex, char key) {
        if (fromIndex < 0 || toIndex > a.length || fromIndex > toIndex) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            char midVal = a[mid];

            if (midVal < key) {
                low = mid + 1;
            } else if (midVal > key) {
                high = mid - 1;
            } else {
                return mid; // Найдено совпадение
            }
        }
        return -(low + 1); // Элемент не найден
    }

    // Бинарный поиск для массива double
    public static int binarySearch(double[] a, double key) {
        return binarySearch(a, 0, a.length, key);
    }

    // Бинарный поиск для массива double с заданным диапазоном
    public static int binarySearch(double[] a, int fromIndex, int toIndex, double key) {
        if (fromIndex < 0 || toIndex > a.length || fromIndex > toIndex) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            double midVal = a[mid];

            if (midVal < key) {
                low = mid + 1;
            } else if (midVal > key) {
                high = mid - 1;
            } else {
                return mid; // Найдено совпадение
            }
        }
        return -(low + 1); // Элемент не найден
    }

    // Бинарный поиск для массива float
    public static int binarySearch(float[] a, float key) {
        return binarySearch(a, 0, a.length, key);
    }

    // Бинарный поиск для массива float с заданным диапазоном
    public static int binarySearch(float[] a, int fromIndex, int toIndex, float key) {
        if (fromIndex < 0 || toIndex > a.length || fromIndex > toIndex) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            float midVal = a[mid];

            if (midVal < key) {
                low = mid + 1;
            } else if (midVal > key) {
                high = mid - 1;
            } else {
                return mid; // Найдено совпадение
            }
        }
        return -(low + 1); // Элемент не найден
    }

    // Бинарный поиск для массива int
    public static int binarySearch(int[] a, int key) {
        return binarySearch(a, 0, a.length, key);
    }

    // Бинарный поиск для массива int с заданным диапазоном
    public static int binarySearch(int[] a, int fromIndex, int toIndex, int key) {
        if (fromIndex < 0 || toIndex > a.length || fromIndex > toIndex) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = a[mid];

            if (midVal < key) {
                low = mid + 1;
            } else if (midVal > key) {
                high = mid - 1;
            } else {
                return mid; // Найдено совпадение
            }
        }
        return -(low + 1); // Элемент не найден
    }

    // Бинарный поиск для массива long
    public static int binarySearch(long[] a, long key) {
        return binarySearch(a, 0, a.length, key);
    }

    // Бинарный поиск для массива long с заданным диапазоном
    public static int binarySearch(long[] a, int fromIndex, int toIndex, long key) {
        if (fromIndex < 0 || toIndex > a.length || fromIndex > toIndex) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            long midVal = a[mid];

            if (midVal < key) {
                low = mid + 1;
            } else if (midVal > key) {
                high = mid - 1;
            } else {
                return mid; // Найдено совпадение
            }
        }
        return -(low + 1); // Элемент не найден
    }

    // Бинарный поиск для массива short
    public static int binarySearch(short[] a, short key) {
        return binarySearch(a, 0, a.length, key);
    }

    // Бинарный поиск для массива short с заданным диапазоном
    public static int binarySearch(short[] a, int fromIndex, int toIndex, short key) {
        if (fromIndex < 0 || toIndex > a.length || fromIndex > toIndex) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            short midVal = a[mid];

            if (midVal < key) {
                low = mid + 1;
            } else if (midVal > key) {
                high = mid - 1;
            } else {
                return mid; // Найдено совпадение
            }
        }
        return -(low + 1); // Элемент не найден
    }

    // Бинарный поиск для массива T с компаратором
    public static <T> int binarySearch(T[] a, T key, Comparator<? super T> c) {
        return binarySearch(a, 0, a.length, key, c);
    }

    // Бинарный поиск для массива T с компаратором и заданным диапазоном
    public static <T> int binarySearch(T[] a, int fromIndex, int toIndex, T key, Comparator<? super T> c) {
        if (fromIndex < 0 || toIndex > a.length || fromIndex > toIndex) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            T midVal = a[mid];

            int cmp = c.compare(midVal, key);
            if (cmp < 0) {
                low = mid + 1;
            } else if (cmp > 0) {
                high = mid - 1;
            } else {
                return mid; // Найдено совпадение
            }
        }
        return -(low + 1); // Элемент не найден
    }
}