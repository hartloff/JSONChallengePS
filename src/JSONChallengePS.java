import java.util.ArrayList;
import java.util.HashMap;

public class JSONChallengePS{


    // 5 points
    static String Q1(ArrayList<HashMap<String,Integer>> data){
        // return the provided data as a JSON String representing an array of objects

        return "";
    }


    // 5 points
    static String Q2(String json1, String json2, String json3){
        // given three JSON Strings, combine them into a single JSON String.
        //
        // The inputs are in the format:
        // json1: {"number":9}
        // json2: [10,14,0,12] <-- any number of ints
        // json3: [{"key1":4},{"key2":5}] <-- always 2 objects
        //
        // and the output must be in the format:
        // {"number":9,"array":[10,14,0,12],"key1":4,"key2":5}

        return "";
    }


    // 5 points
    static ArrayList<String> Q3(String jsonInput, String csvInput){
        // Fair Warning: This question is much more difficult than Q1 or Q2
        //
        // given a JSON String in the format of an array of objects where each object is in the format
        // {"title":"Star Wars: Episode V - The Empire Strikes Back","year":1980}
        //
        // and a CSV String containing multiple lines where each line is in the format "title,year"
        // Top Gun,1986
        //
        // return an ArrayList of all the titles sorted by year in increasing order. You may assume there are no
        // duplicate years.

        return null;
    }



    public static void main(String[] args){

    }

}
