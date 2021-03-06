/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package io.carrera.fhir.avro.models;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class Coding extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -4940296303678137886L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Coding\",\"namespace\":\"io.carrera.fhir.avro.models\",\"fields\":[{\"name\":\"system\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"code\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"display\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"version\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"userSelected\",\"type\":[\"null\",\"boolean\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Coding> ENCODER =
      new BinaryMessageEncoder<Coding>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Coding> DECODER =
      new BinaryMessageDecoder<Coding>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Coding> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Coding> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Coding> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Coding>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Coding to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Coding from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Coding instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Coding fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.CharSequence system;
   private java.lang.CharSequence code;
   private java.lang.CharSequence display;
   private java.lang.CharSequence version;
   private java.lang.Boolean userSelected;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Coding() {}

  /**
   * All-args constructor.
   * @param system The new value for system
   * @param code The new value for code
   * @param display The new value for display
   * @param version The new value for version
   * @param userSelected The new value for userSelected
   */
  public Coding(java.lang.CharSequence system, java.lang.CharSequence code, java.lang.CharSequence display, java.lang.CharSequence version, java.lang.Boolean userSelected) {
    this.system = system;
    this.code = code;
    this.display = display;
    this.version = version;
    this.userSelected = userSelected;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return system;
    case 1: return code;
    case 2: return display;
    case 3: return version;
    case 4: return userSelected;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: system = (java.lang.CharSequence)value$; break;
    case 1: code = (java.lang.CharSequence)value$; break;
    case 2: display = (java.lang.CharSequence)value$; break;
    case 3: version = (java.lang.CharSequence)value$; break;
    case 4: userSelected = (java.lang.Boolean)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'system' field.
   * @return The value of the 'system' field.
   */
  public java.lang.CharSequence getSystem() {
    return system;
  }


  /**
   * Sets the value of the 'system' field.
   * @param value the value to set.
   */
  public void setSystem(java.lang.CharSequence value) {
    this.system = value;
  }

  /**
   * Gets the value of the 'code' field.
   * @return The value of the 'code' field.
   */
  public java.lang.CharSequence getCode() {
    return code;
  }


  /**
   * Sets the value of the 'code' field.
   * @param value the value to set.
   */
  public void setCode(java.lang.CharSequence value) {
    this.code = value;
  }

  /**
   * Gets the value of the 'display' field.
   * @return The value of the 'display' field.
   */
  public java.lang.CharSequence getDisplay() {
    return display;
  }


  /**
   * Sets the value of the 'display' field.
   * @param value the value to set.
   */
  public void setDisplay(java.lang.CharSequence value) {
    this.display = value;
  }

  /**
   * Gets the value of the 'version' field.
   * @return The value of the 'version' field.
   */
  public java.lang.CharSequence getVersion() {
    return version;
  }


  /**
   * Sets the value of the 'version' field.
   * @param value the value to set.
   */
  public void setVersion(java.lang.CharSequence value) {
    this.version = value;
  }

  /**
   * Gets the value of the 'userSelected' field.
   * @return The value of the 'userSelected' field.
   */
  public java.lang.Boolean getUserSelected() {
    return userSelected;
  }


  /**
   * Sets the value of the 'userSelected' field.
   * @param value the value to set.
   */
  public void setUserSelected(java.lang.Boolean value) {
    this.userSelected = value;
  }

  /**
   * Creates a new Coding RecordBuilder.
   * @return A new Coding RecordBuilder
   */
  public static io.carrera.fhir.avro.models.Coding.Builder newBuilder() {
    return new io.carrera.fhir.avro.models.Coding.Builder();
  }

  /**
   * Creates a new Coding RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Coding RecordBuilder
   */
  public static io.carrera.fhir.avro.models.Coding.Builder newBuilder(io.carrera.fhir.avro.models.Coding.Builder other) {
    if (other == null) {
      return new io.carrera.fhir.avro.models.Coding.Builder();
    } else {
      return new io.carrera.fhir.avro.models.Coding.Builder(other);
    }
  }

  /**
   * Creates a new Coding RecordBuilder by copying an existing Coding instance.
   * @param other The existing instance to copy.
   * @return A new Coding RecordBuilder
   */
  public static io.carrera.fhir.avro.models.Coding.Builder newBuilder(io.carrera.fhir.avro.models.Coding other) {
    if (other == null) {
      return new io.carrera.fhir.avro.models.Coding.Builder();
    } else {
      return new io.carrera.fhir.avro.models.Coding.Builder(other);
    }
  }

  /**
   * RecordBuilder for Coding instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Coding>
    implements org.apache.avro.data.RecordBuilder<Coding> {

    private java.lang.CharSequence system;
    private java.lang.CharSequence code;
    private java.lang.CharSequence display;
    private java.lang.CharSequence version;
    private java.lang.Boolean userSelected;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(io.carrera.fhir.avro.models.Coding.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.system)) {
        this.system = data().deepCopy(fields()[0].schema(), other.system);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.code)) {
        this.code = data().deepCopy(fields()[1].schema(), other.code);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.display)) {
        this.display = data().deepCopy(fields()[2].schema(), other.display);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.version)) {
        this.version = data().deepCopy(fields()[3].schema(), other.version);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.userSelected)) {
        this.userSelected = data().deepCopy(fields()[4].schema(), other.userSelected);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
    }

    /**
     * Creates a Builder by copying an existing Coding instance
     * @param other The existing instance to copy.
     */
    private Builder(io.carrera.fhir.avro.models.Coding other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.system)) {
        this.system = data().deepCopy(fields()[0].schema(), other.system);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.code)) {
        this.code = data().deepCopy(fields()[1].schema(), other.code);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.display)) {
        this.display = data().deepCopy(fields()[2].schema(), other.display);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.version)) {
        this.version = data().deepCopy(fields()[3].schema(), other.version);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.userSelected)) {
        this.userSelected = data().deepCopy(fields()[4].schema(), other.userSelected);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'system' field.
      * @return The value.
      */
    public java.lang.CharSequence getSystem() {
      return system;
    }


    /**
      * Sets the value of the 'system' field.
      * @param value The value of 'system'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Coding.Builder setSystem(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.system = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'system' field has been set.
      * @return True if the 'system' field has been set, false otherwise.
      */
    public boolean hasSystem() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'system' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Coding.Builder clearSystem() {
      system = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'code' field.
      * @return The value.
      */
    public java.lang.CharSequence getCode() {
      return code;
    }


    /**
      * Sets the value of the 'code' field.
      * @param value The value of 'code'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Coding.Builder setCode(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.code = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'code' field has been set.
      * @return True if the 'code' field has been set, false otherwise.
      */
    public boolean hasCode() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'code' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Coding.Builder clearCode() {
      code = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'display' field.
      * @return The value.
      */
    public java.lang.CharSequence getDisplay() {
      return display;
    }


    /**
      * Sets the value of the 'display' field.
      * @param value The value of 'display'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Coding.Builder setDisplay(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.display = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'display' field has been set.
      * @return True if the 'display' field has been set, false otherwise.
      */
    public boolean hasDisplay() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'display' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Coding.Builder clearDisplay() {
      display = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'version' field.
      * @return The value.
      */
    public java.lang.CharSequence getVersion() {
      return version;
    }


    /**
      * Sets the value of the 'version' field.
      * @param value The value of 'version'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Coding.Builder setVersion(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.version = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'version' field has been set.
      * @return True if the 'version' field has been set, false otherwise.
      */
    public boolean hasVersion() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'version' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Coding.Builder clearVersion() {
      version = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'userSelected' field.
      * @return The value.
      */
    public java.lang.Boolean getUserSelected() {
      return userSelected;
    }


    /**
      * Sets the value of the 'userSelected' field.
      * @param value The value of 'userSelected'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Coding.Builder setUserSelected(java.lang.Boolean value) {
      validate(fields()[4], value);
      this.userSelected = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'userSelected' field has been set.
      * @return True if the 'userSelected' field has been set, false otherwise.
      */
    public boolean hasUserSelected() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'userSelected' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Coding.Builder clearUserSelected() {
      userSelected = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Coding build() {
      try {
        Coding record = new Coding();
        record.system = fieldSetFlags()[0] ? this.system : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.code = fieldSetFlags()[1] ? this.code : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.display = fieldSetFlags()[2] ? this.display : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.version = fieldSetFlags()[3] ? this.version : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.userSelected = fieldSetFlags()[4] ? this.userSelected : (java.lang.Boolean) defaultValue(fields()[4]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Coding>
    WRITER$ = (org.apache.avro.io.DatumWriter<Coding>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Coding>
    READER$ = (org.apache.avro.io.DatumReader<Coding>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    if (this.system == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.system);
    }

    if (this.code == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.code);
    }

    if (this.display == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.display);
    }

    if (this.version == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.version);
    }

    if (this.userSelected == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeBoolean(this.userSelected);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (in.readIndex() != 1) {
        in.readNull();
        this.system = null;
      } else {
        this.system = in.readString(this.system instanceof Utf8 ? (Utf8)this.system : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.code = null;
      } else {
        this.code = in.readString(this.code instanceof Utf8 ? (Utf8)this.code : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.display = null;
      } else {
        this.display = in.readString(this.display instanceof Utf8 ? (Utf8)this.display : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.version = null;
      } else {
        this.version = in.readString(this.version instanceof Utf8 ? (Utf8)this.version : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.userSelected = null;
      } else {
        this.userSelected = in.readBoolean();
      }

    } else {
      for (int i = 0; i < 5; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (in.readIndex() != 1) {
            in.readNull();
            this.system = null;
          } else {
            this.system = in.readString(this.system instanceof Utf8 ? (Utf8)this.system : null);
          }
          break;

        case 1:
          if (in.readIndex() != 1) {
            in.readNull();
            this.code = null;
          } else {
            this.code = in.readString(this.code instanceof Utf8 ? (Utf8)this.code : null);
          }
          break;

        case 2:
          if (in.readIndex() != 1) {
            in.readNull();
            this.display = null;
          } else {
            this.display = in.readString(this.display instanceof Utf8 ? (Utf8)this.display : null);
          }
          break;

        case 3:
          if (in.readIndex() != 1) {
            in.readNull();
            this.version = null;
          } else {
            this.version = in.readString(this.version instanceof Utf8 ? (Utf8)this.version : null);
          }
          break;

        case 4:
          if (in.readIndex() != 1) {
            in.readNull();
            this.userSelected = null;
          } else {
            this.userSelected = in.readBoolean();
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










