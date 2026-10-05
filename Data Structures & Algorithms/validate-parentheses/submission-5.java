class Solution {
    public static boolean isValid(String s) {
    if (s.length() > 1 && s.length() <= 1000) {
        Map<String, String> closedOpen = new HashMap<>();
        closedOpen.put("}", "{");
        closedOpen.put(")", "(");
        closedOpen.put("]", "[");
        
        Stack<String> parentisisStack = new Stack<>();
        String[] inputArray = s.split("");
        
        for (int i = 0; i <= inputArray.length - 1; i++) {
            String current = inputArray[i];
            var data = closedOpen.get(current);
            
            if (data == null) {
                // It's an opening bracket, push to stack
                parentisisStack.push(current);
            } else {
                // It's a closing bracket. 
                // CRITICAL FIX: Check if stack is empty before calling peek()
                if (parentisisStack.empty() || !parentisisStack.peek().equals(data)) {
                    return false; 
                }
                parentisisStack.pop();
            }
        }
        return parentisisStack.empty();
    } else {
        return false;
    }
}

}
