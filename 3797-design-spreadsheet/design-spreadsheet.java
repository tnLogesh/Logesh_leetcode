class Spreadsheet {
    Map<String,Integer>cells=new HashMap<>();
    public Spreadsheet(int rows) {
        
    }
    
    public void setCell(String cell, int value) {
        cells.put(cell,value);
    }
    
    public void resetCell(String cell) {
        cells.remove(cell);
    }
    
    public int getValue(String formula) {
        int index=formula.indexOf('+');
        String left=formula.substring(1,index);
        String right=formula.substring(index+1);
        int leftVal=Character.isLetter(left.charAt(0))?cells.getOrDefault(left,0):Integer.valueOf(left);
        int rightVal=Character.isLetter(right.charAt(0))?cells.getOrDefault(right,0):Integer.valueOf(right);
        return leftVal+rightVal;
    }
}

/**
 * Your Spreadsheet object will be instantiated and called as such:
 * Spreadsheet obj = new Spreadsheet(rows);
 * obj.setCell(cell,value);
 * obj.resetCell(cell);
 * int param_3 = obj.getValue(formula);
 */