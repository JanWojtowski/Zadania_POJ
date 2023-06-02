package ProjektE.Modules;

public abstract class Module {
    boolean status;
    String name;

    public Module(String name){
        this.name = name;
        this.status = false;
    }
    boolean turnOn(){
        if(!this.status){
            this.status = true;
            return true;
        }
        else {
            return false;
        }
    }

    boolean turnOff(){
        if(this.status){
            this.status = false;
            return true;
        }
        else {
            return false;
        }
    }

}
