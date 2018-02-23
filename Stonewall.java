//https://app.codility.com/programmers/lessons/7-stacks_and_queues/stone_wall/
import java.util.Stack;

public class Stonewall {
    public static int solution(int[] H){
        Stack<Integer> blocks = new Stack<Integer>();
        int blockCount = 0;

        for(int i = 0; i < H.length; i++) {
            //If the stack is not empty and the top
            //block is taller than the next block, remove top block and try again
            //Since Pop is O(1), will not increase complexity
            while(!blocks.isEmpty() && blocks.peek() > H[i]){
                blocks.pop();
            }
            //If the current block is taller than the previous or no previous block
            //needs to be built on, increase block count and put the current block on the stack
            if(blocks.isEmpty() || blocks.peek() < H[i]){
                blockCount++;
                blocks.push(H[i]);
            }
        }
        return blockCount;
    }
}
