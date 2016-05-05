package zhujie;

/**
 * Created by licheng on 5/5/16.
 */
@Table("tb_test")
public class TableDto {

    @Deprecated
    private String tt;

    @Column("_id")
    private String _id;

    @Column("username")
    private String username;

    public TableDto(String _id, String username) {
        this._id = _id;
        this.username = username;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
