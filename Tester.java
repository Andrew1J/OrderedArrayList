public class Tester{
    public static void main(String[] args){
        NoNullArrayList<Integer> nonulllist = new NoNullArrayList<Integer>();
        Integer[] list = new Integer[]{1,null,3,6,null};
        for(Integer i:list){
            try{
                nonulllist.add(i);
                System.out.println("Adding "+i);
            } catch (IllegalArgumentException e){
                System.out.println("Can't add nulls");
            }
        }
        for(Integer i:nonulllist){
            System.out.println(i+" ");
        }
        System.out.println();

        
    }
}
