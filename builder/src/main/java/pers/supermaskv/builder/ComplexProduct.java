package pers.supermaskv.builder;

public class ComplexProduct {
    public static void main(String[] args) {
        ComplexProduct product = new ComplexProduct.Builder()
                .setA("asdf")
                .setB("hasdf")
                .setC("as5df43")
                .setD("asd51f3")
                .setE("fasd3f1a3")
                .build();
        System.out.println("product = " + product);
    }
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    public String getE() {
        return e;
    }

    public void setE(String e) {
        this.e = e;
    }

    @Override
    public String toString() {
        return "ComplexProduct{" +
                "a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", c='" + c + '\'' +
                ", d='" + d + '\'' +
                ", e='" + e + '\'' +
                '}';
    }

    public static class Builder {
        private ComplexProduct product;

        public Builder() {
            this.product = new ComplexProduct();
        }

        public Builder setA(String a) {
            this.product.setA(a);
            return this;
        }

        public Builder setB(String b) {
            this.product.setB(b);
            return this;
        }

        public Builder setC(String c) {
            this.product.setC(c);
            return this;
        }

        public Builder setD(String d) {
            this.product.setD(d);
            return this;
        }

        public Builder setE(String e) {
            this.product.setE(e);
            return this;
        }

        public ComplexProduct build() {
            return this.product;
        }

    }
}
