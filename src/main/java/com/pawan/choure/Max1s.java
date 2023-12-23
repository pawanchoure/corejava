package com.pawan.choure;

import org.apache.commons.lang3.StringUtils;

public class Max1s {
    private String orderId;


    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public static void main(String[] args){
      int[] nums = new int[]{1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        String order_id= "ABC_";
        String[] split = StringUtils.split(order_id,"_");
        Max1s m1= new Max1s();
        m1.setOrderId(split.length==0 ? order_id : split[0]);
        int counter=0;
        int result=0;
        for(int i : nums){
            if(i==1) {
                counter++;
            }
            else{
                counter=0;
            }
            if(counter>result){
                result=counter;
            }
        }
        return result;
    }
}
