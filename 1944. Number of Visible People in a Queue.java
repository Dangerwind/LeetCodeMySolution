class Solution {
    public int[] canSeePersonsCount(int[] heights) {

        Deque<Integer> stack = new ArrayDeque<>();
        int queueLength = heights.length;
        int[] result = new int[queueLength];

        for (var i = queueLength - 1; i >= 0; i--) {
            /*
            System.out.print("номер в очереди=" + i + "  высота=" + heights[i]);

            if (!stack.isEmpty()) {
                 System.out.println("  в стеке сверху=" + heights[stack.peek()]);
            } else {
                System.out.println("  стек пуст");
            }
            */
            int counter = 0;
            while(!stack.isEmpty() && (heights[i] >= heights[stack.peek()]) ) {

              //  System.out.println("Высота=" + heights[i] + " >= чем в стеке=" + heights[stack.peek()]);
                stack.pop();
                counter++;
              //  System.out.println("вытащили из стека и прибавили" + " counter=" + counter);
            }
            if(!stack.isEmpty()) {
                counter++;
               // System.out.println("еще прибавили counter");
            } //else {
               // System.out.println("в стеке пусто");
           // }

            result[i] = counter;
            stack.push(i);
           // System.out.println(" положили в стек =" + heights[stack.peek()] + " result[" + i + "]=" + result[i]);
        }

        return result;
    }
}
