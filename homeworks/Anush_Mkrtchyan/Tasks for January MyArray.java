public class MyArray {
    private static int[] array;
    private static int size;

    public static void setArray(int[] array) {
        MyArray.array = array;
    }

    public static void setSize() {
        MyArray.size = array.length;
    }

    public static int getSize() {
        System.out.println( size);
        return size;
    }

    public static int[] printArray() {
        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);
        return array;
    }
    public static int [] delete( int index) {
        int b[] = new int[size - 1];
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
    public static void insert(int element){
    int c[]=new int[size+1];
    size++;
    for( int i=0; i<c.length-1; i++)
        c[i]=array[i];
    c [ size-1 ]= element;
    array=c;
    }

    public static void insertAtIndex(int index, int element ){
     int c[]=new int[size+1];
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

    public static void update(int index, int element ){
        if( index < size ){
            array[index]=element;
        }else {
            System.out.println(" the index is not correct");
        }
    }
    public static void read(int index){
        System.out.println(array[index]);
    }
    public static int find(int element ){
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
