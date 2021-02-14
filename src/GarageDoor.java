public class GarageDoor {


    private Motor motor;
    private DoorState currentState;
    public GarageDoor(Motor motor) {

    }
    public void openDoor(){

    }

    public void stopper(){}

    public void closeDoor(){}





    public abstract class DoorState {



        public void openDoor(){

        }

        public void stopper(){


        }

        public void closeDoor(){


        }


    }
    class Closed extends DoorState {
        @Override
        public void openDoor() {
            super.openDoor();
        }
    }


    class Open extends DoorState {

        @Override
        public void closeDoor() {
            super.closeDoor();
        }
    }


    class Opening extends DoorState {


        @Override
        public void closeDoor() {
            super.closeDoor();
        }

        @Override
        public void stopper() {
            super.stopper();
        }
    }




    class Closing extends DoorState {

        @Override
        public void openDoor() {
            super.openDoor();
        }

        @Override
        public void stopper() {
            super.stopper();
        }
    }







}
