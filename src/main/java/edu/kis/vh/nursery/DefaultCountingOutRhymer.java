package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int MAX_STACK_CAPACITY = 12;
    private static final int INVALID_STACK_VALUE = -1;
    private static final int EMPTY_STACK_INDICATOR = -1;
    private final int[] numbers = new int[MAX_STACK_CAPACITY];
    private int total = EMPTY_STACK_INDICATOR;

    public static int getMaxStackCapacity() {
        return MAX_STACK_CAPACITY;
    }

    public static int getInvalidStackValue() {
        return INVALID_STACK_VALUE;
    }

    public static int getEmptyStackIndicator() {
        return EMPTY_STACK_INDICATOR;
    }

    public int getTotal() {
        return total;
    }

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_STACK_INDICATOR;
    }

    public boolean isFull() {
        return total == MAX_STACK_CAPACITY-1;
    }

    protected int peekaboo() {
        if (callCheck())
            return INVALID_STACK_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return INVALID_STACK_VALUE;
        return numbers[total--];
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
