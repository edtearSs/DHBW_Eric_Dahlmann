import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
public class Company {
        private String name;
        private String headquarter_city;

        public Company(String name, String headquarter_city) {
            this.name = name;
            this.headquarter_city = headquarter_city;
        }

        public Company(){}

        public String getName(){
            return this.name;
        }

        public void setName(String name){
            this.name = name;
        }

        public String getHeadquarter_city(){
            return this.headquarter_city;
        }

        public void setHeadquarter_city(String headquarter_city){
            this.headquarter_city =  headquarter_city;
        }

        @Override
        public String toString() {
            String delimiter = " " + Config.getSeparator();
            return "<name>" + name + "</name>" + delimiter + "<headquarter_city>" + headquarter_city + "</headquarter_city>" + delimiter;
        }
}
