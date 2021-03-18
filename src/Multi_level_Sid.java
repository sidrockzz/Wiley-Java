class grandparent{
    void nose(){
        System.out.println("nose");
    }
}
class parent1 extends grandparent{
    void hairs(){
        System.out.println("parents hairs");
    }
}
public class Multi_level_Sid extends parent1{
public static void main(String [] args){
    Multi_level_Sid m = new Multi_level_Sid();
    m.hairs();
    m.nose();
}
}
