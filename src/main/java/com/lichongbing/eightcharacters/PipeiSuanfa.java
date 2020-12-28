package com.lichongbing.eightcharacters;

/**
 * @author lichongbing
 * @email 873610008@qq.com
 * @date 2020/08/22 13:13
 */
public class PipeiSuanfa {
    /*
"子子","子丑","子寅","子卯",子辰","子巳","子午","子未","子申","子酉","子戌","子亥 "丑子","丑丑","丑寅","丑卯","丑辰","丑巳","丑午丑未","丑申","丑酉","丑戌","丑亥",
"寅子","寅丑","寅寅","寅卯","寅辰","寅巳","寅午","寅未","寅申","寅酉","寅戌","寅亥",
"卯子","卯丑","卯寅","卯卯","卯辰","卯巳","卯午","卯未","卯申","卯酉","卯戌","卯亥",
"辰子","辰丑","辰寅","辰卯","辰辰","辰巳","辰午","辰未","辰申","辰酉","辰戌","辰亥",
"巳子","巳丑","巳寅","巳卯","巳辰","巳巳","巳午","巳未","巳申","巳酉","巳戌","巳亥",
"午子","午丑","午寅","午卯","午辰","午巳","午午","午未","午申","午酉","午戌","午亥",
"未子","未丑","未寅","未卯","未辰","未巳","未午","未未","未申","未酉","未戌","未亥",
"申子","申丑","申寅","申卯","申辰","申巳","申午","申未","申申","申酉","申戌","申亥",
"酉子","酉丑","酉寅","酉卯","酉辰","酉巳","酉午","酉未","酉申","酉酉","酉戌","酉亥",
"戌子","戌丑","戌寅","戌卯","戌辰","戌巳","戌午","戌未","戌申","戌酉","戌戌","戌亥",
"亥子","亥丑","亥寅","亥卯","亥辰","亥巳","亥午","亥未","亥申","亥酉","亥戌","亥亥"
5,7,5,3,5,1,0,0,5,0,5,5,7,5,5,5,0,5,0,5,5,5,5,5 5,5,5,6,5,5,5,5,0,1,5,6,3,5,6,6,0,5,3,5,1,0,8,5,5,0,5,0,4,5,5,5,5,9,
0,5,1,5,5,5,5,5,5,5,5,6,5,0,0,0,5,3,5,5,4,10,5,5,6,1,0,5,5,5,5,5,10,5,5,5,3,5,5,5,0,1,5,5,5,5,5,5,5,0,0,5,1,0,9,6,5,5,5,4,0,5,5,5,5,8,0,5,6,3,5,0,5,5,5,5,6,5,5,0,1,5,0,5,5,4
*
*/
    static String [] peiduitiangan=new String[]{"甲甲","甲乙","甲丙","甲丁","甲戊","甲己","甲庚","甲辛","甲壬","甲癸","乙甲","乙乙","乙丙","乙丁", "乙戊","乙己","乙庚","乙辛","乙壬","乙癸","丙甲","丙乙","丙丙","丙丁","丙戊","丙己","丙庚","丙辛","丙壬","丙癸","丁甲","丁乙","丁丙","丁丁","丁戊","丁己","丁庚", "丁辛","丁壬","丁癸","戊甲","戊乙","戊丙","戊丁","戊戊","戊己","戊庚","戊辛","戊壬","戊癸","己甲","己乙","己丙","己丁","己戊","己己","己庚","己辛", "己壬","己癸","庚甲","庚乙","庚丙","庚丁","庚戊","庚己","庚庚","庚辛","庚壬","庚癸","辛甲","辛乙","辛丙","辛丁","辛戊","辛己","辛庚","辛辛","辛壬", "辛癸","壬甲","壬乙","壬丙","壬丁","壬戊","壬己","壬庚","壬辛","壬壬","壬癸","癸甲","癸乙","癸丙","癸丁","癸戊","癸己","癸庚","癸辛","癸壬","癸癸"};
    static int [] fenshusnans= new int[]{5,6,4,5,5,10,1,2,8,9,6, 7,5,4,9,3,9,1,8,2,8,9,7,6,5,4,3,10,1,2,8,5,6,7,4,3,7,4,9,1,5,6,8,9,7,5,6,4,5,10,7,6,7,6,6,7,4,3,8,4,7,10,4,5,6,5,7,6,3,3,7,6,7,6,6,5,6,7,3,3,3,3,4,7,5,5,8,5,7,5,4, 3,8,7,6,5,6,5,6,7};
    static int [] fenshusnvs= new int[]{5,6,8,8,5,7,7,7,3,4,6,7,9,5,6,6,10,6,3,3,4,5,7,6,8,7,4,7,4,8,5,4,6,7,9,6,5,6,7,7,5,9,5,4,7,6,6,6,5,6,10,3,4,3,5,7,5,5,5,5,1,9,3,7,6,4,7,6,8,6,2,1,10,4,4,3,6,7,5,5,8,8,1,9,5,8,3,3,7,6,9,2,2,1, 10,4,3,3,5,7};
    static String [] peiduidizhi=new String[]{"子子","子丑","子寅","子卯","子辰","子巳","子午","子未","子申","子酉","子戌","子亥","丑子","丑丑","丑寅","丑卯","丑辰","丑巳","丑午","丑未","丑申","丑酉","丑戌","丑亥", "寅子","寅丑","寅寅","寅卯","寅辰","寅巳","寅午","寅未","寅申","寅酉","寅戌","寅亥", "卯子","卯丑","卯寅","卯卯","卯辰","卯巳","卯午","卯未","卯申","卯酉","卯戌","卯亥", "辰子","辰丑","辰寅","辰卯","辰辰","辰巳","辰午","辰未","辰申","辰酉","辰戌","辰亥", "巳子","巳丑","巳寅","巳卯","巳辰","巳巳","巳午","巳未","巳申","巳酉","巳戌","巳亥", "午子","午丑","午寅","午卯","午辰","午巳","午午","午未","午申","午酉","午戌","午亥", "未子","未丑","未寅","未卯","未辰","未巳","未午","未未","未申","未酉","未戌","未亥", "申子","申丑","申寅","申卯","申辰","申巳","申午","申未","申申","申酉","申戌","申亥", "酉子","酉丑","酉寅","酉卯","酉辰","酉巳","酉午","酉未","酉申","酉酉","酉戌","酉亥", "戌子","戌丑","戌寅","戌卯","戌辰","戌巳","戌午","戌未","戌申","戌酉","戌戌","戌亥", "亥子","亥丑","亥寅","亥卯","亥辰","亥巳","亥午","亥未","亥申","亥酉","亥戌","亥亥"};
    static int [] fenshudizhis= new int[]{5,7,5,3,5,1,0,0,5,0,5,5,7,5,5,5,0,5,0,5,5,5,5,5,5,5,5,6,5,5,5,5,0,1,5,6,3,5,6,6,0,5,3,5,1,0,8,5,5,0,5,0,4,5,5,5,5,9,0,5,1,5,5,5,5,5,5,5,5,6,5,0,0,0,5,3,5,5,4,10,5,5,6,1,0,5,5,5,5,5,10,5,5,5,3,5,5,5,0,1,5,5,5,5,5,5,5,0,0,5,1,0,9,6,5,5,5,4,0,5,5,5,5,8,0,5,6,3,5,0,5,5,5,5,6,5,5,0,1,5,0,5,5,4};

