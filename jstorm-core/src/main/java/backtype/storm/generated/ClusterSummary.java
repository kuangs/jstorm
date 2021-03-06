/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package backtype.storm.generated;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-12-22")
public class ClusterSummary implements org.apache.thrift.TBase<ClusterSummary, ClusterSummary._Fields>, java.io.Serializable, Cloneable, Comparable<ClusterSummary> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ClusterSummary");

  private static final org.apache.thrift.protocol.TField NIMBUS_FIELD_DESC = new org.apache.thrift.protocol.TField("nimbus", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField SUPERVISORS_FIELD_DESC = new org.apache.thrift.protocol.TField("supervisors", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField TOPOLOGIES_FIELD_DESC = new org.apache.thrift.protocol.TField("topologies", org.apache.thrift.protocol.TType.LIST, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ClusterSummaryStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ClusterSummaryTupleSchemeFactory());
  }

  private NimbusSummary nimbus; // required
  private List<SupervisorSummary> supervisors; // required
  private List<TopologySummary> topologies; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NIMBUS((short)1, "nimbus"),
    SUPERVISORS((short)2, "supervisors"),
    TOPOLOGIES((short)3, "topologies");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // NIMBUS
          return NIMBUS;
        case 2: // SUPERVISORS
          return SUPERVISORS;
        case 3: // TOPOLOGIES
          return TOPOLOGIES;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NIMBUS, new org.apache.thrift.meta_data.FieldMetaData("nimbus", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, NimbusSummary.class)));
    tmpMap.put(_Fields.SUPERVISORS, new org.apache.thrift.meta_data.FieldMetaData("supervisors", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SupervisorSummary.class))));
    tmpMap.put(_Fields.TOPOLOGIES, new org.apache.thrift.meta_data.FieldMetaData("topologies", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TopologySummary.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ClusterSummary.class, metaDataMap);
  }

  public ClusterSummary() {
  }

  public ClusterSummary(
    NimbusSummary nimbus,
    List<SupervisorSummary> supervisors,
    List<TopologySummary> topologies)
  {
    this();
    this.nimbus = nimbus;
    this.supervisors = supervisors;
    this.topologies = topologies;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ClusterSummary(ClusterSummary other) {
    if (other.is_set_nimbus()) {
      this.nimbus = new NimbusSummary(other.nimbus);
    }
    if (other.is_set_supervisors()) {
      List<SupervisorSummary> __this__supervisors = new ArrayList<SupervisorSummary>(other.supervisors.size());
      for (SupervisorSummary other_element : other.supervisors) {
        __this__supervisors.add(new SupervisorSummary(other_element));
      }
      this.supervisors = __this__supervisors;
    }
    if (other.is_set_topologies()) {
      List<TopologySummary> __this__topologies = new ArrayList<TopologySummary>(other.topologies.size());
      for (TopologySummary other_element : other.topologies) {
        __this__topologies.add(new TopologySummary(other_element));
      }
      this.topologies = __this__topologies;
    }
  }

  public ClusterSummary deepCopy() {
    return new ClusterSummary(this);
  }

  @Override
  public void clear() {
    this.nimbus = null;
    this.supervisors = null;
    this.topologies = null;
  }

  public NimbusSummary get_nimbus() {
    return this.nimbus;
  }

  public void set_nimbus(NimbusSummary nimbus) {
    this.nimbus = nimbus;
  }

  public void unset_nimbus() {
    this.nimbus = null;
  }

  /** Returns true if field nimbus is set (has been assigned a value) and false otherwise */
  public boolean is_set_nimbus() {
    return this.nimbus != null;
  }

  public void set_nimbus_isSet(boolean value) {
    if (!value) {
      this.nimbus = null;
    }
  }

  public int get_supervisors_size() {
    return (this.supervisors == null) ? 0 : this.supervisors.size();
  }

  public java.util.Iterator<SupervisorSummary> get_supervisors_iterator() {
    return (this.supervisors == null) ? null : this.supervisors.iterator();
  }

  public void add_to_supervisors(SupervisorSummary elem) {
    if (this.supervisors == null) {
      this.supervisors = new ArrayList<SupervisorSummary>();
    }
    this.supervisors.add(elem);
  }

  public List<SupervisorSummary> get_supervisors() {
    return this.supervisors;
  }

  public void set_supervisors(List<SupervisorSummary> supervisors) {
    this.supervisors = supervisors;
  }

  public void unset_supervisors() {
    this.supervisors = null;
  }

  /** Returns true if field supervisors is set (has been assigned a value) and false otherwise */
  public boolean is_set_supervisors() {
    return this.supervisors != null;
  }

  public void set_supervisors_isSet(boolean value) {
    if (!value) {
      this.supervisors = null;
    }
  }

  public int get_topologies_size() {
    return (this.topologies == null) ? 0 : this.topologies.size();
  }

  public java.util.Iterator<TopologySummary> get_topologies_iterator() {
    return (this.topologies == null) ? null : this.topologies.iterator();
  }

  public void add_to_topologies(TopologySummary elem) {
    if (this.topologies == null) {
      this.topologies = new ArrayList<TopologySummary>();
    }
    this.topologies.add(elem);
  }

  public List<TopologySummary> get_topologies() {
    return this.topologies;
  }

  public void set_topologies(List<TopologySummary> topologies) {
    this.topologies = topologies;
  }

  public void unset_topologies() {
    this.topologies = null;
  }

  /** Returns true if field topologies is set (has been assigned a value) and false otherwise */
  public boolean is_set_topologies() {
    return this.topologies != null;
  }

  public void set_topologies_isSet(boolean value) {
    if (!value) {
      this.topologies = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NIMBUS:
      if (value == null) {
        unset_nimbus();
      } else {
        set_nimbus((NimbusSummary)value);
      }
      break;

    case SUPERVISORS:
      if (value == null) {
        unset_supervisors();
      } else {
        set_supervisors((List<SupervisorSummary>)value);
      }
      break;

    case TOPOLOGIES:
      if (value == null) {
        unset_topologies();
      } else {
        set_topologies((List<TopologySummary>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NIMBUS:
      return get_nimbus();

    case SUPERVISORS:
      return get_supervisors();

    case TOPOLOGIES:
      return get_topologies();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case NIMBUS:
      return is_set_nimbus();
    case SUPERVISORS:
      return is_set_supervisors();
    case TOPOLOGIES:
      return is_set_topologies();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ClusterSummary)
      return this.equals((ClusterSummary)that);
    return false;
  }

  public boolean equals(ClusterSummary that) {
    if (that == null)
      return false;

    boolean this_present_nimbus = true && this.is_set_nimbus();
    boolean that_present_nimbus = true && that.is_set_nimbus();
    if (this_present_nimbus || that_present_nimbus) {
      if (!(this_present_nimbus && that_present_nimbus))
        return false;
      if (!this.nimbus.equals(that.nimbus))
        return false;
    }

    boolean this_present_supervisors = true && this.is_set_supervisors();
    boolean that_present_supervisors = true && that.is_set_supervisors();
    if (this_present_supervisors || that_present_supervisors) {
      if (!(this_present_supervisors && that_present_supervisors))
        return false;
      if (!this.supervisors.equals(that.supervisors))
        return false;
    }

    boolean this_present_topologies = true && this.is_set_topologies();
    boolean that_present_topologies = true && that.is_set_topologies();
    if (this_present_topologies || that_present_topologies) {
      if (!(this_present_topologies && that_present_topologies))
        return false;
      if (!this.topologies.equals(that.topologies))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_nimbus = true && (is_set_nimbus());
    list.add(present_nimbus);
    if (present_nimbus)
      list.add(nimbus);

    boolean present_supervisors = true && (is_set_supervisors());
    list.add(present_supervisors);
    if (present_supervisors)
      list.add(supervisors);

    boolean present_topologies = true && (is_set_topologies());
    list.add(present_topologies);
    if (present_topologies)
      list.add(topologies);

    return list.hashCode();
  }

  @Override
  public int compareTo(ClusterSummary other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(is_set_nimbus()).compareTo(other.is_set_nimbus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_nimbus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nimbus, other.nimbus);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_supervisors()).compareTo(other.is_set_supervisors());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_supervisors()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.supervisors, other.supervisors);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_topologies()).compareTo(other.is_set_topologies());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_topologies()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.topologies, other.topologies);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ClusterSummary(");
    boolean first = true;

    sb.append("nimbus:");
    if (this.nimbus == null) {
      sb.append("null");
    } else {
      sb.append(this.nimbus);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("supervisors:");
    if (this.supervisors == null) {
      sb.append("null");
    } else {
      sb.append(this.supervisors);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("topologies:");
    if (this.topologies == null) {
      sb.append("null");
    } else {
      sb.append(this.topologies);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!is_set_nimbus()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'nimbus' is unset! Struct:" + toString());
    }

    if (!is_set_supervisors()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'supervisors' is unset! Struct:" + toString());
    }

    if (!is_set_topologies()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'topologies' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
    if (nimbus != null) {
      nimbus.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ClusterSummaryStandardSchemeFactory implements SchemeFactory {
    public ClusterSummaryStandardScheme getScheme() {
      return new ClusterSummaryStandardScheme();
    }
  }

  private static class ClusterSummaryStandardScheme extends StandardScheme<ClusterSummary> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ClusterSummary struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NIMBUS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.nimbus = new NimbusSummary();
              struct.nimbus.read(iprot);
              struct.set_nimbus_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SUPERVISORS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list82 = iprot.readListBegin();
                struct.supervisors = new ArrayList<SupervisorSummary>(_list82.size);
                SupervisorSummary _elem83;
                for (int _i84 = 0; _i84 < _list82.size; ++_i84)
                {
                  _elem83 = new SupervisorSummary();
                  _elem83.read(iprot);
                  struct.supervisors.add(_elem83);
                }
                iprot.readListEnd();
              }
              struct.set_supervisors_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TOPOLOGIES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list85 = iprot.readListBegin();
                struct.topologies = new ArrayList<TopologySummary>(_list85.size);
                TopologySummary _elem86;
                for (int _i87 = 0; _i87 < _list85.size; ++_i87)
                {
                  _elem86 = new TopologySummary();
                  _elem86.read(iprot);
                  struct.topologies.add(_elem86);
                }
                iprot.readListEnd();
              }
              struct.set_topologies_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ClusterSummary struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.nimbus != null) {
        oprot.writeFieldBegin(NIMBUS_FIELD_DESC);
        struct.nimbus.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.supervisors != null) {
        oprot.writeFieldBegin(SUPERVISORS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.supervisors.size()));
          for (SupervisorSummary _iter88 : struct.supervisors)
          {
            _iter88.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.topologies != null) {
        oprot.writeFieldBegin(TOPOLOGIES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.topologies.size()));
          for (TopologySummary _iter89 : struct.topologies)
          {
            _iter89.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ClusterSummaryTupleSchemeFactory implements SchemeFactory {
    public ClusterSummaryTupleScheme getScheme() {
      return new ClusterSummaryTupleScheme();
    }
  }

  private static class ClusterSummaryTupleScheme extends TupleScheme<ClusterSummary> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ClusterSummary struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.nimbus.write(oprot);
      {
        oprot.writeI32(struct.supervisors.size());
        for (SupervisorSummary _iter90 : struct.supervisors)
        {
          _iter90.write(oprot);
        }
      }
      {
        oprot.writeI32(struct.topologies.size());
        for (TopologySummary _iter91 : struct.topologies)
        {
          _iter91.write(oprot);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ClusterSummary struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.nimbus = new NimbusSummary();
      struct.nimbus.read(iprot);
      struct.set_nimbus_isSet(true);
      {
        org.apache.thrift.protocol.TList _list92 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.supervisors = new ArrayList<SupervisorSummary>(_list92.size);
        SupervisorSummary _elem93;
        for (int _i94 = 0; _i94 < _list92.size; ++_i94)
        {
          _elem93 = new SupervisorSummary();
          _elem93.read(iprot);
          struct.supervisors.add(_elem93);
        }
      }
      struct.set_supervisors_isSet(true);
      {
        org.apache.thrift.protocol.TList _list95 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.topologies = new ArrayList<TopologySummary>(_list95.size);
        TopologySummary _elem96;
        for (int _i97 = 0; _i97 < _list95.size; ++_i97)
        {
          _elem96 = new TopologySummary();
          _elem96.read(iprot);
          struct.topologies.add(_elem96);
        }
      }
      struct.set_topologies_isSet(true);
    }
  }

}

