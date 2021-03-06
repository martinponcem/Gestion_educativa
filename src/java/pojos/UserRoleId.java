package pojos;
// Generated 25/09/2016 04:58:35 AM by Hibernate Tools 4.3.1



/**
 * UserRoleId generated by hbm2java
 */
public class UserRoleId  implements java.io.Serializable {


     private int roleId;
     private String usrId;

    public UserRoleId() {
    }

    public UserRoleId(int roleId, String usrId) {
       this.roleId = roleId;
       this.usrId = usrId;
    }
   
    public int getRoleId() {
        return this.roleId;
    }
    
    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }
    public String getUsrId() {
        return this.usrId;
    }
    
    public void setUsrId(String usrId) {
        this.usrId = usrId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof UserRoleId) ) return false;
		 UserRoleId castOther = ( UserRoleId ) other; 
         
		 return (this.getRoleId()==castOther.getRoleId())
 && ( (this.getUsrId()==castOther.getUsrId()) || ( this.getUsrId()!=null && castOther.getUsrId()!=null && this.getUsrId().equals(castOther.getUsrId()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getRoleId();
         result = 37 * result + ( getUsrId() == null ? 0 : this.getUsrId().hashCode() );
         return result;
   }   


}


