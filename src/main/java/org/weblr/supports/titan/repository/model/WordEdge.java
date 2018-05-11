package org.weblr.supports.titan.repository.model;

import org.weblr.supports.titan.repository.annotation.TitanCompositeKey;
import org.weblr.supports.titan.repository.annotation.TitanEdge;
import org.weblr.supports.titan.repository.annotation.TitanField;

/**
 * Created by lr on 2017/1/15.
 */
@TitanEdge(label = "relation")
public class WordEdge extends TitanModel{
    @TitanCompositeKey
    @TitanField(name = "identifier")
    private String identifier;

    @TitanField(name = "relation")
    private String relation;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }
}
