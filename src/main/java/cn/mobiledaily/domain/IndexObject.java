package cn.mobiledaily.domain;

public class IndexObject {
    private final String indexName;
    private final String type;
    private final Indexable data;

    public IndexObject(String indexName, String type, Indexable data) {
        this.indexName = indexName;
        this.type = type;
        this.data = data;
    }

    public String getIndexName() {
        return indexName;
    }

    public String getType() {
        return type;
    }

    public Indexable getData() {
        return data;
    }

    public String getIdAsString() {
        return getData().getId().toString();
    }

    public String dataToJson() {
       return Converter.toJson(getData());
    }
}
