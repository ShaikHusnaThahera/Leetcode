class MyCircularQueue {
    int q[];
    int front;
    int rear;
    int size;
    int k;
    public MyCircularQueue(int k) {
        q=new int[k];
        this.front=0;
        this.rear=0;
        this.size=0;
        this.k=k;
    }
    
    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }
        rear=(rear+1)%k;
        q[rear]=value;
        if(size==0){
            front=rear;
        }
        size++;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        front=(front+1)%k;
        size--;
        return true;
    }
    
    public int Front() {
        if(isEmpty()){
            return -1;
        }
        return q[front];
    }
    
    public int Rear() {
        if(size==0){
            return -1;
        }
        return q[rear];
    }
    
    public boolean isEmpty() {
        if(size==0){
            return true;
        }
        return false;
    }
    
    public boolean isFull() {
        if(size==k){
            return true;
        }
        return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */