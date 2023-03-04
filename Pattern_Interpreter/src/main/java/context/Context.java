package context;

import java.util.HashMap;
import java.util.Map;

public class Context {
    private final Map<String, Integer> variables;

    public Context(){
        variables = new HashMap<>();
    }
    // отримуємо значення змінної на її ім'я
    public int getVariable(String name){
        return variables.get(name);
    }

    public void setVariable(String name, int value){
        if(variables.containsKey(name)){
            variables.remove(name);
            variables.put(name, value);
        }
        else{
            variables.put(name, value);
        }
    }
}