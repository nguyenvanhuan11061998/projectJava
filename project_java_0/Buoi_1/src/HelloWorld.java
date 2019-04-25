public class HelloWorld {
    void sayhello() {
        System.out.println("Hello world");
        System.out.println("Hello java");
    }
    void sayHelloByDay(int day){
        if(day == 2){
            System.out.println("Hello world");
        }else if(day == 3){
            System.out.println("Hi world");
        }else if(day == 4){
            System.out.println("good morning world");
        }else if(day == 5){
            System.out.println("good afternoon world");
        }else if(day == 6){
            System.out.println("good night world");
        }else if(day == 7 ){
            System.out.println(" good evening world");
        }else {
            System.out.println("good bye world");
        }
    }

    void sayHelloByDaywithSwitch(int day) {
        switch(day){
            case 2:
                System.out.println("Hello world");
                break;
            case 3:
                System.out.println("Hi world");
                break;
            case 4:
                System.out.println("good morning world");
                break;
            case 5:
                System.out.println("good afternoon world");
                break;
            case 6:
                System.out.println("good night world");
                break;
            case 7:
            case 8:
                System.out.println(" good evening world");
            default:
                System.out.println("good bye world");
                break;
        }
    }
}
