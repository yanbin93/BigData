// ORM class for table 'goods'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Sat Apr 22 13:47:52 CST 2017
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class goods extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private Integer id;
  public Integer get_id() {
    return id;
  }
  public void set_id(Integer id) {
    this.id = id;
  }
  public goods with_id(Integer id) {
    this.id = id;
    return this;
  }
  private String goods_name;
  public String get_goods_name() {
    return goods_name;
  }
  public void set_goods_name(String goods_name) {
    this.goods_name = goods_name;
  }
  public goods with_goods_name(String goods_name) {
    this.goods_name = goods_name;
    return this;
  }
  private String goods_code;
  public String get_goods_code() {
    return goods_code;
  }
  public void set_goods_code(String goods_code) {
    this.goods_code = goods_code;
  }
  public goods with_goods_code(String goods_code) {
    this.goods_code = goods_code;
    return this;
  }
  private String goods_other;
  public String get_goods_other() {
    return goods_other;
  }
  public void set_goods_other(String goods_other) {
    this.goods_other = goods_other;
  }
  public goods with_goods_other(String goods_other) {
    this.goods_other = goods_other;
    return this;
  }
  private Integer products_id;
  public Integer get_products_id() {
    return products_id;
  }
  public void set_products_id(Integer products_id) {
    this.products_id = products_id;
  }
  public goods with_products_id(Integer products_id) {
    this.products_id = products_id;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof goods)) {
      return false;
    }
    goods that = (goods) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.goods_name == null ? that.goods_name == null : this.goods_name.equals(that.goods_name));
    equal = equal && (this.goods_code == null ? that.goods_code == null : this.goods_code.equals(that.goods_code));
    equal = equal && (this.goods_other == null ? that.goods_other == null : this.goods_other.equals(that.goods_other));
    equal = equal && (this.products_id == null ? that.products_id == null : this.products_id.equals(that.products_id));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.goods_name = JdbcWritableBridge.readString(2, __dbResults);
    this.goods_code = JdbcWritableBridge.readString(3, __dbResults);
    this.goods_other = JdbcWritableBridge.readString(4, __dbResults);
    this.products_id = JdbcWritableBridge.readInteger(5, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(goods_name, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(goods_code, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(goods_other, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(products_id, 5 + __off, 4, __dbStmt);
    return 5;
  }
  public void readFields(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.id = null;
    } else {
    this.id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.goods_name = null;
    } else {
    this.goods_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.goods_code = null;
    } else {
    this.goods_code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.goods_other = null;
    } else {
    this.goods_other = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.products_id = null;
    } else {
    this.products_id = Integer.valueOf(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.id);
    }
    if (null == this.goods_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, goods_name);
    }
    if (null == this.goods_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, goods_code);
    }
    if (null == this.goods_other) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, goods_other);
    }
    if (null == this.products_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.products_id);
    }
  }
  private final DelimiterSet __outputDelimiters = new DelimiterSet((char) 1, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(id==null?"null":"" + id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(goods_name==null?"null":goods_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(goods_code==null?"null":goods_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(goods_other==null?"null":goods_other, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(products_id==null?"null":"" + products_id, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  private final DelimiterSet __inputDelimiters = new DelimiterSet((char) 1, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str;
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.id = null; } else {
      this.id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.goods_name = null; } else {
      this.goods_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.goods_code = null; } else {
      this.goods_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.goods_other = null; } else {
      this.goods_other = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.products_id = null; } else {
      this.products_id = Integer.valueOf(__cur_str);
    }

  }

  public Object clone() throws CloneNotSupportedException {
    goods o = (goods) super.clone();
    return o;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("goods_name", this.goods_name);
    __sqoop$field_map.put("goods_code", this.goods_code);
    __sqoop$field_map.put("goods_other", this.goods_other);
    __sqoop$field_map.put("products_id", this.products_id);
    return __sqoop$field_map;
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("id".equals(__fieldName)) {
      this.id = (Integer) __fieldVal;
    }
    else    if ("goods_name".equals(__fieldName)) {
      this.goods_name = (String) __fieldVal;
    }
    else    if ("goods_code".equals(__fieldName)) {
      this.goods_code = (String) __fieldVal;
    }
    else    if ("goods_other".equals(__fieldName)) {
      this.goods_other = (String) __fieldVal;
    }
    else    if ("products_id".equals(__fieldName)) {
      this.products_id = (Integer) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
}