    public static int getIndex(String[] arr, String value) {
        for (int i = 0; i < arr.length; i++) {
            if (value.equals(arr[i])) {
                return i;
            }
        }
        return -1;//如果未找到返回-1
    }


    public  int getHehunzhishu(String bazi1,String  bazi2){
    /*
    *
    *
    */
//    StringBuilder stringBuilder = null;
//    String tiangan=bazi1.substring(0, 1);
//    String dizhi=bazi2.substring(0, 1);
//        stringBuilder.append(tiangan);
//        stringBuilder.append(dizhi);
//        StringBuilder append = stringBuilder;
//        System.out.println(append);
    String nianganpeidui=bazi1.substring(0,1)+bazi2.substring(0,1);
 //       System.out.println(nianganpeidui);
    String yueganpeidui=bazi1.substring(2,3)+bazi2.substring(2,3);
    String riganpeidui=bazi1.substring(4,5)+bazi2.substring(4,5);
    String shiganpeidui=bazi1.substring(6,7)+bazi2.substring(6,7);
    String nianzhipeidui=bazi1.substring(1,2)+bazi2.substring(1,2);
        //System.out.println(nianganpeidui);
    String yuezhipeidui=bazi1.substring(3,4)+bazi2.substring(3,4);
    String rizhipeidui=bazi1.substring(5,6)+bazi2.substring(5,6);
    String shizhipeidui=bazi1.substring(7,8)+bazi2.substring(7,8);
//        System.out.println(shizhipeidui);
//    int nianganpeiduifenshu =fenshusnans[getIndex(peiduitiangan, nianganpeidui)];
//        int fenshusnan1 = fenshusnans[getIndex(peiduitiangan, nianganpeidui)];
//        int fenshusnan2 = fenshusnans[getIndex(peiduitiangan, yueganpeidui)];
//        int fenshusnan3 = fenshusnans[getIndex(peiduitiangan, riganpeidui)];
//        int fenshusnan4 = fenshusnans[getIndex(peiduitiangan, shiganpeidui)];
//        int  fenshusnan5 = fenshudizhis[getIndex(peiduidizhi, nianzhipeidui)];
//        int  fenshusnan6 = fenshudizhis[getIndex(peiduidizhi, yuezhipeidui)];
//        int  fenshusnan7 = fenshudizhis[getIndex(peiduidizhi, rizhipeidui)];
//        int  fenshusnan8 = fenshudizhis[getIndex(peiduidizhi, shizhipeidui)];
//        System.out.println(fenshusnan1);
//        System.out.println(fenshusnan2);
//        System.out.println(fenshusnan3);
//        System.out.println(fenshusnan4);
//        System.out.println(fenshusnan5);
//        System.out.println(fenshusnan6);
//        System.out.println(fenshusnan7);
//        System.out.println(fenshusnan8);
        //int i = getIndex(peiduitiangan, nianganpeidui);
        //System.out.println(i);
        //System.out.println(fenshusnans[getIndex(peiduitiangan, nianganpeidui)]);

        int hehunzhishu = fenshusnans[getIndex(peiduitiangan, nianganpeidui)]+fenshusnans[getIndex(peiduitiangan,
            yueganpeidui)]+fenshusnans[getIndex(peiduitiangan, riganpeidui)]+fenshusnans[getIndex(peiduitiangan,
            shiganpeidui)]+fenshudizhis[getIndex(peiduidizhi, nianzhipeidui)] +fenshudizhis[getIndex(peiduidizhi,
            yuezhipeidui)] +fenshudizhis[getIndex(peiduidizhi, rizhipeidui)] +fenshudizhis[getIndex(peiduidizhi, shizhipeidui)]+20;

    return hehunzhishu;
    }

// 查询符合条件的美女的八字

//    public Map<Integer,String > getBazis(Boolean sex) throws SQLException, ClassNotFoundException {
//    /*
//    *
//    *
//    */
//        List<User> users = gettAllUser();
//
//        return null;
//    }

