import java.util.List;

public class TestWazzufJobs {
    public void test(){
        ReadCsvFile file  = new ReadCsvFile();
        System.out.println("============Start to read CSV file============");
        System.out.println();

        List<JobDetails> jobDetailsList = file.readWazzufJobsFromCSV("resource\\Wuzzuf_Jobs.csv");
        System.out.println("============Finish to read Wazzuf _Jobs file and create list of job row============");
        JobsDataService filterJob = new JobsDataService();
        System.out.println();

        System.out.println("================Coded By MhmdSyd!==================");
        System.out.println();

        System.out.println("=====================Filter Jobs By Title==========================");
        System.out.println(filterJob.filterJobsByTitle(jobDetailsList));
        System.out.println();

        System.out.println("=====================Filter Jobs By Country==========================");
        System.out.println(filterJob.filterJobsByCountry(jobDetailsList));
        System.out.println();

        System.out.println("=====================Filter Jobs By Level==========================");
        System.out.println(filterJob.filterJobsByLevel(jobDetailsList));
        System.out.println();

        System.out.println("=====================Sorted Filter Jobs By YearsExp==========================");
        System.out.println(filterJob.filterJobsByYearsExp(jobDetailsList));
        System.out.println();

//        System.out.println("==================Sorted Filter Jobs By YearsExpj another way=================");
//        filterJob.filterJobsByYearsExp(jobDetailsList).forEach((key, value) -> System.out.println(key + " = " + value));
//        System.out.println();

    }
}
