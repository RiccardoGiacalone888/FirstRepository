public class bankCount {
    private String count = "500000 $";
    private int code = 1030;
    private int insertCode;

    public void setInsertCode(int pin) {
        insertCode = pin;
    }

    public int getInsertCode() {
        return insertCode;
    }

    public String GetCount() {
        if (insertCode == code) {
            return count;
        } else {
            return "error code!";
        }
    }
}




