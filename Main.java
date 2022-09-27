import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        wallet wallet= new wallet(1,1234,"vu van dung",1234342335);

       ArrayList <item>items = new ArrayList<>();
        item item1=new item(1,"thuốc sâu",1233434.8,"hết hạn sử dụng");
        item item2=new item(2,"bàn trải điện ",234432124.8,"chạy bằng cơm");
        items.add(item1);
        items.add(item2);
        item item3=null;
        for (item item :items
             ) {
            System.out.println(item.toString());
        }
        System.out.println("nhập id sản phẩm");
        String chonSp = scanner.nextLine();
        for (item item :items){
            if(item.getId() == Integer.parseInt(chonSp)){
                item3=item;
                break;
            }else {
                System.out.println("sản phẩm bạn đã chọn không có");
                System.exit(0);
            }

        }

        System.out.println("sản phẩm bạn đã chọn");
        System.out.println(item2.toString());
        System.out.println("nhập thông tin khách hàng ");
        System.out.println("nhập tên");
        String name=scanner.nextLine();
        System.out.println("nhập địa chỉ");
        String diachi=scanner.nextLine();
        System.out.println("nhâp sdt");
        int sdt=scanner.nextInt();
        customer customer=new customer(1,name,sdt,diachi);
        System.out.println("nhập số lượng cần mua");
        int soluong= scanner.nextInt();
        order order=new order(1, customer.getId(),soluong, LocalDate.now(),item3);

        System.out.println("thông tin đơn hàng");
        double tt=item3.getPrice()*soluong;
        System.out.println("ten : "+customer.getName() +"\n"+"sdt : " +customer.getPhone()+"\n"+"dia chi : "+customer.getAddress()
                +"\n"+"so luong : "+soluong +"\n"+"tổng tiền:"+tt +"\n"+ "số tiền còn lại trong wallet là : "+(wallet.amount-tt ));


















    }
}
