package org.example;

public class Address {
        private String street;
        private int no;
        private int zip;
        private String city;

        public Address(String street, int no, int zip, String city) {
            this.street = street;
            this.no = no;
            this.zip = zip;
            this.city = city;
        }

        public String getStreet(){
            return street;
        }

        public void setStreet(String street){
            this.street =street;
        }

        public int getNo() {
            return no;
        }

        public void setNo(int no){
            this.no = no;
        }

        public int getZip(){
            return zip;
        }

        public void setZip(int zip){
            this.zip = zip;
        }

        public String getCity(){
            return city;
        }

        public void setCity(String city){
            this.city = city;
        }

        @Override
        public String toString() {
            String delimiter = Config.getDelimiter();
            return street + delimiter + no + delimiter + zip + delimiter + city;
        }
}

