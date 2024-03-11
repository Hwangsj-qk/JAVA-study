package java_240311.generic.ex.ex3;


public class StringDataProcessor implements DataProcessor<String>{
    @Override
    public String processData(String data) {
        String upper = data.toUpperCase();
        return  upper;

    }
}
