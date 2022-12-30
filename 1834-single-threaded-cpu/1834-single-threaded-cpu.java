class Solution {
    public int[] getOrder(int[][] tasks) {
        PriorityQueue<Task> taskQueue = new PriorityQueue<>((x,y)-> x.enqueueTime-y.enqueueTime), availableQueue = new PriorityQueue<>((x,y)->x.processingTime!=y.processingTime ? x.processingTime-y.processingTime : x.index-y.index);
        int[] result = new int[tasks.length];
        for(int i=0;i<tasks.length;i++) taskQueue.offer(new Task(i, tasks[i][0], tasks[i][1]));
        int index=0, currentTime = taskQueue.peek().enqueueTime;
        while(!taskQueue.isEmpty() || !availableQueue.isEmpty()) {
            while(!taskQueue.isEmpty() && taskQueue.peek().enqueueTime <= currentTime)
                availableQueue.offer(taskQueue.poll());
            if(!availableQueue.isEmpty()) {
                currentTime = currentTime + availableQueue.peek().processingTime;
                result[index++] = availableQueue.poll().index;
            } else currentTime = taskQueue.peek().enqueueTime;
        }
        return result;
    }
}
class Task {
    int index,enqueueTime,processingTime;
    public Task(int index, int enqueueTime, int processingTime) {
        this.index = index;
        this.enqueueTime = enqueueTime;
        this.processingTime = processingTime;
    }
}