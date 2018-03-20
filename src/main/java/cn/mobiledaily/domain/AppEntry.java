package cn.mobiledaily.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppEntry {
    private final String indexName;
    private final Date createDate = new Date();
    private List<String> types = new ArrayList<String>();

    public AppEntry(String indexName) {
        this.indexName = indexName;
    }

    public String getIndexName() {
        return indexName;
    }

    public void addType(final String type) {
        if (!types.contains(type)) types.add(type);
    }

    public void remove(final String type) {
        if (types.contains(type)) types.remove(type);
    }

}
