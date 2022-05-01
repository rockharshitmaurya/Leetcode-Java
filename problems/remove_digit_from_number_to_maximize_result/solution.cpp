class Solution {
public:
    string removeDigit(string number, char digit) {
             int i; 
        for(i=0;i<number.length()-1;i++) 
        { 
            if(number[i]==digit) 
            { 
                if(number[i+1]>number[i]) 
                { 
                    number.erase(number.begin()+i); 
                    return number; 
                } 
            } 
        } 
        while(true) 
        { 
            if(number[i]==digit) 
            { 
                number.erase(number.begin()+i); 
                break; 
            } 
            i--; 
        } 
        return number; 
        //testing code
        
//         for (int initialPos=0; initialPos<A.size(); initialPos++) {

//         // iterate on liste size, start on full list and then decrease size
//         for (int currentListSize=A.size()-initialPos; currentListSize>0; currentListSize--) {

//             //initialize current list.
//             List<Integer> currentList = new ArrayList<Integer>();

//             // iterate on each (corresponding) int of global list
//             for ( int i = 0; i<currentListSize; i++) {
//                 currentList.add(A.get(initialPos+i));
//             }

//             // insure unicity
//             if (!listOfUniqueList.contains(currentList)){
//                 listOfUniqueList.add(currentList);                      
//             } else {
//                 continue;
//             }
//         }
    }
};