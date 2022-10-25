public class RobotX {
    String name = null;
    String Brand = null;
    int codeInput = 0;

    void MoveActions(int codeInput){
        if(codeInput == 1)
        {
            System.out.println("Robot Starts.");
        }
        else
        {
            System.out.println("Start Procedure fail.");
        }
    }
    void Terminate(){
        System.out.println("Robot Stops.");
    }
}
class MainRobotX{
    public static void main(String[] args){
        RobotX RobotXBeta = new RobotX();
        RobotXBeta.Brand = "X";
        RobotXBeta.codeInput = 1;
        RobotXBeta.MoveActions(1);
        RobotXBeta.Terminate();
    }
}
