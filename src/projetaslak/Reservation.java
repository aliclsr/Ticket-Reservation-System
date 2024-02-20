package projetaslak;


public class Reservation {


        private Passenger passenger;  // Yolcu bilgisi için bir obje
        private Vehicle vehicle;      // Araç bilgisi için bir obje
        private Seat seat;            // Koltuk bilgisi için bir obje

        // Parametre alabilen constructor
        public Reservation(Passenger passenger, Vehicle vehicle, Seat seat) {
            this.passenger = passenger;
            this.vehicle = vehicle;
            this.seat = seat;
        }

        // Getter ve Setter metotları
        public Passenger getPassenger() {
            return passenger;
        }

        public void setPassenger(Passenger passenger) {
            this.passenger = passenger;
        }

        public Vehicle getVehicle() {
            return vehicle;
        }

        public void setVehicle(Vehicle vehicle) {
            this.vehicle = vehicle;
        }

        public Seat getSeat() {
            return seat;
        }

        public void setSeat(Seat seat) {
            this.seat = seat;
        }

        /* toString metodu, nesnenin bilgilerini string olarak döndürür.
        @Override
        public String toString() {
            return "Reservation{" +
                    "passenger=" + passenger +
                    ", vehicle=" + vehicle +
                    ", seat=" + seat +
                    '}';*/
        }
