package com.nashorn;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class nashorn {

    public static void main(String[] args) throws ScriptException, NoSuchMethodException, FileNotFoundException {
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");



        engine.eval(new FileReader("script.js"));

        Invocable invocable = (Invocable) engine;

        Object result = invocable.invokeFunction("function1", "Anuradha");
        System.out.println(result);
    }

}
