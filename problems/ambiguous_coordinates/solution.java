class Solution {
    public List<String> helper (String s) {
        
        List<String> answer = new ArrayList<> ();
        
        if (s.length () == 1) {
            answer.add (s);
            return answer;
        }
        else if (s.charAt (0) == '0' && s.charAt (s.length () - 1) == '0') {
            return answer;
        }
        else if (s.charAt (0) == '0') {
            StringBuilder sb = new StringBuilder ();
            sb.append (s.charAt (0)).append (".").append (s.substring (1));
            answer.add (sb.toString ());
            return answer;
        }
        else if (s.charAt (s.length () - 1) == '0') {
            answer.add (s);
            return answer;
        }
        
        answer.add (s);
        
        for (int i = 1; i < s.length (); i++) {
            StringBuilder sb = new StringBuilder ();
            sb.append (s.substring (0, i)).append (".").append (s.substring (i));
            answer.add (sb.toString ());
        }
        
        return answer;
    }
    
    public List<String> ambiguousCoordinates(String s) {
        
        List<String> answer = new ArrayList<> ();
        
        for (int i = 2; i < s.length () - 1; i++) {
            List<String> leftLists = helper (s.substring (1, i));
            List<String> rightLists = helper (s.substring (i, s.length () - 1));
            
            for (String leftString : leftLists) {
                for (String rightString : rightLists) {
                    StringBuilder sb = new StringBuilder ();
                    sb.append ("(").append (leftString).append (", ").append (rightString).append (")");
                    answer.add (sb.toString ());
                }
            }
        }
        
        return answer;
    }
}