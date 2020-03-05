public class RecursiveStackAlgorithms {
    public int sumN(MyStack stack, int n) { //Sums the first n elements of the given stack
        int sum = 0;
        int element = stack.pop();

        if (n < 0) { //Special case: negative n
            System.out.println("Error: n is negative!");
            stack.push(element);
            return -9999; //Returns some weird int to alarm the user
        }
        else if (n == 0) { //Special case: n equals 0 (doesn't sum anything)
            stack.push(element);
            return 0;
        }
        else if (n == 1 || stack.isEmpty()) { //Base case, stops recursion
            stack.push(element);
            return element;
        }
        else { //Recursive step
            sum = element + sumN(stack, n-1);
            stack.push(element); //This instruction rebuilds the original stack
            return sum; //What we initially wanted
        }
    }

    public MyStack copy(MyStack stack) { //Makes a copy of the given stack
        MyStack copiedStack = new MyStack();

        if (stack.isEmpty()) { //Base case
            return copiedStack;
        }
        else { //Recursive step
            int element = stack.pop();
            copiedStack = copy(stack);
            copiedStack.push(element);
            stack.push(element);
        }

        return copiedStack;
        /*
         * Returns copiedStack in either case
         * At the end we get what we initially wanted
         */
    }
}
