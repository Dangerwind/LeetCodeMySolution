class Solution {
    public String simplifyPath(String path) {
    

        String[] command = path.split("/");

        List<String> strLst = new ArrayList<>(Arrays.asList(command));

        var retStr = new StringBuilder();

        System.out.println(Arrays.toString(command));

        int pointer = 0;
        while(pointer < strLst.size()) {


            if (strLst.get(pointer).equals(".") || strLst.get(pointer).equals("")) {
                strLst.remove(pointer);
            }
            else {
                if (strLst.get(pointer).equals("..")) {
                    strLst.remove(pointer);
                    if (pointer > 0) {
                        strLst.remove(pointer - 1);
                    }
                    pointer = 0;
                } else {
                    pointer++;
                }
            }
        }

        boolean changeFlag = false;
        for (String str : strLst) {
            if (!str.isEmpty()) {
                retStr.append("/");
                retStr.append(str);
                changeFlag = true;
            }
        }

        if (!changeFlag) {
            retStr.append("/");
        }

        return retStr.toString();
        
    }
}
