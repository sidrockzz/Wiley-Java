public class hierarchical_inher_Sid extends grandparent1{
    public static void main(String [] args){
        Multi_level_Sid m = new Multi_level_Sid();
        m.hairs();
        m.nose();
    }
}
class grandparent1{
    void nose(){
        System.out.println("nose");
    }
}
class parent2 extends grandparent1{
    void hairs(){
        System.out.println("parents hairs");
    }
}