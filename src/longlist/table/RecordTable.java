package longlist.table;
import longlist.record.RecordList;

import java.util.Map;

public class RecordTable extends RecordList {
    public RecordTable(){super();}
    RecordTable(RecordTable table){
        super.head = table.head;
    }
    RecordTable(RecordList list){
        super(list);
    }
    public RecordTable select(int[] indexes){
        return new RecordTable();
    }
    public RecordTable where(Map<Integer,Object> conditions){
        return new RecordTable();
    }
    public RecordTable join(RecordTable rightTable, int leftIndex, int rightIndex){
        return new RecordTable();
    }
    public RecordTable leftJoin(RecordTable rightTable, int leftIndex, int rightIndex){
        return new RecordTable();
    }
}
