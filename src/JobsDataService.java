import java.util.*;
//import java.util.stream.Collectors;
//
public class JobsDataService {

//output the list of Job Titles and Job popularity(i.e. frequency of job titles) in the console.
    public Map<String,Integer> filterJobsByTitle(List<JobDetails> jobs){
        // start of code.
        Map<String,Integer> titleMap = new HashMap<>();
        List<String> titles = new ArrayList<>();

        for(JobDetails j : jobs){
            titles.add(j.getTitle());
        }

        String temp;
        for(JobDetails j : jobs){
            temp = j.getTitle();
            if(!titleMap.containsKey(temp)){
                titleMap.put(temp,Collections.frequency(titles,temp));
            }

        }
        return titleMap;
    }
//which output the list of Country and Job demand (i.e. frequency of jobs related to country) in the console.
    public Map<String,Integer> filterJobsByCountry(List<JobDetails> jobs){

        Map<String,Integer> countryMap = new HashMap<>();
        List<String> countries = new ArrayList<>();

        for(JobDetails j : jobs){
            countries.add(j.getCountry());
        }

        String temp;
        for(JobDetails j : jobs){
            temp = j.getCountry();
            if(!countryMap.containsKey(temp)){
                countryMap.put(temp,Collections.frequency(countries,temp));
            }

        }

        return countryMap;
    }

// which output the list of Level and popularity(i.e. frequency of job Level) in the console.
    public Map<String,Integer> filterJobsByLevel(List<JobDetails> jobs){
        Map<String,Integer> levelMap = new HashMap<>();
        List<String> levels = new ArrayList<>();

        for(JobDetails j : jobs){
            levels.add(j.getLevel());
        }

        String temp;
        for(JobDetails j : jobs){
            temp = j.getLevel();
            if(!levelMap.containsKey(temp)){
                levelMap.put(temp,Collections.frequency(levels,temp));
            }

        }

        return levelMap;
    }

    public Map<String,Integer> filterJobsByYearsExp(List <JobDetails> jobs){

        Map<String,Integer> yearsExpMap = new HashMap<>();
        TreeMap<String,Integer> sortedYearsExpMap = new TreeMap<>();
        List<String> years = new ArrayList<>();

        for(JobDetails j : jobs){
            years.add(j.getYear());
        }

        String temp;
        for(JobDetails j : jobs){
            temp = j.getYear();
            if(!yearsExpMap.containsKey(temp)){
                yearsExpMap.put(temp,Collections.frequency(years,temp));
            }

        }
        sortedYearsExpMap.putAll(yearsExpMap);
        yearsExpMap = sortedYearsExpMap;
        return yearsExpMap;
    }
}

