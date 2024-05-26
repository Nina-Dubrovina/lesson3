
import java.util.ArrayList;

    public class Park {
        public class Attraction {
            private String name;
            private String worktime;
            private double price;

            public Attraction(String name, String worktime, double price) {
                this.name = name;
                this.worktime = worktime;
                this.price = price;
            }


            public String getName() {
                return name;
            }

            public String getWorktime() {
                return worktime;
            }

            public double getPrice() {
                return price;
            }
        }

        private ArrayList<Attraction> attractions;

        public Park() {
            attractions = new ArrayList<>();
        }


        public void addAttraction(String name, String worktime, double price) {
            attractions.add(new Attraction(name, worktime, price));
        }

        public void displayAttractions() {
            System.out.println("Аттракционы:");
            for (Attraction attraction : attractions) {
                System.out.println("Название: " + attraction.getName());
                System.out.println("Время работы: " + attraction.getWorktime());
                System.out.println("Стоимость: " + attraction.getPrice());
                System.out.println();
            }
        }

        public static void main(String[] args) {
            Park park = new Park();
            park.addAttraction("Лошадки", "10:00 - 16:00", 250.0);
            park.displayAttractions();


        }
    }
