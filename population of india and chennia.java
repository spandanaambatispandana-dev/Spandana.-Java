import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        // Create a HashMap to store country/city and population
        HashMap<String, Long> population = new HashMap<>();

        // Store population
        population.put("India", 1420000000L);
        population.put("Chennai", 13100000L);

        // Print population
        System.out.println("Population of India: " + population.get("India"));
        System.out.println("Population of Chennai: " + population.get("Chennai"));
    }
}

Output
Population of India: 1420000000
Population of Chennai: 13100000

How it works

The important part is:

population.put("India", 1420000000L);
population.put("Chennai", 13100000L);


put() stores the key and its value.

Then:

population.get("India");
population.get("Chennai");


get() retrieves the population using the name as the key.

For example:

population.get("India")


returns the population stored for "India".

Note: The L after the numbers means the value is a Java long, which is useful for large population numbers.{"fallbackMarkdown":"","reference":{"matched_text":" ","prefix":null,"start_idx":1645,"end_idx":1645,"safe_urls":[],"refs":[],"alt":"","prompt_text":null,"type":"sources_footnote","sources":[{"title":"India Cities by Population 2026","url":"https://worldpopulationreview.com/cities/india?source=post_page---------------------------&utm_source=chatgpt.com","attribution":"World Population Review"}],"has_images":false},"showLoginRequiredCard":false}
