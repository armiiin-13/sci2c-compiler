package entitiy;

class Function{
    private Header header;
    private Body block;

    public Function(Header header, Body block) {
        this.header = header;
        this.block = block;
    }

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public Body getBlock() {
        return block;
    }

    public void setBlock(Body block) {
        this.block = block;
    }

    public void printHeader(){
        System.out.print(header.toString() + ";");    //PROVISIONAL
    }

    public void printFunction(){
        System.out.println(header.toString() +  block.toString());  //PROVISIONAL
    }
}