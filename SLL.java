public class SLL {
    private Link root;
    private Link curr;
    private Link tail;
    int cardinality;

    public SLL() {
        this.root = new Link();
        this.curr = tail = root;
        this.cardinality = 0;
    }
    public void push(Integer val) {
        this.tail.setNxt(new Link(val));
        this.tail = tail.getNxt();
        this.cardinality += 1;
    }
    public void pop(){
        this.curr = root;
        while(this.curr.getNxt() != this.tail) {
            this.curr = this.curr.getNxt();
        }

        this.tail = this.curr;
        this.tail.setNxt(null);

        this.cardinality -= 1;
    }
    public void print(){

        System.out.println("Stack:");
        this.curr = root;

        if (cardinality != 0) {
            do {

                System.out.println(this.curr.getNxt().getVal());
                if(cardinality != 1){
                    this.curr = this.curr.getNxt();
                }
    
            } while(this.curr.getNxt() != tail);
            
            if(cardinality != 1) {
                System.out.println(this.curr.getNxt().getVal() + " (Top)");
            }
        }
        else {
            System.out.println("Empty.");
        }
    }
}
