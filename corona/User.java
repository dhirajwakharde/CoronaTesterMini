/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corona;

/**
 *
 * @author DHANASHREE
 */
class User {
    private String name,gender,prof,travel,sym,dis,inter,intra,tr;
    private int age;
    private long  mob_no;
    public User(String name,long mob_no,int age,String gender,String prof,String travel,String sym,String dis,String inter,String intra,String tr)
    {
        this.name=name;
        this.mob_no=mob_no;
        this.age=age;
        this.gender=gender;
        this.prof=prof;
        this.travel=travel;
        this.sym=sym;
        this.dis=dis;
        this.inter=inter;
        this.intra=intra;
        this.tr=tr;
    }
//    public User(String name,long mob_no,int age,String gender,String prof,String travel)
//    {
//        this.name=name;
//        this.mob_no=mob_no;
//        this.age=age;
//        this.gender=gender;
//        this.prof=prof;
//        this.travel=travel;
////        this.sym=sym;
////        this.dis=dis;
////        this.inter=inter;
////        this.intra=intra;
////        this.tr=tr;
//    }
    public String getname()
    {
        return name;
    }
   public String getsymptoms()
    {
        return sym;
    }
    public String getdisease()
    {
        return dis;
    }
    public String getinternationaltravel()
    {
        return inter;
    }
    public String getinteraction()
    {
        return intra;
    }
    public String gettestresult()
    {
        return tr;
    }
    public String getgender()
    {
        return gender;
    }
    public String getprofession()
    {
        return prof;
    }
public String gettravel_history()
    {
        return travel;
    }
public int getage()
    {
        return age;
    }
public long getmob_no()
    {
        return mob_no;
    }


}
