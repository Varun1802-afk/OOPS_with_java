import java.util.*;

public class practice_LL {

    public static int findIndex(int key,int m,int i){
        // int index = (key%m + i)%m;  -> LINEAR PROBING
        int index = (key%m + i*i)%m; // Quadratic probing
        return index;
    }
    public static void main(String[]args){
        int[] arr = {10,22,31,4,15,28,17,88,59};
        int[] bucket = new int[11];
        Arrays.fill(bucket, -1);
        int i,done;
        for(int ele : arr){
            i=0;
            done=0;
            while(done == 0){
                int index = findIndex(ele,11,i);
                if(bucket[index] == -1){
                    bucket[index] = ele;
                    done = 1;
                }else{
                    i++;
                }
            }
        }

        for(i=0;i<11;i++){
            System.out.println("Bucket:["+i+"]:"+bucket[i]);
        }
        
    }
}


/*

INSERT KEYS: 10,22,31,4,15,28,17,88,59
into hash table sie m = 11
using linear probing, quadratic probing, double hasing
h2(K) = (1+ K*mod(m-1))


Linear probing : (h(K) + F(i)) % m
for linear probing F(i) = i [0,1,2,3,4,....n]

hash(K) = (K % m + i) % m

10 -> (10%11 + 0) % 11 -> 10
22 -> (22%11 + 0) % 11 -> 0
31 -> (31%11 + 0) % 11 -> 9
4  -> (4%11 + 0)  % 11 -> 4
15 -> (15%11 + 0) % 11 -> 4 (collision) **Value of i will increase**
15 -> (15%11 + 1) % 11 -> 5 
28 -> (28%11 + 0) % 11 -> 6
17 -> (17%11 + 0) % 11 -> 6 (collision) **Value of i will increase**
17 -> (17%11 + 1) % 11 -> 7
88 -> (88%11 + 0) % 11 -> 0 (collision)
88 -> (88%11 + 1) % 11 -> 1
59 -> (59%11)+ 0) % 11 -> 4 (collsion)
59 -> (59%11)+ 1) % 11 -> 5 (collsion)
59 -> (59%11)+ 2) % 11 -> 6 (collsion)
59 -> (59%11)+ 3) % 11 -> 7 (collsion)
59 -> (59%11)+ 4) % 11 -> 8 

0 : null        45 index = 45%10-> 5 65 65%10 -> 5            1 for insert 45 65 55       2 for delete 45 index -> 5  
1 : null
2 : null               
3 : null                                    3-> hashtable ->array of integer->hash function change
4 : null                                       1 -> hashtable -> array of linkedlist -> h1 = x%table size
5 : 55->65->45                  linkedlist.addfirst();  linkedlist.remove(value)
6 : null
7 : null
8 : null
9 : null



Quadratic Probing : K % m
*/