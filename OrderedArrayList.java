public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {

    public OrderedArrayList(){
        super();
    }

    public OrderedArrayList(int initialCapacity) {
        super(InitialCapacity);
    }

    public boolean add(T element){
        for(int i=0;i<this.size();i++){
            if(element.compareTo(this.get(i))<0){
                super.add(index-1,element);
                return true;
            }
        }
        return super.add(value);
    }
    
}
