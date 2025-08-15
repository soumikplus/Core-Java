package L12_enum;

enum Day{
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;
}
public class Test0 {
    Day day;
    // constructor
    public Test0(Day day){
        this.day = day;
    }
    public void dayIsLike(){
        switch (day){
            case MONDAY:
                System.out.println("It is Monday");
                break;
            case FRIDAY:
                System.out.println("It is Friday");
                break;
            default:
                System.out.println("It is not Monday or Friday");

        }
    }

    public static void main(String[] args) {
        String str = "FRIDAY";
        System.out.println(Day.valueOf(str));
        Test0 t1 = new Test0(Day.valueOf(str));
        t1.dayIsLike();
    }

}
