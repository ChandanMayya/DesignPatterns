class Student {
    private int id;
    private String name;
    private Address address;
    private Marks marks;

    private Student(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.address = builder.address; // Use the address builder
        this.marks = builder.marks; // Use the marks builder
    }

    public void getStudent(){
        System.out.println(this.id);
        System.out.println(this.name);
        System.out.println(this.address.getAddressLine1());
        System.out.println(this.address.getAddressLine2());
        System.out.println(this.address.getCity());
        System.out.println(this.address.getState());
        System.out.println(this.address.getCountry());
        System.out.println(this.address.getPinCode());
        System.out.println(this.marks.getMark1());
        System.out.println(this.marks.getMark2());
        System.out.println(this.marks.getMark3());
        System.out.println(this.marks.getMark4());
    }

    public static class Builder {
        private int id;
        private String name;
        private Address address;
        private Marks marks;

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder address(Address address) {
            this.address = address;
            return this;
        }

        public Builder marks(Marks marks) {
            this.marks = marks;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }
    
}

class Address {
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String country;
    private String pinCode;

    private Address(Builder builder) {
        this.addressLine1 = builder.addressLine1;
        this.addressLine2 = builder.addressLine2;
        this.city = builder.city;
        this.state = builder.state;
        this.country = builder.country;
        this.pinCode = builder.pinCode;
    }

    public String getAddressLine1(){
        return addressLine1;
    }

    public String getAddressLine2(){
        return addressLine2;
    }

    public String getCity(){
        return city;
    }

    public String getState(){
        return state;
    }

    public String getCountry(){
        return country;
    }

    public String getPinCode() {
        return pinCode;
    }

    public static class Builder {
        private String addressLine1;
        private String addressLine2;
        private String city;
        private String state;
        private String country;
        private String pinCode;

        public Builder addressLine1(String addressLine1) {
            this.addressLine1 = addressLine1;
            return this;
        }

        public Builder addressLine2(String addressLine2) {
            this.addressLine2 = addressLine2;
            return this;
        }

        public Builder city(String city) {
            this.city = city;
            return this;
        }

        public Builder state(String state) {
            this.state = state;
            return this;
        }

        public Builder country(String country) {
            this.country = country;
            return this;
        }

        public Builder pinCode(String pinCode) {
            this.pinCode = pinCode;
            return this;
        }

        public Address build() {
            return new Address(this);
        }
    }
}

class Marks {
    private double marks1;
    private double marks2;
    private double marks3;
    private double marks4;

    private Marks(Builder builder) {
        this.marks1 = builder.marks1;
        this.marks2 = builder.marks2;
        this.marks3 = builder.marks3;
        this.marks4 = builder.marks4;
    }

    public double getMark1() {
        return marks1;
    }

    public double getMark2() {
        return marks2;
    }

    public double getMark3() {
        return marks3;
    }

    public double getMark4() {
        return marks4;
    }

    public static class Builder {
        private double marks1;
        private double marks2;
        private double marks3;
        private double marks4;

        public Builder marks1(double marks1) {
            this.marks1 = marks1;
            return this;
        }

        public Builder marks2(double marks2) {
            this.marks2 = marks2;
            return this;
        }

        public Builder marks3(double marks3) {
            this.marks3 = marks3;
            return this;
        }

        public Builder marks4(double marks4) {
            this.marks4 = marks4;
            return this;
        }

        public Marks build() {
            return new Marks(this);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Address address = new Address.Builder()
                .addressLine1("Keshava nilaya")
                .addressLine2("Uppinangady")
                .city("Puttur")
                .state("Karnataka")
                .country("Bharatha")
                .pinCode("574241")
                .build();
        Marks marks = new Marks.Builder()
                .marks1(85)
                .marks2(95)
                .marks3(75)
                .marks4(90)
                .build();   
        Student student = new Student.Builder()
                .id(10)
                .name("Keshava")
                .address(address)
                .marks(marks)
                .build();
        student.getStudent();
    }
}
