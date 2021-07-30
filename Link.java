class Link {
    Integer val;
    Link nxt;
    public Link() {
    	// default
    }
    public Link(Integer val) {
    	this.val = val;
    }
    public Link(Integer val, Link nxt) {
    	this.val = val;
    	this.nxt = nxt;
    }
    public Integer getVal() {
        return this.val;
    }
    public void setVal(Integer val) {
        this.val = val;
    }
    public Link getNxt() {
        return this.nxt;
    }
    public void setNxt(Link nxt) {
        this.nxt = nxt;
    }
}