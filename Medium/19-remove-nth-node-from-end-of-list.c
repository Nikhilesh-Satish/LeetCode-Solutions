/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* removeNthFromEnd(struct ListNode* head, int n) {
    
    struct ListNode* ptr=head;
    struct ListNode* p;
    int count=0,count1=0;
    while(ptr!=NULL)
    {
        ptr=ptr->next;
        count++;
    }

    if(n==1 && count==1)
    {
        return NULL;
    }
    

    count=count-n;
    if(count==0)
    {
        return (head->next);
    }
    
    ptr=head;
    while(ptr->next!=NULL)
    {
        
        count1++;
        if(count1==count)
        {
            p=ptr->next;
            ptr->next=p->next;
            break;
        }
        
        ptr=ptr->next;
    }


    return head;
}