    //登录名
   // private static String username="root";
    //登录密码
  //  private static String password="lcb369";
    //连接数据库地址
//    private static String url="jdbc:mysql://47.108.130.77:3306/mingyuan?useSSL=false&serverTimezone=UTC";
//    private static String driver="com.mysql.jdbc.Driver";
//    //参数
//    private static Connection con=null;
//    private static PreparedStatement ps=null;
//    private static ResultSet rs=null;

  //  public static List<User> gettAllUser() throws ClassNotFoundException, SQLException {
        //在用list来获取

        //获取 jdbc.driver包-驱动类
   //     Class.forName(driver);
        //获取数据库表列名
    //    Connection con = DriverManager.getConnection(url, username, password);
    //    Statement st = con.createStatement();
       // boolean execute = st.execute("SELECT*FROM user WHERE user.sex= 1 ");
        //System.out.println(execute);
        //执行查询语句

     //   ResultSet rs = st.executeQuery("SELECT*FROM user WHERE sex= 0");
      //  System.out.println( rs.next());
        //实例User类

    //    User user = null;
        //遍历
  //      while (rs.next()) {
      //      user = new User();
//            user.setSex(rs.getInt("sex"));
//            user.setId(rs.getInt("id"));
//            user.setName(rs.getString("name"));
//            user.setBazi(rs.getString("bazi"));
//            user.setAge(rs.getInt("age"));
//            users.add(user);
//        }
//        rs.close();
//        st.close();
//        con.close();
//        return users;
//    }

}








