package longlist.table;

import java.util.HashMap;
import java.util.Map;

public class IndexedRecordTable extends RecordTable {
    protected Map<Integer, Map<Object, RecordTable>> indexSet;

    IndexedRecordTable(){
        super();
        indexSet = new HashMap<Integer,Map<Object, RecordTable>>();
    }
    IndexedRecordTable(RecordTable table){
        super(table);
    }

    public void createIndex(int index){}

    @Override
    public IndexedRecordTable select(int[] indexes) {
        return new IndexedRecordTable(super.select(indexes));
    }

    @Override
    public IndexedRecordTable where(Map<Integer, Object> conditions) {
        return new IndexedRecordTable(super.where(conditions));
    }

    @Override
    public IndexedRecordTable join(RecordTable rightTable, int leftIndex, int rightIndex) {
        return new IndexedRecordTable(super.join(rightTable, leftIndex, rightIndex));
    }

    @Override
    public IndexedRecordTable leftJoin(RecordTable rightTable, int leftIndex, int rightIndex) {
        return new IndexedRecordTable(super.leftJoin(rightTable, leftIndex, rightIndex));
    }
}
