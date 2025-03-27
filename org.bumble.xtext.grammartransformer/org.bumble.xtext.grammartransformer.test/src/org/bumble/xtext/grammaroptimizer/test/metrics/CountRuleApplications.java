package org.bumble.xtext.grammaroptimizer.test.metrics;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class CountRuleApplications {
	
	private static Map<String, Integer> ruleCount = new HashMap<>();

	public static void main(String[] args) throws IOException {
		
		try (Stream<Path> paths = Files.walk(Paths.get("/Users/janste/git/grammar-optimizer/org.bumble.xtext.grammaroptimizer/org.bumble.xtext.grammaroptimizer.test/src/org/bumble/xtext/grammaroptimizer/test"))) {
		    paths
		        .filter(Files::isRegularFile)
		        .forEach(CountRuleApplications::countRules);
		}
		ruleCount = sortByValue(ruleCount);
		ruleCount.forEach(CountRuleApplications::printRuleCount);
	}
	
	private static void countRules(Path path) {
		List<String> stringsInFile = new ArrayList<String>();
		Pattern pattern = Pattern.compile("go\\.([a-zA-Z0-9]*)\\(");
		try {
			stringsInFile = Files.readAllLines(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (String line : stringsInFile) {
				Matcher matcher = pattern.matcher(line);
				
				if (matcher.find()) {
					String rule = matcher.group(1);
					Integer specificRuleCount = ruleCount.get(rule);
					if (specificRuleCount == null) {
						ruleCount.put(rule, Integer.valueOf(1));
					} else {
						ruleCount.put(rule, Integer.valueOf(specificRuleCount.intValue()+1));
					}
				}
			
		}
	}
	
	private static void printRuleCount(String rule, Integer count) {
		System.out.println(rule + ": " + count.intValue());
	}

	
	// function to sort hashmap by values
    public static HashMap<String, Integer> sortByValue(Map<String, Integer> hm)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<String, Integer> > list =
               new LinkedList<Map.Entry<String, Integer> >(hm.entrySet());
 
        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
         
        // put data from sorted list to hashmap
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
}
