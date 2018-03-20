package cn.mobiledaily.client;

import cn.mobiledaily.domain.IndexObject;
import org.apache.http.HttpHost;
import org.elasticsearch.action.delete.DeleteRequest;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.update.UpdateRequest;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestClientBuilder;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.xcontent.XContentType;

import java.io.IOException;

public final class ESClient {
    private static final RestClientBuilder BUILDER = RestClient.builder(new HttpHost("106.14.4.47", 3000));
    private static final RestHighLevelClient CLIENT = new RestHighLevelClient(BUILDER);

    public void createIndex(final IndexObject object) {
        IndexRequest request = new IndexRequest(object.getIndexName(), object.getType(), object.getIdAsString());
        request.source(object.dataToJson(), XContentType.JSON);
        try {
            CLIENT.index(request);
        } catch (IOException e) {
            throw new IllegalStateException("can not index provided object.");
        }
    }

    public void deleteIndex(final IndexObject object) {
        DeleteRequest request = new DeleteRequest(object.getIndexName(), object.getType(), object.getIdAsString());
        try {
            CLIENT.delete(request);
        } catch (IOException e) {
            throw new IllegalStateException("can not index provided object.");
        }
    }

    public void updateIndex(final IndexObject object) {
        UpdateRequest request = new UpdateRequest(object.getIndexName(), object.getType(), object.getIdAsString());
        try {
            CLIENT.update(request);
        } catch (IOException e) {
            throw new IllegalStateException("can not index provided object.");
        }
    }
}
