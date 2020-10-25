package jpashop.domain;

/**
 * Created by holyeye on 2014. 3. 15..
 */
public class OrderSearch {

    private String memberName;      //회원 이름
    private jpashop.domain.OrderStatus orderStatus;//주문 상태

    //Getter, Setter
    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public jpashop.domain.OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(jpashop.domain.OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }
}
