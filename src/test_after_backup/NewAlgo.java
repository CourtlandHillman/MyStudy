
package test_after_backup;


public class NewAlgo {
    
    public static void main (String args []){
        int [] station = {0 , 200 , 375 , 550 , 750 , 950  };
        
       // System.out.println(minStops(station, 400));
        
    }
    
    // return -1 if it's imposible  to get from A to B
//    public static int minStops(int[] station , int capacity ){
//        int result = 0 ;// optimalnoe kolichestvo ostanovok
//        int currentStop = 0;
//        
//        while(currentStop < station.length - 1){
//            int nextStop = currentStop;
//            
//            while(nextStop < station.length  - 1 && station[nextStop + 1] - station[currentStop ] <= capacity)
//                
//                nextStop++;
//                
//                if(currentStop == nextStop)
//                    return  -1;
//                if(nextStop < station.length-1)
//                   result++;
//                
//                currentStop = nextStop;
//        
//        
// }
//        return result;
//    
//    
//}

    public  static  int minStop(int [] station , int capacity){
        int currentStop = 0;
        int result = 0;
        
        while(currentStop < station.length -1){
            int nextStop = 0;
            
            while (nextStop < station.length - 1 && station[nextStop + 1] - station[currentStop] <= capacity) 
                nextStop++;
                
                if(currentStop == nextStop)
                   return -1;
                
                if(nextStop < station.length - 1)
                    result++;
                
                currentStop = nextStop;
            
        }
        return result;
        
        
    }
    
    
    
    
    
}