public class SuperHero {

    class Person {
        private String name;
        public Person(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
    }

    class Super extends Person {
        private String alterEgo;
        public Super(String name, String alterEgo) {
            super(name);
            this.alterEgo = alterEgo;
        }
        public String getName() {
            return alterEgo;
        }
        public String getSecretIdentity() {
            return super.getName();
        }
    }
    public static void main(String[] args) {

    }
}
