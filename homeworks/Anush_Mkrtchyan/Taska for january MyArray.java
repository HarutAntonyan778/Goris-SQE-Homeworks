public class MyArray <K> {
    private Object [] array=new Object[20];
    private  int size=0;

    public void add (K element){
        if (size==array.length-1 ){
        Object c[]=new Object[size+1];
         for( int i=0; i < array.length; i++){
            c[i]=array[i];}
          array=c;
        }
        array[size]=element;
        size++;
    }

    public  int getSize() {
        System.out.println( size);
        return size;
    }

    public  Object[] printArray() {
        for (int i = 0; i < size; i++)
            System.out.println(array[i]);
        return array;
    }

    public  Object [] delete( int index) {
        Object b[] = new Object [size - 1];
        if ( index<= size ){
            for (int i = 0; i < size; i++) {
                if (i <= index) {
                    b[i] = array[i];
                } else if (i > index) {
                    b[i-1] = array[i];
                }
            }
            size--;
            array = b;
        }
        else {
            System.out.println("error ");
        }
        return array;
    }



    public void insertAtIndex(int index, K element ){
     Object c[]=new Object [size+1];
     size++;
     c[index]= element;
     for( int i=0; i<size; i++){
         if( i < index ) {
         c[i]=array[i];
         } else if ( i > index ){
         c[i] = array[i-1];
         }
         }
     array=c;
    }

    public  void update(int index, K element ){
        if( index < size ){
            array[index]=element;
        }else {
            System.out.println(" the index is not correct");
        }
    }
    public void read(int index){

        System.out.println(array[index]);
    }
    public int find( K element ){
        int k=-1;
        for( int i=0; i<size; i++){
            if( array[i] == element ){
                k=i;
            }
        }
        System.out.println(k+" ");
        return k;
    }

}
