/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package net.achalaggarwal.workerbee.example.baseball.domain;
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Player extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord, java.io.Serializable{
public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Player\",\"namespace\":\"net.achalaggarwal.workerbee.example.baseball.domain\",\"fields\":[{\"name\":\"playerId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"totalRuns\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\",\"java-class\":\"java.math.BigDecimal\",\"logicalType\":\"decimal\",\"precision\":38,\"scale\":4}],\"default\":null}]}");
public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
			@Deprecated public String playerId;
			@Deprecated public java.math.BigDecimal totalRuns;

  /**
  * Default constructor.  Note that this does not initialize fields
  * to their default values from the schema.  If that is desired then
  * one should use <code>newBuilder()</code>.
  */
  public Player() {}

  /**
  * All-args constructor.
  */
  public Player(String playerId, java.math.BigDecimal totalRuns) {
        this.playerId = playerId;
        this.totalRuns = totalRuns;
      }

  public Player(java.util.Map<String, Object> setterMap) {
  for (String keyName : setterMap.keySet()) {
      put(getClassSchema().getField(keyName).pos(), setterMap.get(keyName));
  }
  }

public org.apache.avro.Schema getSchema() { return SCHEMA$; }
// Used by DatumWriter.  Applications should not call.
public Object get(int field$) {
switch (field$) {
case 0: return playerId;
  case 1: return totalRuns;
  default: throw new org.apache.avro.AvroRuntimeException("Bad index");
}
}
// Used by DatumReader.  Applications should not call.
@SuppressWarnings(value="unchecked")
public void put(int field$, Object value$) {
switch (field$) {
case 0: playerId =  (String)value$; break;
case 1: totalRuns = value$ != null ? new java.math.BigDecimal(value$.toString()) : null; break;
default: throw new org.apache.avro.AvroRuntimeException("Bad index");
}
}

/**
* Gets the value of the 'playerId' field.
  */
public String getPlayerId() {
return playerId;
}

    /**
  * Sets the value of the 'playerId' field.
      * @param value the value to set.
  */
  public void setPlayerId(String value) {
  this.playerId = value;
  }

/**
* Gets the value of the 'totalRuns' field.
  */
public java.math.BigDecimal getTotalRuns() {
return totalRuns;
}

    /**
  * Sets the value of the 'totalRuns' field.
      * @param value the value to set.
  */
  public void setTotalRuns(java.math.BigDecimal value) {
  this.totalRuns = value;
  }

/** Creates a new Player RecordBuilder */
public static net.achalaggarwal.workerbee.example.baseball.domain.Player.Builder newBuilder() {
return new net.achalaggarwal.workerbee.example.baseball.domain.Player.Builder();
}

/** Creates a new Player RecordBuilder by copying an existing Builder */
public static net.achalaggarwal.workerbee.example.baseball.domain.Player.Builder newBuilder(net.achalaggarwal.workerbee.example.baseball.domain.Player.Builder other) {
return new net.achalaggarwal.workerbee.example.baseball.domain.Player.Builder(other);
}

/** Creates a new Player RecordBuilder by copying an existing Player instance */
public static net.achalaggarwal.workerbee.example.baseball.domain.Player.Builder newBuilder(net.achalaggarwal.workerbee.example.baseball.domain.Player other) {
return new net.achalaggarwal.workerbee.example.baseball.domain.Player.Builder(other);
}

/**
* RecordBuilder for Player instances.
*/
public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Player>
implements org.apache.avro.data.RecordBuilder<Player> {

private String playerId;
private java.math.BigDecimal totalRuns;

/** Creates a new Builder */
private Builder() {
super(net.achalaggarwal.workerbee.example.baseball.domain.Player.SCHEMA$);
}

/** Creates a Builder by copying an existing Builder */
private Builder(net.achalaggarwal.workerbee.example.baseball.domain.Player.Builder other) {
super(other);
if (isValidValue(fields()[0], other.playerId)) {
this.playerId =  data().deepCopy(fields()[0].schema(), other.playerId);
fieldSetFlags()[0] = true;
}
if (isValidValue(fields()[1], other.totalRuns)) {
this.totalRuns =  new java.math.BigDecimal(data().deepCopy(fields()[1].schema(), other.totalRuns.toString())); fieldSetFlags()[1] = true;
}
}

/** Creates a Builder by copying an existing Player instance */
private Builder(net.achalaggarwal.workerbee.example.baseball.domain.Player other) {
super(net.achalaggarwal.workerbee.example.baseball.domain.Player.SCHEMA$);
if (isValidValue(fields()[0], other.playerId)) {
this.playerId =  data().deepCopy(fields()[0].schema(), other.playerId);
fieldSetFlags()[0] = true;
}
if (isValidValue(fields()[1], other.totalRuns)) {
this.totalRuns =  new java.math.BigDecimal(data().deepCopy(fields()[1].schema(), other.totalRuns.toString())); fieldSetFlags()[1] = true;
}
}

/** Gets the value of the 'playerId' field */
public String getPlayerId() {
return playerId;
}

/** Sets the value of the 'playerId' field */
public net.achalaggarwal.workerbee.example.baseball.domain.Player.Builder setPlayerId(String value) {
validate(fields()[0], value);
this.playerId = value;
fieldSetFlags()[0] = true;
return this;
}

/** Checks whether the 'playerId' field has been set */
public boolean hasPlayerId() {
return fieldSetFlags()[0];
}

/** Clears the value of the 'playerId' field */
public net.achalaggarwal.workerbee.example.baseball.domain.Player.Builder clearPlayerId() {
      playerId = null;
  fieldSetFlags()[0] = false;
return this;
}

/** Gets the value of the 'totalRuns' field */
public java.math.BigDecimal getTotalRuns() {
return totalRuns;
}

/** Sets the value of the 'totalRuns' field */
public net.achalaggarwal.workerbee.example.baseball.domain.Player.Builder setTotalRuns(java.math.BigDecimal value) {
validate(fields()[1], value);
this.totalRuns = value;
fieldSetFlags()[1] = true;
return this;
}

/** Checks whether the 'totalRuns' field has been set */
public boolean hasTotalRuns() {
return fieldSetFlags()[1];
}

/** Clears the value of the 'totalRuns' field */
public net.achalaggarwal.workerbee.example.baseball.domain.Player.Builder clearTotalRuns() {
      totalRuns = null;
  fieldSetFlags()[1] = false;
return this;
}

@Override
public Player build() {
try {
Player record = new Player();
record.playerId = fieldSetFlags()[0] ? this.playerId : (String) defaultValue(fields()[0]);
record.totalRuns = fieldSetFlags()[1] ? this.totalRuns : (java.math.BigDecimal) defaultValue(fields()[1]);
return record;
} catch (Exception e) {
throw new org.apache.avro.AvroRuntimeException(e);
}
}
}
}
