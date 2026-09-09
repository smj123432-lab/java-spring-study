public class JobExample {
    public static void main(String[] args){
    Job job = new Job();
    job.setTitle("굴착기 기사");
    job.setSalary(-1000000);
    job.setSalary(3000000);
        System.out.println(job.getTitle());
        System.out.println(job.getSalary());
    }
    }

    class Job{
        private String title;
        private int salary;

        public String getTitle(){
            return title;
        }
        public void setTitle(String title){
            this.title = title;
        }

        public int getSalary() {
            return salary;
        }
        public void setSalary(int salary){
            if(salary < 0){
                System.out.println("잘못된 입력입니다.");
                return;
            }
            this.salary = salary;
        }
}
