package com.nashorn;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class nashorn2 {
    public static void main(String[] args) throws ScriptException, NoSuchMethodException, FileNotFoundException {
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
        String filepath= "lib.js";
        String url = "http://yourjavascript.com/110181462191/lib.js";
        String scriptObject ="{\"name\":\"lib.js\",\"script\":\"function increment(number){number=number+1;return number;}\"}";

        /*Uncomment the relevate line if you want to load and evaluate the function in lib.js in the java code*/
        //engine.eval("load("+scriptObject+")");
        //engine.eval("load('"+url+"')");
        //engine.eval("load('"+filepath+"')");

        engine.eval(new FileReader("math.js"));

        Invocable invocable = (Invocable) engine;

        Object result = invocable.invokeFunction("function2", 50);
        System.out.println(result);
    }
}
