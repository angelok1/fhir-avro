/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.hl7.fhir.avro.models;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class CodeableConcept extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -5742156605915540359L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"CodeableConcept\",\"namespace\":\"org.hl7.fhir.avro.models\",\"fields\":[{\"name\":\"coding\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Coding\",\"fields\":[{\"name\":\"system\",\"type\":\"string\"},{\"name\":\"code\",\"type\":\"string\"},{\"name\":\"display\",\"type\":\"string\"}]}}},{\"name\":\"text\",\"type\":[\"string\",\"null\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<CodeableConcept> ENCODER =
      new BinaryMessageEncoder<CodeableConcept>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<CodeableConcept> DECODER =
      new BinaryMessageDecoder<CodeableConcept>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<CodeableConcept> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<CodeableConcept> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<CodeableConcept> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<CodeableConcept>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this CodeableConcept to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a CodeableConcept from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a CodeableConcept instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static CodeableConcept fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.util.List<org.hl7.fhir.avro.models.Coding> coding;
  @Deprecated public java.lang.CharSequence text;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public CodeableConcept() {}

  /**
   * All-args constructor.
   * @param coding The new value for coding
   * @param text The new value for text
   */
  public CodeableConcept(java.util.List<org.hl7.fhir.avro.models.Coding> coding, java.lang.CharSequence text) {
    this.coding = coding;
    this.text = text;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return coding;
    case 1: return text;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: coding = (java.util.List<org.hl7.fhir.avro.models.Coding>)value$; break;
    case 1: text = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'coding' field.
   * @return The value of the 'coding' field.
   */
  public java.util.List<org.hl7.fhir.avro.models.Coding> getCoding() {
    return coding;
  }


  /**
   * Sets the value of the 'coding' field.
   * @param value the value to set.
   */
  public void setCoding(java.util.List<org.hl7.fhir.avro.models.Coding> value) {
    this.coding = value;
  }

  /**
   * Gets the value of the 'text' field.
   * @return The value of the 'text' field.
   */
  public java.lang.CharSequence getText() {
    return text;
  }


  /**
   * Sets the value of the 'text' field.
   * @param value the value to set.
   */
  public void setText(java.lang.CharSequence value) {
    this.text = value;
  }

  /**
   * Creates a new CodeableConcept RecordBuilder.
   * @return A new CodeableConcept RecordBuilder
   */
  public static org.hl7.fhir.avro.models.CodeableConcept.Builder newBuilder() {
    return new org.hl7.fhir.avro.models.CodeableConcept.Builder();
  }

  /**
   * Creates a new CodeableConcept RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new CodeableConcept RecordBuilder
   */
  public static org.hl7.fhir.avro.models.CodeableConcept.Builder newBuilder(org.hl7.fhir.avro.models.CodeableConcept.Builder other) {
    if (other == null) {
      return new org.hl7.fhir.avro.models.CodeableConcept.Builder();
    } else {
      return new org.hl7.fhir.avro.models.CodeableConcept.Builder(other);
    }
  }

  /**
   * Creates a new CodeableConcept RecordBuilder by copying an existing CodeableConcept instance.
   * @param other The existing instance to copy.
   * @return A new CodeableConcept RecordBuilder
   */
  public static org.hl7.fhir.avro.models.CodeableConcept.Builder newBuilder(org.hl7.fhir.avro.models.CodeableConcept other) {
    if (other == null) {
      return new org.hl7.fhir.avro.models.CodeableConcept.Builder();
    } else {
      return new org.hl7.fhir.avro.models.CodeableConcept.Builder(other);
    }
  }

  /**
   * RecordBuilder for CodeableConcept instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<CodeableConcept>
    implements org.apache.avro.data.RecordBuilder<CodeableConcept> {

    private java.util.List<org.hl7.fhir.avro.models.Coding> coding;
    private java.lang.CharSequence text;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.hl7.fhir.avro.models.CodeableConcept.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.coding)) {
        this.coding = data().deepCopy(fields()[0].schema(), other.coding);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.text)) {
        this.text = data().deepCopy(fields()[1].schema(), other.text);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing CodeableConcept instance
     * @param other The existing instance to copy.
     */
    private Builder(org.hl7.fhir.avro.models.CodeableConcept other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.coding)) {
        this.coding = data().deepCopy(fields()[0].schema(), other.coding);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.text)) {
        this.text = data().deepCopy(fields()[1].schema(), other.text);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'coding' field.
      * @return The value.
      */
    public java.util.List<org.hl7.fhir.avro.models.Coding> getCoding() {
      return coding;
    }


    /**
      * Sets the value of the 'coding' field.
      * @param value The value of 'coding'.
      * @return This builder.
      */
    public org.hl7.fhir.avro.models.CodeableConcept.Builder setCoding(java.util.List<org.hl7.fhir.avro.models.Coding> value) {
      validate(fields()[0], value);
      this.coding = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'coding' field has been set.
      * @return True if the 'coding' field has been set, false otherwise.
      */
    public boolean hasCoding() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'coding' field.
      * @return This builder.
      */
    public org.hl7.fhir.avro.models.CodeableConcept.Builder clearCoding() {
      coding = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'text' field.
      * @return The value.
      */
    public java.lang.CharSequence getText() {
      return text;
    }


    /**
      * Sets the value of the 'text' field.
      * @param value The value of 'text'.
      * @return This builder.
      */
    public org.hl7.fhir.avro.models.CodeableConcept.Builder setText(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.text = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'text' field has been set.
      * @return True if the 'text' field has been set, false otherwise.
      */
    public boolean hasText() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'text' field.
      * @return This builder.
      */
    public org.hl7.fhir.avro.models.CodeableConcept.Builder clearText() {
      text = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public CodeableConcept build() {
      try {
        CodeableConcept record = new CodeableConcept();
        record.coding = fieldSetFlags()[0] ? this.coding : (java.util.List<org.hl7.fhir.avro.models.Coding>) defaultValue(fields()[0]);
        record.text = fieldSetFlags()[1] ? this.text : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<CodeableConcept>
    WRITER$ = (org.apache.avro.io.DatumWriter<CodeableConcept>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<CodeableConcept>
    READER$ = (org.apache.avro.io.DatumReader<CodeableConcept>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    long size0 = this.coding.size();
    out.writeArrayStart();
    out.setItemCount(size0);
    long actualSize0 = 0;
    for (org.hl7.fhir.avro.models.Coding e0: this.coding) {
      actualSize0++;
      out.startItem();
      e0.customEncode(out);
    }
    out.writeArrayEnd();
    if (actualSize0 != size0)
      throw new java.util.ConcurrentModificationException("Array-size written was " + size0 + ", but element count was " + actualSize0 + ".");

    if (this.text == null) {
      out.writeIndex(1);
      out.writeNull();
    } else {
      out.writeIndex(0);
      out.writeString(this.text);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      long size0 = in.readArrayStart();
      java.util.List<org.hl7.fhir.avro.models.Coding> a0 = this.coding;
      if (a0 == null) {
        a0 = new SpecificData.Array<org.hl7.fhir.avro.models.Coding>((int)size0, SCHEMA$.getField("coding").schema());
        this.coding = a0;
      } else a0.clear();
      SpecificData.Array<org.hl7.fhir.avro.models.Coding> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<org.hl7.fhir.avro.models.Coding>)a0 : null);
      for ( ; 0 < size0; size0 = in.arrayNext()) {
        for ( ; size0 != 0; size0--) {
          org.hl7.fhir.avro.models.Coding e0 = (ga0 != null ? ga0.peek() : null);
          if (e0 == null) {
            e0 = new org.hl7.fhir.avro.models.Coding();
          }
          e0.customDecode(in);
          a0.add(e0);
        }
      }

      if (in.readIndex() != 0) {
        in.readNull();
        this.text = null;
      } else {
        this.text = in.readString(this.text instanceof Utf8 ? (Utf8)this.text : null);
      }

    } else {
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          long size0 = in.readArrayStart();
          java.util.List<org.hl7.fhir.avro.models.Coding> a0 = this.coding;
          if (a0 == null) {
            a0 = new SpecificData.Array<org.hl7.fhir.avro.models.Coding>((int)size0, SCHEMA$.getField("coding").schema());
            this.coding = a0;
          } else a0.clear();
          SpecificData.Array<org.hl7.fhir.avro.models.Coding> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<org.hl7.fhir.avro.models.Coding>)a0 : null);
          for ( ; 0 < size0; size0 = in.arrayNext()) {
            for ( ; size0 != 0; size0--) {
              org.hl7.fhir.avro.models.Coding e0 = (ga0 != null ? ga0.peek() : null);
              if (e0 == null) {
                e0 = new org.hl7.fhir.avro.models.Coding();
              }
              e0.customDecode(in);
              a0.add(e0);
            }
          }
          break;

        case 1:
          if (in.readIndex() != 0) {
            in.readNull();
            this.text = null;
          } else {
            this.text = in.readString(this.text instanceof Utf8 ? (Utf8)this.text : null);
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










