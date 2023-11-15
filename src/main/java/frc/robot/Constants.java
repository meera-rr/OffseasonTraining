package frc.robot;

public class Constants {
    public static enum CANIds {
        leftFalcon1(4),
        rightFalcon1(2),
        leftFalcon2(5),
        rightFalcon2(3)
        ;

        public final int id;

        private CANIds(int id) {
          this.id = id;
        }
    }
}
