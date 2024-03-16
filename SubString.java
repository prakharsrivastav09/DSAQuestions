class Scratch {
    public static void main(String[] args) {
//        String s = "abcde";
//        for(int i =0; i<s.length(); i++){
//            for(int j =i+1; j<=s.length(); j++){
//                System.out.println(s.substring(i,j));
//            }
//        }
        String s = "abcd efgh ijkl mnop";
        String[] part = s.split(" ");
        for (int i =0; i<part.length; i++){
            System.out.println(part[i]);
        }


        
    }
}