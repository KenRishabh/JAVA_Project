public class Condition {
    public static void main(String[] args) {
        int salary = 50000;
       /* if (salary > 10000) {
            salary = salary + 2000;
        } else {
            salary = salary + 1000;
        }*/

        if(salary>100000){
            salary=salary+1000;
        }
        else if(salary<100000){
            salary=salary+5000;
        }
        else{
            salary=salary+100;
        }
        System.out.println(salary);
    }
}
