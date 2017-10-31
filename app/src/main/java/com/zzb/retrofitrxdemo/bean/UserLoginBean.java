package com.zzb.retrofitrxdemo.bean;

/**
 * Created by 张梓彬 on 2017/10/31 0031.
 */

public class UserLoginBean {

    /**
     * ret_code : 0
     * ret_msg : 成功
     * ret_data : {"id":175773,"userId":"student222","userName":"赵同学","realName":"赵同学","birthDay":"2017/10/1 0:00:00","sex":"保密","userFace":"/LocalFiles/UserIcon/2017/10/20171020122416.jpg","schoolId":"1","schoolName":"外地用户","signatrueName":"是否打算","sid":"18521376204","uscore":"0.0000","roleid":"","userGuid":"0","useremail":"","LastLoginTime":"2017/10/31 10:04:55","U_VipScore":"","InTime":"2017/7/26 14:21:00","UserDepID":1,"u_classid":"0","hjyid":"0","LoginTimes":"339","dutyId":"1","jifenSoft":"80","xfbnSoft":"56","gyzSoft":"0","classId":0}
     */

    private String ret_code;
    private String ret_msg;
    private RetDataBean ret_data;

    public String getRet_code() {
        return ret_code;
    }

    public void setRet_code(String ret_code) {
        this.ret_code = ret_code;
    }

    public String getRet_msg() {
        return ret_msg;
    }

    public void setRet_msg(String ret_msg) {
        this.ret_msg = ret_msg;
    }

    public RetDataBean getRet_data() {
        return ret_data;
    }

    public void setRet_data(RetDataBean ret_data) {
        this.ret_data = ret_data;
    }

    public static class RetDataBean {
        /**
         * id : 175773
         * userId : student222
         * userName : 赵同学
         * realName : 赵同学
         * birthDay : 2017/10/1 0:00:00
         * sex : 保密
         * userFace : /LocalFiles/UserIcon/2017/10/20171020122416.jpg
         * schoolId : 1
         * schoolName : 外地用户
         * signatrueName : 是否打算
         * sid : 18521376204
         * uscore : 0.0000
         * roleid :
         * userGuid : 0
         * useremail :
         * LastLoginTime : 2017/10/31 10:04:55
         * U_VipScore :
         * InTime : 2017/7/26 14:21:00
         * UserDepID : 1
         * u_classid : 0
         * hjyid : 0
         * LoginTimes : 339
         * dutyId : 1
         * jifenSoft : 80
         * xfbnSoft : 56
         * gyzSoft : 0
         * classId : 0
         */

        private int id;
        private String userId;
        private String userName;
        private String realName;
        private String birthDay;
        private String sex;
        private String userFace;
        private String schoolId;
        private String schoolName;
        private String signatrueName;
        private String sid;
        private String uscore;
        private String roleid;
        private String userGuid;
        private String useremail;
        private String LastLoginTime;
        private String U_VipScore;
        private String InTime;
        private int UserDepID;
        private String u_classid;
        private String hjyid;
        private String LoginTimes;
        private String dutyId;
        private String jifenSoft;
        private String xfbnSoft;
        private String gyzSoft;
        private int classId;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getRealName() {
            return realName;
        }

        public void setRealName(String realName) {
            this.realName = realName;
        }

        public String getBirthDay() {
            return birthDay;
        }

        public void setBirthDay(String birthDay) {
            this.birthDay = birthDay;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public String getUserFace() {
            return userFace;
        }

        public void setUserFace(String userFace) {
            this.userFace = userFace;
        }

        public String getSchoolId() {
            return schoolId;
        }

        public void setSchoolId(String schoolId) {
            this.schoolId = schoolId;
        }

        public String getSchoolName() {
            return schoolName;
        }

        public void setSchoolName(String schoolName) {
            this.schoolName = schoolName;
        }

        public String getSignatrueName() {
            return signatrueName;
        }

        public void setSignatrueName(String signatrueName) {
            this.signatrueName = signatrueName;
        }

        public String getSid() {
            return sid;
        }

        public void setSid(String sid) {
            this.sid = sid;
        }

        public String getUscore() {
            return uscore;
        }

        public void setUscore(String uscore) {
            this.uscore = uscore;
        }

        public String getRoleid() {
            return roleid;
        }

        public void setRoleid(String roleid) {
            this.roleid = roleid;
        }

        public String getUserGuid() {
            return userGuid;
        }

        public void setUserGuid(String userGuid) {
            this.userGuid = userGuid;
        }

        public String getUseremail() {
            return useremail;
        }

        public void setUseremail(String useremail) {
            this.useremail = useremail;
        }

        public String getLastLoginTime() {
            return LastLoginTime;
        }

        public void setLastLoginTime(String LastLoginTime) {
            this.LastLoginTime = LastLoginTime;
        }

        public String getU_VipScore() {
            return U_VipScore;
        }

        public void setU_VipScore(String U_VipScore) {
            this.U_VipScore = U_VipScore;
        }

        public String getInTime() {
            return InTime;
        }

        public void setInTime(String InTime) {
            this.InTime = InTime;
        }

        public int getUserDepID() {
            return UserDepID;
        }

        public void setUserDepID(int UserDepID) {
            this.UserDepID = UserDepID;
        }

        public String getU_classid() {
            return u_classid;
        }

        public void setU_classid(String u_classid) {
            this.u_classid = u_classid;
        }

        public String getHjyid() {
            return hjyid;
        }

        public void setHjyid(String hjyid) {
            this.hjyid = hjyid;
        }

        public String getLoginTimes() {
            return LoginTimes;
        }

        public void setLoginTimes(String LoginTimes) {
            this.LoginTimes = LoginTimes;
        }

        public String getDutyId() {
            return dutyId;
        }

        public void setDutyId(String dutyId) {
            this.dutyId = dutyId;
        }

        public String getJifenSoft() {
            return jifenSoft;
        }

        public void setJifenSoft(String jifenSoft) {
            this.jifenSoft = jifenSoft;
        }

        public String getXfbnSoft() {
            return xfbnSoft;
        }

        public void setXfbnSoft(String xfbnSoft) {
            this.xfbnSoft = xfbnSoft;
        }

        public String getGyzSoft() {
            return gyzSoft;
        }

        public void setGyzSoft(String gyzSoft) {
            this.gyzSoft = gyzSoft;
        }

        public int getClassId() {
            return classId;
        }

        public void setClassId(int classId) {
            this.classId = classId;
        }
    }
}
