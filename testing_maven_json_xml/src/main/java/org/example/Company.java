package org.example;

public class Company {
        private String name;
        private String headquarter_city;

        public String getName(){
            return name;
        }

        public void setName(String name){
            this.name = name;
        }

        public String getHeadquarter_city(){
            return headquarter_city;
        }

        public void setHeadquarter_city(String headquarter_city){
            this.headquarter_city =  headquarter_city;
        }

        @Override
        public String toString(){
            return "Company{" +
                    "name='" + name + '\'' +
                    ", headquarter_city='" + headquarter_city + '\'' +
                    '}';
        }
}
