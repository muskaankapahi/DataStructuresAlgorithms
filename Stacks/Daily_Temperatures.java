package Stacks;

import java.util.Stack;

class Daily_Temperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<Integer> stew = new Stack<>();
        for(int i = 0 ; i < temperatures.length; i ++)
        {
            while(!stew.isEmpty() && temperatures[stew.peek()] < temperatures[i])
            {
                int index = stew.pop();
                result[index] = i - index;
            }
            stew.push(i);
        }
        return result;
    }
}



