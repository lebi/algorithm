package _468_ValidateIPAddress;

/**
 * Created by hzhuangyan1 on 2017/12/27.
 */
class Solution {
    public String validIPAddress(String IP) {
        if(IP.endsWith(".") || IP.endsWith(":"))
            return  "Neither";
        String[] arr = IP.split("\\.");
        if(arr.length == 4){
            for(String str : arr){
                int value = 0;
                for(char c : str.toCharArray()){
                    if(c >= '0' && c <= '9'){
                        value = value * 10 + c - '0';
                        if(value <= 0 || value > 255){
                            return  "Neither";
                        }
                    }else
                        return  "Neither";
                }
                if(value <= 0 || value > 255){
                    return  "Neither";
                }
            }
            return "IPv4";
        }else {
            arr = IP.split(":");
            if(arr.length == 8){
                for(String str : arr){
                    long value = 0;
                    if(str.length() > 4)
                        return  "Neither";
                    for(char c : str.toLowerCase().toCharArray()){
                        if(c >= '0' && c <= '9'){
                            value = value * 16 + c - '0';
                        }else if( c >= 'a' && c <= 'f'){
                            value = value * 16 + c - 'a' + 10;
                        }else
                            return  "Neither";
                        if(value > 0xffff){
                            return  "Neither";
                        }
                    }
                    if(value <= 0 || value > 0xffff){
                        return  "Neither";
                    }
                }
                return "IPv6";
            }
        }
        return  "Neither";
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.validIPAddress("2001:0db8:85a3:00000:0:8A2E:0370:7334"));
    }
}