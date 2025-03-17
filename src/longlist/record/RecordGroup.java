package longlist.record;


public class RecordGroup {
    public RecordGroup next;
    protected final Object[][] records;
    public RecordGroup() {
        records = new Object[100][];
    }
    public Object[][] getRecords() {
        return records;
    }
    private boolean inRange(int index){
        return index < 0 || index > records.length;
    }
    public int insert(Object[] record) throws Exception {
        // todo check if is full
        int i = 0;
        for(;i<records.length;i++){
            if(records[i]==null){
                records[i]=record;
                break;
            }
        }
        return i;
    }
    public void clean(int index) throws Exception {
        if(inRange(index)){
            throw new Exception("Index out of bounds");
        }
        records[index]=null;
    };
    public Object[] get(int index) throws Exception {
        if(inRange(index)){
            throw new Exception("Index out of bounds");
        }
        return records[index];
    }
}
