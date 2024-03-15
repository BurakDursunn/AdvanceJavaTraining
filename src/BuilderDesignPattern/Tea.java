package BuilderDesignPattern;

public class Tea {
    private String type;
    private boolean sugar;
    private boolean milk;

    @Override
    public String toString(){
        return "Tea : " +
                "type='" + type + '\'' +
                ", sugar=" + sugar +
                ", milk=" + milk;
    }
    public Tea(Builder builder){
        this.type=builder.type;
        this.sugar = builder.sugar;
        this.milk = builder.milk;
    }
    public static class Builder{
        private String type;
        private boolean sugar;
        private boolean milk;
        public Builder(String type){
            this.type=type;
        }
        public Builder addSugar(boolean sugar){
            this.sugar=sugar;
            return this;
        }
        public Builder addMilk(boolean milk) {
            this.milk = milk;
            return this;
        }
        public Tea build(){
            return new Tea(this);
        }
    }
}
