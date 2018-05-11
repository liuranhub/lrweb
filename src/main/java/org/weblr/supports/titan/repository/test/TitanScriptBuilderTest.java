package org.weblr.supports.titan.repository.test;

import org.weblr.supports.titan.repository.model.WordVertex;
import org.weblr.supports.titan.repository.script.TitanScriptBuilder;

import java.util.UUID;

/**
 * Created by lr on 2017/1/15.
 */
public class TitanScriptBuilderTest {
    public static void main(String[] args){
        TitanScriptBuilderTest test = new TitanScriptBuilderTest();
        test.testCreate();
    }

    public void testCreate(){
        WordVertex wordVertex = new WordVertex();
        wordVertex.setIdentifier(UUID.randomUUID().toString());
        wordVertex.setWord("你好");


        TitanScriptBuilder builder = new TitanScriptBuilder();
        builder.add(wordVertex);

        System.out.println(builder.getScript());


    }
}
