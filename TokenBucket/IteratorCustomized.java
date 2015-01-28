package TokenBucket;

import java.util.Iterator;

public interface IteratorCustomized<T> extends Iterator<T>
{
   void iterate(int n);
   T getdata();
}
