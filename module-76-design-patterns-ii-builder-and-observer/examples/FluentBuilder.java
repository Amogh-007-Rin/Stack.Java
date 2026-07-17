public class FluentBuilder {

    public static class Computer {

        private final String cpu;
        private final int ramGb;
        private final int storageGb;
        private final boolean ssd;
        private final String gpu;

        private Computer(Builder builder) {
            this.cpu = builder.cpu;
            this.ramGb = builder.ramGb;
            this.storageGb = builder.storageGb;
            this.ssd = builder.ssd;
            this.gpu = builder.gpu;
        }

        @Override
        public String toString() {
            return "Computer [cpu=" + cpu + ", ram=" + ramGb + "GB"
                    + ", storage=" + storageGb + "GB" + ", ssd=" + ssd
                    + ", gpu=" + gpu + "]";
        }

        public static class Builder {

            private String cpu = "Intel i5";
            private int ramGb = 8;
            private int storageGb = 256;
            private boolean ssd = true;
            private String gpu = "Integrated";

            public Builder cpu(String cpu) {
                this.cpu = cpu;
                return this;
            }

            public Builder ram(int ramGb) {
                this.ramGb = ramGb;
                return this;
            }

            public Builder storage(int storageGb) {
                this.storageGb = storageGb;
                return this;
            }

            public Builder ssd(boolean ssd) {
                this.ssd = ssd;
                return this;
            }

            public Builder gpu(String gpu) {
                this.gpu = gpu;
                return this;
            }

            public Computer build() {
                return new Computer(this);
            }
        }
    }

    public static void main(String[] args) {
        Computer gamingPC = new Computer.Builder()
                .cpu("Intel i9")
                .ram(32)
                .storage(1024)
                .ssd(true)
                .gpu("NVIDIA RTX 4080")
                .build();

        Computer officePC = new Computer.Builder()
                .cpu("Intel i5")
                .ram(16)
                .storage(512)
                .build();

        System.out.println(gamingPC);
        System.out.println(officePC);
    }
}
