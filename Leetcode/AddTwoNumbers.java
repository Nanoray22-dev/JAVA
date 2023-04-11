package Leetcode;

public class AddTwoNumbers {
    int val;
    AddTwoNumbers next;
    AddTwoNumbers() {}
    AddTwoNumbers(int val) { this.val = val; }
    AddTwoNumbers(int val, AddTwoNumbers next) { this.val = val; this.next = next; }

    public AddTwoNumbers addTwoNumbers(AddTwoNumbers l1, AddTwoNumbers l2){
        AddTwoNumbers dummyHead =  new AddTwoNumbers(0);
        AddTwoNumbers curr = dummyHead;
        int curry = 0;
        while(l1 != null || l2 != null){
            int x = ( l1 != null )? l1.val : 0;
            int y = (l2 != null)? l2.val : 0;
            int sum = curry + x + y;
            curry = sum / 10; 
            curr.next = new AddTwoNumbers(sum % 10);
            curr = curr.next;
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;

        }
        if (curry > 0 ){
            curr.next = new AddTwoNumbers(curry);
        }
        return dummyHead.next;
    }
}
